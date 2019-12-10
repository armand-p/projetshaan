import {Domaine} from './Domaine';

export class Caste{
  id:number;
  version:number;
  nomCaste:string;
  description:string;
  domaine:Domaine;


  constructor(id?: number, version?: number, nomCaste?: string, description?: string, domaine?: Domaine) {
    this.id = id;
    this.version = version;
    this.nomCaste = nomCaste;
    this.description = description;
    this.domaine = domaine;
  }
}
