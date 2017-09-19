package Notebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Record {
    private static int counter = 0;
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private List<String> phones = new ArrayList<>();

    public Record() {
        counter++;
        id = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail (String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<String> addPhones() {
        return phones;
    }

    public void addPhones(String... phone) {
        Collections.addAll(this.phones = phones);
    }


    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phones='" + phones + '\'' +
                '}';
    }
}
