package sonu.dra.sb.end.to.end.service;

import org.springframework.stereotype.Service;
import sonu.dra.sb.end.to.end.model.Employee;

import java.time.LocalDate;
import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StaticAppService {
    static List<Employee> employeeList=new ArrayList<>();
    static{
       // employeeList=  Arrays.asList(new Employee(1l,"sonu","assosiate",LocalDate.of(1989,9,17)),new Employee(2l,"ajay","senior assosiate", LocalDate.of(1988,9,17)));

    }
    public List<Employee> getAllEmp(){
      return  employeeList;
    }
}
