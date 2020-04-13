/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanjavakoneksi.MainFrame;

import java.sql.ResultSet;
import java.util.Date;
import javax.swing.JOptionPane;
import latihanjavakoneksi.Controller.MainController;
import latihanjavakoneksi.Helper.Helper;
import latihanjavakoneksi.Model.MainModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Wibby Chandra
 */
public class MainFrame extends javax.swing.JFrame {
    MainModel model = new MainModel();
    MainController controller = new MainController();
    
    Helper helper = new Helper();
    String product_id;
    ResultSet rs;

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        getAllData();
        clear();
    }
    
    public void getAllData(){
        this.rs = controller.get();
        loadtable(this.rs);
    }
    
    public void loadtable(ResultSet rs){
        tb_product.setModel(DbUtils.resultSetToTableModel(rs));
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cb_type = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        tf_stock = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_price = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dp_expired = new org.jdesktop.swingx.JXDatePicker();
        btn_submit = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        tf_search = new javax.swing.JTextField();
        btn_searchName = new javax.swing.JButton();
        btn_searchID = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_product = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Aplikasi Inventory");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Nama Barang");

        tf_name.setBackground(new java.awt.Color(0, 0, 0));
        tf_name.setForeground(new java.awt.Color(255, 255, 255));
        tf_name.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Jenis Barang");

        cb_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan & Minuman", "Makanan", "Minuman", "Pakaian" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Stock Barang");

        tf_stock.setBackground(new java.awt.Color(0, 0, 0));
        tf_stock.setForeground(new java.awt.Color(255, 255, 255));
        tf_stock.setCaretColor(new java.awt.Color(255, 255, 255));
        tf_stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_stockActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Harga Barang");

        tf_price.setBackground(new java.awt.Color(0, 0, 0));
        tf_price.setForeground(new java.awt.Color(255, 255, 255));
        tf_price.setCaretColor(new java.awt.Color(255, 255, 255));
        tf_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_priceActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Masa Aktif");

        btn_submit.setText("Submit");
        btn_submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submitActionPerformed(evt);
            }
        });

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Pencarian");

        tf_search.setBackground(new java.awt.Color(0, 0, 0));
        tf_search.setForeground(new java.awt.Color(255, 255, 255));
        tf_search.setCaretColor(new java.awt.Color(255, 255, 255));

        btn_searchName.setText("Cari Dengan Nama");
        btn_searchName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchNameActionPerformed(evt);
            }
        });

        btn_searchID.setText("Cari Dengan ID");
        btn_searchID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchIDActionPerformed(evt);
            }
        });

        tb_product.setBackground(new java.awt.Color(0, 0, 0));
        tb_product.setForeground(new java.awt.Color(255, 255, 255));
        tb_product.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tb_product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_productMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_product);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_name)
                            .addComponent(cb_type, 0, 225, Short.MAX_VALUE)
                            .addComponent(tf_stock)
                            .addComponent(tf_price)
                            .addComponent(dp_expired, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_submit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_update))))
                    .addComponent(btn_delete, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(78, 78, 78)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btn_searchName)
                        .addGap(29, 29, 29)
                        .addComponent(btn_searchID))
                    .addComponent(jScrollPane1))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_searchName)
                    .addComponent(btn_searchID))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(tf_stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tf_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dp_expired, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_submit)
                            .addComponent(btn_update))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_delete))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_stockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_stockActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_stockActionPerformed

    private void tf_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_priceActionPerformed

    private void btn_submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submitActionPerformed
        // TODO add your handling code here:
        try{
            String name = tf_name.getText();
            String price = tf_price.getText();
            String stock = tf_stock.getText();
            String type = cb_type.getSelectedItem().toString();
            Date date = dp_expired.getDate();
            
            model.setName(name);
            model.setPrice(price);
            model.setStock(stock);
            model.setExpired(date);
            model.setType(type);
            
            Boolean result = controller.create(model);
            if(result){
                JOptionPane.showMessageDialog(null, "Berhasil Menambahkan Data");
            }
            else{
                JOptionPane.showMessageDialog(null, "Gagal Menambahkan Data");
            }
            clear();
            getAllData();
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btn_submitActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        try{
            
        }
        catch(Exception ex){
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_searchNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchNameActionPerformed
        // TODO add your handling code here:
        search("name", tf_search.getText());
    }//GEN-LAST:event_btn_searchNameActionPerformed

    private void tb_productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_productMouseClicked
        // TODO add your handling code here:
        try{
            String id = helper.getValueRows(tb_product, 0);
            String name = helper.getValueRows(tb_product, 1);
            String type = helper.getValueRows(tb_product, 2);
            String stock = helper.getValueRows(tb_product, 3);
            String price = helper.getValueRows(tb_product, 4);
            String expired = helper.getValueRows(tb_product, 5);
            
            btn_update.setEnabled(true);
            btn_delete.setEnabled(true);
            
            this.product_id = id;
            tf_name.setText(name);
            cb_type.setSelectedItem(type);
            tf_stock.setText(stock);
            tf_price.setText(price);
            dp_expired.setDate(new Date(helper.parseStringToDatepickerFormat(expired)));
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_tb_productMouseClicked

    private void btn_searchIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchIDActionPerformed
        // TODO add your handling code here:
        search("id", tf_search.getText());
    }//GEN-LAST:event_btn_searchIDActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        try{
            
        }
        catch(Exception ex){
            System.err.println(ex.getMessage());
        }
    }//GEN-LAST:event_btn_updateActionPerformed
    public void search(String type, String query){
        try{
            if(query.isEmpty()){
                this.rs = controller.get();
            }
            else if(type.equals("id") && !query.isEmpty()){
                this.rs = controller.showById(query);
            }
            else if(type.equals("name") && !query.isEmpty()){
                this.rs = controller.showByName(query);
            }
            
            loadtable(this.rs);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void clear(){
        tf_name.setText("");
        tf_price.setText("");
        tf_stock.setText("");
        cb_type.setSelectedIndex(0);
        dp_expired.setDate(null);
        
        btn_update.setEnabled(false);
        btn_delete.setEnabled(false);
    }
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_searchID;
    private javax.swing.JButton btn_searchName;
    private javax.swing.JButton btn_submit;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cb_type;
    private org.jdesktop.swingx.JXDatePicker dp_expired;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_product;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_price;
    private javax.swing.JTextField tf_search;
    private javax.swing.JTextField tf_stock;
    // End of variables declaration//GEN-END:variables
}