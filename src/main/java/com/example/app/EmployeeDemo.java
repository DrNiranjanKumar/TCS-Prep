package com.example.app;

import java.util.List;

class EmployeeBlueprint{
    static int uniqueNumber = 1000;

    String regNumber;
    String name;
    String designation;

    EmployeeBlueprint(String name,String designation){
        this.regNumber = Integer.toString(++uniqueNumber);
        this.name = name;
        this.designation = designation;
    }
}

class Department extends EmployeeBlueprint{
    String department;
    Department(String name, String designation,String dept){
        super(name,designation);
        this.department = dept;
    }
    @Override
    public String toString(){
        return "Reg no.:"+regNumber+"\nName: "+name+"\nDesignation: "+designation+"\nDepartment: "+department;
    }
}
public class EmployeeDemo {
    public static void main(String[] args) {
        int count=0;
        Department developmentDept = new Department("Niranjan","SSE-III","Velocity-IT");
        Department developmentDept2 = new Department("Kumar","SSE-II","Matrix");
        for(Department department: List.of(developmentDept,developmentDept2)){
            ++count;
            System.out.println("******* Employee "+count+" *******");
            System.out.println(department);
        }
    }
}
