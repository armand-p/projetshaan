import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {AppConfigService} from '../app-config.service';
import {Observable} from 'rxjs';
import {Acquis} from '../model/Acquis';

@Injectable({
  providedIn: 'root'
})
export class AcquisService {

  private acquiss: any;

  constructor(private http: HttpClient, private appConfigService: AppConfigService) {
    this.load();
  }

  load() {
    this.http.get(this.appConfigService.backEnd + 'acquis')
      .subscribe(resp => this.acquiss = resp);
  }

  public findAll(): Array<Acquis> {
    return this.acquiss;
  }

  findById(id: number): Observable<any> {
    return this.http.get(this.appConfigService.backEnd + 'acquis/' + id);
  }

  save(acquis: Acquis) {
    if (acquis.id) {
      this.http.put(this.appConfigService.backEnd + 'acquis/' + acquis.id, acquis).subscribe(resp => this.load());
    } else {
      this.http.post(this.appConfigService.backEnd + 'acquis/', acquis).subscribe(resp => this.load());
    }
  }

  deleteBydId(id: number) {
    this.http.delete(this.appConfigService.backEnd + 'acquis/' + id).subscribe(resp => this.load());
  }}
