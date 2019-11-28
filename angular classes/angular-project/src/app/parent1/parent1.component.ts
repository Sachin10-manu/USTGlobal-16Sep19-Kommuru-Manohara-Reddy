import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent1',
  templateUrl: './parent1.component.html',
  styleUrls: ['./parent1.component.css']
})
export class Parent1Component implements OnInit {

  selectedBike;

  Bikes = [
    {
      name : 'Dirt',
      imgUrl : 'https://cdn.pixabay.com/photo/2014/04/23/20/34/dirt-bike-330815__340.jpg'
    },
    {
      name : 'Super Bike',
      imgUrl : 'https://cdn.pixabay.com/photo/2015/09/08/21/02/superbike-930715__340.jpg'
    },
    {
      name : 'Vintage',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/03/27/17/59/vintage-1283299__340.jpg'
    },
    {
      name : 'Honda',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/11/18/21/30/bike-1836962__340.jpg'
    }
  ];

  constructor() { }

  ngOnInit() {
  }
  sendBike(bike) {
    this.selectedBike = bike;
    console.log(bike);
  }

}
