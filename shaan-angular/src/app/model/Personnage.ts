import {Joueur} from './Joueur';
import {Metier} from './Metier';
import {Caste} from './Caste';
import {Race} from './Race';
import {Peuple} from './Peuple';
import {TableDeJeu} from './TableDeJeu';

export class Personnage {
  id: number;
  version: number;
  type:string;
  nom:string;
  taille:number;
  sexe:string;
  poids:number;
  age:number;
  ame:number;
  corps:number;
  esprit:number;
  joueur:Joueur;
  racePerso:Race;
  peuplePerso:Peuple;
  metierPerso:Metier;
  castePerso:Caste;
  parties:TableDeJeu;


  constructor(id?: number, version?: number, nom?: string, taille?: number, sexe?: string, poids?: number, age?: number, ame?: number, corps?: number, esprit?: number, joueur?: Joueur, racePerso?: Race, peuplePerso?: Peuple, metierPerso?: Metier, castePerso?: Caste, parties?: TableDeJeu) {
    this.id = id;
    this.version = version;
    this.nom = nom;
    this.taille = taille;
    this.sexe = sexe;
    this.poids = poids;
    this.age = age;
    this.ame = ame;
    this.corps = corps;
    this.esprit = esprit;
    this.joueur = joueur;
    this.racePerso = racePerso;
    this.peuplePerso = peuplePerso;
    this.metierPerso = metierPerso;
    this.castePerso = castePerso;
    this.parties = parties;
  }
}
