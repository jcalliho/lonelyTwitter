package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class happyMood extends Mood {

    public void happyMood()
    {
        mood = "Happy";
        date = null;
    }

    public void happyMood(Date day)
    {
        mood = "Happy";
        date = day;
    }

    public void print()
    {
        System.out.println("I'm feelin good!");
    }

}
