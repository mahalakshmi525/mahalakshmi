import { Injectable } from '@angular/core';
import { AuthenticationService } from './authentication.service';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, Router } from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class AuthGuardService {
  router: any;

  constructor(public auth : AuthenticationService,public route : Router) { }
    CanActivate(route : ActivatedRouteSnapshot, state: RouterStateSnapshot) {

      if(this.auth.isUserLoggedIn()){
        return true;
      }
      
      else{
    // navigate to login component
    this.router.navigate(['/login']);
    return false;
         
  }
}
}
