/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanjavakoneksi.Controller;

import java.sql.ResultSet;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import latihanjavakoneksi.Helper.Helper;
import latihanjavakoneksi.Model.MainModel;
import latihanjavakoneksi.Query.MainQuery;

/**
 *
 * @author Wibby Chandra
 */
public class MainController extends BaseController{
    Helper helper = new Helper();
    MainQuery query = new MainQuery();
    
    public boolean create(MainModel model) throws ParseException{
        String date = helper.parseDateToString(model.getExpired());
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getName());
        map.put(2, model.getType());
        map.put(3, model.getStock());
        map.put(4, model.getPrice());
        map.put(5, date);
        
        String sql = this.query.create;
        
        return this.preparedStatement(map, sql);
    }
    
    public ResultSet get(){
        String sql = this.query.get;
        return this.get(sql);
    }
    
    public ResultSet showById(String id){
        String sql = this.query.showById;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, id);
        
        return this.getWithParameter(map, sql);
    }
    
    public ResultSet showByName(String name){
        String sql = this.query.showByName;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, helper.parseLikeQuery(name));
        
        return this.getWithParameter(map, sql);
    }
}
