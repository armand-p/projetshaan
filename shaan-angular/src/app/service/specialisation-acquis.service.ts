import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {AppConfigService} from "../app-config.service";
import {BonusPersonnage} from "../model/BonusPersonnage";
import {Observable} from "rxjs";
import {SpecialisationAcquis} from "../model/SpecialisationAcquis";

@Injectable({
  providedIn: 'root'
})
export class SpecialisationAcquisService {

  private specialisationAcquis: any;

  constructor(private http: HttpClient, private appConfigService: AppConfigService) {
    this.load();
  }

  load() {
    this.http.get(this.appConfigService.backEnd + 'specialisationAcquis')
      .subscribe(resp => this.specialisationAcquis = resp);
  }

  public findAll(): Array<SpecialisationAcquis> {
    return this.specialisationAcquis;
  }
  findById(id: number): Observable<any> {
    return this.http.get(this.appConfigService.backEnd + 'specialisationAcquis/' + id);
  }

  save(specialisationAcquis: SpecialisationAcquis) {
    if (specialisationAcquis.id) {
      this.http.put(this.appConfigService.backEnd + 'specialisationAcquis/' + specialisationAcquis.id, specialisationAcquis).subscribe(resp => this.load());
    } else {
      this.http.post(this.appConfigService.backEnd + 'specialisationAcquis/', specialisationAcquis).subscribe(resp => this.load());
    }
  }

  deleteBydId(id: number) {
    this.http.delete(this.appConfigService.backEnd + 'specialisationAcquis/' + id).subscribe(resp => this.load());
  }}
