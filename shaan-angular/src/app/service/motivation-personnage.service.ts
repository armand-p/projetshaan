import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {AppConfigService} from "../app-config.service";
import {PouvoirPersonnage} from "../model/PouvoirPersonnage";
import {Observable} from "rxjs";
import {MotivationPersonnage} from "../model/MotivationPersonnage";

@Injectable({
  providedIn: 'root'
})
export class MotivationPersonnageService {

  private motivationPerso: any;

  constructor(private http: HttpClient, private appConfigService: AppConfigService) {
    this.load();
  }

  load() {
    this.http.get(this.appConfigService.backEnd + 'motivationPersonnage')
      .subscribe(resp => this.motivationPerso = resp);
  }

  public findAll(): Array<PouvoirPersonnage> {
    return this.motivationPerso;
  }

  findById(id: number): Observable<any> {
    return this.http.get(this.appConfigService.backEnd + 'motivationPersonnage/' + id);
  }

  save(motivationPerso: MotivationPersonnage) {
    if (motivationPerso.id) {
      this.http.put(this.appConfigService.backEnd + 'motivationPersonnage/' + motivationPerso.id, motivationPerso).subscribe(resp => this.load());
    } else {
      this.http.post(this.appConfigService.backEnd + 'motivationPersonnage/', motivationPerso).subscribe(resp => this.load());
    }
  }

  deleteBydId(id: number) {
    this.http.delete(this.appConfigService.backEnd + 'motivationPersonnage/' + id).subscribe(resp => this.load());
  }
}
