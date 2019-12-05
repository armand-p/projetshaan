import { Component, OnInit } from '@angular/core';
import {RaceService} from "../service/race.service";
import {Race} from "../model/Race";

@Component({
  selector: 'personnage-identite',
  templateUrl: './personnage-identite.component.html',
  styleUrls: ['./personnage-identite.component.css']
})
export class PersonnageIdentiteComponent implements OnInit {

  //Données temporaires
  race: Race = null;
  origines: Array<string> = ['Forets blanches', 'desert', 'ville'];
  castes: Array<string> = ['Novateurs', 'ombres', 'artisants','artiste'];
  metiers: Array<string> = ['forgeron', 'mineur', 'codeur'];

  constructor(private raceService:RaceService) { }

  ngOnInit() {
  }

  list(): Array<Race> {
    return this.raceService.findAll();
  }

}
