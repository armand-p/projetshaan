import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {AppConfigService} from '../app-config.service';
import {Specialisation} from '../model/Specialisation';
import {Observable} from 'rxjs';
import {filter} from "rxjs/operators";

@Injectable({
  providedIn: 'root'
})
export class SpecialisationService {

  private specialisations: any;

  constructor(private http: HttpClient, private appConfigService: AppConfigService) {
    this.load();
  }

  load() {
    this.http.get(this.appConfigService.backEnd + 'specialisation')
      .subscribe(resp => this.specialisations = resp);
  }

  findAll(): Array<Specialisation> {
    return this.specialisations;
  }

  // findSpecByDomaine(): Array<Specialisation> {
  //
  //   this.http.get(this.appConfigService.backEnd + 'specialisation/').subscribe(resp => resp);
  //
  // }

  findById(id: number): Observable<any> {
    return this.http.get(this.appConfigService.backEnd + 'specialisation/' + id);
  }

  findByDomaine(id: number): Observable<any> {
    return this.http.get(this.appConfigService.backEnd + '/domaine/' + id + '/specialisation');
  }

  save(specialisation: Specialisation) {
    if (specialisation.id) {
      this.http.put(this.appConfigService.backEnd + 'specialisation/' + specialisation.id, specialisation).subscribe(resp => this.load());
    } else {
      this.http.post(this.appConfigService.backEnd + 'specialisation/', specialisation).subscribe(resp => this.load());
    }
  }

  deleteBydId(id: number) {
    this.http.delete(this.appConfigService.backEnd + 'specialisation/' + id).subscribe(resp => this.load());
  }
}
