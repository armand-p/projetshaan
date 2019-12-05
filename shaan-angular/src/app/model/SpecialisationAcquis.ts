import {Specialisation} from './Specialisation';
import {Acquis} from './Acquis';

export class SpecialisationAcquis {
  id: number;
  version: number;
  specialisation : Specialisation;
  acquis : Acquis;


  constructor(id: number, version: number, specialisation: Specialisation, acquis: Acquis) {
    this.id = id;
    this.version = version;
    this.specialisation = specialisation;
    this.acquis = acquis;
  }
}
