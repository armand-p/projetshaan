import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  motDePasse;
  pseudo;
  id;
  type;
  title = 'shaan-angular';
  unlog(){
    localStorage.setItem('isLoggedin', 'false');
    localStorage.setItem(this.motDePasse, null);
    localStorage.setItem(this.pseudo, null);
    localStorage.setItem(this.id, null);
    localStorage.setItem(this.type, null);

  }

}
