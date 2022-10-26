package com.thesis.mobiserve;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder>
{
    private Context context;
    private List<Product> productList;


    public ProductAdapter( Context context, List<Product> productList) {
        this.productList = productList;
        this.context = context;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.card_product, null);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position)
    {
     Product product = productList.get(position);

        Glide.with(context)
                .load(product.getImg())
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(holder.tuyo_img);

        holder.tv_title.setText(product.getTitle());
        holder.tv_des.setText(product.getDes());
        holder.tv_price.setText(product.getPrice());

    }


    @Override
    public int getItemCount() {
        return productList.size();
    }

    public static class ProductViewHolder extends RecyclerView.ViewHolder
    {
        TextView tv_title, tv_des, tv_price;
        ImageView add_tocart, tuyo_img;

        public ProductViewHolder(@NonNull View itemView)
        {
            super(itemView);

            tv_title = itemView.findViewById(R.id.tv_title);
            tv_des = itemView.findViewById(R.id. tv_des);
            tv_price = itemView.findViewById(R.id.tv_price);
            add_tocart = itemView.findViewById(R.id.add_tocart);
            tuyo_img = itemView.findViewById(R.id.tuyo_img);
        }
    }
}
