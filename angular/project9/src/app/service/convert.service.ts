import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ConvertService {

  constructor() { }
  convertToUpper(str : String) : String{
    return str.toUpperCase();
}
}
