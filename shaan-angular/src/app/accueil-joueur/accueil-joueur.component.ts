import {Personnage} from "../model/Personnage";

templateUrl: './accueil-joueur.component.html'
import { Component, OnInit } from '@angular/core';
import {Produit} from "../../../../../tpAngular/src/app/produit";
import {PersonnageService} from "../service/personnage.service";

@Component({
  selector: 'app-accueil-joueur',
  templateUrl: './accueil-joueur.component.html',
  styleUrls: ['./accueil-joueur.component.css']
})
export class AccueilJoueurComponent implements OnInit {
  personnages: Array<Personnage> = new Array<Personnage>();
  recherche: string = "";
  rentrerNom: string="";
  rentrerRace: string="";
  rentrerPeuple: string="";
  rentrerCaste: string="";
  rentrerMetier: string="";
  rentrerPartie: string="";


  constructor(private personnageService: PersonnageService) { }


  ngOnInit() {
  }

  public list(): any  {
    return this.personnageService.findAll();

}

}
