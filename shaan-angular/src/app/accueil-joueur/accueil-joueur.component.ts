  templateUrl: './accueil-joueur.component.html'
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-accueil-joueur',
  templateUrl: './accueil-joueur.component.html',
  styleUrls: ['./accueil-joueur.component.css']
})
export class AccueilJoueurComponent implements OnInit {
  personnageNom: string;
  personnageRace: string;
  personnagePeuple: string;
  personnageCaste: string;
  personnageMetier: string;
  personnagePartie: string;

  constructor() { }

  ngOnInit() {
  }

}
