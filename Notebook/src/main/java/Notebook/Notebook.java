package Notebook;

import asg.cliche.Command;

import java.util.ArrayList;
import java.util.List;



public class Notebook {
    private List<Record> records = new ArrayList<>();


    @Command
    public void create(String firstName, String lastName, String phone, String email, String address) {
        Record t = new Record();
        t.setFirstName(firstName);
        t.setLastName(lastName);
        t.setPhone(phone);
        t.setEmail(email);
        t.setAddress(address);
        records.add(t);
    }

    @Command
    public List<Record> list(){
        return records;
    }
}
