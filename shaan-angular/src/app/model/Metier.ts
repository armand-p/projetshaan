import {Caste} from './Caste';
import {Specialisation} from './Specialisation';

export class Metier{
  id:number;
  version:number;
  nomMetier:string;
  voie:string;
  description:string;
  specialisation:Specialisation;
  casteLie:Caste;


  constructor(id?: number, version?: number, nomMetier?: string, voie?: string, description?: string, specialisation?: Specialisation, casteLie?: Caste) {
    this.id = id;
    this.version = version;
    this.nomMetier = nomMetier;
    this.voie = voie;
    this.description = description;
    this.specialisation = specialisation;
    this.casteLie = casteLie;
  }
}
