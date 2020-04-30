package cn.henu.one.mapper;


import cn.henu.one.bean.Customer;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;


//指定这是一个操作数据库的mapper
//@Mapper
public interface CustomerMapper {

    @Select("select * from customer where id=#{id}")
    public Customer getCustomerById(Integer id);

    @Select("select * from customer")
    public ArrayList<Customer> getCustomerAll();

    @Select("select * from customer where account=#{account}")
    public Customer getCustomerByAccount(String account);

    @Select("select id from customer where account=#{account}")
    public int getIdByAccount(String account);

    @Delete("delete from customer where id=#{id}")
    public int deleteCustomerById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into customer(account,password,name) values(#{account},#{password},#{name})")
    public int insertCustomer(Customer customer);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateCustomer(Customer customer);
}
