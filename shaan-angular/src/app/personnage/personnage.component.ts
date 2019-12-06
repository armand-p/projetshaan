import { Component, OnInit } from '@angular/core';
import {Personnage} from "../model/Personnage";
import {PersonnageService} from "../service/personnage.service";
import {DomainePersonnage} from "../model/DomainePersonnage";

@Component({
  selector: 'app-personnage',
  templateUrl: './personnage.component.html',
  styleUrls: ['./personnage.component.css']
})
export class PersonnageComponent implements OnInit {

  page: string = 'identite';

  personnage:Personnage = new Personnage();
  domainePerso: Array<DomainePersonnage> = new Array<DomainePersonnage>(10);

  constructor(private personnageService:PersonnageService) {
    this.personnage.type = 'Personnage';
  }

  ngOnInit() {
  }

  receptionPerso(persoRecu:Personnage){
    this.personnage.racePerso = persoRecu.racePerso;
    this.personnage.peuplePerso = persoRecu.peuplePerso;
    this.personnage.castePerso = persoRecu.castePerso;
    this.personnage.metierPerso = persoRecu.metierPerso;
  }

  receptionDomaine(domaineRecu:Array<DomainePersonnage>){
    for(let i = 0; i < this.domainePerso.length; i++){
      this.domainePerso[i] = new DomainePersonnage();
      this.domainePerso[i]=domaineRecu[i];
    }
  }

  save() {
    this.personnageService.save(this.personnage, this.domainePerso);
  }

}
