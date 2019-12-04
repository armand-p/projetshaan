import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PersonnageComponent } from './personnage/personnage.component';
import { PersonnageIdentiteComponent } from './personnage-identite/personnage-identite.component';
import { PersonnageSpecialisationComponent } from './personnage-specialisation/personnage-specialisation.component';
import { PersonnagePouvoirComponent } from './personnage-pouvoir/personnage-pouvoir.component';
import { PersonnageAcquisComponent } from './personnage-acquis/personnage-acquis.component';
import { PersonnageMotivationComponent } from './personnage-motivation/personnage-motivation.component';

@NgModule({
  declarations: [
    AppComponent,
    PersonnageComponent,
    PersonnageIdentiteComponent,
    PersonnageSpecialisationComponent,
    PersonnagePouvoirComponent,
    PersonnageAcquisComponent,
    PersonnageMotivationComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
