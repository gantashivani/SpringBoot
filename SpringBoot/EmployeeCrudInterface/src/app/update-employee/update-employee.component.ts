import { Component, OnInit } from '@angular/core';
import { Employee, EmployeeServiceService } from '../employee-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-update-employee',
  templateUrl: './update-employee.component.html',
  styleUrls: ['./update-employee.component.css']
})
export class UpdateEmployeeComponent implements OnInit {
 
  user:Employee=new Employee(0,"",0);
    
  constructor(private employeeservice: EmployeeServiceService, private router: Router) { }

  ngOnInit(): void {
  }


  updateEmp():void{
    this.employeeservice.updateEmp(this.user).subscribe(data => {});
           this.router.navigate(['/ListEmployee']);
  }

}
