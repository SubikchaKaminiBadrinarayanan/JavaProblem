import java.util.Random;

class Card {
    private int cardNumber;
    private int creditBalance;
    private int ticketBalance;

    public Card(int cardNumber) {
        this.cardNumber = cardNumber;
        this.creditBalance = 0;
        this.ticketBalance = 0;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public int getCreditBalance() {
        return creditBalance;
    }

    public int getTicketBalance() {
        return ticketBalance;
    }

    public void addCredits(int credits) {
        if (credits > 0) {
            creditBalance += credits;
        }
    }

    public void subtractCredits(int credits) {
        if (credits > 0 && credits <= creditBalance) {
            creditBalance -= credits;
        }
    }

    public void addTickets(int tickets) {
        if (tickets > 0) {
            ticketBalance += tickets;
        }
    }

    public void subtractTickets(int tickets) {
        if (tickets > 0 && tickets <= ticketBalance) {
            ticketBalance -= tickets;
        }
    }
}

class Game {
    private String name;
    private int creditsRequired;

    public Game(String name, int creditsRequired) {
        this.name = name;
        this.creditsRequired = creditsRequired;
    }

    public void playGame(Card card) {
        if (card.getCreditBalance() >= creditsRequired) {
            card.subtractCredits(creditsRequired);
            int ticketsWon = new Random().nextInt(10); // Simulating random tickets won
            card.addTickets(ticketsWon);
            System.out.println("Card " + card.getCardNumber() + ": Played " + name + ", won " + ticketsWon + " tickets.");
            System.out.println("Card " + card.getCardNumber() + ": New credit balance: " + card.getCreditBalance());
            System.out.println("Card " + card.getCardNumber() + ": New ticket balance: " + card.getTicketBalance());
        } else {
            System.out.println("Card " + card.getCardNumber() + ": Insufficient credits to play " + name);
        }
    }
}

class PrizeCategory {
    private String name;
    private int ticketsRequired;
    private int remainingPrizes;

    public PrizeCategory(String name, int ticketsRequired, int initialPrizeCount) {
        this.name = name;
        this.ticketsRequired = ticketsRequired;
        this.remainingPrizes = initialPrizeCount;
    }

    public String getName() {
        return name;
    }

    public int getTicketsRequired() {
        return ticketsRequired;
    }

    public int getRemainingPrizes() {
        return remainingPrizes;
    }

    public boolean awardPrize(Card card) {
        if (card.getTicketBalance() >= ticketsRequired && remainingPrizes > 0) {
            card.subtractTickets(ticketsRequired);
            remainingPrizes--;
            System.out.println("Card " + card.getCardNumber() + ": Awarded prize from category " + name);
            System.out.println("Remaining " + name + " prizes: " + remainingPrizes);
            return true;
        } else {
            System.out.println("Card " + card.getCardNumber() + ": Insufficient tickets or no more prizes in category " + name);
            return false;
        }
    }
}

class Terminal {
    private int creditsPerDollar;
    private int remainingPrizes;

    public Terminal(int creditsPerDollar, int initialPrizeCount) {
        this.creditsPerDollar = creditsPerDollar;
        this.remainingPrizes = initialPrizeCount;
    }

    public void addCreditsToCard(Card card, int dollars) {
        int creditsToAdd = dollars * creditsPerDollar;
        card.addCredits(creditsToAdd);
        System.out.println("Card " + card.getCardNumber() + ": Added " + creditsToAdd + " credits.");
        System.out.println("Card " + card.getCardNumber() + ": New credit balance: " + card.getCreditBalance());
    }

    public void checkCardBalances(Card card) {
        System.out.println("Card " + card.getCardNumber() + ": Credit balance: " + card.getCreditBalance());
        System.out.println("Card " + card.getCardNumber() + ": Ticket balance: " + card.getTicketBalance());
    }

    public void transferBalances(Card fromCard, Card toCard) {
        toCard.addCredits(fromCard.getCreditBalance());
        toCard.addTickets(fromCard.getTicketBalance());
        System.out.println("Transferred balances from Card " + fromCard.getCardNumber() + " to Card " + toCard.getCardNumber());
        System.out.println("Card " + toCard.getCardNumber() + ": New credit balance: " + toCard.getCreditBalance());
        System.out.println("Card " + toCard.getCardNumber() + ": New ticket balance: " + toCard.getTicketBalance());
    }

    public void exchangeTicketsForPrize(Card card, PrizeCategory prizeCategory) {
        if (prizeCategory.awardPrize(card)) {
            remainingPrizes--;
            System.out.println("Remaining prizes in terminal: " + remainingPrizes);
        }
    }
}

public class NightatArcade {
    public static void main(String[] args) {
        // Instantiate 2 cards
        Card card1 = new Card(1);
        Card card2 = new Card(2);

        // Instantiate a terminal with 2 credits per dollar and 10 prizes in each category
        Terminal terminal = new Terminal(2, 10);

        // Load credits onto each card
        terminal.addCreditsToCard(card1, 5);
        terminal.addCreditsToCard(card2, 10);

        // Play games using both cards
        Game game1 = new Game("Whack-a-Mole", 3);
        Game game2 = new Game("Skee-Ball", 4);

        game1.playGame(card1);
        game2.playGame(card2);

        // Transfer balances from Card 1 to Card 2
        terminal.transferBalances(card1, card2);

        // Request prizes using Card 2
        PrizeCategory prizeCategory1 = new PrizeCategory("Plush Toys", 5, 10);
        terminal.exchangeTicketsForPrize(card2, prizeCategory1);

        // Try to play a game and request a prize using Card 1
        game1.playGame(card1);
        PrizeCategory prizeCategory2 = new PrizeCategory("Board Games", 8, 10);
        terminal.exchangeTicketsForPrize(card1, prizeCategory2);

        // Check card balances through the terminal
        terminal.checkCardBalances(card1);
        terminal.checkCardBalances(card2);
    }
}

