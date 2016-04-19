package org.cs.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by pc on 2016/4/19.
 */
@Entity
@Table(name = "tbl_flowers")
public class Flowers {

    /*
    * 主键
    * */
    private int id;
    /*
    * 鲜花名称
    * */
    private String flowerName;
    /*
    * 鲜花简介
    * */
    private String type;
    /*
    * 节日鲜花
    * */
    private Date day;

    public Flowers() {
    }

    @Id
    @GeneratedValue
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }
}
