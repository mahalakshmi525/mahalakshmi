import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
//import { MediaBaseComponent } from './media-base/media-base.component';
import { CustomPipePipe } from './pipe/custom-pipe.pipe';
import { CustomPipeComponent } from './pipe/custom-pipe/custom-pipe.component';

@NgModule({
  declarations: [
    AppComponent,
    //MediaBaseComponent,
    CustomPipePipe,
    CustomPipeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
