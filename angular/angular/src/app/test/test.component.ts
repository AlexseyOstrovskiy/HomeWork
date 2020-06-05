import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.scss']
})
export class TestComponent implements OnInit {
value = 123456;
url = "https://www.google.com";
count = 0;
name = "Vasya";
users = [
  {
    name:"Vasya",
    email: "vasya.gmail"
  },
  {
    name:"Kolya",
    email: "kolya.gmail"
},
  {
    name:"Igor",
    email: "igor.gmail"
}
];

  constructor() { 
    setInterval(()=> {
      this.value++;
    }, 1000);
  }

  ngOnInit(): void {
  }

  addValue(){
    this.count++;

  }

}
