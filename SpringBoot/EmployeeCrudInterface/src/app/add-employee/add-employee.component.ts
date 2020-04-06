import { Component, OnInit } from '@angular/core';
import { EmployeeServiceService, Employee } from '../employee-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-employee',
  templateUrl: './add-employee.component.html',
  styleUrls: ['./add-employee.component.css']
})
export class AddEmployeeComponent implements OnInit {

    user:Employee=new Employee(0,"",0);
    
  constructor(private employeeservice: EmployeeServiceService, private router: Router) { }

  ngOnInit(): void {
  }

  addEmp():void{
    this.employeeservice.addEmp(this.user)
        .subscribe(data => {});
           this.router.navigate(['/ListEmployee']);
}
}
