package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

abstract class Mood {

    private Date postDate;

    public Mood() {
        this.postDate = new Date();
    }

    public Mood(Date postDate) {
        this.postDate = postDate;
    }

    abstract String returnMood();

    public Date getDate() {
        return postDate;
    }

    public void setDate(Date newDate) {
        this.postDate = newDate;
    }
}