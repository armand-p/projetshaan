import {Domaine} from './Domaine';
import {Personnage} from './Personnage';

export class DomainePersonnage{
  id:number;
  version:number;
  rangDomaine:number;
  domaineLie:Domaine;
  persoLie:Personnage;

  constructor(id?: number, version?: number, rangDomaine?: number, domaineLie?: Domaine, persoLie?: Personnage) {
    this.id = id;
    this.version = version;
    this.rangDomaine = rangDomaine;
    this.domaineLie = domaineLie;
    this.persoLie = persoLie;
  }


}
