import {Injectable} from '@angular/core';
import {ActivatedRouteSnapshot, CanActivate, Router, RouterStateSnapshot, UrlTree} from '@angular/router';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthGuard implements CanActivate {
  canActivate(
    next: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean | UrlTree> | Promise<boolean | UrlTree> | boolean | UrlTree {
    if (this.verifyLogin()) {
      return true;
    } else {
      this.router.navigate(['/login']);
      return false;
    }
  }

  constructor(private router: Router) {
  }

  verifyLogin(): boolean {
    if (!this.isLoggedIn()) {

      return false;
    } else if (this.isLoggedIn()) {
      return true;
    }
  }

  public isLoggedIn(): boolean {
    let status = false;
    if (localStorage.getItem('isLoggedin') == 'true') {
      status = true;
    } else {
      status = false;
    }
    return status;
  }
}
