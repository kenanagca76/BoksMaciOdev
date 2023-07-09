package BoksMaciOdev;
public class RunPlay {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("Eyup CAN", 10, 95, 90, 20);
        Fighter f2 = new Fighter("Mayk TYSON", 10, 95, 90, 20);

        Match match = new Match(f1,f2,90,110);
        match.run();

    }
}