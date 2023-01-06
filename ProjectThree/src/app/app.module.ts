import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { InputsComponent } from './inputs/inputs.component';
import { LoginComponent } from './login/login.component';
import { AssociatePageComponent } from './associate-page/associate-page.component';
import { ManagerPageComponent } from './manager-page/manager-page.component';
import { AuthUserComponent } from './auth-user/auth-user.component';
import { RegUserComponent } from './reg-user/reg-user.component';

@NgModule({
  declarations: [
    AppComponent,
    InputsComponent,
    LoginComponent,
    AssociatePageComponent,
    ManagerPageComponent,
    AuthUserComponent,
    RegUserComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
