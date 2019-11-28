import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { UserService } from '../user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  Users;
  selectedUser;

  constructor(private service: UserService) {
    this.getData();
  }

  ngOnInit() {
  }

  loginData(form: NgForm) {
     console.log(form.value);
     this.service.postUser(form.value).subscribe(data => {
       console.log(data);
     }, err => {
       console.log(err);
     }, () => {
       console.log('Data Posted Successfully');
     });
  }

  getData() {
    this.service.getUsers().subscribe(data => {
      console.log(data);
      this.Users = data;
    }, err => {
      console.log(err);
    }, () => {
      console.log('data got successfully');
    });
  }
  deleteData(user) {
    console.log(user);
    this.service.deleteUser(user.id).subscribe(data => {
      console.log(data);
      this.getData();
    }, err => {
      console.log(err);
    }, () => {
      console.log('data deleted successfully');
    });
  }

  selectUser(user) {
    console.log(user);
    this.selectedUser = user;
  }
  updateData(form) {
    console.log(form.value);
    this.service.updateUser(form.value.id, form.value).subscribe(data => {
      console.log(data);
    }, err => {
      console.log(err);
    }, () => {
      console.log('data updated successfully');
    });
  }
}
