package cn.itcast.order.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class ShopBean implements Serializable
{
    private static  final  long serialVersionUID=1L;//序列化时保持ShopBean类版本的兼容性
    private int id;//店铺ID
    private String shopName;//店铺名称
    private int saleNum;
    private BigDecimal offerPrice;
    private BigDecimal distributionCost;
    private String welfare;
    private String time;
    private String shopPic;
    private String shopNotice;
    private List<FoodBean> foodList;
    public int getId()
    { return id; }

    public void setId(int id)
    { this.id=id;}

    public String getShowName()
    { return shopName; }

    public void setShopName(String shopName)
    { this.shopName=shopName; }

    public int getSaleNum()
    { return saleNum; }

    public void setSaleNum(int saleNum)
    { this.saleNum=saleNum; }

    public BigDecimal getOfferPrice()
    { return offerPrice; }

    public void getOfferPrice(BigDecimal OfferPrice)
    { this.offerPrice=offerPrice; }

    public BigDecimal getDistributionCost()
    { return distributionCost; }

    public void setDistributionCost(BigDecimal distributionCost)
    { this.distributionCost=distributionCost; }

    public String getWelfare()
    { return welfare; }

    public void setWelfare(String welfare)
    { this.welfare=welfare; }

    public String getTime()
    {  return  time;}

    public void setTime(String welfare)
    { this.time=time; }

    public String getShopPic()
    { return shopPic;}

    public void setShopPic(String shopPic)
    { this.shopPic=shopPic; }

    public String getShopNotice()
    { return shopNotice; }

    public void setShopNotice(String shopNotice)
    { this.shopNotice=shopNotice; }

    public List<FoodBean> getFoodList()
    { return  foodList; }

    public void setFoodList(List<FoodBean> foodList)
    { this.foodList=foodList; }

}
