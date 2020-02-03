import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { THIS_EXPR } from '@angular/compiler/src/output/output_ast';
import { AuthenticationService } from 'src/app/services/authentication.service';
import{FormGroup, FormControl, FormBuilder, Validators} from'@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  //styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  username:string;
password:string;
autherized: boolean;
 errorMessage: string;
 myFormGroup : FormGroup;
  constructor(public auth : AuthenticationService,public router : Router,formBuilder: FormBuilder) { 
    this.errorMessage = "Invalid Credentials!!!";
      this.autherized = true;
      this.myFormGroup=formBuilder.group({
     
        "username":new FormControl(""),
            "password": new FormControl("")
          
       });
  }
    checkLogin(txtLogin : HTMLInputElement,txtPass : HTMLInputElement){
      if(this.auth.authenticate(txtLogin.value, txtPass.value)){
        this.autherized = true;
        this.router.navigate(['/mymedia']);
    }else{
        this.autherized = false;
    }
  }
  login(){
    this.username= this.myFormGroup.controls['username'].value;
      this.password=this.myFormGroup.controls['password'].value;
    
     }
    ngOnInit() {
    }
  
  }

