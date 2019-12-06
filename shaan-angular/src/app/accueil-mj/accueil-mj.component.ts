import { Component, OnInit } from '@angular/core';
import {TableDeJeu} from '../model/TableDeJeu';
import {tableDeJeuService} from '../service/tableDeJeu.service';
import {PersonnageService} from '../service/personnage.service';
import {Personnage} from '../model/Personnage';

@Component({
  selector: 'app-accueil-mj',
  templateUrl: './accueil-mj.component.html',
  styleUrls: ['./accueil-mj.component.css']
})
export class AccueilMjComponent implements OnInit {

  tabledujeu:TableDeJeu = null;
  tableencours:TableDeJeu=null;
  persoarajouter:Personnage=null;
  persoaenlever:Personnage=null;
  show:boolean = false;
  showRemove:boolean=false;

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
add(table?:TableDeJeu):Array<Personnage>{

    if(table != null){
      this.tableencours=table;
    }
    this.show=true;

    return this.personnageService.findAllPersoOrphanPartie();
}

remove(id):TableDeJeu{

    this.tableDeJeuService.findById(id).subscribe(resp =>this.tableencours=resp);


  this.showRemove=true;

  return this.tableencours;
}
listr():Array<Personnage>{

      return this.tableencours.personnages;

}

  delete(id){
    this.tableDeJeuService.deleteBydId(id);
  }
linkparties(perso:Personnage){

  this.persoarajouter=perso;
  this.persoarajouter.parties=this.tableencours;
  this.personnageService.save(this.persoarajouter);
  this.tableDeJeuService.load();
  this.personnageService.load()
  this.personnageService.loadPersoOrphanPartie();
}
close(){
    this.show=false;
  this.showRemove=false;
}
  unlinkparties(perso:Personnage){

    this.persoaenlever=perso;
    this.persoaenlever.parties=null;
    this.personnageService.save(this.persoaenlever);
    this.tableDeJeuService.load();
    this.personnageService.loadPersoOrphanPartie();
    this.tableDeJeuService.findById(this.tableencours.id).subscribe(resp =>this.tableencours=resp);
  }
}
