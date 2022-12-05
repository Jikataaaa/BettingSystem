import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { NgForm } from '@angular/forms';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }
  
public login(data: {username: string,  password: string}) {
  
  return this.http.post('http://localhost:8080/user/login', data, { withCredentials: true });
}

}
