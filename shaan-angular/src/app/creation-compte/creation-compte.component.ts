import { Component, OnInit } from '@angular/core';
import {Utilisateur} from '../model/Utilisateur';
import {UtilisateurService} from '../service/utilisateur.service';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';


@Component({
  selector: 'app-creation-compte',
  templateUrl: './creation-compte.component.html',
  styleUrls: ['./creation-compte.component.css']
})
export class CreationCompteComponent implements OnInit {

    utilisateur : Utilisateur = new Utilisateur();
    myForm: FormGroup;

  save(){
     this.utilisateurService.save(this.utilisateur);
  }
  constructor(private utilisateurService : UtilisateurService) { }

  ngOnInit() {
  }

}
