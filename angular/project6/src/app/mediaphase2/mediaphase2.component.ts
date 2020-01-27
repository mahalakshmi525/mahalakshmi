import { Component, OnInit, Input } from '@angular/core';
import { Media } from '../modal/media.model';

@Component({
  selector: 'app-mediaphase2',
  templateUrl: './mediaphase2.component.html',
  styleUrls: ['./mediaphase2.component.css']
})
export class Mediaphase2Component implements OnInit {

  @Input()
  MediaList : Array<Media>;

  constructor() { }
  ngOnInit() {
  }

}
