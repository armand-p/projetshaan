import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {AppConfigService} from "../app-config.service";
import {Observable} from "rxjs";
import {BonusPersonnage} from "../model/BonusPersonnage";
import {Specialisation} from "../model/Specialisation";

@Injectable({
  providedIn: 'root'
})
export class BonusPersonnageService {

  private bonusPerso: any;

  constructor(private http: HttpClient, private appConfigService: AppConfigService) {
    this.load();
  }

  load() {
    this.http.get(this.appConfigService.backEnd + 'bonusPersonnage')
      .subscribe(resp => this.bonusPerso = resp);
  }

  public findAll(): Array<BonusPersonnage> {
    return this.bonusPerso;
  }
  findById(id: number): Observable<any> {
    return this.http.get(this.appConfigService.backEnd + 'bonusPersonnage/' + id);
  }

  save(bonusPerso: BonusPersonnage) {
    if (bonusPerso.id) {
      this.http.put(this.appConfigService.backEnd + 'bonusPersonnage/' + bonusPerso.id, bonusPerso).subscribe(resp => this.load());
    } else {
      this.http.post(this.appConfigService.backEnd + 'bonusPersonnage/', bonusPerso).subscribe(resp => this.load());
    }
  }

  deleteBydId(id: number) {
    this.http.delete(this.appConfigService.backEnd + 'bonusPersonnage/' + id).subscribe(resp => this.load());
  }

}
