import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-deleteproduct',
  templateUrl: './deleteproduct.component.html',
  styleUrls: ['./deleteproduct.component.css']
})
export class DeleteproductComponent implements OnInit {

  constructor(private service: UserService) { }

  ngOnInit() {
  }

  delete(form: NgForm) {
    console.log(form.value);
    this.service.deleteProduct(form.value).subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('Product deleted successfully');
    });
  }

}
