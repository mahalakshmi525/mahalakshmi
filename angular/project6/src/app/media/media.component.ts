import { Component, OnInit } from '@angular/core';
import { Media } from '../modal/media.model';
@Component({
  selector: 'app-media',
  templateUrl: './media.component.html',
  styleUrls: ['./media.component.css']
})
export class MediaComponent implements OnInit {
  Medias : Array<Media>;

  constructor() {
     this.Medias =[
       new Media("first","media details","time","continental"),
       new Media("second","media details","time","continental"),
       new Media("third","media details","time","continental"),
       new Media("four","media details","time","continental"),
     ];
   }
   saveMedia(txtTitle:HTMLInputElement, txtDescription:HTMLInputElement, txtTag:HTMLInputElement,txtName:HTMLInputElement):void{
    let media = new Media(txtTitle.value, txtDescription.value, txtTag.value,txtName.value);
    this.Medias.push(media);
    txtTitle.value = "";
    txtDescription.value = "";
    txtTag.value = "";
    txtName.value = "";
   
}
   
  ngOnInit() {
  }

}
