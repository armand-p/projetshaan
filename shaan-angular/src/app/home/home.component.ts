import { Component, OnInit } from '@angular/core';
import {Utilisateur} from '../model/Utilisateur';
import {Router} from '@angular/router';
import {UtilisateurService} from '../service/utilisateur.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {
  model: Utilisateur;
  private utilisateur: any;
  private utilisateurs: Array<Utilisateur> = new Array<Utilisateur>();
  erreur: boolean = false;
  nomUtilisateur: string;
  motDePasse: string;

  constructor(private router: Router, private utilisateurService: UtilisateurService) {
  }
  ngOnInit() {
  }
  validate() {
    this.utilisateurService.findAll().subscribe(resp => {
      this.utilisateurs = resp;
      for (let util of this.utilisateurs) {
        if (util.id == this.model.id) {
          this.utilisateurService.findById(this.model.id).subscribe(resp => {
            this.utilisateur = resp;
            console.log(this.utilisateur);
            if (this.utilisateur.mdp == this.model.motDePasse) {
              localStorage.setItem('isLoggedin', 'true');
              localStorage.setItem('identifiant', this.model.motDePasse);
              localStorage.setItem('id', this.utilisateur.id);
              this.router.navigate(['/utilisateur/', this.utilisateur.id]);
            } else {
              this.router.navigate(['/login']);
              this.erreur = true;
            }
          });
        } else {
          this.router.navigate(['/login']);
          this.erreur = true;
        }
      }
    });
  }
}
