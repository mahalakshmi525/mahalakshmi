import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'customPipe'
})
export class CustomPipePipe implements PipeTransform {

  transform(value:string):string {
    if(value==""){
      return "no data available" ;
    }
    else{
      return value;
    }
    
  }
}
5