package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Sad extends Mood {

    public Sad() {
        super();
    }

    public Sad(Date postDate) {
        super(postDate);
    }

    public String returnMood() {
        return "Sad";
    }
}
