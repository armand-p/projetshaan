import {Domaine} from './Domaine';

export class Pouvoir {
  id : number;
  version : number;
  nomPouvoir : string;
  rang : string;
  type : string;
  test : string;
  frequence : string;
  activation : string;
  portee : string;
  cible : string;
  nbCible : string;
  typeDegat : string;
  duree : string;
  cout : string;
  degats : string;
  description : string;
  domaineLie : Domaine;


  constructor(id?: number, version?: number, nomPouvoir?: string, rang?: string, type?: string, test?: string, frequence?: string, activation?: string, portee?: string, cible?: string, nbCible?: string, typeDegat?: string, duree?: string, cout?: string, degats?: string, description?: string, domaineLie?: Domaine) {
    this.id = id;
    this.version = version;
    this.nomPouvoir = nomPouvoir;
    this.rang = rang;
    this.type = type;
    this.test = test;
    this.frequence = frequence;
    this.activation = activation;
    this.portee = portee;
    this.cible = cible;
    this.nbCible = nbCible;
    this.typeDegat = typeDegat;
    this.duree = duree;
    this.cout = cout;
    this.degats = degats;
    this.description = description;
    this.domaineLie = domaineLie;
  }
}
