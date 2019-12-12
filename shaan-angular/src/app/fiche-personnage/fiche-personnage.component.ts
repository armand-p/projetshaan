import {Component, Input, OnInit} from '@angular/core';
import {Personnage} from "../model/Personnage";
import {PersonnageService} from "../service/personnage.service";
import {ActivatedRoute} from "@angular/router";
import {DomainePersonnageService} from "../service/domaine-personnage.service";
import {DomainePersonnage} from "../model/DomainePersonnage";
import {TableDeJeu} from "../model/TableDeJeu";
import {Specialisation} from "../model/Specialisation";
import {SpecialisationService} from "../service/specialisation.service";
import {BonusPersonnage} from "../model/BonusPersonnage";
import {BonusPersonnageService} from "../service/bonus-personnage.service";
import {PouvoirPersonnage} from "../model/PouvoirPersonnage";
import {PouvoirPersonnageService} from "../service/pouvoir-personnage.service";
import {MotivationPersonnage} from "../model/MotivationPersonnage";
import {MotivationPersonnageService} from "../service/motivation-personnage.service";

@Component({
  selector: 'app-fiche-personnage',
  templateUrl: './fiche-personnage.component.html',
  styleUrls: ['./fiche-personnage.component.css']
})
export class FichePersonnageComponent implements OnInit {

  personnage: Personnage = new Personnage();
  @Input("current")
  id: number;
  private Domaines: Array<DomainePersonnage>;
  listDomaines: Array<DomainePersonnage>;
  listSpecialisations: Array<Specialisation>;
  listBonus:Array<BonusPersonnage>;
  listPouvoirs:Array<PouvoirPersonnage>;
  listMotivation:Array<MotivationPersonnage>;

  constructor(private pouvoirPersonnageService:PouvoirPersonnageService, private bonusPersonnageService:BonusPersonnageService, private specialisationService:SpecialisationService, private domainePersonnageService: DomainePersonnageService, private personnageService: PersonnageService, private route: ActivatedRoute) {



  }

  ngOnInit() {

    this.personnageService.findById(this.id).subscribe(resp => this.personnage = resp);
    this.personnageService.domaineperso(this.id).subscribe(resp => {this.listDomaines = resp});
    this.personnageService.bonusPersonnage(this.id).subscribe(resp => this.listBonus=resp);
    this.personnageService.pouvoirPersonnage(this.id).subscribe(resp =>this.listPouvoirs=resp);
    this.personnageService.motivationPersonnage(this.id).subscribe(resp => this.listMotivation=resp);
  }

  public list(): any {
    return this.personnageService.findAll();
  }


  listDom(id: number): Array<DomainePersonnage> {
    return this.listDomaines;
  }

}
