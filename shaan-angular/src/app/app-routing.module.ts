import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {PersonnageComponent} from "./personnage/personnage.component";
import {HomeComponent} from "./home/home.component";
import {CreationCompteComponent} from "./creation-compte/creation-compte.component";
import {AccueilJoueurComponent} from "./accueil-joueur/accueil-joueur.component";


const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'personnage', component: PersonnageComponent},
  {path: 'creationcompte', component: CreationCompteComponent},
  {path: 'accueiljoueur', component: AccueilJoueurComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
