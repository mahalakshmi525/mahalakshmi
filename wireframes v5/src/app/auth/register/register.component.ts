import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormGroup, FormBuilder, FormControl, Validators } from '@angular/forms';
import { AuthenticationService } from 'src/app/services/authentication.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  //styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  //ngOnInit(): void {
    //throw new Error("Method not implemented.");
  //}
  name : string;
  password: string;
  errorMessage: string;
  autherized: boolean;
  myFormGroup : FormGroup;
  myRegisterName : FormControl;

  constructor(public router:Router) { }
  checkLogin(txtLogin : HTMLInputElement, txtPass : HTMLInputElement,txtrepeatPass:HTMLInputElement){
    this.router.navigate(['/login']);
  }

  ngOnInit() : void {
  }
}

