import { Component, OnInit } from '@angular/core';
import {Personnage} from "../model/Personnage";
import {PersonnageIdentiteComponent} from "../personnage-identite/personnage-identite.component";

@Component({
  selector: 'app-personnage',
  templateUrl: './personnage.component.html',
  styleUrls: ['./personnage.component.css']
})
export class PersonnageComponent implements OnInit {

  page: string = 'identite';

  personnage:Personnage = new Personnage();

  constructor() {
  }

  ngOnInit() {
  }

  receptionPerso(persoRecu:Personnage){
    this.personnage.racePerso = persoRecu.racePerso;
    this.personnage.peuplePerso = persoRecu.peuplePerso;
    this.personnage.castePerso = persoRecu.castePerso;
    this.personnage.metierPerso = persoRecu.metierPerso;
  }

}
