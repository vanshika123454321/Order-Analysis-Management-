package com.example;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="orders")

public class Orders {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int oid;

    private String item;
    private int cost;
    private int uid;
    private Date DOO;

    public Orders(){}

    public Orders(String item, int cost, int uid, Date DOO){
        this.item=item;
        this.cost=cost;
        this.uid=uid;
        this.DOO=DOO;
    }

    public int getId(){ return oid; }
    public String getItem(){ return item; }
    public int getCost(){ return cost; }
    public int getUid(){ return uid; }
    public Date getDate(){ return DOO; }

    public void setItem(String item){ this.item=item; }
    public void setCost(int cost){ this.cost=cost; }
    public void setUid(int uid){ this.uid=uid; }
    public void setDate(Date DOO){ this.DOO=DOO; }

}
