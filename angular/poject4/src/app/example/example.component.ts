import { Component, OnInit } from '@angular/core';
import { getLocaleFirstDayOfWeek } from '@angular/common';

@Component({
  selector: 'example',
  templateUrl: './example.component.html',
  styleUrls: ['./example.component.css']
})
export class ExampleComponent {
   name:string;
   age:number;
   email:string;

  constructor() {
    this.name="first";
    this.age=20;
    this.email="fisrt@gmail.com";
    
   }
Change(){
  this.name="second";
  this.age=25;
  this.email="second@gmail.com";
}
}

