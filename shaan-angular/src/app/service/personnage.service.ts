import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {AppConfigService} from '../app-config.service';
import {Personnage} from '../model/Personnage';
import {Observable} from 'rxjs';
import {DomainePersonnage} from "../model/DomainePersonnage";
import {DomainePersonnageService} from "./domaine-personnage.service";

@Injectable({
  providedIn: 'root'
})
export class PersonnageService {

  private personnages: any;
  private idPerso: number;

  constructor(private http: HttpClient, private appConfigService: AppConfigService, private domainePersonnageService:DomainePersonnageService) {
    this.load();
  }

  load() {
    this.http.get(this.appConfigService.backEnd + 'personnage')
      .subscribe(resp => this.personnages = resp);
  }

  public findAll(): Array<Personnage> {
    return this.personnages;
  }

  findById(id: number): Observable<any> {
    return this.http.get(this.appConfigService.backEnd + 'personnage/' + id);
  }

  save(personnage: Personnage, domainePerso:Array<DomainePersonnage>)  {
    if (personnage.id) {
      this.http.put(this.appConfigService.backEnd + 'personnage/' + personnage.id, personnage).subscribe(resp => this.load());
    } else {
      this.http.post<Personnage>(this.appConfigService.backEnd + 'personnage/', personnage).subscribe(resp => {
        this.idPerso = resp.id;
        console.log(this.idPerso);

        for(let i = 0; i < domainePerso.length; i++){
          domainePerso[i].persoLie = resp;
          this.domainePersonnageService.save(domainePerso[i]);
        }

        this.load()
      });


    }
  }

  deleteBydId(id: number) {
    this.http.delete(this.appConfigService.backEnd + 'personnage/' + id).subscribe(resp => this.load());
  }
}
