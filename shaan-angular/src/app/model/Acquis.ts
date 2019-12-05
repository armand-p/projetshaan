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


  constructor(id?: number, version?: number, nom?: string, categorie?: string, classe?: number, protection?: string, description?: string, capacite?: string, valeur?: number, prestige?: number) {
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
  }
}
