import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-creation-compte',
  templateUrl: './creation-compte.component.html',
  styleUrls: ['./creation-compte.component.css']
})
export class CreationCompteComponent implements OnInit {
  nomUtilisateur: string;
  emailUtilisateur: string;
  confirmationEmailUtilisateur: string;
  motDePasse: string;
  confirmationMotDePasse: string;


  constructor() { }

  ngOnInit() {
  }

}
