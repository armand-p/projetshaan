import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {AppConfigService} from '../app-config.service';
import {Metier} from '../model/Metier';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MetierService {

  private metiers: any;

  constructor(private http: HttpClient, private appConfigService: AppConfigService) {
    this.load();
  }

  load() {
    this.http.get(this.appConfigService.backEnd + 'metier')
      .subscribe(resp => this.metiers = resp);
  }

  public findAll(): Array<Metier> {
    return this.metiers;
  }

  findById(id: number): Observable<any> {
    return this.http.get(this.appConfigService.backEnd + 'metier/' + id);
  }

  save(metier: Metier) {
    if (metier.id) {
      this.http.put(this.appConfigService.backEnd + 'metier/' + metier.id, metier).subscribe(resp => this.load());
    } else {
      this.http.post(this.appConfigService.backEnd + 'metier/', metier).subscribe(resp => this.load());
    }
  }

  deleteBydId(id: number) {
    this.http.delete(this.appConfigService.backEnd + 'metier/' + id).subscribe(resp => this.load());
  }}
