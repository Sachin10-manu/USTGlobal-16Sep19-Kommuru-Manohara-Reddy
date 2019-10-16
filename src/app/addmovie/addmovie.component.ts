import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, NgForm } from '@angular/forms';

@Component({
  selector: 'app-addmovie',
  templateUrl: './addmovie.component.html',
  styleUrls: ['./addmovie.component.css']
})
export class AddmovieComponent implements OnInit {

  get addMovie() {
    return this.form.get('addMovie');
  }

  get movieTitle() {
    return this.form.get('movieTitle');
  }

  get imgUrl() {
    return this.form.get('imgUrl');
  }

  get desc() {
    return this.form.get('desc');
  }

  form = new FormGroup({
    addMovie : new FormControl('', [Validators.required]),
    movieTitle : new FormControl('', [Validators.required]),
    imgUrl : new FormControl('', [Validators.required]),
    desc : new FormControl('', [Validators.required])
  });

  constructor() { }

  ngOnInit() {
  }
  login(form: NgForm) {
    console.log(form.value);
  }

}
