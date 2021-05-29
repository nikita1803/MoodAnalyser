package moodanalyser;

public class MoodAnalysisException extends Exception
{
	/**
	 * taken enum to take null and empty value which is not be changed
	 * @author OM NAMO NAMAH
	 */
	enum ExceptionType 
	{
        NULL_VALUE,EMPTY_VALUE
    }
    ExceptionType type;
    /**
     * Parameterize constructor of the class
     * @param type
     * @param message
     */
    public MoodAnalysisException(ExceptionType type, String message) 
    {
        super();
        this.type = type;
    }
}
