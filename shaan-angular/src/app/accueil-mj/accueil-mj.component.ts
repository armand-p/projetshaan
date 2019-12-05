import { Component, OnInit } from '@angular/core';
import {TableDeJeu} from '../model/TableDeJeu';
import {tableDeJeuService} from '../service/tableDeJeu.service';
import {PersonnageService} from '../service/personnage.service';

@Component({
  selector: 'app-accueil-mj',
  templateUrl: './accueil-mj.component.html',
  styleUrls: ['./accueil-mj.component.css']
})
export class AccueilMjComponent implements OnInit {

  tabledujeu:TableDeJeu = null;
  constructor(private tableDeJeuService:tableDeJeuService,private personnageService:PersonnageService) { }

  ngOnInit() {
  }
creer(){
    this.tabledujeu=new TableDeJeu();
}
save(){
    this.tableDeJeuService.save(this.tabledujeu);
    this.tabledujeu=null;
}
list():Array<TableDeJeu>{
    return this.tableDeJeuService.findAll();
}
  delete(id){
   let test : TableDeJeu;
    this.tableDeJeuService.findById(id).subscribe(resp =>test=resp);
    console.log(test.personnages.length);

  }

}
