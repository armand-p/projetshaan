import {Utilisateur} from './Utilisateur';
import {PersonnageNonJoueur} from './PersonnageNonJoueur';

export class MaitreDuJeu extends Utilisateur {

pnj:Array<PersonnageNonJoueur>;
  constructor(id?: number, version?: number, pseudo?: string, motDePasse?: string, email?: string, pnj?:Array<PersonnageNonJoueur>) {
    super(id, version, pseudo, motDePasse, email);
    this.pnj=pnj;
  }
}
