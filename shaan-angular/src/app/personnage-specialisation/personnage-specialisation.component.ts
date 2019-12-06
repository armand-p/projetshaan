import {Component, OnInit} from '@angular/core';
import {Domaine} from "../model/Domaine";
import {DomaineService} from "../service/domaine.service";
import {SpecialisationService} from "../service/specialisation.service";
import {Specialisation} from "../model/Specialisation";
import {Observable, Subscription} from "rxjs";

@Component({
  selector: 'personnage-specialisation',
  templateUrl: './personnage-specialisation.component.html',
  styleUrls: ['./personnage-specialisation.component.css']
})
export class PersonnageSpecialisationComponent implements OnInit {

  specialisations: Array<Specialisation> = new Array<Specialisation>();
  loop: boolean = true;
  id: number = null;

  constructor(private domaineService: DomaineService, private specialisationService: SpecialisationService) {
  }

  ngOnInit() {
  }

  listDomaine(): Array<Domaine> {

    if (this.loop) {
      return this.domaineService.findAll();
    }

  }

  listSpecialisation(id: number){
    this.loop = false;
    console.log('sdqf')
    this.specialisationService.findByDomaine(id).subscribe(resp => this.specialisations = resp);
    console.log(this.specialisations)
  }


}
