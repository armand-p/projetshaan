import {MaitreDuJeu} from './MaitreDuJeu';

export class PersonnageNonJoueur {
  createur : MaitreDuJeu;


  constructor(createur?: MaitreDuJeu) {
    this.createur = createur;
  }
}
