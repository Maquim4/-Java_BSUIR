public class _17_Train {
    public static void main(String[] args) {
        int firstTicket = 1;
        int lastTicket = 999999;
        int n1, n2, n3, n4, n5, n6;
        int luckyTickets = 0;
        for (int i = firstTicket; i <= lastTicket ; i++){
            n1 = i/100000;
            n2 = (i/10000)%10;
            n3 = (i/1000)%10;
            n4 = (i/100)%10;
            n5 = (i/10)%10;
            n6 = i%10;
            if (n1 + n2 + n3 == n4 + n5 + n6){
                luckyTickets++;
            }
        }
        System.out.println("В рулоне "+ luckyTickets + " счастливых билетов.");
    }
}
