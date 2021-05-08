/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import com.google.gson.Gson;
import dao.CustomerDao;
import dao.CustomerOperationsDao;
import dao.CustomerOrderDao;
import dao.ProductDao;
import dao.StaffDao;
import domain.Customer;
import domain.CustomerOperations;
import domain.CustomerOrder;
import domain.Product;
import domain.Staff;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;
import javax.swing.JOptionPane;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.primefaces.json.JSONArray;
import org.primefaces.json.JSONException;
import org.primefaces.json.JSONObject;

/**
 *
 * @author Gasana
 */
public class Test {

    /**
     * @param args the command line arguments
     */
   //  ProductDao productDao = new ProductDao();
      
    public static void main(String[] args) throws JSONException {
   //Session s = HibernateUtil.getSessionFactory().openSession();
       
       
       Product product = new Product();
       ProductDao productDao = new ProductDao();
       CustomerOperations customerOperations = new CustomerOperations();
        CustomerOperationsDao customerOperationsDao = new CustomerOperationsDao();
        List<CustomerOperations> customerOperationses= new ArrayList<>();
       List<Product> products = new ArrayList<>();
       List<Customer> customers = new ArrayList<>();
       Customer customer = new Customer();
       CustomerDao customerDao = new CustomerDao();
//       
//       products = productDao.findAll(Product.class);
//       
//        System.out.println("LIST ALL PROD SIZE "+products.size());
//        
//        
//         if(!products.isEmpty()){
//            Product pro = products.get(products.size()-1);
//            System.out.println("Pro Name "+pro.getName());
//           }


//        String searchKey = "Red Suit";
//        customerOperations = customerOperationsDao.getOperationBySearchKey(searchKey);
//        
//        if(Objects.isNull(customerOperations)){
//            System.out.println("EMPTY");
//        }else{
//            System.out.println("NOT EMPTY");
//        }


//        CustomerOrder order = new CustomerOrder();
//        CustomerOrderDao customerOrderDao = new CustomerOrderDao();
//        
//        List<CustomerOrder>orders = new ArrayList<>();
//        
//        orders = customerOrderDao.findCustomerOrderByProducts("WI Shop");
//        
//        if(orders.isEmpty()){
//            System.out.println("EMPTY");
//        }else{
//            System.out.println("NOT EMPTY");
//        }
       
        
    
    
    }
 
}
