package Notebook;

import asg.cliche.Command;

import java.util.ArrayList;
import java.util.List;



public class Notebook {
    private List<Record> records = new ArrayList<>();


    // Make a Command
    @Command
    public void create(String firstName, String lastName, String phone) {
        Record t = new Record();
        t.setFirstName(firstName);
        t.setLastName(lastName);
        t.setPhone(phone);
        records.add(t);
    }

    @Command
    public List<Record> list(){
        return records;
    }
}
