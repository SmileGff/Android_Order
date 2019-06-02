package cn.itcast.order.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

import cn.itcast.order.bean.ShopBean;

public class JsonParse
{
    private static JsonParse instance;
    private JsonParse()
    { }
    public  static  JsonParse getInstance()
    {
        if (instance==null)
        {
            instance=new JsonParse();
        }
        return  instance;
    }
    public List<ShopBean> getShopList(String json)
    {
        Gson gson=new Gson();
        Type listType=new TypeToken<List<ShopBean>>()
        {}
        .getType();
        List<ShopBean> shopList=gson.fromJson(json,listType);
        return shopList;
    }
}
