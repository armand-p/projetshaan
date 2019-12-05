import {Motivation} from './Motivation';
import {Personnage} from './Personnage';

export class MotivationPersonnage {
  id: number;
  version: number;
  persoLie:Personnage;
  motivation:Motivation;


  constructor(id?: number, version?: number, persoLie?: Personnage, motivation?: Motivation) {
    this.id = id;
    this.version = version;
    this.persoLie = persoLie;
    this.motivation = motivation;
  }
}
