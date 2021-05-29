package moodanalyser;

public class MoodAnalyserTest 
{
	/**
	 * analyseMood is a method to check if sad message
	 * then contain sad if happy then return happy
	 * @param message
	 * @return string value
	 */
	public String analyseMood(String message) {
        if(message.contains("Sad"))
            return "SAD";
        return "HAPPY";
    }
}
