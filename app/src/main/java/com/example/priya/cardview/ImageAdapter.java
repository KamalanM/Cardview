package com.example.priya.cardview;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.MyViewHolder> {

    private Context mContext;
    private List<Images> imagelist;

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        ImageView imageView;

        public MyViewHolder(View View) {
            super(View);

            textView=(TextView)View.findViewById(R.id.description);
            imageView=(ImageView)View.findViewById(R.id.thumbnail);

        }
    }

    public ImageAdapter(Context mContext,List<Images> imagelist)
    {
        this.mContext=mContext;
        this.imagelist=imagelist;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.image_view,parent,false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Images images=imagelist.get(position);
        holder.textView.setText(images.getDescription());

        Glide.with(mContext).load(images.getImageUrl()).into(holder.imageView);
//        Picasso.with(mContext).load(images.getImageUrl()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return imagelist.size();
    }


}
