import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {PersonnageComponent} from "./personnage/personnage.component";
import {HomeComponent} from "./home/home.component";
import {CreationCompteComponent} from "./creation-compte/creation-compte.component";
import {AccueilJoueurComponent} from "./accueil-joueur/accueil-joueur.component";
import {AccueilMjComponent} from "./accueil-mj/accueil-mj.component";
import {tableDeJeuService} from './service/tableDeJeu.service';
import {TableDeJeuComponent} from './table-de-jeu/table-de-jeu.component';
import {AuthGuard} from './auth-guard.service';
import {FichePersonnageComponent} from "./fiche-personnage/fiche-personnage.component";


const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'personnage', component: PersonnageComponent, canActivate: [AuthGuard]},
  {path: 'personnage/:id', component: PersonnageComponent,canActivate: [AuthGuard]},
  {path: 'creationcompte', component: CreationCompteComponent},
  {path: 'accueiljoueur/:id', component: AccueilJoueurComponent,canActivate: [AuthGuard]},
  {path: 'accueilmj/:id', component: AccueilMjComponent,canActivate: [AuthGuard]},
  {path: 'tabledejeu/:idMJ/:id', component: TableDeJeuComponent,canActivate: [AuthGuard]},
  {path: 'tabledejeu/:id/player/:idJoueur', component: TableDeJeuComponent,canActivate: [AuthGuard]},
  {path: 'fichePerso/:id', component: FichePersonnageComponent,canActivate: [AuthGuard]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
