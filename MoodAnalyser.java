package moodanalyser;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyser {

	@Test
    public void givenSadMessageReturnSad()
    {
        MoodAnalyserTest moodAnalyser = new MoodAnalyserTest();
        String mood = moodAnalyser.analyseMood("Hello i am Sad");
        Assert.assertEquals("SAD",mood);
    }
	@Test
    public void givenHappyMessageReturnHappy()
    {
        MoodAnalyserTest moodAnalyser = new MoodAnalyserTest();
        String mood = moodAnalyser.analyseMood("Hello i am Happy");
        Assert.assertEquals("HAPPY",mood);
    }
	@Test
    public void givenNullMassageShouldReturnHappyMessage()
	{
        MoodAnalyserTest moodAnalyzer = new MoodAnalyserTest(null);
        String mood = moodAnalyzer.exceptionAnalyseMood();
        Assert.assertEquals("HAPPY",mood);

    }
}
