public class TimeCounter
{
    private static int counter = 0;
    private static final int MINUTESLIMIT = 30;
    private static final float MINPERSTEP = 0.05f;

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
