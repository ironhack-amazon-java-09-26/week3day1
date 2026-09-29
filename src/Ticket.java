public class Ticket {
    private final String TICKET_NUMBER;

    public Ticket(String TICKET_NUMBER) {
        this.TICKET_NUMBER = TICKET_NUMBER;
    }

    public String getTICKET_NUMBER() {
        return TICKET_NUMBER;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "TICKET_NUMBER_PREFIX='" + TICKET_NUMBER + '\'' +
                '}';
    }
}
