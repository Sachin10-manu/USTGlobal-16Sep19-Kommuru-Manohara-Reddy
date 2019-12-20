import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-getproduct',
  templateUrl: './getproduct.component.html',
  styleUrls: ['./getproduct.component.css']
})
export class GetproductComponent implements OnInit {

  constructor(private service: UserService) { }

  ngOnInit() {
  }

  getProduct(form: NgForm) {
    console.log(form.value);
    this.service.getProduct(form.value).subscribe(data => {
      console.log(data);
      form.reset();
    }, err => {
      console.log(err);
    }, () => {
      console.log('Data posted successfully');
    });
  }
}
