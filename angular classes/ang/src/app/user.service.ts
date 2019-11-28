import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { userInfo } from 'os';
import { map } from 'rxjs/operators';
import { TouchSequence } from 'selenium-webdriver';

@Injectable({
  providedIn: 'root'
})
export class UserService {
  firebaseURL = 'https://ust-ty-91282.firebaseio.com/';
  constructor(public http: HttpClient) { }

  postUser(data) {
    console.log('service', data);
    return this.http.post(`${this.firebaseURL}/user.json`, data);
  }
  getUsers() {
    return this.http.get(`${this.firebaseURL}/user.json`).pipe(
      map(data => {
        let newArray = [];
        for (let key in data) {
          newArray.push({...data[key], id: key});
        }
        return newArray;
      })
    );
  }

  updateUser(id , data) {
    return this.http.put(`${this.firebaseURL}/user/${id}.json`, data);
  }

  deleteUser(id) {
    return this.http.delete(`${this.firebaseURL}/user/${id}.json`);
  }
}
