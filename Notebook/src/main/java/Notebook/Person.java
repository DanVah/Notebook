package Notebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person extends Note {

    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private List<String> phones = new ArrayList<>();

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

    public void setEmail(String email) {
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

    public void addPhones(String... phones) {
        Collections.addAll(this.phones, phones);
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + getId() +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", note='" + getNote() + '\'' +
                ", phones='" + phones + '\'' +
                '}';
    }

    @Override
    public boolean contains(String str) {
        if (super.contains(str)) {
            return true;
        } else if (lastName.contains(str)) {
            return true;
        } else if (firstName.contains(str)) {
            return true;
        } else if (email.contains(str)) {
            return true;
        }else if (address.contains(str)) {
            return true;
        } else {
            for (String p : phones) {
                if (p.toLowerCase().contains(str)) {
                    return true;
                }
            }
        }
        return false;

    }
}