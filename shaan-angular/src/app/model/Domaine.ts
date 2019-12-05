export class Domaine{
  id:number;
  version:number;
  nom:string;
  elementLie:string;
  description:string;


  constructor(id?: number, version?: number, nom?: string, elementLie?: string, description?: string) {
    this.id = id;
    this.version = version;
    this.nom = nom;
    this.elementLie = elementLie;
    this.description = description;
  }
}
