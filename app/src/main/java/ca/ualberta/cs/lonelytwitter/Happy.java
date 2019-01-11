package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Happy extends Mood {

    public Happy() {
        super();
    }

    public Happy(Date postDate) {
        super(postDate);
    }

    public String returnMood() {
        return "Happy";
    }
}
