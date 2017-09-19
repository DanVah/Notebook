package Notebook;

import asg.cliche.Command;

import java.util.ArrayList;
import java.util.List;



public class Notebook {
    private List<Record> records = new ArrayList<>();


    @Command
    public void createPerson(String firstName, String lastName, String email, String address, String... phones) {
        Person t = new Person();
        t.setFirstName(firstName);
        t.setLastName(lastName);
        t.setEmail(email);
        t.setAddress(address);
        t.addPhones(phones);
        records.add(t);
    }

    @Command
    public void createNote (String note) {
        Note t = new Note();
        t.setNote(note);
        records.add(t);
    }

    @Command
    public void createReminder (String time) {
        Reminder t = new Reminder();
        t.setTime(time);
        records.add(t);
    }

    @Command
    public List<Record> list(){
        return records;
    }

    @Command
    public void remove(int id) {
        for (int i = 0; i < records.size(); i++) {
            Record r = records.get(i);
            if (r.getId() == id) {
                records.remove(i);
                break;
            }
        }
    }
}
