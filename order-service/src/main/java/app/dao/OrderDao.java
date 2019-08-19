package app.dao;

import org.springframework.stereotype.Repository;
import app.pojo.Order;

/**
 * @ClassName OrderDao
 * @Description TODO
 * @Author Liyihe
 * @Date 2019/08/19 下午2:08
 * @Version 1.0
 */

@Repository
public class OrderDao {
    public void putOrder(Order order){
        System.out.println("存入数据库--->"+order.toString());
    }
}
