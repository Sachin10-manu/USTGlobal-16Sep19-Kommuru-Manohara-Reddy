import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private http: HttpClient) { }

  addProduct(product): Observable <any> {
    return this.http.post('http://localhost:8080/add', (product));
  }

  deleteProduct(product): Observable <any> {
    return this.http.post(`http://localhost:8080/delete/${product.id}`, (product));
  }

  getProduct(product): Observable <any> {
    return this.http.post('http://localhost:8080/get', (product));
  }
}
