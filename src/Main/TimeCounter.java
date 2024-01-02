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
    private static final int step;
    private static final float MINUTESLIMIT = 10f;
    private static final float MINPERSTEP = 0.05f;

    static {
        stepsCounter = 0;
        step = 1;
    }

    /**
     * Increases internal steps counter on the absolute value of the given number.
     * If the percent of minutes left more or equal than 75% and less than 100% then
     * the special message is being printing.
     * If the percent of minutes left more or equal than 100% then
     * the special message is being printing and the game finishes.
     */
    public static void takeSteps()
    {
        stepsCounter += Math.abs(step);
        float minutesLeftPercentage = getMinutesPassed() / MINUTESLIMIT;

        if (Float.compare(minutesLeftPercentage, 0.75f) >= 0 &&
            Float.compare(minutesLeftPercentage, 1f) < 0)
            System.out.println("You have to hurry, there's not much time left!");
        else if (Float.compare(minutesLeftPercentage, 1f) >= 0) {
            System.out.println("You're out of your time! The most precious thing went up in flames...\n");
            System.exit(0);
        }
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
}
