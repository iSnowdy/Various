package Watch.Build;

import Watch.Domain.Watch;

public class Main {
    public static void main (String[] args) {
        Watch watch1 = new Watch(52, 24, 15);
        Watch watch2 = new Watch();
        Watch watch3 = new Watch();


        /*if (!(watch3.askTime())) {
            System.out.println("No battery. Gonna charge it now!");
            watch3.setChargeWatch(true);
            watch3.askTime();
            System.out.println(watch3.toString());
        }*/

        if (!(watch2.randomTime())) {
            System.out.println("No battery. Gonna charge it now!");
            watch2.setChargeWatch(true);
            watch2.randomTime();
            System.out.println(watch2.toString());
        }
    }
}
