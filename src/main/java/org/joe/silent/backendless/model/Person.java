package org.joe.silent.backendless.model;

public class Person {

    private String personName;

    public Person(String personName){
        this.personName = personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getPersonName(){
        return personName;
    }

}
