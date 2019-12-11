import {Component, OnInit} from '@angular/core';
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
  pseudo: string;
  motDePasse: string;
  type: string;
  id:string;


  constructor(private router: Router, private utilisateurService: UtilisateurService) {
  }

  ngOnInit() {;

  }

  validate() {
    this.utilisateurs = this.utilisateurService.findAll();
    for (let util of this.utilisateurs) {
      if (util.pseudo == this.pseudo) {
        this.utilisateurService.findById(util.id).subscribe(resp => {
          this.utilisateur = resp;
          if (this.utilisateur.motDePasse == this.motDePasse) {
            localStorage.setItem('isLoggedin', 'true');
            localStorage.setItem(this.motDePasse, this.utilisateur.motDePasse);
            localStorage.setItem(this.pseudo, this.utilisateur.pseudo);
            localStorage.setItem(this.id, this.utilisateur.id);
            localStorage.setItem(this.type, this.utilisateur.type);

            if (this.utilisateur.type == 'joueur') {
              this.type = 'joueur';
              localStorage.setItem(this.type, 'joueur');
              this.router.navigate(['/accueiljoueur/', this.utilisateur.id]);
            } else if (this.utilisateur.type == 'maitreDuJeu') {
              localStorage.setItem(this.type, 'mj');
              this.router.navigate(['/accueilmj/',this.utilisateur.id]);
            }
          } else {
            this.router.navigate(['']);
            this.erreur = true;
          }
        });

      } else {
        this.router.navigate(['']);
        this.erreur = true;
      }
    }
  }
}
