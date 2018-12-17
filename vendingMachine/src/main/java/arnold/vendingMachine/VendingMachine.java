package arnold.vendingMachine;
/**
 * Vending Machine Implementation Interface 
 */
import java.util.List;

public interface VendingMachine {

    public long selectItemAndGetPrice(Item item);

    public void insertCoin(Coin coin);

    public List<Coin> refund(long price);

    public Bucket<Item, List<Coin>> collectItemAndChange();

    public void reset();

}
