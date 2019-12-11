import { Component, OnInit } from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {TableDeJeu} from '../model/TableDeJeu';
import {tableDeJeuService} from '../service/tableDeJeu.service';

@Component({
  selector: 'app-table-de-jeu',
  templateUrl: './table-de-jeu.component.html',
  styleUrls: ['./table-de-jeu.component.css']
})
export class TableDeJeuComponent implements OnInit {
id:number;
idMJ:number = null;
idJoueur:number = null;
tabledejeu : TableDeJeu;
  constructor(private route : ActivatedRoute,private tabledejeuService : tableDeJeuService) {
  this.route.params.subscribe(params => this.id=params.id);
  this.route.params.subscribe(params => this.idMJ = params.idMJ);
    this.route.params.subscribe(params => this.idJoueur = params.idJoueur);
this.load();
  }

  ngOnInit() {
  }
async load() {
  await this.tabledejeuService.findById(this.id).toPromise().then(resp => this.tabledejeu=resp);
}
}
