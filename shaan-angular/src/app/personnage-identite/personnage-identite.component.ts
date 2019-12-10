import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {RaceService} from "../service/race.service";
import {Race} from "../model/Race";
import {Peuple} from "../model/Peuple";
import {PeupleService} from "../service/peuple.service";
import {Caste} from "../model/Caste";
import {CasteService} from "../service/caste.service";
import {Metier} from "../model/Metier";
import {Personnage} from "../model/Personnage";
import {DomainePersonnage} from "../model/DomainePersonnage";
import {DomaineService} from "../service/domaine.service";
import {Domaine} from "../model/Domaine";
import {Specialisation} from "../model/Specialisation";
import {BonusPersonnage} from "../model/BonusPersonnage";

@Component({
  selector: 'personnage-identite',
  templateUrl: './personnage-identite.component.html',
  styleUrls: ['./personnage-identite.component.css']
})
export class PersonnageIdentiteComponent implements OnInit {


  @Output()
  personnageEnvoi = new EventEmitter<Personnage>();
  @Output()
  domainePersoEnvoi = new EventEmitter<Array<DomainePersonnage>>();

  domaines:Array<Domaine> = new Array<Domaine>();
  domainePerso: Array<DomainePersonnage> = new Array<DomainePersonnage>(10);
  personnage: Personnage = new Personnage();
  metiers: Array<Metier> = new Array<Metier>();

  constructor(private raceService: RaceService, private peupleService: PeupleService,
              private casteService: CasteService, private domaineService: DomaineService) {

  }

  ngOnInit() {
  }

  selectionRace(race : Race){
      if (this.personnage.racePerso.nomRace == "Boreals"){
        this.domainePerso[7].rangDomaine=5;
      }else if (this.personnage.racePerso.nomRace == "Darkens"){
        this.domainePerso[8].rangDomaine=5;
      }else if (this.personnage.racePerso.nomRace == "Delhions"){
        this.domainePerso[2].rangDomaine=5;
      }else if(this.personnage.racePerso.nomRace == "Felings"){
        this.domainePerso[4].rangDomaine=5;
      }else if (this.personnage.racePerso.nomRace == "Kelwins"){
        this.domainePerso[0].rangDomaine=5;
      }else if (this.personnage.racePerso.nomRace == "Melodiens"){
        this.domainePerso[3].rangDomaine=5;
      }else if (this.personnage.racePerso.nomRace == "Nomoïs"){
        this.domainePerso[5].rangDomaine=5;
      }else if (this.personnage.racePerso.nomRace == "Woons"){
        this.domainePerso[6].rangDomaine=5;
      }else if (this.personnage.racePerso.nomRace == "Ygwans"){
        this.domainePerso[1].rangDomaine=5;
      }else if (this.personnage.racePerso.nomRace == "Humains"){
        this.domainePerso[9].rangDomaine=5;
      }
    }

  selectionPeuple(peuple : Peuple){
    if (peuple!=null){
      if (this.personnage.peuplePerso.nomPeuple== "Forêts Blanches"){
        if (this.domainePerso[7].rangDomaine==5){
          this.domainePerso[7].rangDomaine=6;
        }else{
        this.domainePerso[7].rangDomaine=5;
        }
      }else if (this.personnage.racePerso.nomRace == "Darkens"){
        this.domainePerso[8].rangDomaine=5;
      }else if (this.personnage.racePerso.nomRace == "Delhions"){
        this.domainePerso[2].rangDomaine=5;
      }else if(this.personnage.racePerso.nomRace == "Felings"){
        this.domainePerso[4].rangDomaine=5;
      }else if (this.personnage.racePerso.nomRace == "Kelwins"){
        this.domainePerso[0].rangDomaine=5;
      }else if (this.personnage.racePerso.nomRace == "Melodiens"){
        this.domainePerso[3].rangDomaine=5;
      }else if (this.personnage.racePerso.nomRace == "Nomoïs"){
        this.domainePerso[5].rangDomaine=5;
      }else if (this.personnage.racePerso.nomRace == "Woons"){
        this.domainePerso[6].rangDomaine=5;
      }else if (this.personnage.racePerso.nomRace == "Ygwans"){
        this.domainePerso[1].rangDomaine=5;
      }else if (this.personnage.racePerso.nomRace == "Humains"){
        this.domainePerso[9].rangDomaine=5;
      }
    }
  }

  listRace(): Array<Race> {
    return this.raceService.findAll();
  }


  listpeuple(): Array<Peuple> {
    return this.peupleService.findAll();
  }

  listcaste(): Array<Caste> {
    return this.casteService.findAll();
  }

  selectCaste($event) {
    this.personnage.castePerso = $event;
    this.casteService.findAllMetierByCaste(this.personnage.castePerso.id).subscribe(resp => this.metiers = resp);
  }

  listDomaine(): Array<Domaine> {

    return this.domaineService.findAll();
  }

  setDomaine(index, domaine):boolean {

    if(!this.domainePerso[index]) {
      this.domainePerso[index] = new DomainePersonnage();
      this.domainePerso[index].rangDomaine = 1;
      this.domainePerso[index].domaineLie = domaine;
    }

    return true;

  }

  envoi() {
    this.personnageEnvoi.emit(this.personnage);
    this.domainePersoEnvoi.emit(this.domainePerso);
  }

}
