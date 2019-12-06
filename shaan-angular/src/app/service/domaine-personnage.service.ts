import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {AppConfigService} from "../app-config.service";
import {Domaine} from "../model/Domaine";
import {Observable} from "rxjs";
import {DomainePersonnage} from "../model/DomainePersonnage";

@Injectable({
  providedIn: 'root'
})
export class DomainePersonnageService {

  private domainePerso: any;

  constructor(private http: HttpClient, private appConfigService: AppConfigService) {
    this.load();
  }

  load() {
    this.http.get(this.appConfigService.backEnd + 'domainePersonnage')
      .subscribe(resp => this.domainePerso = resp);
  }

  public findAll(): Array<Domaine> {
    return this.domainePerso;
  }

  findById(id: number): Observable<any> {
    return this.http.get(this.appConfigService.backEnd + 'domainePersonnage/' + id);
  }

  save(domainePerso: DomainePersonnage) {
    if (domainePerso.id) {
      this.http.put(this.appConfigService.backEnd + 'domainePersonnage/' + domainePerso.id, domainePerso).subscribe(resp => this.load());
    } else {
      this.http.post(this.appConfigService.backEnd + 'domainePersonnage/', domainePerso).subscribe(resp => this.load());
    }
  }

  deleteBydId(id: number) {
    this.http.delete(this.appConfigService.backEnd + 'domainePersonnage/' + id).subscribe(resp => this.load());
  }}
