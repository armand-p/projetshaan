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


const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'personnage', component: PersonnageComponent, canActivate: [AuthGuard]},
  {path: 'personnage/:id', component: PersonnageComponent, canActivate: [AuthGuard]},
  {path: 'creationcompte', component: CreationCompteComponent},
  {path: 'accueiljoueur', component: AccueilJoueurComponent},
  {path: 'accueilmj', component: AccueilMjComponent},
  {path: 'tabledejeu/:id', component: TableDeJeuComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
