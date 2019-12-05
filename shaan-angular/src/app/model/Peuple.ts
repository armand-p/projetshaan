import {Specialisation} from './Specialisation';

export class Peuple {
  id : number;
  version : number;
  nomPeuple : string;
  description : string;
  domaine : Domaine;
  specialisation1 : Specialisation;
  specialisation2 : Specialisation;


  constructor(id?: number, version?: number, nomPeuple?: string, description?: string, domaine?: Domaine, specialisation1?: Specialisation, specialisation2?: Specialisation) {
    this.id = id;
    this.version = version;
    this.nomPeuple = nomPeuple;
    this.description = description;
    this.domaine = domaine;
    this.specialisation1 = specialisation1;
    this.specialisation2 = specialisation2;
  }
}
