package cn.itcast.order.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class FoodBean implements Serializable
{
    private static  final  long serialVersionUID=1L;//序列化时保持ShopBean类版本的兼容性
    private int foodId;//ID
    private String foodName;//名称
    private String taste;
    private int saleNum;
    private BigDecimal price;
    private int count;
    private String foodPic;
    public int getFoodId()
    { return foodId; }

    public void setFoodId(int foodId)
    { this.foodId=foodId;}

    public String getFoodName()
    { return foodName; }

    public void  setFoodName(String foodNotice)
    { this.foodName=foodName; }

    public String getTaste()
    { return taste; }

    public void setTaste(String taste)
    { this.taste=taste; }

    public int getSaleNum()
    { return saleNum; }

    public void setSaleNum(int saleNum)
    { this.saleNum=saleNum; }

    public BigDecimal getPrice()
    { return price; }

    public void setPrice(BigDecimal price)
    { this.price=price; }

    public String getFoodPic()
    { return foodPic; }

    public void setFoodPic(String foodPic)
    { this.foodPic=foodPic; }

    public int getCount()
    {  return count;}

    public void setCount(int count)
    { this.count=count; }
}
