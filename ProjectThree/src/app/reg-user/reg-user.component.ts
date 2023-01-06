import { Component } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
@Component({
  selector: 'app-reg-user',
  templateUrl: './reg-user.component.html',
  styleUrls: ['./reg-user.component.css']
})
export class RegUserComponent {

  constructor(private fb: FormBuilder,
    // private userService: UserService,
    private router: Router) {}

  registrationForm = this.fb.group(
    {
      firstName: ['', Validators.compose([Validators.minLength(3), 
                                          Validators.maxLength(20), 
                                          Validators.required])],
      lastName: ['', Validators.compose([Validators.minLength(3), 
                                         Validators.maxLength(20), 
                                         Validators.required])],
      email: ['', Validators.compose([Validators.required,
                                      Validators.email])],
      password: ['', Validators.compose([Validators.required,
                                         Validators.minLength(8),
                                         Validators.maxLength(8)])],
      confirmPassword: ['', Validators.compose([Validators.required,
                                                Validators.minLength(8),
                                                Validators.maxLength(8)])]
}

);

formTest: any = {
    firstName: 'firstName',
    lastName: 'lastName',
    email: 'email',
    password: 'password',
    confirmPassword: 'confirmPassword'
  }


 onSubmit(): void {
  this.formTest = this.registrationForm.value;
    // this.userService.registerUser(new User(this.firstName?.value!,
                                          //  this.lastName?.value!,
                                          //  this.email?.value!,
                                          //  this.password?.value!));

    }
}