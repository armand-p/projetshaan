import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {AppConfigService} from '../app-config.service';
import {Domaine} from '../model/domaine';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class DomaineService {

  private domaines: any;

  constructor(private http: HttpClient, private appConfigService: AppConfigService) {
    this.load();
  }

  load() {
    this.http.get(this.appConfigService.backEnd + 'domaine')
      .subscribe(resp => this.domaines = resp);
  }

  findAll(): Array<Domaine> {
    return this.domaines;
  }

  findById(id: number): Observable<any> {
    return this.http.get(this.appConfigService.backEnd + 'domaine/' + id);
  }

  save(domaine: Domaine) {
    if (domaine.id) {
      this.http.put(this.appConfigService.backEnd + 'domaine/' + domaine.id, domaine).subscribe(resp => this.load());
    } else {
      this.http.post(this.appConfigService.backEnd + 'domaine/', domaine).subscribe(resp => this.load());
    }
  }

  deleteBydId(id: number) {
    this.http.delete(this.appConfigService.backEnd + 'domaine/' + id).subscribe(resp => this.load());
  }}
