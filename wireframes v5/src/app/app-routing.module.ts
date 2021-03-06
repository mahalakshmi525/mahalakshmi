import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './auth/login/login.component';
import { RegisterComponent } from './auth/register/register.component';
import { MymediaComponent } from './media/mymedia/mymedia.component';
import { UploadmediaComponent } from './media/uploadmedia/uploadmedia.component';
import { FollowersComponent } from './media/followers/followers.component';
import { HeaderComponent } from './menu/header/header.component';
import { UserheaderComponent } from './menu/userheader/userheader.component';
import { AccountComponent } from './media/account/account.component';
import { SinglemediaComponent } from './media/singlemedia/singlemedia.component';
import { MultimediaComponent } from './media/multimedia/multimedia.component';
//import { SearchResultComponent } from './search-result/search-result.component';



const routes: Routes = [
  { path:"  ",redirectTo: "login" , pathMatch:"full"},
  { path: 'login', component:LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path:'uploadmedia', component:UploadmediaComponent},
  { path:'mymedia', component: MymediaComponent},
  { path: 'followers', component:FollowersComponent },
  { path: 'header', component: HeaderComponent },
  { path:'userheader', component:UserheaderComponent},
  { path:'account', component:AccountComponent},
  { path:'singlemedia', component:SinglemediaComponent},
  { path:'multimedia', component:MultimediaComponent},
 

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
