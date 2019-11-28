import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent2',
  templateUrl: './parent2.component.html',
  styleUrls: ['./parent2.component.css']
})
export class Parent2Component implements OnInit {

  selectedMovie;

  constructor() { }
  Movies = [
    {
      name : 'Charles Chaplin',
      imgUrl : 'https://cdn.pixabay.com/photo/2018/07/06/19/48/charles-chaplin-3521070__340.jpg'
    },
    {
      name : 'Child Girl',
      imgUrl : 'https://cdn.pixabay.com/photo/2014/12/09/20/27/child-562297__340.jpg'
    },
    {
      name : 'Cinema',
      imgUrl : 'https://cdn.pixabay.com/photo/2018/09/24/17/34/cinema-3700446__340.png'
    },
    {
      name : 'Movie Camera',
      imgUrl : 'https://cdn.pixabay.com/photo/2012/08/27/22/59/movie-projector-55122__340.png'
    }
  ];

  ngOnInit() {
  }
  sendMovie(movie) {
    this.selectedMovie = movie;
    console.log(movie);
  }

}
