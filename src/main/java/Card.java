public abstract class Card {

    public String cardNumber;
    public String expiryDate;
    public int securityNumber;

    public Card(String cardNumber, String expiryDate, int securityNumber) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
    }
}
