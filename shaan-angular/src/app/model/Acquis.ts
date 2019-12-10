import {Domaine} from "./Domaine";

export class Acquis{
id:number;
version:number;
nom:string;
categorie:string;
classe:number;
protection:string;
description:string;
capacite:string;
valeur:number;
prestige:number;
domaine:Domaine;


  constructor(id?: number, version?: number, nom?: string, categorie?: string, classe?: number, protection?: string, description?: string, capacite?: string, valeur?: number, prestige?: number, domaine?: Domaine) {
    this.id = id;
    this.version = version;
    this.nom = nom;
    this.categorie = categorie;
    this.classe = classe;
    this.protection = protection;
    this.description = description;
    this.capacite = capacite;
    this.valeur = valeur;
    this.prestige = prestige;
    this.domaine = domaine;
  }
}
