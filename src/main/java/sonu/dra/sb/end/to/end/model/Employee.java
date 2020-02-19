package sonu.dra.sb.end.to.end.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long eid;
    private String ename;
    private String designation;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dob;

    public Employee() {
        System.out.println("######Inside Employee -D.C");
    }

    public Employee(Long eid, String ename, String designation, LocalDate dob) {
        System.out.println("######Inside Employee -4 argumented Constructor");
        this.eid = eid;
        this.ename = ename;
        this.designation = designation;
        this.dob = dob;
    }
    @Embedded
     private EmpAddress add;

    public Employee(String ename, String designation, LocalDate dob) {
        System.out.println("######Inside Employee -3 argumented Constructor");
        this.eid = eid;
        this.ename = ename;
        this.designation = designation;
        this.dob = dob;
    }
   /* public void setEid(Long eid) {
        this.eid = eid;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    */

    public Long getEid() {
        return eid;
    }

    public String getEname() {
        return ename;
    }

    public String getDesignation() {
        return designation;
    }

    public LocalDate getDob() {
        return dob;
    }

    @PrePersist
    void prePersist(){
        System.out.println("****PrePersist called******");
    }
    @PreUpdate
    void preUpdate(){
        System.out.println("****PreUpdate called******");
    }
}
