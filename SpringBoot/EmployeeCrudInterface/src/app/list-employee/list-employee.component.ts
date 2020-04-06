import { Component, OnInit } from '@angular/core';
import { Employee, EmployeeServiceService } from '../employee-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-list-employee',
  templateUrl: './list-employee.component.html',
  styleUrls: ['./list-employee.component.css']
})
export class ListEmployeeComponent implements OnInit {

  employees: Employee;
  
  constructor(private empService: EmployeeServiceService,private router: Router) {}

  ngOnInit(): void 
  {
    this.empService.getEmployees().subscribe(
    response =>this.handleSuccessfulResponse(response),
   );
 }

handleSuccessfulResponse(response)
{
   this.employees=response;
}
}
