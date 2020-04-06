import { Component, OnInit } from '@angular/core';
import { EmployeeServiceService, Employee } from '../employee-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-delete-employee',
  templateUrl: './delete-employee.component.html',
  styleUrls: ['./delete-employee.component.css']
})
export class DeleteEmployeeComponent implements OnInit {

  user : Employee = new Employee(0,"",0)
  id:number= 0

  constructor(private employeeservice: EmployeeServiceService, private router: Router) { }

  ngOnInit(): void {
  }

  deleteEmpById():void{
    this.employeeservice.deleteEmpById(this.user).subscribe(data => {});
           this.router.navigate(['/ListEmployee']);

}
}
