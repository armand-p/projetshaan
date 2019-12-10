import {Component, EventEmitter, OnInit, Output} from '@angular/core';
import {Domaine} from "../model/Domaine";
import {DomaineService} from "../service/domaine.service";
import {PouvoirPersonnage} from "../model/PouvoirPersonnage";
import {Pouvoir} from "../model/Pouvoir";
import {PouvoirService} from "../service/pouvoir.service";

@Component({
  selector: 'personnage-pouvoir',
  templateUrl: './personnage-pouvoir.component.html',
  styleUrls: ['./personnage-pouvoir.component.css']
})
export class PersonnagePouvoirComponent implements OnInit {

  @Output()
  pouvoirEnvoi = new EventEmitter<Array<PouvoirPersonnage>>();

  pouvoirs: Array<Pouvoir> = new Array<Pouvoir>();
  domaines: Array<Domaine> = new Array<Domaine>();
  pouvoirPerso: Array<PouvoirPersonnage> = new Array<PouvoirPersonnage>();
  id: number = null;


  constructor(private domaineService: DomaineService, private pouvoirService: PouvoirService) {
  }

  ngOnInit() {
  }

  listDomaine(): Array<Domaine> {
    this.listPouvoir();
    return this.domaines = this.domaineService.findAll();
  }

  listPouvoir() {
    this.pouvoirs = this.pouvoirService.findAll();
  }

  triPouvoir(nom: string): Array<Pouvoir> {
    return this.pouvoirs.filter(pouvoir => pouvoir.domaineLie.nom.indexOf(nom) !== -1);
  }

  ajoutePouvoir(pouvoir: Pouvoir) {

    if (this.pouvoirPerso.filter(pouvoirPerso => pouvoirPerso.pouvoir.nomPouvoir.indexOf(pouvoir.nomPouvoir) !== -1).length > 0) {

    } else {
      this.pouvoirPerso.push(new PouvoirPersonnage(null, null, null, pouvoir));
    }

    console.log(this.pouvoirPerso);
  }

  suppressionPouvoir(pouvoir: Pouvoir) {

      var index = this.pouvoirPerso.findIndex(pouvoirPerso => pouvoirPerso.pouvoir.nomPouvoir === pouvoir.nomPouvoir);
      this.pouvoirPerso.splice(index, 1);

    console.log(this.pouvoirPerso);

  }

  findPouvoir(pouvoir: Pouvoir): boolean {

    if (this.pouvoirPerso.findIndex(pouvoirPerso => pouvoirPerso.pouvoir.nomPouvoir === pouvoir.nomPouvoir) === -1) {
      return true;
    } else {
      return false;
    }

  }

  envoi() {
    console.log('envoi')
    this.pouvoirEnvoi.emit(this.pouvoirPerso);
  }


}
