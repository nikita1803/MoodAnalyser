package moodanalyser;

public class MoodAnalyserTest 
{
	public String message;
	/**
	 * analyseMood is a method to check if sad message
	 * then contain sad if happy then return happy
	 * @param message
	 * @return string value
	 */
	public String analyseMood(String message) 
	{
        if(message.contains("Sad"))
            return "SAD";
        return "HAPPY";
    }
	/**
	 * Parameterized constructor of the class
	 * @param message
	 */
	public MoodAnalyserTest(String message)
	{
        this.message = message;
    }
	/**
	 * Default constructor
	 */
	public MoodAnalyserTest()
	{
        this.message = message;
    }
	/**
	 * exceptionAnalyseMood is a function check if message contain sad then return 
	 * if contain happy then return happy 
	 * if contain null then also return happy 
	 * @return string value
	 */
	public String exceptionAnalyseMood() 
	{
        try 
        {
        if (message.contains("sad"))
            return "SAD";
        return "HAPPY";
        } 
        catch (NullPointerException e) 
        {
            return "HAPPY";
        }
    }
}
