import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {Personnage} from "../model/Personnage";
import {PersonnageService} from "../service/personnage.service";
import {DomainePersonnage} from "../model/DomainePersonnage";
import {ActivatedRoute, Router} from '@angular/router';
import {BonusPersonnage} from "../model/BonusPersonnage";
import {last} from "rxjs/operators";
import {PouvoirPersonnage} from "../model/PouvoirPersonnage";
import {MotivationPersonnage} from "../model/MotivationPersonnage";
import {SpecialisationAcquis} from "../model/SpecialisationAcquis";


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
  joueurId:number;

  @Output()
  childEvent = new EventEmitter();

  constructor(private router: Router, private personnageService: PersonnageService, private route: ActivatedRoute) {

    this.route.params.subscribe(params => this.id = params.id);
    if (this.id == null) {
      this.personnage.type = 'Personnage';
    } else {
      this.personnageService.findById(this.id).subscribe(resp => this.personnage = resp);
    }
    this.route.params.subscribe((params => this.joueurId=params.joueurId));

  }

  ngOnInit() {
  }

  receptionPerso(persoRecu: Personnage) {
    this.personnage.racePerso = persoRecu.racePerso;
    this.personnage.peuplePerso = persoRecu.peuplePerso;
    this.personnage.castePerso = persoRecu.castePerso;
    this.personnage.metierPerso = persoRecu.metierPerso;
    console.log(this.personnage)
  }

  receptionDomaine(domaineRecu: Array<DomainePersonnage>) {
    for (let i = 0; i < this.domainePerso.length; i++) {
      this.domainePerso[i] = new DomainePersonnage();
      this.domainePerso[i] = domaineRecu[i];
    }
  }

  receptionSpecialisation(specilisationRecu: Array<BonusPersonnage>) {

    //Suppression des anciennes données
    var longeur = this.bonusPerso.length;
    var index: Array<number> = new Array<number>();

    for (let i = longeur - 1; i >= 0; i--) {
      if (this.bonusPerso[i].acquis == null) {
        index.push(i);
      }
    }

    for (let i of index) {
      this.bonusPerso.splice(i, 1);
    }

    console.log(this.bonusPerso);

    //Ajout des nouvelles données
    for (let i = 0; i < specilisationRecu.length; i++) {
      this.bonusPerso.push(new BonusPersonnage(null, null, null, specilisationRecu[i].bonusPerso, specilisationRecu[i].specialisation, null, null,));
    }
  }

  receptionPouvoir(pouvoirRecu: Array<PouvoirPersonnage>) {

    //Suppression des anciennes données

    this.pouvoirPerso.splice(0,this.pouvoirPerso.length);

    //Ajout des nouvelles données
    for (let i = 0; i < pouvoirRecu.length; i++) {
      this.pouvoirPerso.push(new PouvoirPersonnage());
      this.pouvoirPerso[i].pouvoir = pouvoirRecu[i].pouvoir;
    }
  }

  receptionAcquis(acquisRecu: Array<BonusPersonnage>) {

    //Suppression des anciennes données
    var longeur = this.bonusPerso.length;
    var index: Array<number> = new Array<number>();

    for (let i = longeur - 1; i >= 0; i--) {
      if (this.bonusPerso[i].acquis !== null) {
        index.push(i);
      }
    }

    for (let i of index) {
      this.bonusPerso.splice(i, 1);
    }

    console.log(this.bonusPerso);

    //Ajout des nouvelles données
    for (let i = 0; i < acquisRecu.length; i++) {
      this.bonusPerso.push(new BonusPersonnage(null, null, acquisRecu[i].bonusAcquis, null, acquisRecu[i].specialisation, acquisRecu[i].acquis, null,));
    }

  }

  receptionMotivation(motivationRecu: Array<MotivationPersonnage>) {

    //Suppression des anciennes données

    this.motivationPerso.splice(0,this.motivationPerso.length);

    //Ajout des nouvelles données
    for (let i = 0; i < motivationRecu.length; i++) {
      this.motivationPerso.push(new MotivationPersonnage());
      this.motivationPerso[i].motivation = motivationRecu[i].motivation;
    }

  }

  save() {
    this.personnageService.save(this.personnage, this.domainePerso, this.bonusPerso, this.pouvoirPerso, this.motivationPerso);
    this.router.navigate(['/accueiljoueur/', this.joueurId]);
  }

  cancel() {
    this.childEvent.emit();
  }

  retour(){
    this.domainePerso.splice(0, this.domainePerso.length);
    this.bonusPerso.splice(0, this.bonusPerso.length);
    this.pouvoirPerso.splice(0, this.pouvoirPerso.length);
    this.motivationPerso.splice(0,this.motivationPerso.length);
    console.log(localStorage.getItem("this.id"));
    this.router.navigate(['/accueiljoueur/', this.joueurId]);
  }

}
