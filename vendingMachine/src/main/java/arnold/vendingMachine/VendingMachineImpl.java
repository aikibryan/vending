package arnold.vendingMachine;

/**
* VendingMachineImpl 
* Implementation of Vending Machine - provides tabulation methods
* for Inventory of Coins and Vending Items corresponding to user 
* interface operations .
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class VendingMachineImpl implements VendingMachine {

   private Inventory<Coin> cashInventory = new Inventory<Coin>();
   private Inventory<Item> itemInventory = new Inventory<Item>();
   private long totalSales;
   private Item currentItem;
   private long currentBalance;
   private long remainingBalance;

   Logger logger;

   public VendingMachineImpl() {

       PatternLayout layout = new PatternLayout();
       String conversionPattern = "%-7p %d [%t] %c %x - %m%n";
       layout.setConversionPattern(conversionPattern);

       // creates console appender
       ConsoleAppender consoleAppender = new ConsoleAppender();
       consoleAppender.setLayout(layout);
       consoleAppender.activateOptions();

       // creates file appender
       FileAppender fileAppender = new FileAppender();
       fileAppender.setFile("applog3.txt");
       fileAppender.setLayout(layout);
       fileAppender.activateOptions();

       // configures the root logger
       Logger rootLogger = Logger.getRootLogger();
       rootLogger.setLevel(Level.DEBUG);
       rootLogger.addAppender(consoleAppender);
       rootLogger.addAppender(fileAppender);

       // creates a custom logger and log messages
       logger = Logger.getLogger(VendingMachineImpl.class);
       //   logger.debug("this is a debug log message");
       logger.info("Calling Inititalization");
       //   logger.warn("this is a warning log message");

       initialize();
   }

   private void initialize() {
       //initialize machine with 5 coins of each denomination
       //and 5 cans of each Item       
       for (Coin c : Coin.values()) {
           cashInventory.put(c, 5);
       }
       for (Item i : Item.values()) {
           itemInventory.put(i, 5);
       }
       logger.info("Vending Maching Implementation Inititalization");
   }

   @Override
   public long selectItemAndGetPrice(Item item) {
       if (itemInventory.hasItem(item)) {
           currentItem = item;
           return currentItem.getPrice();
       }
       throw new SoldOutException("Sold Out, Please buy another item");
   }

   @Override
   public void insertCoin(Coin coin) {
       currentBalance = currentBalance + coin.getDenomination();
       cashInventory.add(coin);
       logger.info("Coin Insertion " + coin.name());
   }

   @Override
   public Bucket<Item, List<Coin>> collectItemAndChange() {
       logger.info("Collect Item and Change ");
       Item item = collectItem();
       totalSales = totalSales + currentItem.getPrice();
       List<Coin> change = collectChange();
       return new Bucket<Item, List<Coin>>(item, change);
   }

   private Item collectItem() throws NotSufficientChangeException,
           NotFullPaidException {
       if (isFullPaid()) {
           if (hasSufficientChange()) {
               itemInventory.deduct(currentItem);
               return currentItem;
           }
           logger.info("Not Sufficient Change exception ");
           throw new NotSufficientChangeException("Not Sufficient change in  Inventory");

       }
       remainingBalance = currentItem.getPrice() - currentBalance;
       logger.info("Not Full Paid Exception ");
       throw new NotFullPaidException("Price not full paid, remaining : ",
               remainingBalance);
   }

   private List<Coin> collectChange() {
       long changeAmount = currentBalance - currentItem.getPrice();
       List<Coin> change = getChange(changeAmount);
       updateCashInventory(change);
       remainingBalance = changeAmount;
       logger.info("Returning Change : " + 1.0 * remainingBalance / 100);
       currentBalance = 0;
       currentItem = null;
       return change;
   }

   @Override
   public List<Coin> refund(long price) {
       List<Coin> refund = getChange(currentBalance - price);
       updateCashInventory(refund);
       remainingBalance = currentBalance - price;
       currentBalance = 0;
       currentItem = null;
       return refund;
   }

   private boolean isFullPaid() {
       if (currentBalance >= currentItem.getPrice()) {
           logger.info("Have full payment");
           return true;
       }
       return false;
   }

   private List<Coin> getChange(long amount) throws NotSufficientChangeException {
     //  List<Coin> changes = Collections.EMPTY_LIST;
       long balance = amount;
        List<Coin> changes = new ArrayList<Coin>();
       if (amount > 0) {
         //  Coin[] values = Coin.values();
           for (int i = Coin.values().length - 1; i >= 0; i--) {
               Coin temp = Coin.values()[i];
               while (balance >= temp.getDenomination() && cashInventory.hasItem(temp)) {
                   changes.add(temp);
                   balance = balance - temp.getDenomination();
                   cashInventory.deduct(temp);
               }
           }
       }
       if (balance > 0) {
           logger.info("Not Sufficient Change exception");
           throw new NotSufficientChangeException("NotSufficientChange,  Please try another product");
       }

       return changes;
   }

   @Override
   public void reset() {
       cashInventory.clear();
       itemInventory.clear();
       totalSales = 0;
       currentItem = null;
       currentBalance = 0;
       restock();
   }

   private void restock() {
       for (Coin c : Coin.values()) {
           cashInventory.put(c, 5);
       }

       for (Item i : Item.values()) {
           itemInventory.put(i, 5);
       }
   }

   private boolean hasSufficientChange() {
       return hasSufficientChangeForAmount(currentBalance - currentItem.getPrice());
   }

   private boolean hasSufficientChangeForAmount(long amount) {
       boolean hasChange = true;
       try {
           getChange(amount);
       } catch (NotSufficientChangeException nsce) {
           return hasChange = false;
       }
       return hasChange;
   }

   private void updateCashInventory(List<Coin> change) {
       for (Coin c : change) {
           cashInventory.deduct(c);
       }
   }
   
   public Double getCurrentBalance() {
       logger.info("Returning current balance :  " + 1.0 * currentBalance / 100);
       return 1.0 * currentBalance / 100;
   }

   public int getInventoryCount(Item i) {
       logger.info("Returning Inventory Count for :" + i.getName());
       return itemInventory.getQuantity(i);
   }

}
