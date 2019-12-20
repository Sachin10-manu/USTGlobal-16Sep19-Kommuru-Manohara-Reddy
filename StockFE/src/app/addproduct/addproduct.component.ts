import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent implements OnInit {

  constructor(private service: UserService) { }

  ngOnInit() {
  }

  addProducts(form: NgForm) {
    console.log(form.value);
    this.service.addProduct(form.value).subscribe(data => {
      console.log(data);
      form.reset();
    }, err => {
      console.log(err);
    }, () => {
      console.log('Data posted successfully');
    });
  }

}
