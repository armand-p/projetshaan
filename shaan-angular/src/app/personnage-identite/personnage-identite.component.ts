import { Component, OnInit } from '@angular/core';
import {RaceService} from "../service/race.service";
import {Race} from "../model/Race";
import {Peuple} from "../model/Peuple";
import {PeupleService} from "../service/peuple.service";

@Component({
  selector: 'personnage-identite',
  templateUrl: './personnage-identite.component.html',
  styleUrls: ['./personnage-identite.component.css']
})
export class PersonnageIdentiteComponent implements OnInit {

  //Données temporaires
  castes: Array<string> = ['Novateurs', 'ombres', 'artisants','artiste'];
  metiers: Array<string> = ['forgeron', 'mineur', 'codeur'];

  constructor(private raceService:RaceService, private peupleService:PeupleService) { }

  ngOnInit() {
  }

  listRace(): Array<Race> {
    return this.raceService.findAll();
  }

  listpeuple(): Array<Peuple> {
    return this.peupleService.findAll();
  }

  listcaste(): Array<Race> {
    return null;
  }

  listmetier(): Array<Race> {
    return null;
  }

}
