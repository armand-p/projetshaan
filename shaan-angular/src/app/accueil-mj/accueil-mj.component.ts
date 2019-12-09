import { Component, OnInit } from '@angular/core';
import {TableDeJeu} from '../model/TableDeJeu';
import {tableDeJeuService} from '../service/tableDeJeu.service';
import {PersonnageService} from '../service/personnage.service';
import {Personnage} from '../model/Personnage';
import {UtilisateurService} from '../service/utilisateur.service';
import {ActivatedRoute} from '@angular/router';
import {MaitreDuJeu} from '../model/MaitreDuJeu';

@Component({
  selector: 'app-accueil-mj',
  templateUrl: './accueil-mj.component.html',
  styleUrls: ['./accueil-mj.component.css']
})
export class AccueilMjComponent implements OnInit {

  tabledujeu:TableDeJeu = null;
  tableencours:TableDeJeu=null;
  tableasupprimer:TableDeJeu=null;
  persoarajouter:Personnage=null;
  persoaenlever:Personnage=null;
  show:boolean = false;
  showRemove:boolean=false;
  idMJ:number;
  masterOfTheGame : MaitreDuJeu;
  listTable : Array<TableDeJeu>;
  constructor(private tableDeJeuService:tableDeJeuService,private personnageService:PersonnageService,private utilisateurService:UtilisateurService,private route:ActivatedRoute) {
    this.route.params.subscribe(params =>this.idMJ=params.id);
    this.utilisateurService.findByIdMasterOfTheGame(this.idMJ).toPromise().then(resp => {this.masterOfTheGame=resp; this.load(this.masterOfTheGame.id);});

  }

  ngOnInit() {
  }
creer(){

    this.tabledujeu=new TableDeJeu();
}
async save(){
    let m :MaitreDuJeu = new MaitreDuJeu();
    m.id=this.masterOfTheGame.id;
    m.type="maitreDuJeu";
    this.tabledujeu.maitreDuJeu=m;
    await this.tableDeJeuService.save(this.tabledujeu);
    this.tabledujeu=null;
    await this.load(this.masterOfTheGame.id);
  await this.load(this.masterOfTheGame.id);
}
list(id:number):Array<TableDeJeu>{

    return this.listTable;
}
async load(id:number){
  await this.tableDeJeuService.findBymjId(id).toPromise().then(resp => {this.listTable=resp;console.log("coucou")});

}



add(table?:TableDeJeu):Array<Personnage>{

    if(table != null){
      this.tableencours=table;
    }
    this.show=true;

    return this.personnageService.findAllPersoOrphanPartie();
}

async remove(id){
  this.load(this.masterOfTheGame.id);
   await this.tableDeJeuService.findById(id).toPromise().then(resp =>{this.tableencours=resp;
      this.showRemove=true;});




}
listr():Array<Personnage>{

      return this.tableencours.personnages;

}

  async delete(id){
    await this.tableDeJeuService.findById(id).toPromise().then(resp =>{this.tableasupprimer=resp;
      for(let perso of this.tableasupprimer.personnages)
      {  this.persoaenlever=perso;
        this.persoaenlever.parties=null;
        this.personnageService.savesimple(this.persoaenlever);
          this.tableDeJeuService.load()}
      this.tableDeJeuService.deleteBydId(id);
    }

    );
    await this.load(this.masterOfTheGame.id);
    await this.load(this.masterOfTheGame.id);
  }
async linkparties(perso:Personnage){

  this.persoarajouter=perso;
  this.persoarajouter.parties=this.tableencours;
  await this.personnageService.savesimple(this.persoarajouter);
  this.tableDeJeuService.load();
  this.personnageService.load();
  await this.load(this.masterOfTheGame.id);
  await this.load(this.masterOfTheGame.id);
  await this.load(this.masterOfTheGame.id);
  await this.personnageService.loadPersoOrphanPartie();
}
close(){
    this.show=false;
}
closer(){
  this.showRemove=false;
}
  async unlinkparties(perso:Personnage){

    this.persoaenlever=perso;
    this.persoaenlever.parties=null;
    await this.personnageService.savesimple(this.persoaenlever);
    this.tableDeJeuService.load();
    this.personnageService.load();
    await this.load(this.masterOfTheGame.id);
    await this.load(this.masterOfTheGame.id);
    await this.load(this.masterOfTheGame.id);
    await this.tableDeJeuService.findById(this.tableencours.id).toPromise().then(resp =>{this.tableencours=resp;
      });
  }
}
