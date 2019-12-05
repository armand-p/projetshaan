import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PersonnageComponent } from './personnage/personnage.component';
import { HomeComponent } from './home/home.component';
import {FormsModule} from "@angular/forms";
import { CreationCompteComponent } from './creation-compte/creation-compte.component';
import { AccueilJoueurComponent } from './accueil-joueur/accueil-joueur.component';
import { PersonnageIdentiteComponent } from './personnage-identite/personnage-identite.component';
import { PersonnageSpecialisationComponent } from './personnage-specialisation/personnage-specialisation.component';
import { PersonnagePouvoirComponent } from './personnage-pouvoir/personnage-pouvoir.component';
import { PersonnageAcquisComponent } from './personnage-acquis/personnage-acquis.component';
import { PersonnageMotivationComponent } from './personnage-motivation/personnage-motivation.component';

import {HttpClientModule} from "@angular/common/http";
import {AppConfigService} from './app-config.service';


@NgModule({
  declarations: [
    AppComponent,
    PersonnageComponent,
    HomeComponent,
    CreationCompteComponent,
    AccueilJoueurComponent,
    PersonnageComponent,
    PersonnageIdentiteComponent,
    PersonnageSpecialisationComponent,
    PersonnagePouvoirComponent,
    PersonnageAcquisComponent,
    PersonnageMotivationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [AppConfigService],
  bootstrap: [AppComponent]
})
export class AppModule { }
