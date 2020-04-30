package cn.henu.one.controller;

import cn.henu.one.bean.Customer;
import cn.henu.one.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@RestController
public class CustomerController {
    @Autowired
    CustomerMapper customerMapper;

    @GetMapping("/customer_all")
    @CrossOrigin
    public ArrayList<Customer> getAll(){
        ArrayList<Customer> customers=customerMapper.getCustomerAll();
        return customers;
    }

    @PostMapping("/login_in")
    @CrossOrigin
    public String login_in(Customer customer,HttpSession session){

//        session.getAttribute("name");
        //删除
//        session.removeAttribute("name");
        Customer customer1 = customerMapper.getCustomerByAccount(customer.getAccount());
        if(customer1!=null&&customer.getPassword().equals(customer1.getPassword())){
            //添加sessionKey
            session.setAttribute("loginUser",customer.getAccount());
            return "ok";
        }
        else {
            return "no";
        }
    }

    @PostMapping("/delete_customer/{id}")
    @CrossOrigin
    public void deleteCustomer(@PathVariable("id") Integer id) {
        customerMapper.deleteCustomerById(id);
    }

    @PostMapping("/customer_signup")
    @CrossOrigin
    public int insertCustomer(Customer customer) {
        if(customerMapper.getCustomerByAccount(customer.getAccount())!=null){
            return -1;
        }
        else{
            customerMapper.insertCustomer(customer);
            int id=customerMapper.getIdByAccount(customer.getAccount());
            return id;
        }
    }
}
