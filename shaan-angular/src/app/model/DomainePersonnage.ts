import {Domaine} from './Domaine';
import {Personnage} from './Personnage';

export class DomainePersonnage{
  id:number;
  version:number;
  rengDomaine:number;
  domaineLie:Domaine;
  persoLie:Personnage;


  constructor(id?: number, version?: number, rengDomaine?: number, domaineLie?: Domaine, persoLie?: Personnage) {
    this.id = id;
    this.version = version;
    this.rengDomaine = rengDomaine;
    this.domaineLie = domaineLie;
    this.persoLie = persoLie;
  }
}
