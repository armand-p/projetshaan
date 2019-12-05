import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {AppConfigService} from '../app-config.service';
import {Caste} from '../model/Caste';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CasteService {

  private castes: any;

  constructor(private http: HttpClient, private appConfigService: AppConfigService) {
    this.load();
  }

  load() {
    this.http.get(this.appConfigService.backEnd + 'caste')
      .subscribe(resp => this.castes = resp);
  }

  public findAll(): Array<Caste> {
    return this.castes;
  }

  findById(id: number): Observable<any> {
    return this.http.get(this.appConfigService.backEnd + 'caste/' + id);
  }

  save(caste: Caste) {
    if (caste.id) {
      this.http.put(this.appConfigService.backEnd + 'caste/' + caste.id, caste).subscribe(resp => this.load());
    } else {
      this.http.post(this.appConfigService.backEnd + 'caste/', caste).subscribe(resp => this.load());
    }
  }

  deleteBydId(id: number) {
    this.http.delete(this.appConfigService.backEnd + 'caste/' + id).subscribe(resp => this.load());
  }}
