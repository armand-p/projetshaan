import {Component, OnInit} from '@angular/core';
import {RaceService} from "../service/race.service";
import {Race} from "../model/Race";
import {Peuple} from "../model/Peuple";
import {PeupleService} from "../service/peuple.service";
import {Caste} from "../model/Caste";
import {CasteService} from "../service/caste.service";
import {Metier} from "../model/Metier";
import {Personnage} from "../model/Personnage";
import {MetierService} from "../service/metier.service";

@Component({
  selector: 'personnage-identite',
  templateUrl: './personnage-identite.component.html',
  styleUrls: ['./personnage-identite.component.css']
})
export class PersonnageIdentiteComponent implements OnInit {

  racePerso: Race = null;

  castePerso: Caste = null;
  metiers: Array<Metier> = new Array<Metier>();

  constructor(private raceService: RaceService, private peupleService: PeupleService,
              private casteService: CasteService, private metierService: MetierService) {
  }

  ngOnInit() {
  }

  listRace(): Array<Race> {
    return this.raceService.findAll();
  }

  listpeuple(): Array<Peuple> {
    return this.peupleService.findAll();
  }

  listcaste(): Array<Caste> {
    return this.casteService.findAll();
  }

  selectCaste($event) {
    this.castePerso = $event;
    this.casteService.findAllMetierByCaste(this.castePerso.id).subscribe(resp => this.metiers = resp);
  }

  // listmetier() {
  //   console.log(this.casteJoueur.id);
  //   this.casteService.findAllMetierByCaste(this.casteJoueur.id).subscribe(resp => this.metiers = resp);
  // }


}
