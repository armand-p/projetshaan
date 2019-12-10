import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {BonusPersonnage} from "../model/BonusPersonnage";
import {Specialisation} from "../model/Specialisation";
import {Domaine} from "../model/Domaine";
import {DomaineService} from "../service/domaine.service";
import {SpecialisationService} from "../service/specialisation.service";
import {Acquis} from "../model/Acquis";
import {AcquisService} from "../service/acquis.service";
import {SpecialisationAcquisService} from "../service/specialisation-acquis.service";
import {SpecialisationAcquis} from "../model/SpecialisationAcquis";

@Component({
  selector: 'personnage-acquis',
  templateUrl: './personnage-acquis.component.html',
  styleUrls: ['./personnage-acquis.component.css']
})
export class PersonnageAcquisComponent implements OnInit {

  @Output()
  acquisEnvoi = new EventEmitter<Array<BonusPersonnage>>();

  acquiss: Array<Acquis> = new Array<Acquis>();
  domaines: Array<Domaine> = new Array<Domaine>();
  bonusPers: Array<BonusPersonnage> = new Array<BonusPersonnage>();
  specialisationAcquis: Array<SpecialisationAcquis> = new Array<SpecialisationAcquis>();
  id: number = null;


  constructor(private domaineService: DomaineService, private acquisService: AcquisService, private specialisationAcquisService: SpecialisationAcquisService) {
  }

  ngOnInit() {
  }

  listDomaine(): Array<Domaine> {
    this.listAcquis();
    this.listSpecialisationAcquis();
    return this.domaines = this.domaineService.findAll();
  }

  listAcquis() {
    this.acquiss = this.acquisService.findAll();
  }

  listSpecialisationAcquis() {
    this.specialisationAcquis = this.specialisationAcquisService.findAll();
  }

  triAcquis(nom: string): Array<Acquis> {
    return this.acquiss.filter(acquis => acquis.domaine.nom.indexOf(nom) !== -1);
  }

  ajouteAcquis(acquis: Acquis) {

    if (this.bonusPers.filter(bonus => bonus.acquis.nom.indexOf(acquis.nom) !== -1).length > 0) {

    } else {
      var speAcquis: Array<SpecialisationAcquis>;

      speAcquis = this.specialisationAcquis.filter(speAcquis => speAcquis.acquis.nom.indexOf(acquis.nom) !== -1);

      if (speAcquis.length == 0) {
        this.bonusPers.push(new BonusPersonnage(null, null, null, null, null, acquis, null));
      }

      for (let i = 0; i < speAcquis.length; i++) {
        this.bonusPers.push(new BonusPersonnage(null, null, speAcquis[i].rangSpecialisation, null, speAcquis[i].specialisation, acquis, null));
      }
    }

    console.log(this.bonusPers);
  }

  suppressionAcquis(acquis: Acquis) {

    var speAcquis: Array<SpecialisationAcquis>;
    speAcquis = this.specialisationAcquis.filter(speAcquis => speAcquis.acquis.nom.indexOf(acquis.nom) !== -1);

    if (speAcquis.length == 0) {
      var index = this.bonusPers.findIndex(bonus => bonus.acquis.nom === acquis.nom);
      this.bonusPers.splice(index, 1);
    } else {
      var index = this.bonusPers.findIndex(bonus => bonus.acquis.nom === acquis.nom);
      this.bonusPers.splice(index, speAcquis.length);
    }

    console.log(this.bonusPers);

  }

  findAcquis(acquis: Acquis): boolean {

    if (this.bonusPers.findIndex(bonus => bonus.acquis.nom === acquis.nom) === -1) {
      return true;
    } else {
      return false;
    }

  }



  envoi() {
    console.log('envoi')
    this.acquisEnvoi.emit(this.bonusPers);
  }


}
