package arnold.vendingMachine;

/**
 * VendingGUI Implementation of Vending Machine GUI - provides interaction of
 * user event requests to Vending Implementation objects.
 */
public class VendingGUI extends javax.swing.JFrame {

    /**
     * Creates new form Vending
     */
    public VendingGUI() {
        initComponents();
        m.setLocationRelativeTo(null);
        m.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(240, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(500, 32767));
        jPanel1.setMinimumSize(new java.awt.Dimension(200, 160));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        jButton1.setBackground(new java.awt.Color(240, 0, 0));
        jButton1.setIcon(new javax.swing.ImageIcon("coke.jpg")); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setMaximumSize(new java.awt.Dimension(100, 189));
        jButton1.setMinimumSize(new java.awt.Dimension(80, 160));
        jButton1.setPreferredSize(new java.awt.Dimension(90, 200));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setBackground(new java.awt.Color(240, 0, 0));
        jButton2.setIcon(new javax.swing.ImageIcon("water.jpg")); // NOI18N
        jButton2.setMaximumSize(new java.awt.Dimension(100, 175));
        jButton2.setMinimumSize(new java.awt.Dimension(80, 160));
        jButton2.setPreferredSize(new java.awt.Dimension(90, 175));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setBackground(new java.awt.Color(240, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon("chips.png")); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        jButton4.setBackground(new java.awt.Color(240, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon("bar.jpg")); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        jButton5.setBackground(new java.awt.Color(240, 0, 0));
        jButton5.setIcon(new javax.swing.ImageIcon("snickers.jpg")); // NOI18N
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(240, 0, 0));
        jPanel2.setMinimumSize(new java.awt.Dimension(300, 100));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Inventory :");
        jPanel2.add(jLabel5);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("5");
        jPanel2.add(jLabel6);

        jLabel1.setBackground(new java.awt.Color(240, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Price : ");
        jPanel2.add(jLabel1);

        jLabel2.setBackground(new java.awt.Color(240, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("0.00");
        jLabel2.setVerifyInputWhenFocusTarget(false);
        jPanel2.add(jLabel2);
        jLabel2.getAccessibleContext().setAccessibleName("jLabel1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Amount Entered : ");
        jPanel2.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("0.00");
        jPanel2.add(jLabel4);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setBackground(new java.awt.Color(240, 0, 0));
        jPanel3.setMinimumSize(new java.awt.Dimension(300, 100));
        jPanel3.setLayout(new java.awt.CardLayout());

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton8.setText("Empty");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8, "card2");

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jPanel4.setBackground(new java.awt.Color(240, 0, 0));
        jPanel4.setMinimumSize(new java.awt.Dimension(50, 50));
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.Y_AXIS));

        jButton6.setBackground(new java.awt.Color(240, 0, 0));
        jButton6.setIcon(new javax.swing.ImageIcon("coins.jpg")); // NOI18N
        jButton6.setText("jButton6");
        jButton6.setMaximumSize(new java.awt.Dimension(80, 125));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton6);

        jButton7.setBackground(new java.awt.Color(240, 0, 0));
        jButton7.setIcon(new javax.swing.ImageIcon("bills.jpg")); // NOI18N
        jButton7.setText("jButton7");
        jButton7.setMaximumSize(new java.awt.Dimension(80, 135));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton7);

        jButton9.setText("Return $");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton9);

        getContentPane().add(jPanel4, java.awt.BorderLayout.LINE_END);

        jPanel5.setBackground(new java.awt.Color(240, 0, 0));
        jPanel5.setMinimumSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jLabel2.setText("1.25");
        jLabel6.setText(Integer.toString(vm.getInventoryCount(Item.COKE)));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
        jLabel2.setText("1.50");
        jLabel6.setText(Integer.toString(vm.getInventoryCount(Item.WATER)));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
        jLabel2.setText("1.00");
        jLabel6.setText(Integer.toString(vm.getInventoryCount(Item.CHIPS)));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        //  System.out.println(m.getDenomination());

        switch (m.getDenomination()) {

            case "PENNY":
                vm.insertCoin(Coin.PENNY);
                break;
            case "NICKEL":
                vm.insertCoin(Coin.NICKLE);
                break;
            case "DIME":
                vm.insertCoin(Coin.DIME);
                break;
            case "QUARTER":
                vm.insertCoin(Coin.QUARTER);
                break;
            case "HALFDOLLAR":
                vm.insertCoin(Coin.HALFDOLLAR);
                break;
            case "DOLLAR":
                vm.insertCoin(Coin.DOLLAR);
                break;

            default:

        }

        jLabel4.setText(df.format(vm.getCurrentBalance()));
    }//GEN-LAST:event_jButton6ActionPerformed

    //  DOLLAR INSERT
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        switch (m.getDenomination()) {

            case "DOLLAR":
                vm.insertCoin(Coin.DOLLAR);
                break;
            case "TWODOLLAR":
                vm.insertCoin(Coin.TWODOLLAR);
                break;
            case "FIVEDOLLAR":
                vm.insertCoin(Coin.FIVEDOLLAR);
                break;
            case "TENDOLLAR":
                vm.insertCoin(Coin.TENDOLLAR);
                break;
            case "TWENTYDOLLAR":
                vm.insertCoin(Coin.TWENTYDOLLAR);
                break;

            default:

        }
        jLabel4.setText(df.format(vm.getCurrentBalance()));

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
        jLabel2.setText("0.75");
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:
        jLabel2.setText("0.75");
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            long price = vm.selectItemAndGetPrice(Item.COKE);

            try {
                long current = ((Double) (vm.getCurrentBalance() * 100)).longValue();
                Bucket b = vm.collectItemAndChange();
                jButton8.setText(((Item) b.getFirst()).getName().toString());
                if (price < current) {
                    jButton8.setText("Get " + ((Item) b.getFirst()).getName().toString() + "  and Change : " + df.format(1.0 * (current - price) / 100));
                }
                java.util.List<Coin> cs = ((java.util.List<Coin>) vm.refund(price));
                jLabel4.setText("0.0");
            } catch (NotFullPaidException e) {
                System.out.println(e.getMessage());
                jButton8.setText("Insufficent Funds");
            } catch (NotSufficientChangeException f) {
                System.out.println(f.getMessage());
                jButton8.setText("Not Enough Change");
            }
        } catch (SoldOutException e) {
            System.out.println(e.getMessage());
            jButton8.setText("Sold Out");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            long price = vm.selectItemAndGetPrice(Item.WATER);

            try {
                long current = ((Double) (vm.getCurrentBalance() * 100)).longValue();
                Bucket b = vm.collectItemAndChange();
                jButton8.setText(((Item) b.getFirst()).getName().toString());
                if (price < current) {
                    jButton8.setText("Get " + ((Item) b.getFirst()).getName().toString() + "  and Change : " + df.format(1.0 * (current - price) / 100));
                }
                java.util.List<Coin> cs = ((java.util.List<Coin>) vm.refund(price));
                jLabel4.setText("0.0");
            } catch (NotFullPaidException e) {
                System.out.println(e.getMessage());
                jButton8.setText("Insufficent Funds");
            } catch (NotSufficientChangeException f) {
                System.out.println(f.getMessage());
                jButton8.setText("Not Enough Change");
            }
        } catch (SoldOutException e) {
            System.out.println(e.getMessage());
            jButton8.setText("Sold Out");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            long price = vm.selectItemAndGetPrice(Item.CHIPS);

            try {
                long current = ((Double) (vm.getCurrentBalance() * 100)).longValue();
                Bucket b = vm.collectItemAndChange();
                jButton8.setText(((Item) b.getFirst()).getName().toString());
                if (price < current) {
                    jButton8.setText("Get " + ((Item) b.getFirst()).getName().toString() + "  and Change : " + df.format(1.0 * (current - price) / 100));
                }
                java.util.List<Coin> cs = ((java.util.List<Coin>) vm.refund(price));
                jLabel4.setText("0.0");
            } catch (NotFullPaidException e) {
                System.out.println(e.getMessage());
                jButton8.setText("Insufficent Funds");
            } catch (NotSufficientChangeException f) {
                System.out.println(f.getMessage());
                jButton8.setText("Not Enough Change");
            }
        } catch (SoldOutException e) {
            System.out.println(e.getMessage());
            jButton8.setText("Sold Out");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            long price = vm.selectItemAndGetPrice(Item.BAR);

            try {
                long current = ((Double) (vm.getCurrentBalance() * 100)).longValue();
                Bucket b = vm.collectItemAndChange();
                jButton8.setText(((Item) b.getFirst()).getName().toString());
                if (price < current) {
                    jButton8.setText("Get " + ((Item) b.getFirst()).getName().toString() + "  and Change : " + df.format(1.0 * (current - price) / 100));
                }
                java.util.List<Coin> cs = ((java.util.List<Coin>) vm.refund(price));
                jLabel4.setText("0.0");
            } catch (NotFullPaidException e) {
                System.out.println(e.getMessage());
                jButton8.setText("Insufficent Funds");
            } catch (NotSufficientChangeException f) {
                System.out.println(f.getMessage());
                jButton8.setText("Not Enough Change");
            }
        } catch (SoldOutException e) {
            System.out.println(e.getMessage());
            jButton8.setText("Sold Out");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try {
            long price = vm.selectItemAndGetPrice(Item.SNICKERS);

            try {
                long current = ((Double) (vm.getCurrentBalance() * 100)).longValue();
                Bucket b = vm.collectItemAndChange();
                jButton8.setText(((Item) b.getFirst()).getName().toString());
                if (price < current) {
                    jButton8.setText("Get " + ((Item) b.getFirst()).getName().toString() + "  and Change : " + df.format(1.0 * (current - price) / 100));
                }
                java.util.List<Coin> cs = ((java.util.List<Coin>) vm.refund(price));
                jLabel4.setText("0.0");
            } catch (NotFullPaidException e) {
                System.out.println(e.getMessage());
                jButton8.setText("Insufficent Funds");
            } catch (NotSufficientChangeException f) {
                System.out.println(f.getMessage());
                jButton8.setText("Not Enough Change");
            }

        } catch (SoldOutException e) {
            System.out.println(e.getMessage());
            jButton8.setText("Sold Out");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        try {
            long current = ((Double) (vm.getCurrentBalance() * 100)).longValue();
            java.util.List<Coin> cs = ((java.util.List<Coin>) vm.refund(0));
            jLabel4.setText("0.0");
            jButton8.setText("Get " + "Change : " + df.format(1.0 * current / 100));
        } catch (NotSufficientChangeException f) {
            System.out.println(f.getMessage());
            jButton8.setText("Not Enough Change");
        }

    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jButton8.setText("Empty");
    }//GEN-LAST:event_jButton8ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VendingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendingGUI().setVisible(true);
            }
        });
    }

    java.text.DecimalFormat df = new java.text.DecimalFormat("#.00");
    VendingMachineImpl vm = new VendingMachineImpl();
    Money m = new Money();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}