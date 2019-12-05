import {Utilisateur} from './Utilisateur';

export class Joueur extends Utilisateur{


  constructor(id?: number, version?: number, pseudo?: string, motDePasse?: string, email?: string) {
    super(id, version, pseudo, motDePasse, email);
  }
}
