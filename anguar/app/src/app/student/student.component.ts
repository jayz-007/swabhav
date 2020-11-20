import { Component, OnInit } from '@angular/core';

import { IStudent } from './IStudent';

@Component({
selector: 'sw-student',
templateUrl: './student.component.html',
styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {
Student:IStudent={}
Students:IStudent[]=[]
Image:String;

constructor(){
this.Image = "/assets/images/jay.png";
}
LoadStudent(){
this.Student={
name:'jay',rollNo:3,cgpa:5
}
}
LoadStudents(){
this.Students=[{
name:'jay',rollNo:1,cgpa:9
},
{
name:"shel",rollNo:2,cgpa:8
}

]
}
ngOnInit(): void {
}

}
