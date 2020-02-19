package sonu.dra.sb.end.to.end.model;

import javax.persistence.Embeddable;

@Embeddable
public class EmpAddress {

    String line1;
    String line2;
    String landmark;
    Long pincode;
    String city;
    String Landmark;

    public EmpAddress(){
        System.out.println("@@@@@@@EmpAddress D.C-called");
    }
}
