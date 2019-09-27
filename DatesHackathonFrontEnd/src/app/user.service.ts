import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Users} from './users.model';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) {
  }


  getUsers(): Observable<Users[]> {
    return this.http.get<Users[]>(`http://localhost:8080/api/Users`);
  }
}
