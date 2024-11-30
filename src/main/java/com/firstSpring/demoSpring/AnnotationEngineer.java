package com.firstSpring.demoSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("anEng")
public class AnnotationEngineer {

    @Autowired
    Address address;

    @Autowired
//    @Qualifier("address")
    public void setAddress(Address address) {
        this.address = address;
    }//will throw an error because not specified which address to use
    AnnotationEngineer(){

    }

    @Override
    public String toString() {
        return "AnnotationEngineer{" +
                "address=" + address +
                '}';
    }
}
