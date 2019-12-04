import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'personnage-identite',
  templateUrl: './personnage-identite.component.html',
  styleUrls: ['./personnage-identite.component.css']
})
export class PersonnageIdentiteComponent implements OnInit {

  //Données temporaires
  races: Array<string> = ['Kelwin', 'Ygwan', 'Delian'];


  constructor() { }

  ngOnInit() {
  }

}
