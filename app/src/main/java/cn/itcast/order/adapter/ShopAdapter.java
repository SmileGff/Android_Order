package cn.itcast.order.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import cn.itcast.order.R;
import cn.itcast.order.bean.ShopBean;

public class ShopAdapter extends BaseAdapter
{
    private Context mContext;
    private List<ShopBean> sbl;
    public ShopAdapter(Context context)
    {
        this.mContext=context;
    }
    /**
     * 设置数据更新界面
     */
    public void setData(List<ShopBean> sbl)
    {
        this.sbl=sbl;
        notifyDataSetChanged();
    }
    @Override
    public  int getCount()
    {
        return sbl==null?0:sbl.size();
    }
    @Override
    public ShopBean getItem(int position)
    {
        return sbl==null?null:sbl.get(position);
    }
    @Override
    public long getItemId(int position)
    {
        return position;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        final ViewHolder vh;
        if (convertView==null)
        {
            vh=new ViewHolder();
            convertView=LayoutInflater.from(mContext).inflate(R.layout.shop_item,null);
            vh.tv_shop_name=(TextView) convertView.findViewById(R.id.tv_shop_name);
            vh.tv_sale_num=(TextView)convertView.findViewById(R.id.tv_sale_num);
            vh.tv_cost=(TextView)convertView.findViewById(R.id.tv_cost);
            vh.tv_welfare=(TextView)convertView.findViewById(R.id.tv_welfare);
            vh.tv_time=(TextView)convertView.findViewById(R.id.tv_time);
            vh.iv_shop_pic=(ImageView) convertView.findViewById(R.id.iv_shop_pic);
        }
        else
        {
            vh=(ViewHolder) convertView.getTag();
        }
        final ShopBean bean =getItem(position);
        if (bean !=null)
        {
            vh.tv_shop_name.setText(bean.getShowName());
            vh.tv_sale_num.setText("月售"+bean.getSaleNum());
            vh.tv_cost.setText("起送¥"+bean.getOfferPrice()+"|配送¥"+bean.getDistributionCost());
            vh.tv_time.setText(bean.getTime());
            vh.tv_welfare.setText(bean.getWelfare());
            Glide.with(mContext)
                .load(bean.getShopPic())
                .error(R.mipmap.ic_launcher)
                .into(vh.iv_shop_pic);
        }
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //跳转到店铺详情界面
            }
        });
        return convertView;
    }
    class ViewHolder
    {
        public TextView tv_shop_name,tv_sale_num,tv_cost,tv_welfare,tv_time;
        public ImageView iv_shop_pic;
    }
}
