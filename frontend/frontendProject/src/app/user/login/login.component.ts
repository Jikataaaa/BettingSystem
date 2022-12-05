import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { UserService } from '../user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent {

  constructor(private service : UserService, private router: Router, private ActivateRoute: ActivatedRoute){
    
  }

  public login(form: NgForm) : void {
    const {username, password} = form.value;
    this.service.login({username, password}).subscribe({
      next: () => {
        const redirectUrl =  '/';
        this.ActivateRoute.snapshot.queryParams['redirectUrl'] || '/';
        this.router.navigate([redirectUrl]);
      },
    });
  }

}
