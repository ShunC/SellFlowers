package org.cs.Model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by pc on 2016/4/19.
 */
@Entity
@Table(name = "tbl_sell")
public class SellFlowers {

    /*
    * 主键
    * */
    private String id;
    /*
    * 鲜花信息
    * */
    private Flowers flowers;
    /*
    * 价格
    * */
    private String price;
    /*
    * 出售标价的时间记录
    * */
    private Date nowSell;

    public SellFlowers() {
    }

    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "flowers")
    public Flowers getFlowers() {
        return flowers;
    }

    public void setFlowers(Flowers flowers) {
        this.flowers = flowers;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getNowSell() {
        return nowSell;
    }

    public void setNowSell(Date nowSell) {
        this.nowSell = nowSell;
    }
}
