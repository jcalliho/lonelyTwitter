package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class Mood {

    String mood;
    Date date;

    public void setDate(Date d)
    {
        date = d;
    }

    public Date getDate()
    {
        return date;
    }

    public abstract void print();
}
