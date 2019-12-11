import {Specialisation} from './Specialisation';
import {Peuple} from './Peuple';
import {Domaine} from './Domaine';
import {Caste} from './Caste';

export class Race{
  id : number;
  version : number;
  nomRace : string;
  domaine : Domaine;
  specialisation1 : Specialisation;
  specialisation2 : Specialisation;
  tailleEstmation : string;
  poidsEstmation : string;
  langue : string;
  pouvoirDeRace : string;
  peupleOrigine : Peuple;
  castePredilection : Caste;
  elementTotem : string;
  couleurSymbolique : string;


  constructor(id?: number, version?: number, nomRace?: string, domaine?: Domaine, specialisation1?: Specialisation, specilisation2?: Specialisation, tailleEstmation?: string, poidsEstmation?: string, langue?: string, pouvoirDeRace?: string, peupleOrigine?: Peuple, castePredilection?: Caste, elementTotem?: string, couleurSymbolique?: string) {
    this.id = id;
    this.version = version;
    this.nomRace = nomRace;
    this.domaine = domaine;
    this.specialisation1 = specialisation1;
    this.specialisation2 = specilisation2;
    this.tailleEstmation = tailleEstmation;
    this.poidsEstmation = poidsEstmation;
    this.langue = langue;
    this.pouvoirDeRace = pouvoirDeRace;
    this.peupleOrigine = peupleOrigine;
    this.castePredilection = castePredilection;
    this.elementTotem = elementTotem;
    this.couleurSymbolique = couleurSymbolique;
  }
}
