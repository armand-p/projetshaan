import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Race} from "../model/Race";
import {AppConfigService} from '../app-config.service';

@Injectable({
  providedIn: 'root'
})
export class RaceService {

  private races: any;

  constructor(private http: HttpClient, private appConfigService: AppConfigService) {
    this.load();
  }

  load() {
    this.http.get(this.appConfigService.backEnd + 'race')
      .subscribe(resp => this.races = resp);
  }

  findAll(): any {
    return this.races;
  }

  findById(id: number): Observable<any> {
    return this.http.get(this.appConfigService.backEnd + 'race/' + id);
  }

  save(race: Race) {
    if (race.id) {
      this.http.put(this.appConfigService.backEnd + 'race/' + race.id, race).subscribe(resp => this.load());
    } else {
      this.http.post(this.appConfigService.backEnd + 'race/', race).subscribe(resp => this.load());
    }
  }

  deleteBydId(id: number) {
    this.http.delete(this.appConfigService.backEnd + 'race/' + id).subscribe(resp => this.load());
  }

}



