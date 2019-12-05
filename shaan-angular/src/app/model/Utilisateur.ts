export abstract class Utilisateur {
  id: number;
  version: number;
  pseudo: string;
  motDePasse: string;
  email: string;


  constructor(id?: number, version?: number, pseudo?: string, motDePasse?: string, email?: string) {
    this.id = id;
    this.version = version;
    this.pseudo = pseudo;
    this.motDePasse = motDePasse;
    this.email = email;
  }
}
