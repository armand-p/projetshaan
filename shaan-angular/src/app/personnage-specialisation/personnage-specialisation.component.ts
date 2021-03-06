import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {Domaine} from "../model/Domaine";
import {DomaineService} from "../service/domaine.service";
import {SpecialisationService} from "../service/specialisation.service";
import {Specialisation} from "../model/Specialisation";
import {Observable, Subscription} from "rxjs";
import {BonusPersonnage} from "../model/BonusPersonnage";
import {Personnage} from "../model/Personnage";
import {DomainePersonnage} from '../model/DomainePersonnage';

@Component({
  selector: 'personnage-specialisation',
  templateUrl: './personnage-specialisation.component.html',
  styleUrls: ['./personnage-specialisation.component.css']
})
export class PersonnageSpecialisationComponent implements OnInit {

  @Output()
  specialisationEnvoi = new EventEmitter<Array<BonusPersonnage>>();

  @Output()
  pageEnvoi = new EventEmitter<string>();

  @Input("current")
  domainePerso: Array<DomainePersonnage>;

  specialisations: Array<Specialisation> = new Array<Specialisation>();
  domaines: Array<Domaine> = new Array<Domaine>();
  bonusPers: Array<BonusPersonnage> = new Array<BonusPersonnage>();
  id: number = null;
  counter: number = 4;

  afficherDomaine: Array<boolean> = [true, true, true, true, true, true, true, true, true, true];

  @Input("current")
  personnage: Personnage;


  constructor(private domaineService: DomaineService, private specialisationService: SpecialisationService) {
  }

  ngOnInit() {
    this.bonusPers.push(new BonusPersonnage(null, null, null, 1, this.personnage.racePerso.specialisation1, null, null));
    this.bonusPers.push(new BonusPersonnage(null, null, null, 1, this.personnage.racePerso.specialisation2, null, null));
    this.bonusPers.push(new BonusPersonnage(null, null, null, 1, this.personnage.peuplePerso.specialisation1, null, null));
    this.bonusPers.push(new BonusPersonnage(null, null, null, 1, this.personnage.peuplePerso.specialisation2, null, null));
    this.bonusPers.push(new BonusPersonnage(null, null, null, 2, this.personnage.metierPerso.specialisation, null, null));

  }

  listDomaine(): Array<Domaine> {
    this.listSpecialisation();
    return this.domaines = this.domaineService.findAll();
  }

  listSpecialisation() {
    this.specialisations = this.specialisationService.findAll();
  }

  triSpecialisation(nom: string): Array<Specialisation> {
    return this.specialisations.filter(specialisation => specialisation.domaineLie.nom.indexOf(nom) !== -1);
  }

  ajouteSpe(specialisation: Specialisation) {

    if (this.bonusPers.filter(bonus => bonus.specialisation.nom.indexOf(specialisation.nom) !== -1).length > 0) {
      this.bonusPers.filter(bonus => bonus.specialisation.nom.indexOf(specialisation.nom) !== -1)[0].bonusPerso++;
    } else {
      this.bonusPers.push(new BonusPersonnage(null, null, null, null, specialisation, null, null));
      this.bonusPers.filter(bonus => bonus.specialisation.nom.indexOf(specialisation.nom) !== -1)[0].bonusPerso++;
    }

    console.log(this.bonusPers);
  }

  suppressionSpe(specialisation: Specialisation) {

    this.bonusPers.filter(bonus => bonus.specialisation.nom.indexOf(specialisation.nom) !== -1)[0].bonusPerso--;

    if (this.bonusPers.filter(bonus => bonus.specialisation.nom.indexOf(specialisation.nom) !== -1)[0].bonusPerso === 0) {

      var index = this.bonusPers.findIndex(bonus => bonus.specialisation.nom === specialisation.nom);
      this.bonusPers.splice(index, 1);
    }

    console.log(this.bonusPers);

  }

  findSpe(specialisation: Specialisation): boolean {

    if (this.bonusPers.findIndex(bonus => bonus.specialisation.nom === specialisation.nom) === -1) {
      return true;
    } else {
      return false;
    }

  }

  envoi() {
    console.log('envoi')
    this.specialisationEnvoi.emit(this.bonusPers);
    this.pageEnvoi.emit('pouvoir');
  }


}
