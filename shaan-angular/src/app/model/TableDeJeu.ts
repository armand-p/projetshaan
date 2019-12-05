import {MaitreDuJeu} from './MaitreDuJeu';
import {Personnage} from './Personnage';

export class TableDeJeu {
  id : number;
  version : number;
  nom : string;
  notes : string;
  statut : boolean;
  connection : boolean;
  maitreDuJeu : MaitreDuJeu;
  personnages : Array <Personnage>;


  constructor(id?: number, version?: number, nom?: string, notes?: string, statut?: boolean, connection?: boolean, maitreDuJeu? : MaitreDuJeu, personnages?:Array <Personnage>) {
    this.id = id;
    this.version = version;
    this.nom = nom;
    this.notes = notes;
    this.statut = statut;
    this.connection = connection;
    this.maitreDuJeu = maitreDuJeu;
    this.personnages = personnages;
  }

}
