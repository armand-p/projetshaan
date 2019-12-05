import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {AppConfigService} from "../app-config.service";
import {Observable} from "rxjs";
import {Peuple} from "../model/Peuple";

@Injectable({
  providedIn: 'root'
})
export class PeupleService {

  private peuples: any;

  constructor(private http: HttpClient, private appConfigService: AppConfigService) {
    this.load();
  }

  load() {
    this.http.get(this.appConfigService.backEnd + 'peuple')
      .subscribe(resp => this.peuples = resp);
  }

  findAll(): any {
    return this.peuples;
  }

  findById(id: number): Observable<any> {
    return this.http.get(this.appConfigService.backEnd + 'peuple/' + id);
  }

  save(peuple: Peuple) {
    if (peuple.id) {
      this.http.put(this.appConfigService.backEnd + 'peuple/' + peuple.id, peuple).subscribe(resp => this.load());
    } else {
      this.http.post(this.appConfigService.backEnd + 'peuple/', peuple).subscribe(resp => this.load());
    }
  }

  deleteBydId(id: number) {
    this.http.delete(this.appConfigService.backEnd + 'peuple/' + id).subscribe(resp => this.load());
  }
}



