package com.techfreaks.fragmentsandservices;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by acer on 9/12/2017.
 */

public class ListAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ListViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ((ListViewHolder)holder).bindView(position);
    }

    @Override
    public int getItemCount() {
        return Party.names.length;
    }
    private class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        private TextView mtextview;
        private ImageView mimageView;
        public ListViewHolder(View itemView) {
            super(itemView);
            mtextview= (TextView) itemView.findViewById(R.id.itemText);
            mimageView= (ImageView) itemView.findViewById(R.id.itemImage);
        }
        public void bindView(int position)
        {
            mtextview.setText(Party.names[position]);
            mimageView.setImageResource(Party.resourceid[position]);
        }

        @Override
        public void onClick(View v) {

        }
    }}
