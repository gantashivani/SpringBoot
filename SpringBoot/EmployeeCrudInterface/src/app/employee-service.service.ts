import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class EmployeeServiceService {
 
  
  constructor(private http:HttpClient) { }
  employee:Employee

  public getEmployees() {
    console.log("test call");
    return this.http.get<Employee>("http://localhost:2020/Employee/fetchall");
  }
  
  public addEmp(user: Employee) {
    console.log(user);
    return this.http.post<Employee>("http://localhost:2020/Employee/create", user);
 }
 
 public deleteEmpById(user: Employee) {
    return this.http.delete<Employee>("http://localhost:2020/Employee/delete/"+ user.id);
  }


  public  updateEmp(user: Employee) {
    console.log(user);
    return this.http.put<Employee>("http://localhost:2020/Employee/update", user);
  }

}

export class Employee
{
  id:number;
  name:string;
  sal:number;

  constructor(id:number, name:string, sal:number)
  {
    this.id=id;
    this.name=name;
    this.sal=sal;
  }
}