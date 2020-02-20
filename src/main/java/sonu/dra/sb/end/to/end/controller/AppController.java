package sonu.dra.sb.end.to.end.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sonu.dra.sb.end.to.end.model.Employee;
import sonu.dra.sb.end.to.end.service.AppServiceDao;
import sonu.dra.sb.end.to.end.service.StaticAppService;

import java.util.List;

@RestController
public class AppController {
    @Autowired
    StaticAppService staticAppService;
    @Autowired
    AppServiceDao appServiceDao;

    @GetMapping("/test")
    String test() {
        return "sonu ";
    }

   /* @GetMapping(value = "/getAllEmployee"*//*produces = "text/plain"*//*)
    ResponseEntity<List<Employee>> getAll() {
        return new ResponseEntity<>(staticAppService.getAllEmp(),HttpStatus.OK);
    }*/

    @GetMapping(value = "/getAllEmployee"/*produces = "text/plain"*/)
    ResponseEntity<List<Employee>> getAll() {
        return new ResponseEntity<>(appServiceDao.getAllEmp(),HttpStatus.OK);
    }

    @PostMapping("/addEmployee")
    ResponseEntity addEmployee(@RequestBody Employee employee){
        appServiceDao.addEmployee(employee);

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping(value="updateDesignation")
    ResponseEntity updateDesignation(@RequestBody Employee emp){
        System.out.println("printing empid here"+emp.getEid()+"\t"+emp.getDesignation());
      int i=  appServiceDao.updateDesignation(emp.getEid(),emp.getDesignation());
        System.out.println("printing updated record-->"+i);
        return new ResponseEntity(HttpStatus.OK);
    }
}
