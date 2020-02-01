import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { THIS_EXPR } from '@angular/compiler/src/output/output_ast';
import { AuthenticationService } from 'src/app/services/authentication.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  //styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  
  errorMessage: string;
  autherized: boolean;
  
  constructor(public auth : AuthenticationService,public router : Router) { 
    this.errorMessage = "Invalid Credentials!!!";
      this.autherized = true;
  }
    checkLogin(txtLogin : HTMLInputElement,txtPass : HTMLInputElement){
      if(this.auth.authenticate(txtLogin.value, txtPass.value)){
        this.autherized = true;
        this.router.navigate(['/mymedia']);
    }else{
        this.autherized = false;
    }
  }
    ngOnInit() {
    }
  
  }

