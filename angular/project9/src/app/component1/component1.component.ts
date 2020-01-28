import { Component, OnInit } from '@angular/core';
import { ConvertService } from '../service/convert.service';
@Component({
  selector: 'app-component1',
  templateUrl: './component1.component.html',
  styleUrls: ['./component1.component.css']
})
export class Component1Component implements OnInit {
  uppername : String ;

  constructor(public convertService : ConvertService) { 

  }
  con(txt:HTMLInputElement){
    this.uppername=this.convertService.convertToUpper(txt.value);
  }

  ngOnInit() {
  }

}
