import { Component, OnInit } from '@angular/core';
import {Personnage} from "../model/Personnage";
import {PersonnageService} from "../service/personnage.service";

@Component({
  selector: 'app-personnage',
  templateUrl: './personnage.component.html',
  styleUrls: ['./personnage.component.css']
})
export class PersonnageComponent implements OnInit {

  page: string = 'identite';

  personnage:Personnage = new Personnage();

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

  save() {
    this.personnageService.save(this.personnage);
  }

}
