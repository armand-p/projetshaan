import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {AppConfigService} from '../app-config.service';
import {AlterationEtat} from '../model/AlterationEtat';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AlterationEtatService {

  private alterationEtats: any;

  constructor(private http: HttpClient, private appConfigService: AppConfigService) {
    this.load();
  }

  load() {
    this.http.get(this.appConfigService.backEnd + 'alterationEtat')
      .subscribe(resp => this.alterationEtats = resp);
  }

  public findAll(): Array<AlterationEtat> {
    return this.alterationEtats;
  }

  findById(id: number): Observable<any> {
    return this.http.get(this.appConfigService.backEnd + 'alterationEtat/' + id);
  }

  save(alterationEtat: AlterationEtat) {
    if (alterationEtat.id) {
      this.http.put(this.appConfigService.backEnd + 'alterationEtat/' + alterationEtat.id, alterationEtat).subscribe(resp => this.load());
    } else {
      this.http.post(this.appConfigService.backEnd + 'alterationEtat/', alterationEtat).subscribe(resp => this.load());
    }
  }

  deleteBydId(id: number) {
    this.http.delete(this.appConfigService.backEnd + 'alterationEtat/' + id).subscribe(resp => this.load());
  }}
