import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {AppConfigService} from "../app-config.service";
import {BonusPersonnage} from "../model/BonusPersonnage";
import {Observable} from "rxjs";
import {PouvoirPersonnage} from "../model/PouvoirPersonnage";

@Injectable({
  providedIn: 'root'
})
export class PouvoirPersonnageService {

  private pouvoirPerso: any;

  constructor(private http: HttpClient, private appConfigService: AppConfigService) {
    this.load();
  }

  load() {
    this.http.get(this.appConfigService.backEnd + 'pouvoirPersonnage')
      .subscribe(resp => this.pouvoirPerso = resp);
  }

  public findAll(): Array<PouvoirPersonnage> {
    return this.pouvoirPerso;
  }
  findById(id: number): Observable<any> {
    return this.http.get(this.appConfigService.backEnd + 'pouvoirPersonnage/' + id);
  }

  save(pouvoirPerso: PouvoirPersonnage) {
    if (pouvoirPerso.id) {
      this.http.put(this.appConfigService.backEnd + 'pouvoirPersonnage/' + pouvoirPerso.id, pouvoirPerso).subscribe(resp => this.load());
    } else {
      this.http.post(this.appConfigService.backEnd + 'pouvoirPersonnage/', pouvoirPerso).subscribe(resp => this.load());
    }
  }

  deleteBydId(id: number) {
    this.http.delete(this.appConfigService.backEnd + 'pouvoirPersonnage/' + id).subscribe(resp => this.load());
  }}
