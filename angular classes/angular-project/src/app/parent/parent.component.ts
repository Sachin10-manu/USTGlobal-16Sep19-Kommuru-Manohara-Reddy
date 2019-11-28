import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {
  selectedMobile;

  Mobiles = [
    {
      name : 'Samsung',
      imgUrl : 'https://cdn.pixabay.com/photo/2015/01/20/12/51/mobile-605422__340.jpg'
    },
    {
      name : 'iphone',
      imgUrl : 'https://cdn.pixabay.com/photo/2018/05/01/13/04/sport-3365503__340.jpg'
    },
    {
      name : 'Redmi',
      imgUrl : 'https://cdn.pixabay.com/photo/2016/01/19/14/49/hand-1148981__340.jpg'
    },
    {
      name : 'Honor',
      imgUrl : 'https://cdn.pixabay.com/photo/2017/04/26/16/06/mobile-2262928__340.jpg'
    }
  ];

  constructor() { }

  ngOnInit() {
  }

  sendMobile(mobile) {
    this.selectedMobile = mobile;
    console.log(mobile);
  }
}
