import { Component, OnInit } from '@angular/core';
import {Personnage} from "../model/Personnage";
import {PersonnageService} from "../service/personnage.service";
import {ActivatedRoute} from "@angular/router";
import {DomainePersonnageService} from "../service/domaine-personnage.service";
import {DomainePersonnage} from "../model/DomainePersonnage";
import {TableDeJeu} from "../model/TableDeJeu";

@Component({
  selector: 'app-fiche-personnage',
  templateUrl: './fiche-personnage.component.html',
  styleUrls: ['./fiche-personnage.component.css']
})
export class FichePersonnageComponent implements OnInit {

  personnage: Personnage = new Personnage();
  id:number;
  private Domaines: Array<DomainePersonnage>;
  listDomaines:Array<DomainePersonnage>;
  bool:boolean;

  constructor(private domainePersonnageService:DomainePersonnageService, private personnageService:PersonnageService,private route:ActivatedRoute ) {
    this.route.params.subscribe(params => this.id = params.id);
    this.personnageService.findById(this.id).subscribe(resp => this.personnage = resp);
  }

  ngOnInit() {
  }

  public list(): any {
    return this.personnageService.findAll();
  }

  listdomaine():Array<DomainePersonnage> {
    this.bool = true;
    if (this.bool==true){
      this.bool=false;
    return this.personnageService.domaineperso(this.id);
  }
  }

  async load(id:number){
    await this.personnageService.domainesansboucle(id).toPromise().then(resp => {this.listDomaines=resp;console.log("ça marche !")});

}
  listDom(id:number):Array<DomainePersonnage>{
    return this.listDomaines;
}

}
