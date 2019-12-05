import {Pouvoir} from './Pouvoir';
import {Personnage} from './Personnage';

export class PouvoirPersonnage {
  id: number;
  version: number;
  persoLie: Personnage;
  pouvoir: Pouvoir;


  constructor(id?: number, version?: number, persoLie?: Personnage, pouvoir?: Pouvoir) {
    this.id = id;
    this.version = version;
    this.persoLie = persoLie;
    this.pouvoir = pouvoir;
  }
}
