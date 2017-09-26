package Notebook;

public class Alarm extends Note implements Expirable {
    private String Time;

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    @Override
    public boolean isExpired() {
        return false;
    }

    @Override
    public boolean contains(String str) {
        if (super.contains(str)) {
            return true;
        } else if (Time.contains(str)){
            return true;
        }
        return false;
    }
}
