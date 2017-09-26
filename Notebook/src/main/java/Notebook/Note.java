package Notebook;

public class Note extends Record {
    private String Text;

    public String getNote() {
        return Text;
    }

    public void setNote(String note) {
        Text = note;
    }

    @Override
    public String toString() {
        return "Note{" +
                "Note='" + Text + '\'' +
                '}';
    }
    @Override
    public boolean contains(String str) {
        String strLower = str.toLowerCase();
        String textLover = Text.toLowerCase();
        return textLover.contains(strLower);
    }
}
