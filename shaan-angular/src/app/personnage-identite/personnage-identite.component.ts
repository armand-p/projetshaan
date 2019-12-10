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
  hidden : boolean = true;
  c5:number = 0;
  cf:number;

  constructor(private raceService: RaceService, private peupleService: PeupleService,
              private casteService: CasteService, private domaineService: DomaineService) {

  }

  ngOnInit() {
  }

  selectionRace(){
    if (this.personnage.racePerso!=null){
    if (this.personnage.racePerso.nomRace == "Boreals"){
        if (this.domainePerso[7].rangDomaine>=5){
          this.domainePerso[7].rangDomaine+=1;
        }else{
          this.domainePerso[7].rangDomaine=5;
          this.c5= this.c5+1;
          console.log(this.c5);
        }
      }else if (this.personnage.racePerso.nomRace == "Darkens"){
        if (this.domainePerso[8].rangDomaine>=5){
          this.domainePerso[8].rangDomaine+=1;
        }else{
          this.domainePerso[8].rangDomaine=5;
          this.c5= this.c5+1;
        }

      }else if (this.personnage.racePerso.nomRace == "Delhions"){
        if (this.domainePerso[2].rangDomaine>=5){
          this.domainePerso[2].rangDomaine+=1;
        }else{
          this.domainePerso[2].rangDomaine=5;
          this.c5= this.c5+1;
        }
      }else if(this.personnage.racePerso.nomRace == "Felings"){
        if (this.domainePerso[4].rangDomaine>=5){
          this.domainePerso[4].rangDomaine+=1;
        }else{
          this.domainePerso[4].rangDomaine=5;
          this.c5= this.c5+1;
        }
      }else if (this.personnage.racePerso.nomRace == "Kelwins"){
        if (this.domainePerso[0].rangDomaine>=5){
          this.domainePerso[0].rangDomaine+=1;
        }else{
          this.domainePerso[0].rangDomaine=5;
          this.c5= this.c5+1;
        }
      }else if (this.personnage.racePerso.nomRace == "Melodiens"){
        if (this.domainePerso[3].rangDomaine>=5){
          this.domainePerso[3].rangDomaine+=1;
        }else{
          this.domainePerso[3].rangDomaine=5;
          this.c5= this.c5+1;
        }
      }else if (this.personnage.racePerso.nomRace == "Nomoïs"){
        if (this.domainePerso[5].rangDomaine>=5){
          this.domainePerso[5].rangDomaine+=1;
        }else{
          this.domainePerso[5].rangDomaine=5;
          this.c5= this.c5+1;
        }
      }else if (this.personnage.racePerso.nomRace == "Woons"){
        if (this.domainePerso[6].rangDomaine>=5){
          this.domainePerso[6].rangDomaine+=1;
        }else{
          this.domainePerso[6].rangDomaine=5;
          this.c5= this.c5+1;
        }
      }else if (this.personnage.racePerso.nomRace == "Ygwans"){
        if (this.domainePerso[1].rangDomaine>=5){
          this.domainePerso[1].rangDomaine+=1;
        }else{
          this.domainePerso[1].rangDomaine=5;
          this.c5= this.c5+1;
        }
      }else if (this.personnage.racePerso.nomRace == "Humains"){
        if (this.domainePerso[9].rangDomaine>=5){
          this.domainePerso[9].rangDomaine+=1;
        }else{
          this.domainePerso[9].rangDomaine=5;
          this.c5= this.c5+1;
        }
      }
    }
  }

  selectionPeuple() {
      if (this.personnage.peuplePerso != null) {
        if (this.personnage.peuplePerso.nomPeuple == "Rivages") {
          if (this.domainePerso[7].rangDomaine >= 5) {
            this.domainePerso[7].rangDomaine += 1;
          } else {
            this.domainePerso[7].rangDomaine = 5;
            this.c5= this.c5+1;
          }

        } else if (this.personnage.peuplePerso.nomPeuple == "Sables") {
          if (this.domainePerso[8].rangDomaine >= 5) {
            this.domainePerso[8].rangDomaine += 1;
          } else {
            this.domainePerso[8].rangDomaine = 5;
            this.c5= this.c5+1;
          }

        } else if (this.personnage.peuplePerso.nomPeuple == "Montagnes") {
          if (this.domainePerso[2].rangDomaine >= 5) {
            this.domainePerso[2].rangDomaine += 1;
          } else {
            this.domainePerso[2].rangDomaine = 5;
            this.c5= this.c5+1;
          }

        } else if (this.personnage.peuplePerso.nomPeuple == "Grands Arbres") {
          if (this.domainePerso[4].rangDomaine >= 5) {
            this.domainePerso[4].rangDomaine += 1;
          } else {
            this.domainePerso[4].rangDomaine = 5;
            this.c5= this.c5+1;
          }

        } else if (this.personnage.peuplePerso.nomPeuple == "Terres Brûlées") {
          if (this.domainePerso[0].rangDomaine >= 5) {
            this.domainePerso[0].rangDomaine += 1;
          } else {
            this.domainePerso[0].rangDomaine = 5;
            this.c5= this.c5+1;
          }

        } else if (this.personnage.peuplePerso.nomPeuple == "Hautes Herbes") {
          if (this.domainePerso[3].rangDomaine >= 5) {
            this.domainePerso[3].rangDomaine += 1;
          } else {
            this.domainePerso[3].rangDomaine = 5;
            this.c5= this.c5+1;
          }

        } else if (this.personnage.peuplePerso.nomPeuple == "Glaces") {
          if (this.domainePerso[5].rangDomaine >= 5) {
            this.domainePerso[5].rangDomaine += 1;
          } else {
            this.domainePerso[5].rangDomaine = 5;
            this.c5= this.c5+1;
          }

        } else if (this.personnage.peuplePerso.nomPeuple == "Forêts Blanches") {
          if (this.domainePerso[6].rangDomaine >= 5) {
            this.domainePerso[6].rangDomaine += 1;
          } else {
            this.domainePerso[6].rangDomaine = 5;
            this.c5= this.c5+1;
          }

        } else if (this.personnage.peuplePerso.nomPeuple == "Marais") {
          if (this.domainePerso[1].rangDomaine >= 5) {
            this.domainePerso[1].rangDomaine += 1;
          } else {
            this.domainePerso[1].rangDomaine = 5;
            this.c5= this.c5+1;
          }

        } else if (this.personnage.peuplePerso.nomPeuple == "Cités") {
          if (this.domainePerso[9].rangDomaine >= 5) {
            this.domainePerso[9].rangDomaine += 1;
          } else {
            this.domainePerso[9].rangDomaine = 5;
            this.c5= this.c5+1;
          }

        }
      }
  }

  selectionCaste() {
      if (this.personnage.castePerso != null) {
        if (this.personnage.castePerso.nomCaste == "Voyageurs") {
          if (this.domainePerso[7].rangDomaine >= 5) {
            this.domainePerso[7].rangDomaine += 1;
          } else {
            this.domainePerso[7].rangDomaine = 5;
            this.c5= this.c5+1;
          }

        } else if (this.personnage.castePerso.nomCaste == "Combattants") {
          if (this.domainePerso[8].rangDomaine >= 5) {
            this.domainePerso[8].rangDomaine += 1;
          } else {
            this.domainePerso[8].rangDomaine = 5;
            this.c5= this.c5+1;
          }

        } else if (this.personnage.castePerso.nomCaste == "Négociants") {
          if (this.domainePerso[2].rangDomaine >= 5) {
            this.domainePerso[2].rangDomaine += 1;
          } else {
            this.domainePerso[2].rangDomaine = 5;
            this.c5= this.c5+1;
          }

        } else if (this.personnage.castePerso.nomCaste == "Shaanistes") {
          if (this.domainePerso[4].rangDomaine >= 5) {
            this.domainePerso[4].rangDomaine += 1;
          } else {
            this.domainePerso[4].rangDomaine = 5;
            this.c5= this.c5+1;
          }

        } else if (this.personnage.castePerso.nomCaste == "Novateurs") {
          if (this.domainePerso[0].rangDomaine >= 5) {
            this.domainePerso[0].rangDomaine += 1;
          } else {
            this.domainePerso[0].rangDomaine = 5;
            this.c5= this.c5+1;
          }

        } else if (this.personnage.castePerso.nomCaste == "Artistes") {
          if (this.domainePerso[3].rangDomaine >= 5) {
            this.domainePerso[3].rangDomaine += 1;
          } else {
            this.domainePerso[3].rangDomaine = 5;
            this.c5= this.c5+1;
          }

        } else if (this.personnage.castePerso.nomCaste == "Magiciens") {
          if (this.domainePerso[5].rangDomaine >= 5) {
            this.domainePerso[5].rangDomaine += 1;
          } else {
            this.domainePerso[5].rangDomaine = 5;
            this.c5= this.c5+1;
          }

        } else if (this.personnage.castePerso.nomCaste == "Élémentalistes") {
          if (this.domainePerso[6].rangDomaine >= 5) {
            this.domainePerso[6].rangDomaine += 1;
          } else {
            this.domainePerso[6].rangDomaine = 5;
            this.c5= this.c5+1;
          }

        } else if (this.personnage.castePerso.nomCaste == "Erudits") {
          if (this.domainePerso[1].rangDomaine >= 5) {
            this.domainePerso[1].rangDomaine += 1;
          } else {
            this.domainePerso[1].rangDomaine = 5;
            this.c5= this.c5+1;
          }

        } else if (this.personnage.castePerso.nomCaste == "Ombres") {
          if (this.domainePerso[9].rangDomaine >= 5) {
            this.domainePerso[9].rangDomaine += 1;
          } else {
            this.domainePerso[9].rangDomaine = 5;
            this.c5= this.c5+1;
          }

        }
      }
  }

  cache(){
    if(this.hidden==false){
      this.hidden=true;
    }else {
      this.hidden = false;
    }
   this.cf= 8+3*(4-this.c5);
    console.log(this.c5);
    console.log(this.cf);
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
