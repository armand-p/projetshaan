import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {Personnage} from "../model/Personnage";
import {PersonnageService} from "../service/personnage.service";
import {DomainePersonnage} from "../model/DomainePersonnage";
import {ActivatedRoute} from "@angular/router";


@Component({
  selector: 'app-personnage',
  templateUrl: './personnage.component.html',
  styleUrls: ['./personnage.component.css']
})
export class PersonnageComponent implements OnInit {

  page: string = 'identite';

  personnage:Personnage = new Personnage();
  domainePerso: Array<DomainePersonnage> = new Array<DomainePersonnage>(10);


  id:number;

  @Output()
  childEvent = new EventEmitter();

  constructor(private personnageService:PersonnageService,private route:ActivatedRoute ) {
    this.route.params.subscribe(params => this.id=params.id);
    if (this.id == null){
      this.personnage.type = 'Personnage';
    } else {
      this.personnageService.findById(this.id).subscribe(resp => this.personnage = resp);
    }

  }

  ngOnInit() {
  }

  receptionPerso(persoRecu:Personnage){
    this.personnage.racePerso = persoRecu.racePerso;
    this.personnage.peuplePerso = persoRecu.peuplePerso;
    this.personnage.castePerso = persoRecu.castePerso;
    this.personnage.metierPerso = persoRecu.metierPerso;
  }

  receptionDomaine(domaineRecu:Array<DomainePersonnage>){
    for(let i = 0; i < this.domainePerso.length; i++){
      this.domainePerso[i] = new DomainePersonnage();
      this.domainePerso[i]=domaineRecu[i];
    }
  }

  save() {
    this.personnageService.save(this.personnage, this.domainePerso);
  }

  cancel(){
    this.childEvent.emit();
  }


}
