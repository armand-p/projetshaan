import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {Personnage} from "../model/Personnage";
import {PersonnageService} from "../service/personnage.service";
import {DomainePersonnage} from "../model/DomainePersonnage";
import {ActivatedRoute} from "@angular/router";
import {BonusPersonnage} from "../model/BonusPersonnage";
import {last} from "rxjs/operators";
import {PouvoirPersonnage} from "../model/PouvoirPersonnage";
import {MotivationPersonnage} from "../model/MotivationPersonnage";


@Component({
  selector: 'app-personnage',
  templateUrl: './personnage.component.html',
  styleUrls: ['./personnage.component.css']
})
export class PersonnageComponent implements OnInit {

  page: string = 'identite';

  personnage: Personnage = new Personnage();
  domainePerso: Array<DomainePersonnage> = new Array<DomainePersonnage>(10);
  bonusPerso: Array<BonusPersonnage> = new Array<BonusPersonnage>();
  pouvoirPerso: Array<PouvoirPersonnage> = new Array<PouvoirPersonnage>();
  motivationPerso: Array<MotivationPersonnage> = new Array<MotivationPersonnage>();


  id: number;

  @Output()
  childEvent = new EventEmitter();

  constructor(private personnageService: PersonnageService, private route: ActivatedRoute) {

    this.route.params.subscribe(params => this.id = params.id);
    if (this.id == null) {
      this.personnage.type = 'Personnage';
    } else {
      this.personnageService.findById(this.id).subscribe(resp => this.personnage = resp);
    }

  }

  ngOnInit() {
  }

  receptionPerso(persoRecu: Personnage) {
    this.personnage.racePerso = persoRecu.racePerso;
    this.personnage.peuplePerso = persoRecu.peuplePerso;
    this.personnage.castePerso = persoRecu.castePerso;
    this.personnage.metierPerso = persoRecu.metierPerso;
  }

  receptionDomaine(domaineRecu: Array<DomainePersonnage>) {
    for (let i = 0; i < this.domainePerso.length; i++) {
      this.domainePerso[i] = new DomainePersonnage();
      this.domainePerso[i] = domaineRecu[i];
    }
  }

  receptionSpecialisation(specilisationRecu: Array<BonusPersonnage>) {
    for (let i = 0; i < specilisationRecu.length; i++) {
      this.bonusPerso.push(new BonusPersonnage());
      this.bonusPerso[i].bonusPerso = specilisationRecu[i].bonusPerso;
      this.bonusPerso[i].specialisation = specilisationRecu[i].specialisation;
    }
  }

  receptionPouvoir(pouvoirRecu: Array<PouvoirPersonnage>) {
    for (let i = 0; i < pouvoirRecu.length; i++) {
      this.pouvoirPerso.push(new PouvoirPersonnage());
      this.pouvoirPerso[i].pouvoir = pouvoirRecu[i].pouvoir;
    }
  }

  receptionMotivation(motivationRecu : Array<MotivationPersonnage>) {
    for (let i = 0; i < motivationRecu.length; i++) {
      this.motivationPerso.push(new MotivationPersonnage());
      this.motivationPerso[i].motivation = motivationRecu[i].motivation;
    }
  }

  save() {
    this.personnageService.save(this.personnage, this.domainePerso, this.bonusPerso, this.pouvoirPerso, this.motivationPerso);
  }

  cancel() {
    this.childEvent.emit();
  }


}
