import {Acquis} from './Acquis';
import {Specialisation} from './Specialisation';
import {Personnage} from './Personnage';

export class BonusPersonnage{
  id:number;
  version:number;
  bonusAcquis:number;
  bonusPerso:number;
  specialisation:Specialisation;
  acquis:Acquis;
  pesoLie:Personnage;


  constructor(id?: number, version?: number, bonusAcquis?: number, bonusPerso?: number, specialisation?: Specialisation, acquis?: Acquis, pesoLie?: Personnage) {
    this.id = id;
    this.version = version;
    this.bonusAcquis = bonusAcquis;
    this.bonusPerso = bonusPerso;
    this.specialisation = specialisation;
    this.acquis = acquis;
    this.pesoLie = pesoLie;
  }
}
