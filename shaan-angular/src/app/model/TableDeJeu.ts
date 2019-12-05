export class TableDeJeu {
  id : number;
  version : number;
  nom : string;
  notes : string;
  statut : boolean;
  connection : boolean;
  // maitreDuJeu : MaitreDuJeu;


  constructor(id?: number, version?: number, nom?: string, notes?: string, statut?: boolean, connection?: boolean) {
    this.id = id;
    this.version = version;
    this.nom = nom;
    this.notes = notes;
    this.statut = statut;
    this.connection = connection;
  }
  
}
