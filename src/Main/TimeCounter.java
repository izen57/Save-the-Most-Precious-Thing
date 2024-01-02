package Main;

/**
 * <p>A class to store and manipulate the in-game time.
 * It stores the number of steps main character took, and can convert it to minutes.</p>
 * <p>The class also contains the time limit and the number of minutes per a step.</p>
 * <p>When the main character does not move the in-game time stops since no steps means no minutes left.</p>
 */
public class TimeCounter
{
    /**
     * The variable to count an absolute amount of taken steps.
     * So, if the main character takes 5 steps back this variable increases at 5.
     */
    private static int counter;
    private static final int MINUTESLIMIT = 30;
    private static final float MINPERSTEP = 0.05f;

    static {
        counter = 0;
    }

    public static void takeSteps(int number)
    {
        counter += Math.abs(number);
    }

    public static int getStepsTaken()
    {
        return counter;
    }

    public static float getMinutesLeft()
    {
        return MINUTESLIMIT - counter * MINPERSTEP;
    }

    public static float getMinutesPassed()
    {
        return counter * MINPERSTEP;
    }
}
