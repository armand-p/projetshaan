import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {AppConfigService} from '../app-config.service';
import {Utilisateur} from '../model/Utilisateur';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UtilisateurService {
  private maitreDuJeus : any;
  private joueurs: any;

  constructor(private http: HttpClient, private appConfigService: AppConfigService) {
    this.load();
  }

  load() {
    this.http.get(this.appConfigService.backEnd + 'joueur')
      .subscribe(resp => this.joueurs = resp);
    this.http.get(this.appConfigService.backEnd + 'mj')
      .subscribe(resp => this.maitreDuJeus = resp);
  }

  public findAll(type:string): Array<Utilisateur> {
    if(type === "joueur"){
    return this.joueurs;}
    else if(type=== "maitreDuJeu"){
      return this.maitreDuJeus
    }
  }

  findById(id: number,type:string): Observable<any> {
    if(type === "joueur"){
      return this.http.get(this.appConfigService.backEnd + 'joueur/' + id);}
    else if(type=== "maitreDuJeu"){
      return this.http.get(this.appConfigService.backEnd + 'mj/' + id);
    }

  }

  save(utilisateur: Utilisateur) {
    if(utilisateur.type="maitreDuJeu"){
      if (utilisateur.id) {
        this.http.put(this.appConfigService.backEnd + 'mj/' + utilisateur.id, utilisateur).subscribe(resp => this.load());
      } else {
        this.http.post(this.appConfigService.backEnd + 'mj/', utilisateur).subscribe(resp => this.load());
      }

    }
    else{
      if (utilisateur.id) {
        this.http.put(this.appConfigService.backEnd + 'joueur/' + utilisateur.id, utilisateur).subscribe(resp => this.load());
      } else {
        this.http.post(this.appConfigService.backEnd + 'joueur/', utilisateur).subscribe(resp => this.load());
      }

    }
  }

  deleteBydId(id: number,type:string) {
    if(type === "joueur"){
      this.http.delete(this.appConfigService.backEnd + 'joueur/' + id).subscribe(resp => this.load());}
    else if(type=== "maitreDuJeu"){
      this.http.delete(this.appConfigService.backEnd + 'mj/' + id).subscribe(resp => this.load());
    }

  }}
