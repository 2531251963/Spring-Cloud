package app.pojo;

/**
 * @ClassName Order
 * @Description TODO
 * @Author Liyihe
 * @Date 2019/08/19 下午2:09
 * @Version 1.0
 */
public class Order {
    private String id;
    private String goodsid;
    private String phonenumer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid;
    }

    public String getPhonenumer() {
        return phonenumer;
    }

    public void setPhonenumer(String phonenumer) {
        this.phonenumer = phonenumer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", goodsid='" + goodsid + '\'' +
                ", phonenumer='" + phonenumer + '\'' +
                '}';
    }
}
