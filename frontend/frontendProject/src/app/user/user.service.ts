import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { NgForm } from '@angular/forms';
import { User } from '../shared/interfaces/user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }
  
public login(data: {username: string,  password: string}) {
  console.log("service")
  return this.http.post<User>('http://localhost:4200/user/login', data);
}

}
