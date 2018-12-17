package arnold.vendingMachine;

/**
 * VendingMain - main procedure to start application
 * 
 */

public class VendingMain {

	public static void main(String[] args) {
		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new VendingGUI().setVisible(true);
			}
		});
	}
}
