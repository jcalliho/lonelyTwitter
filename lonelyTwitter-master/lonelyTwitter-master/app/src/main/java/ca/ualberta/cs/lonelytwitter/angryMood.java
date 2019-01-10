package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class angryMood extends Mood {

    public void angryMood()
    {
       mood = "Angry";
       date = null;
    }

    public void angryMood(Date day)
    {
        mood = "Angry";
        date = day;
    }

    public void print()
    {
          System.out.println("Not feelin so great");
    }
}
