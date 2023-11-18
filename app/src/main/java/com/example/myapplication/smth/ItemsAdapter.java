package com.example.myapplication.smth;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.model.Items;

import java.util.List;

/* public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ItemsViewHolder> {

    Context context;
    List<Items> items;


    @NonNull
    @Override
    public ItemsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemsC = LayoutInflater.from(context).inflate(R.layout.iteml, parent, false);
        return new ItemsAdapter.ItemsViewHolder(itemsC);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemsViewHolder holder, int position) {

        holder.itemBg.setBackgroundColor(Color.parseColor(items.get(position).getColor()));

        int imageId = context.getResources().getIdentifier("ic"+items.get(position).getImg(),"drawable", context.getPackageName());
        holder.itemimg.setImageResource(imageId);

        holder.itemTitle.setText(items.get(position).getTitle());
        holder.itemPrice.setText(items.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return items.size();

    }

    public static final class ItemsViewHolder extends RecyclerView.ViewHolder{

        LinearLayout itemBg;
        ImageView itemimg;
        TextView itemTitle, itemPrice;


        public ItemsViewHolder(@NonNull View itemView) {
            super(itemView);

            itemBg = itemView.findViewById(R.id.itemBg);
            itemimg = itemView.findViewById(R.id.itemimg);
            itemTitle = itemView.findViewById(R.id.itemTitle);
            itemPrice = itemView.findViewById(R.id.itemPrice);
        }
    }


}*/
