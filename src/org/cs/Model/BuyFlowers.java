package org.cs.Model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by pc on 2016/4/19.
 */
@Entity
@Table(name = "tbl_buy")
public class BuyFlowers {

    /*
    * 主键
    * */
    private String id;
    /*
    * 鲜花信息
    * */
    private Flowers flowers;
    /*
    * 出售信息
    * */
    private SellFlowers sellFlowers;
    /*
    * 购买时间记录
    * */
    private Date nowBuy;

    public BuyFlowers() {
    }

    @Id
    @GeneratedValue(generator = "paymentableGenerator")
    @GenericGenerator(name = "paymentableGenerator", strategy = "uuid")
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

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sell")
    public SellFlowers getSellFlowers() {
        return sellFlowers;
    }

    public void setSellFlowers(SellFlowers sellFlowers) {
        this.sellFlowers = sellFlowers;
    }

    public Date getNowBuy() {
        return nowBuy;
    }

    public void setNowBuy(Date nowBuy) {
        this.nowBuy = nowBuy;
    }

}
