/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanjavakoneksi.Query;

/**
 *
 * @author Wibby Chandra
 */
public class MainQuery {
    public String create = "INSERT INTO product (name, product_type "
            +", stock, price, expired) VALUES (?,?,?,?,?)";
    
    public String get = "SELECT * FROM product";
    public String showById = "SELECT * FROM product WHERE id = ?";
    public String showByName = "SELECT * FROM product WHERE name LIKE ?";
}
