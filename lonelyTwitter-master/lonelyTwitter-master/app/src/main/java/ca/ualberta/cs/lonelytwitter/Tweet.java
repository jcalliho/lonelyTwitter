package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class Tweet {

    String message;
    Date date;

    public void Tweet()
    {
        message = "";
        date = null;
    }

    public void setMessage (String str)
    {
        message = str;
    }

    public String getMessage()
    {
        return message;
    }
}

