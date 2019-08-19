package app.pojo;

/**
 * @ClassName RequestObject
 * @Description TODO
 * @Author Liyihe
 * @Date 2019/08/19 下午2:01
 * @Version 1.0
 */
public class RequestObject {
    private String goodsid;
    private String phonenumber;

    public String getGoodsid() {
        return goodsid;
    }

    public void setGoodsid(String goodsid) {
        this.goodsid = goodsid;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "RequestObject{" +
                "goodsid='" + goodsid + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                '}';
    }
}
