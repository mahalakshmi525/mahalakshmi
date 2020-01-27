import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { MediaComponent } from './media/media.component';
import { Mediaphase2Component } from './mediaphase2/mediaphase2.component';

@NgModule({
  declarations: [
    AppComponent,
    MediaComponent,
    Mediaphase2Component
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
