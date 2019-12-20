import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { AddproductComponent } from './addproduct/addproduct.component';
import { DeleteproductComponent } from './deleteproduct/deleteproduct.component';
import { RouterModule } from '@angular/router';
import { GetproductComponent } from './getproduct/getproduct.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    AddproductComponent,
    DeleteproductComponent,
    GetproductComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      { path: 'addproduct' , component: AddproductComponent},
      { path: 'deleteproduct' , component: DeleteproductComponent},
      { path: 'getproduct' , component: GetproductComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
