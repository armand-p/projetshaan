import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {AppConfigService} from '../app-config.service';
import {Personnage} from '../model/Personnage';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PersonnageService {

  private personnages: any;
  private personnageOnly :any;
  private personnageNoPartie :any;
  private idPerso: any;

  constructor(private http: HttpClient, private appConfigService: AppConfigService) {
    this.load();
    this.loadPersoOrphanPartie();
  }

  load() {
    this.http.get(this.appConfigService.backEnd + 'personnage')
      .subscribe(resp => this.personnages = resp);
  }

  public findAll(): Array<Personnage> {
    return this.personnages;
  }

  loadPersoOnly() {
    this.http.get(this.appConfigService.backEnd + 'personnage/onlyPerso')
      .subscribe(resp => this.personnageOnly = resp);
  }
  public findAllPersoOnly(): Array<Personnage> {
    return this.personnageOnly;
  }

  loadPersoOrphanPartie() {
    this.http.get(this.appConfigService.backEnd + 'personnage/noPartie')
      .subscribe(resp => this.personnageNoPartie = resp);
  }

  public findAllPersoOrphanPartie(): Array<Personnage> {
    return this.personnageNoPartie;
  }


  findById(id: number): Observable<any> {
    return this.http.get(this.appConfigService.backEnd + 'personnage/' + id);
  }

  save(personnage: Personnage)  {
    if (personnage.id) {
      this.http.put(this.appConfigService.backEnd + 'personnage/' + personnage.id, personnage).subscribe(resp => {this.load();this.loadPersoOrphanPartie()});
    } else {
      this.http.post(this.appConfigService.backEnd + 'personnage/', personnage).subscribe(resp => {
      //   this.idPerso = resp.id;
        console.log(this.idPerso);
        this.load()
      });


    }}


  deleteBydId(id: number) {
    this.http.delete(this.appConfigService.backEnd + 'personnage/' + id).subscribe(resp => this.load());
  }
}
