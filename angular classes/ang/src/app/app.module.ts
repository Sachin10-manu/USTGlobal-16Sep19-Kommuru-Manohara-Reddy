import { BrowserModule } from '@angular/platform-browser';
import { NgModule, Component } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { HelpComponent } from './help/help.component';
import { LogComponent } from './log/log.component';
import { RouterModule } from '@angular/router';
import { FooterComponent } from './footer/footer.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { EventBindingComponent } from './data-binding/event-binding/event-binding.component';
import { TwoWayBindingComponent } from './data-binding/two-way-binding/two-way-binding.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { from } from 'rxjs';
import { StructuralDirectiveComponent } from './structural-directive/structural-directive.component';
import { NgIfComponent } from './structural-directive/ng-if/ng-if.component';
import { NgForComponent } from './structural-directive/ng-for/ng-for.component';
import { NgSwitchComponent } from './structural-directive/ng-switch/ng-switch.component';
import { customDirective } from './custom.directive';
import { RegisterComponent } from './register/register.component';
import { ProductComponent } from './product/product.component';
import { CompanyComponent } from './company/company.component';
import { UserComponent } from './user/user.component';
import { CandidateComponent } from './candidate/candidate.component';
import { ReactiveFormComponent } from './reactive-form/reactive-form.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AboutComponent,
    HelpComponent,
    LogComponent,
    FooterComponent,
    DataBindingComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    TwoWayBindingComponent,
    StructuralDirectiveComponent,
    NgIfComponent,
    NgForComponent,
    NgSwitchComponent,
    customDirective,
    RegisterComponent,
    ProductComponent,
    CompanyComponent,
    UserComponent,
    CandidateComponent,
    ReactiveFormComponent,
    ParentComponent,
    ChildComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : 'home', component : HomeComponent},
      {path : 'about', component : AboutComponent},
      {path : 'help', component : HelpComponent},
      {path : 'log', component : LogComponent},
      {path : 'property-binding', component : PropertyBindingComponent},
      {path : 'event-binding', component : EventBindingComponent},
      {path : 'two-way', component : TwoWayBindingComponent},
      {path : 'ngif', component : NgIfComponent},
      {path : 'ngswitch', component : NgSwitchComponent},
      {path : 'register', component : RegisterComponent},
      {path : 'product', component : ProductComponent},
      {path : 'company', component : CompanyComponent},
      {path : 'user', component : UserComponent},
      {path : 'candidate', component : CandidateComponent},
      {path : 'reactive', component : ReactiveFormComponent},
      {path : 'parent', component : ParentComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
