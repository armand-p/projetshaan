import {Personnage} from "../model/Personnage";

templateUrl: './accueil-joueur.component.html'
import {Component, OnInit, Output} from '@angular/core';
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
  utilisateurId:string;

  motDePasse;
  pseudo;
  id;
  type;

  constructor(private personnageService: PersonnageService, private route:ActivatedRoute) {
    this.route.params.subscribe(params =>this.joueurId=params.id);
    this.load();
  }
load(){
  this.personnageService.findByJoueur(this.joueurId).subscribe(resp =>this.personnages =resp);
}

  ngOnInit() {
    localStorage.setItem(this.utilisateurId, String(this.joueurId));
    this.load();
  }

  public list(): any  {
    return this.personnageService.findAll();

}
  public perso(id:number): any {
    return this.personnageService.findByJoueur(id);

  }

    edit(id: number) {
    this.personnageService.findById(id).subscribe(resp =>{this.personnage = resp;
    this.load()});
    }

  delete(id: number) {
    this.personnageService.deleteBydIdpost(id).subscribe(resp =>this.load());
    this.load();
  }

  unlog(){
    localStorage.setItem('isLoggedin', 'false');
    localStorage.setItem(this.motDePasse, null);
    localStorage.setItem(this.pseudo, null);
    localStorage.setItem(this.id, null);
    localStorage.setItem(this.type, null);

  }


}
