import {Metier} from './Metier';
import {Domaine} from './Domaine';

export class Specialisation {
  id : number;
  version : number;
  nom : string;
  description : string;
  metier : Metier;
  domineLie :Domaine;


  constructor(id?: number, version?: number, nom?: string, description?: string, metier?: Metier, domineLie?: Domaine) {
    this.id = id;
    this.version = version;
    this.nom = nom;
    this.description = description;
    this.metier = metier;
    this.domineLie = domineLie;
  }
}
