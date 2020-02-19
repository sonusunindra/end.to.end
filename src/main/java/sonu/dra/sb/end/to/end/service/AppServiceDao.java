package sonu.dra.sb.end.to.end.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sonu.dra.sb.end.to.end.AppRepository;
import sonu.dra.sb.end.to.end.model.Employee;

import java.util.List;

@Service
public class AppServiceDao {
    @Autowired
    AppRepository appRepository;

    public List<Employee> getAllEmp() {
        return appRepository.findAll();
    }

    public void addEmployee(Employee employee) {
        appRepository.save(employee);

    }
    public int updateDesignation(Long eid,String designation){
       return appRepository.updateEmployee(eid,designation);
    }
}
