package spring.homework;

import java.util.Random;

/**
 * Created by Aram on 6/29/2015.
 */
public class Target {
    public int doComplexCalcualtion(int x, int y) {
        System.out.println("Doing calculation.");
        for(int i = 0; i < 100000; i++) {

        }
        return 0;
    }

    public void sendRequestToDB() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void playRussianRoulette() throws Exception{
        Random rand = new Random();

        if(rand.nextInt(3) == 2) {
            throw new Exception("You're dead!");
        }

        System.out.println("Lucky shot.");
    }
}
