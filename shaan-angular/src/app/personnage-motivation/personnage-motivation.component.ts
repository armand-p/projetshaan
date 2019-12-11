import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {Domaine} from "../model/Domaine";
import {DomaineService} from "../service/domaine.service";
import {Motivation} from "../model/Motivation";
import {MotivationPersonnage} from "../model/MotivationPersonnage";
import {MotivationService} from "../service/motivation.service";
import {DomainePersonnage} from "../model/DomainePersonnage";

@Component({
  selector: 'personnage-motivation',
  templateUrl: './personnage-motivation.component.html',
  styleUrls: ['./personnage-motivation.component.css']
})
export class PersonnageMotivationComponent implements OnInit {

  @Output()
  motivationEnvoi = new EventEmitter<Array<MotivationPersonnage>>();

  motivations: Array<Motivation> = new Array<Motivation>();
  domaines: Array<Domaine> = new Array<Domaine>();
  motivationrPerso: Array<MotivationPersonnage> = new Array<MotivationPersonnage>();
  id: number = null;

  @Input("current")
  domainePerso : Array<DomainePersonnage>;

  constructor(private domaineService: DomaineService, private motivationService: MotivationService) {
  }

  ngOnInit() {
  }

  listDomaine(): Array<DomainePersonnage> {
    this.listMotivation();
    // return this.domaines = this.domaineService.findAll();
    return this.domainePerso.filter(domainePerso => domainePerso.rangDomaine >=5);
  }

  listMotivation() {
    this.motivations = this.motivationService.findAll();
  }

  triMotivation(nom: string): Array<Motivation> {
    return this.motivations.filter(motivation => motivation.domaineLie.nom.indexOf(nom) !== -1);
  }

  ajouteMotivation(motivation: Motivation) {

    if (this.motivationrPerso.filter(motivationPerso => motivationPerso.motivation.nomMotivation.indexOf(motivation.nomMotivation) !== -1).length > 0) {

    } else {
      this.motivationrPerso.push(new MotivationPersonnage(null, null, null, motivation ));
    }

    console.log(this.motivationrPerso);
  }

  suppressionMotivation(motivation: Motivation) {

    var index = this.motivationrPerso.findIndex(motivationrPerso => motivationrPerso.motivation.nomMotivation === motivation.nomMotivation);
    this.motivationrPerso.splice(index, 1);

    console.log(this.motivationrPerso);

  }

  findMotivation(motivation: Motivation): boolean {

    if (this.motivationrPerso.findIndex(motivationrPerso => motivationrPerso.motivation.nomMotivation === motivation.nomMotivation) === -1) {
      return true;
    } else {
      return false;
    }

  }

  envoi() {
    console.log('envoi')
    this.motivationEnvoi.emit(this.motivationrPerso);
  }


}
