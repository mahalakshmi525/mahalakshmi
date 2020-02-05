import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import{FormGroup, FormControl, FormBuilder, Validators, ReactiveFormsModule} from'@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
//import { MenuComponent } from './menu/menu.component';
import { LoginComponent } from './auth/login/login.component';
import { RegisterComponent } from './auth/register/register.component';
import { UploadmediaComponent } from './media/uploadmedia/uploadmedia.component';
import { MymediaComponent } from './media/mymedia/mymedia.component';
import { FollowersComponent } from './media/followers/followers.component';
import { HeaderComponent } from './menu/header/header.component';
import { UserheaderComponent } from './menu/userheader/userheader.component';
import { AccountComponent } from './media/account/account.component';
import { MultimediaComponent } from './media/multimedia/multimedia.component';
import { SinglemediaComponent } from './media/singlemedia/singlemedia.component';
import { NewsfeedComponent } from './media/newsfeed/newsfeed.component';
import { BlockedaccountsComponent } from './media/blockedaccounts/blockedaccounts.component';
import { AccountupdateComponent } from './media/accountupdate/accountupdate.component';
import { SearchComponent } from './media/search/search.component';
import { LogoutComponent } from './media/logout/logout.component';
//import { SearchResultComponent } from './search-result/search-result.component';
//import { SinglemediaComponent } from './media/singlemedia/singlemedia.component';
//import { MultimediaComponent } from './media/multimedia/multimedia.component';

@NgModule({
  declarations: [
    AppComponent,
    //MenuComponent,
    LoginComponent,
    RegisterComponent,
    UploadmediaComponent,
    MymediaComponent,
    FollowersComponent,
    HeaderComponent,
    UserheaderComponent,
    AccountComponent,
    MultimediaComponent,
    SinglemediaComponent,
    NewsfeedComponent,
    AccountupdateComponent,
    BlockedaccountsComponent,
    SearchComponent,
    LogoutComponent,
    //SearchResultComponent,
    //SinglemediaComponent,
    //MultimediaComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
