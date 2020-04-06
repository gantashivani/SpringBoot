import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddEmployeeComponent } from './add-employee/add-employee.component';
import { UpdateEmployeeComponent } from './update-employee/update-employee.component';
import { FetchEmployeeComponent } from './fetch-employee/fetch-employee.component';
import { DeleteEmployeeComponent } from './delete-employee/delete-employee.component';
import { ListEmployeeComponent } from './list-employee/list-employee.component';


const routes: Routes = [
  {path:'AddEmployee',component:AddEmployeeComponent},
  {path:'UpdateEmployee',component:UpdateEmployeeComponent},
  {path:'DeleteEmployee',component:DeleteEmployeeComponent},
  {path:'ListEmployee',component:ListEmployeeComponent},
  {path:'',component:ListEmployeeComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
