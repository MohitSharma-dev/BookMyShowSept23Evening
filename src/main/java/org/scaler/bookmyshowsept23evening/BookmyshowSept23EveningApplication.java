package org.scaler.bookmyshowsept23evening;

import org.scaler.bookmyshowsept23evening.models.BaseModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class BookmyshowSept23EveningApplication {

    public static void main(String[] args) {
//        BaseModel baseModel = new BaseModel();
//        baseModel.getId();
//        BaseModel baseModel = new BaseModel(1 , new Date() , new Date());
        // HW : Figure out how Lombok exactly does this

        SpringApplication.run(BookmyshowSept23EveningApplication.class, args);
    }

}

// Database : transform into the corresponding Object
// ORM : Object relation mapping
// Hibernate
// Spring Data JPA : Like an interface

// Phone pe : ICICIBank , YesBank
// BankAPI : dependency inversion


// SpringBoot application wants to use certain methods that can convert data
// from database to corresponding objects

// Hibernate has the implementation functions
// Spring Data JPA : interface
//    Show findById

