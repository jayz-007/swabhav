import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'sw-welcome',
  templateUrl: './welcome.component.html',
  styleUrls: ['./welcome.component.css']
})
export class WelcomeComponent implements OnInit {
  message: String
  constructor() { 

this.message ="Welcome app";
  }

  ngOnInit(): void {
  }

}
