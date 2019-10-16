import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { LoginComponent } from './login/login.component';
import { AddmovieComponent } from './addmovie/addmovie.component';
import { MoviesComponent } from './movies/movies.component';
import { ImdbComponent } from './imdb/imdb.component';
import { RouterModule } from '@angular/router';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LoginComponent,
    AddmovieComponent,
    MoviesComponent,
    ImdbComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      {path : 'imdb' , component : ImdbComponent},
      {path : 'login' , component : LoginComponent},
      {path : 'movies' , component : MoviesComponent},
      {path : 'addmovies', component : AddmovieComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
