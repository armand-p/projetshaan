import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {AppConfigService} from '../app-config.service';
import {Personnage} from '../model/Personnage';
import {Observable} from 'rxjs';
import {DomainePersonnage} from "../model/DomainePersonnage";
import {DomainePersonnageService} from "./domaine-personnage.service";
import {BonusPersonnage} from "../model/BonusPersonnage";
import {BonusPersonnageService} from "./bonus-personnage.service";

@Injectable({
  providedIn: 'root'
})
export class PersonnageService {

  private personnages: any;
  private personnageJoueur:any;
  private personnageOnly :any;
  private personnageNoPartie :any;
  private idPerso: any;

  constructor(private http: HttpClient, private appConfigService: AppConfigService, private domainePersonnageService:DomainePersonnageService,
              private bonusPersonnageService:BonusPersonnageService) {
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
  findByJoueur(id:number): Observable<any>{
    this.http.get(this.appConfigService.backEnd+'persos/'+ id).subscribe(resp =>this.personnageJoueur =resp);
    return this.personnageJoueur;
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

  savesimple(personnage: Personnage)  {
    if (personnage.id) {
      this.http.put(this.appConfigService.backEnd + 'personnage/' + personnage.id, personnage).subscribe(resp => {this.load();this.loadPersoOrphanPartie()});
    } else {
      this.http.post<Personnage>(this.appConfigService.backEnd + 'personnage/', personnage).subscribe(resp => {
        this.load()
      });


    }}


  save(personnage: Personnage, domainePerso:Array<DomainePersonnage>, bonusPerso:Array<BonusPersonnage>)  {
    if (personnage.id) {
      this.http.put(this.appConfigService.backEnd + 'personnage/' + personnage.id, personnage).subscribe(resp => {this.load();this.loadPersoOrphanPartie()});
    } else {
      this.http.post<Personnage>(this.appConfigService.backEnd + 'personnage/', personnage).subscribe(resp => {
        this.idPerso = resp.id;
        console.log(this.idPerso);

        for(let i = 0; i < domainePerso.length; i++){
          domainePerso[i].persoLie = resp;
          this.domainePersonnageService.save(domainePerso[i]);
        }

        for(let i = 0; i < bonusPerso.length; i++){
          bonusPerso[i].pesoLie = resp;
          this.bonusPersonnageService.save(bonusPerso[i]);
        }

        this.load()
      });


    }}


  deleteBydId(id: number) {
    this.http.delete(this.appConfigService.backEnd + 'personnage/' + id).subscribe(resp => this.load());
  }

}
