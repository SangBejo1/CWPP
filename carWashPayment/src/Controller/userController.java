/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
       
import BaseController.BaseController;
    import java.sql.ResultSet;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import Helper.Helper;
import MODEL.userModel;
import MODEL.userModel.UserModel;
import Query.userQuery;

/**
 *
 * @author HP
 */



public class userController extends BaseController {
    
    Helper helper = new Helper();
    userQuery query = new userQuery();
    
    public ResultSet login(UserModel model) {
        String sql = this.query.login;
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getUsername());
        map.put(2, model.getPassword());
        
        return this.getWithParameter(map, sql);
    }

    private ResultSet getWithParameter(Map<Integer, Object> map, String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public ResultSet login(userModel model) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    

