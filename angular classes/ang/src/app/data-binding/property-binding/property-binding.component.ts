import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-property-binding',
  templateUrl: './property-binding.component.html',
  styleUrls: ['./property-binding.component.css']
})
export class PropertyBindingComponent implements OnInit {
 name: string = 'Manu';
 imgUrl: string = 'https://cdn.pixabay.com/photo/2019/03/19/15/03/fantasy-4065924__340.jpg';
 address: string = 'Nagawara,Hebbal,540046';
 colorName: string = 'blue';
 isActive: boolean = false;
 colSpanValue: number = 2;

  constructor() { }

  ngOnInit() {
    setInterval(() => {
      this.colorName = 'green';
      this.isActive = !this.isActive;
    }, 2000);
  }
}
