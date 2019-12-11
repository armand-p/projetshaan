import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {AppConfigService} from '../app-config.service';
import {TableDeJeu} from '../model/tableDeJeu';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class tableDeJeuService {

  private tableDeJeus: any;

  constructor(private http: HttpClient, private appConfigService: AppConfigService) {
    this.load();
  }

  load() {
    this.http.get(this.appConfigService.backEnd + 'tableDeJeu')
      .subscribe(resp => this.tableDeJeus = resp);
  }



  public findAll(): Array<TableDeJeu> {
    return this.tableDeJeus;
  }

  findById(id: number): Observable<any> {
    return this.http.get(this.appConfigService.backEnd + 'tableDeJeu/' + id);
  }
  findBymjId(id: number): Observable<any> {
    return this.http.get(this.appConfigService.backEnd + 'tableDeJeu/mj/' + id);
  }

  savepost(tableDeJeu: TableDeJeu): Observable<any> {
    if (tableDeJeu.id) {
      return this.http.put(this.appConfigService.backEnd + 'tableDeJeu/' + tableDeJeu.id, tableDeJeu)
    } else {
     return this.http.post(this.appConfigService.backEnd + 'tableDeJeu/', tableDeJeu)
    }
  }

  save(tableDeJeu: TableDeJeu) {
    if (tableDeJeu.id) {
      this.http.put(this.appConfigService.backEnd + 'tableDeJeu/' + tableDeJeu.id, tableDeJeu).subscribe(resp => {this.load();console.log("save")})
    } else {
      this.http.post(this.appConfigService.backEnd + 'tableDeJeu/', tableDeJeu).subscribe(resp => {this.load();console.log("save")});
    }
  }
  deleteBydIdpost(id: number): Observable<any> {
    return this.http.delete(this.appConfigService.backEnd + 'tableDeJeu/' + id);
  }

  deleteBydId(id: number) {
    this.http.delete(this.appConfigService.backEnd + 'tableDeJeu/' + id).subscribe(resp => this.load());
  }}
