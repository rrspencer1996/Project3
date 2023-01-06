import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor() { }

  user: any = new BehaviorSubject<any>({
    
    loginname:'larry',
    password: 'crazypants',

});

userVariable: any = {
  loginname: 'rrspencer',
  password: 'abc123',
}

}