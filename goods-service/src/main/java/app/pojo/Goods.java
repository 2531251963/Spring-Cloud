package app.pojo;

/**
 * @ClassName Goods
 * @Description TODO
 * @Author Liyihe
 * @Date 2019/08/19 上午11:45
 * @Version 1.0
 */
public class Goods {
    private String id;
    private String goodsname;
    private double price;
    private int size;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodsname() {
        return goodsname;
    }

    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id='" + id + '\'' +
                ", goodsname='" + goodsname + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
