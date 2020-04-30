package cn.henu.one.mapper;

import cn.henu.one.bean.Afood;
import cn.henu.one.bean.Customer;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

public interface FoodMapper {
    @Select("select * from customer where id=#{id}")
    public Customer getCustomerById(Integer id);

    @Select("select * from food")
    public ArrayList<Afood> getFoodAll();

    @Select("select * from customer where account=#{account}")
    public Customer getCustomerByAccount(String account);

    @Select("select id from customer where account=#{account}")
    public int getIdByAccount(String account);

    @Delete("delete from food where id=#{id}")
    public void deleteFoodById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into customer(account,password,nickname) values(#{account},#{password},#{nickname})")
    public int insertCustomer(Customer customer);

    @Update("update department set departmentName=#{departmentName} where id=#{id}")
    public int updateCustomer(Customer customer);
}
