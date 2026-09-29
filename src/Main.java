import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Ticket ticket = new Ticket("0000001-A");
        Ticket ticket2 = new Ticket("0000002-A");
        Ticket ticket3 = new Ticket("0000003-A");
        Ticket ticket4 = new Ticket("0000004-A");

        List<Ticket> tickets = new ArrayList<>();
        tickets.add(ticket);
        tickets.add(ticket2);
        tickets.add(ticket3);
        tickets.add(ticket4);


        Scanner scanner = new Scanner(System.in);

        boolean winningTicketFound = false;

        int indexOfTheWinningNumber = (int) (Math.random() * tickets.size()); //  formula para generar un número aleatorio entre 0 y el maximo indes del array
        String winningTicketNumber = tickets.get(indexOfTheWinningNumber).getTICKET_NUMBER(); // [x] [v] [x] [x]

        while (!winningTicketFound){
            System.out.println("Please enter your ticket number, and check if its valid:");
            String userTicketNumber = scanner.nextLine();
            boolean isValid = validateTicketNumber(userTicketNumber, tickets);
            if (isValid) {
                System.out.println("Checking if yours is the winning ticket number...");
                if (userTicketNumber.equals(winningTicketNumber)){
                    System.out.println("Congratulations! You have won the lottery!");
                    winningTicketFound = true;
                } else {
                    System.out.println("Try again! :(");
                }
            }

        }

    }

    public static boolean validateTicketNumber(String ticketNumberToValidate, List<Ticket> validTickets){
        boolean isValid = false;
        for(Ticket t : validTickets){
            if (t.getTICKET_NUMBER().equals(ticketNumberToValidate)){
                isValid = true;
                break;
            }
        }

        if(isValid){
            System.out.println("Ticket is valid");
            return true;
        } else {
            System.out.println("Ticket is invalid");
            return false;
        }
    }
}
