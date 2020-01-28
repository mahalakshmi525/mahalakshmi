import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-registrationform',
  templateUrl: './registrationform.component.html',
  styleUrls: ['./registrationform.component.css']
})
export class RegistrationformComponent implements OnInit {
  name : string;
  password : string;
  myFormGroup : formGroup;
  myLogin : formControl;

  constructor(formBuilder : FormBuilder) { 
    this.myLogin=new FormControl("",Validators.required);
    this.myFormGroup = formBuilder.group({
      "login_name" : this.myLogin,
      "login-password" : new formControl("", Validators.required),
    }
    saveLogin(){
    
      this.name = this.myLogin.value,
      this.password= this.myFormGroup.controls['Login_password'].value;
    }
   // ngOnInit() {
    //}
  
  //}