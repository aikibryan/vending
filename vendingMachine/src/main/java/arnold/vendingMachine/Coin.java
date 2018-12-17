package arnold.vendingMachine;
/**
 * Money enumeration for Vending Machine 
 */
public enum Coin {

    PENNY(1), NICKLE(5), DIME(10), QUARTER(25), HALFDOLLAR(50), DOLLAR(100), TWODOLLAR(200), FIVEDOLLAR(500), TENDOLLAR(1000), TWENTYDOLLAR(2000);
    private int denomination;

    private Coin(int denomination) {
        this.denomination = denomination;
    }

    public int getDenomination() {
        return denomination;
    }
}
