package bean;

/*
 ** @author LiGuanda
 ** @date  AM 9:11:30
 ** @description This is a description of Wife
 ** @params
 ** @return
 ** @since version-1.0  */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;


@Repository("heihei")
public class Wife {


    @Value("IU")
    public String name;
    @Value("#{40-10}")
    private int age;
    @Value("${wife.husband}")
    private String husband;


    public Wife() {

    }


    public Wife(String name, int age, String husband) {

        this.name = name;
        this.age = age;
        this.husband = husband;

    }


    public void setName(String name) {

        this.name = name;

    }


    public void setAge(int age) {

        this.age = age;

    }


    public void setHusband(String husband) {

        this.husband = husband;

    }


    public String getName() {

        return name;

    }


    public int getAge() {

        return age;

    }


    public String getHusband() {

        return husband;

    }


    @Override
    public String toString() {

        return "Wife{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", husband='" + husband + '\'' +
                '}';

    }


}
