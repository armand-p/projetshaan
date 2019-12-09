import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {AppConfigService} from '../app-config.service';
import {Utilisateur} from '../model/Utilisateur';
import {Observable} from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class UtilisateurService {
private utilisateurs : any;



  constructor(private http: HttpClient, private appConfigService: AppConfigService) {
    this.load();
  }

  load() {
    this.http.get(this.appConfigService.backEnd + 'utilisateur')
      .subscribe(resp => this.utilisateurs = resp);
  }

  public findAll(): Observable <Array<Utilisateur>> {
    return this.utilisateurs;
  }
  public findAllJoueur(): Observable<any> {
    return this.http.get(this.appConfigService.backEnd + 'utilisateur/joueur');
  }
  public findAllMasterOfTheGame(): Observable<any> {
    return this.http.get(this.appConfigService.backEnd + 'utilisateur/mj');
  }

  findById(id: number): Observable<any> {
    return this.http.get(this.appConfigService.backEnd + 'utilisateur/' + id);
  }

  findByIdJoueur(id: number): Observable<any> {
    return this.http.get(this.appConfigService.backEnd + 'utilisateur/joueur/' + id);
  }
  findByIdMasterOfTheGame(id: number): Observable<any> {
    return this.http.get(this.appConfigService.backEnd + 'utilisateur/mj/' + id);
  }

  save(utilisateur: Utilisateur) {
    if (utilisateur.id) {
      this.http.put(this.appConfigService.backEnd + 'utilisateur/' + utilisateur.id, utilisateur).subscribe(resp => this.load());
    } else {
      this.http.post(this.appConfigService.backEnd + 'utilisateur', utilisateur).subscribe(resp => this.load());
    }
  }


  deleteBydId(id: number) {
    this.http.delete(this.appConfigService.backEnd + 'utilisateur/' + id).subscribe(resp => this.load());
  }

}
