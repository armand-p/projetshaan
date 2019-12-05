export class Caste{
  id:number;
  version:number;
  nomCaste:string;
  desription:string;
  domaine:Domaine;


  constructor(id?: number, version?: number, nomCaste?: string, desription?: string, domaine?: Domaine) {
    this.id = id;
    this.version = version;
    this.nomCaste = nomCaste;
    this.desription = desription;
    this.domaine = domaine;
  }
}
