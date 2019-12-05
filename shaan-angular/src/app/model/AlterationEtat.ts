export class AlterationEtat{
  id:number;
  version:number;
  nom:string;
  effet:string;


  constructor(id?: number, version?: number, nom?: string, effet?: string) {
    this.id = id;
    this.version = version;
    this.nom = nom;
    this.effet = effet;
  }
}
