import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent3',
  templateUrl: './parent3.component.html',
  styleUrls: ['./parent3.component.css']
})
export class Parent3Component implements OnInit {

  selectedLaptop;

  Laptops = [
    {
      name : 'Lenovo',
      imgUrl : 'https://cdn.pixabay.com/photo/2014/05/02/21/49/home-office-336373__340.jpg'
    },
    {
      name : 'Mac',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/03/27/20/00/coffee-1284041__340.jpg'
    },
    {
      name : 'Dell',
      imgUrl : 'https://cdn.pixabay.com/photo/2015/01/09/02/45/laptop-593673__340.jpg'
    },
    {
      name : 'Asus',
      imgUrl : 'https://cdn.pixabay.com/photo/2017/06/23/11/49/laptop-2434393__340.jpg'
    }
  ];

  constructor() { }

  ngOnInit() {
  }

  sendLaptop(laptop) {
    this.selectedLaptop = laptop;
    console.log(laptop);
  }

}
