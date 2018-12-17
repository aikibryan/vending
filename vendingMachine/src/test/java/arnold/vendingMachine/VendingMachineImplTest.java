package arnold.vendingMachine;

//import junit.framework.TestCase;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tallw
 */
public class VendingMachineImplTest {
    
    public VendingMachineImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of selectItemAndGetPrice method, of class VendingMachineImpl.
     */
    @Test
    public void testSelectItemAndGetPrice() {
        System.out.println("selectItemAndGetPrice");
        Item item = Item.COKE;
        VendingMachineImpl instance = new VendingMachineImpl();
        long expResult = 125L;
        long result = instance.selectItemAndGetPrice(item);
        assertEquals(expResult, result);
    }

    /**
     * Test of insertCoin method, of class VendingMachineImpl.
     */
    @Test
    public void testInsertCoin() {
        System.out.println("insertCoin");
        Coin coin = Coin.QUARTER;
        VendingMachineImpl instance = new VendingMachineImpl();
        instance.insertCoin(coin);
        assertEquals((Double)instance.getCurrentBalance(),(Double) 0.25); 
    }

    /**
     * Test of collectItemAndChange method, of class VendingMachineImpl.
     */
    @Test
    public void testCollectItemAndChange() {
        System.out.println("collectItemAndChange");
        VendingMachineImpl instance = new VendingMachineImpl();
      //  Bucket<Item, List<Coin>> expResult = new Bucket("C");
        Item item = Item.CHIPS;
        Coin coin = Coin.TWODOLLAR;
        long price = instance.selectItemAndGetPrice(item);
        instance.insertCoin(coin);
        Bucket<Item, List<Coin>> result = instance.collectItemAndChange();
        assertEquals("Chips", result.getFirst().getName());
        assertTrue( ((List<Coin>) result.getSecond()).size() > 0);
    }


    /**
     * Test of getCurrentBalance method, of class VendingMachineImpl.
     */
    @Test
    public void testGetCurrentBalance() {
        System.out.println("getCurrentBalance");
        VendingMachineImpl instance = new VendingMachineImpl();
        instance.insertCoin(Coin.DIME);
        Double expResult = 0.10;
        Double result = instance.getCurrentBalance();
        assertEquals(expResult, result);
    }

    /**
     * Test of getInventoryCount method, of class VendingMachineImpl.
     */
    @Test
    public void testGetInventoryCount() {
        System.out.println("getInventoryCount");
      
        VendingMachineImpl instance = new VendingMachineImpl();
        int expResult = 5;
        int result = instance.getInventoryCount(Item.BAR);
        assertEquals(expResult, result);
    }
    
}

