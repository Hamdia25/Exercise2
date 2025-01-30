//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] highTemp = {45, 29, 10, 22, 41, 28, 33};
        double[] precipitation = {.95, .6, .25, .05, .0, .75, .9};
        for (int i = 0; i < weekDays.length; i++) {

            if (highTemp[i] <= 32 && 50 < precipitation[i]) {
                System.out.println(weekDays[i] + " is likely to snow.");
            } else {
                System.out.println(weekDays[i] + " isn't likely to snow.");
            }
        }
    }
}