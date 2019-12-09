import {Personnage} from "../model/Personnage";

templateUrl: './accueil-joueur.component.html'
import { Component, OnInit } from '@angular/core';
import {Produit} from "../../../../../tpAngular/src/app/produit";
import {PersonnageService} from "../service/personnage.service";
import {Peuple} from "../model/Peuple";
import {Race} from "../model/Race";
import {TableDeJeu} from "../model/TableDeJeu";
import {Metier} from "../model/Metier";
import {Caste} from "../model/Caste";
import {ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-accueil-joueur',
  templateUrl: './accueil-joueur.component.html',
  styleUrls: ['./accueil-joueur.component.css']
})
export class AccueilJoueurComponent implements OnInit {
  personnages: Array<Personnage> = new Array<Personnage>();
  personnage : Personnage=null;
  joueurId : number;


  constructor(private personnageService: PersonnageService, private route:ActivatedRoute) {
    this.route.params.subscribe(params =>this.joueurId=params.id);
  }


  ngOnInit() {
  }

  public list(): any  {
    return this.personnageService.findAll();

}
  public perso(id:number): any {
    return this.personnageService.findByJoueur(id);

  }

    edit(id: number) {
    this.personnageService.findById(id).subscribe(resp => this.personnage = resp);
    }

  delete(id: number) {
    this.personnageService.deleteBydId(id);
  }


}
