package app.dao;

import org.springframework.stereotype.Repository;
import app.pojo.Goods;

import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName GoodsList
 * @Description TODO
 * @Author Liyihe
 * @Date 2019/08/19 上午11:59
 * @Version 1.0
 */
@Repository
public class GoodsDao {
    private ConcurrentHashMap<String, Goods> map;
    private Random random = new Random();

    public ConcurrentHashMap<String, Goods> searchGoodsInfo() {
        if (map==null){
            map=new ConcurrentHashMap<>(30);
            for (int i = 0; i < 30; i++) {
                Goods goods = new Goods();
                goods.setId(String.valueOf(System.currentTimeMillis())+random.nextInt(20000));
                goods.setGoodsname("Goods" + i);
                goods.setPrice(random.nextInt(100));
                goods.setSize(random.nextInt(20));
                map.put(goods.getId(), goods);
            }
        }
        return map;
    }
    public void removeGoods(String id){
        map.remove(id);
    }
}
