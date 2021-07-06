package com.zimax.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.zimax.R;

import java.util.List;


public class CurrencyRecyclerViewAdapter extends RecyclerView.Adapter<CurrencyRecyclerViewAdapter.RecyclerViewViewHolder> {

    private List<Currency> arrayList;

    public CurrencyRecyclerViewAdapter(List<Currency> arrayList) {
        this.arrayList = arrayList;
    }

    public class RecyclerViewViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView1;

        public RecyclerViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageViewInCard);
            textView1 = itemView.findViewById(R.id.textViewInCard);
        }
    }

    @Override
    public RecyclerViewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        RecyclerViewViewHolder recyclerViewViewHolder = new RecyclerViewViewHolder(view);
        return recyclerViewViewHolder;
    }

    @Override
    public void onBindViewHolder(CurrencyRecyclerViewAdapter.RecyclerViewViewHolder holder, int position) {

        Currency currency = arrayList.get(position);

        holder.imageView.setImageResource(currency.getCurrencyFlag());

        String str = currency.getCurrencyName() + " ( "+ currency.getCurrencyTicker() + ")"
                + "\nцена : " + currency.getCurrencyValue() + " RUB";
        holder.textView1.setText(str);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

}