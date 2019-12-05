import {Domaine} from './Domaine';

export class Motivation {
  id: number;
  version: number;
  nomMotivation:string;
  description:string;
  domaineLie:Domaine;


  constructor(id?: number, version?: number, nomMotivation?: string, description?: string, domaineLie?: Domaine) {
    this.id = id;
    this.version = version;
    this.nomMotivation = nomMotivation;
    this.description = description;
    this.domaineLie = domaineLie;
  }
}
