import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UploadmediaComponent } from './media/uploadmedia/uploadmedia.component';
import { MymediaComponent } from './media/mymedia/mymedia.component';
import { FollowersComponent } from './media/followers/followers.component';
import { MenuComponent } from './menu/menu.component';
import { LoginComponent } from './routeroutlet/login/login.component';
import { RegisterComponent } from './routeroutlet/register/register.component';
import { AccountComponent } from './media/account/account.component';


@NgModule({
  declarations: [
    AppComponent,
    UploadmediaComponent,
    MymediaComponent,
    FollowersComponent,
    MenuComponent,
    LoginComponent,
    RegisterComponent,
    AccountComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
