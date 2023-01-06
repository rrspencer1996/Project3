import { Component } from '@angular/core';
import { UserService } from '../Services/user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  login: string = '';
  pass: string = '';

  constructor(private UserService: UserService){
    this.login  = this.UserService.user.larry;
    this.pass = this.UserService.user.password;
  }
}
