import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {AppConfigService} from '../app-config.service';
import {Motivation} from '../model/motivation';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MotivationService {

  private motivations: any;

  constructor(private http: HttpClient, private appConfigService: AppConfigService) {
    this.load();
  }

  load() {
    this.http.get(this.appConfigService.backEnd + 'motivation')
      .subscribe(resp => this.motivations = resp);
  }

  public findAll(): Array<Motivation> {
    return this.motivations;
  }

  findById(id: number): Observable<any> {
    return this.http.get(this.appConfigService.backEnd + 'motivation/' + id);
  }

  save(motivation: Motivation) {
    if (motivation.id) {
      this.http.put(this.appConfigService.backEnd + 'motivation/' + motivation.id, motivation).subscribe(resp => this.load());
    } else {
      this.http.post(this.appConfigService.backEnd + 'motivation/', motivation).subscribe(resp => this.load());
    }
  }

  deleteBydId(id: number) {
    this.http.delete(this.appConfigService.backEnd + 'motivation/' + id).subscribe(resp => this.load());
  }}
