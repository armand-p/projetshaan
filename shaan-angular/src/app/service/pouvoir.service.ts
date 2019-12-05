import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {AppConfigService} from '../app-config.service';
import {Pouvoir} from '../model/pouvoir';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PouvoirService {

  private pouvoirs: any;

  constructor(private http: HttpClient, private appConfigService: AppConfigService) {
    this.load();
  }

  load() {
    this.http.get(this.appConfigService.backEnd + 'pouvoir')
      .subscribe(resp => this.pouvoirs = resp);
  }

  public findAll(): Array<Pouvoir> {
    return this.pouvoirs;
  }

  findById(id: number): Observable<any> {
    return this.http.get(this.appConfigService.backEnd + 'pouvoir/' + id);
  }

  save(pouvoir: Pouvoir) {
    if (pouvoir.id) {
      this.http.put(this.appConfigService.backEnd + 'pouvoir/' + pouvoir.id, pouvoir).subscribe(resp => this.load());
    } else {
      this.http.post(this.appConfigService.backEnd + 'pouvoir/', pouvoir).subscribe(resp => this.load());
    }
  }

  deleteBydId(id: number) {
    this.http.delete(this.appConfigService.backEnd + 'pouvoir/' + id).subscribe(resp => this.load());
  }}
