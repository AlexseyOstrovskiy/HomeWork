import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.scss']
})
export class MenuComponent implements OnInit {
categories = [
  {
    id:"1",
    name: "CPU"
},
{
  id:"2",
  name: "GPU"
},
{
  id:"3",
  name: "Keyboards"
}];

showItems(event){
  console.log(event);
}
  constructor() { }

  ngOnInit(): void {
  }

}
