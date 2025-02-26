/**
 * @author David Sanchez
 */
public class InsufficientFundsException extends Exception {
    final double shortfall;

    /**
     * Class constructor
     * The constructor should take the amount of the shortfall (as a double) and store
     * it in a member variable.
     * • We want to see some sort of message like “You need more money!” in the stack
     * trace, so call an Exception constructor that takes a message by using the super
     * 1
     * keyword at the beginning of your class’s constructor and pass it an appropriate
     * message string.
     * • The class should have a getShortfall method to access the shortfall amount
     * given in the constructor. This method should return a double.
     */
    protected InsufficientFundsException(double shortfall) {
        super("You need more money!");
        this.shortfall = shortfall;
    }

    /**
     * Getter method to retrieve shortfall.
     *
     * @return The amount of shortfall in the balance
     */
    protected double getShortfall() {
        return shortfall;
    }

}
