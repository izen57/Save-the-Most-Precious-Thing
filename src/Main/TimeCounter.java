package Main;

/**
 * <p>A class to store and manipulate the in-game time.
 * It stores the number of steps main character took, and can convert it to minutes.</p>
 * <p>The class also contains the time limit and the number of minutes per a step.</p>
 * <p>When the main character does not move the in-game time stops since no steps means no minutes left.</p>
 */
public final class TimeCounter
{
    /**
     * The variable to count an absolute amount of taken steps.
     * So, if the main character takes 5 steps back this variable increases at 5.
     */
    private static int stepsCounter;
    private static final int MINUTESLIMIT = 30;
    private static final float MINPERSTEP = 0.05f;

    static {
        stepsCounter = 0;
    }

    public static void takeSteps(int number)
    {
        stepsCounter += Math.abs(number);
    }

    public static int getStepsTaken()
    {
        return stepsCounter;
    }

    public static float getMinutesLeft()
    {
        return MINUTESLIMIT - stepsCounter * MINPERSTEP;
    }

    public static float getMinutesPassed()
    {
        return stepsCounter * MINPERSTEP;
    }

    public static void checkTime()
    {

    }
}
