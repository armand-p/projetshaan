import {AlterationEtat} from './AlterationEtat';
import {Personnage} from './Personnage';

export class AlterationPersonnage {
  id: number;
  version: number;
  persoLie: Personnage;
  alterationEtat: AlterationEtat;


  constructor(id?: number, version?: number, persoLie?: Personnage, alterationEtat?: AlterationEtat) {
    this.id = id;
    this.version = version;
    this.persoLie = persoLie;
    this.alterationEtat = alterationEtat;
  }
}
