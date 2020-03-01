public class SeatTreats {

    public static void main(String[] args) {
        int treats = 15;
        int seats = 7;
        int draw = 3;
        System.out.println("Last receiver gets :" + getLastReceiver(treats, seats, draw));
        printTreatsGiven(treats, seats, draw);
    }

    private static int getLastReceiver(int treats, int seats, int draw) {
        int rem = treats % seats;
        int res = draw + rem;
        return res > seats ? ((res-1) % seats) : res - 1;
    }

    private static void printTreatsGiven(int treats, int seats, int draw) {
        int rem = treats % seats;
        int iten = treats / seats;
        for(int i = 1 ; i <= seats; i++) {
            if(i >= draw) {
                rem = rem < 0 ? 0 : rem;
                int add = rem == 0 ? 0 : 1;
                System.out.println("Seat No. " + i + " gets " + (iten + add) + " treats");
                rem--;
            } else {
                System.out.println("Seat No. " + i + " gets " + iten + " treats");
            }
        }
    }
}