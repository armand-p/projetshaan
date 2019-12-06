export class Utilisateur {
  id: number;
  version: number;
  pseudo: string;
  motDePasse: string;
  mdpConfirmation: string;
  email: string;
  emailConfirmation: string;
  type:string;

  constructor(id?: number, version?: number, pseudo?: string, motDePasse?: string, email?: string, type?:string) {
    this.id = id;
    this.version = version;
    this.pseudo = pseudo;
    this.motDePasse = motDePasse;
    this.email = email;
    this.type = type;
  }
}
