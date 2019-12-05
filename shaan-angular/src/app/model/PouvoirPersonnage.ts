import {Pouvoir} from './Pouvoir';

export class PouvoirPersonnage {
  id: number;
  version: number;
  persoLie: Personage;
  pouvoir: Pouvoir;


  constructor(id?: number, version?: number, persoLie?: Personage, pouvoir?: Pouvoir) {
    this.id = id;
    this.version = version;
    this.persoLie = persoLie;
    this.pouvoir = pouvoir;
  }
}
