package com.emp.exceptions;

@SuppressWarnings("serial")
public class EmployeeNotFound extends RuntimeException{
	
	public EmployeeNotFound(String msg){
        super(msg);
    }

    public EmployeeNotFound(String msg,Throwable e){
        super(msg,e);
    }
	
	

}
