package pl.merito.exam.I.app00.client.server;

import lombok.ToString;

@ToString
public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getAge() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String firstName) {
        this.lastName = lastName;
    }

    public void setAge(String firstName) {
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

}
