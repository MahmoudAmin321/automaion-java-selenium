package helper;

import java.util.Random;

public class Helper
{
    public int inputRandomInteger()
    {
        Random rand = new Random();
        int randInt = rand.nextInt(100000000);
        return randInt;
    }

}
