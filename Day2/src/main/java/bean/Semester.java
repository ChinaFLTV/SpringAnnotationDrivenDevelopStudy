package bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author LiGuanda
 * @date PM 4:25:35
 * @description This is a description of Semester
 * @since version-1.0
 */


public class Semester {


    public Semester() {

        System.out.println("This semester is starting!");

    }


    @PostConstruct
    public void workAfterStart() {

        System.out.println("clear dormitory");

    }


    @PreDestroy
    public void leaveSchool() {

        System.out.println("The holiday is starting!!!");

    }


}
