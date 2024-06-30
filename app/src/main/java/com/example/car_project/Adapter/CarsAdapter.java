package com.example.car_project.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.request.RequestOptions;
import com.example.car_project.Activity.DetailActivity;
import com.example.car_project.Domain.CarDomain;
import com.example.car_project.databinding.ViewholderCarsBinding;

import java.util.ArrayList;

public class CarsAdapter extends RecyclerView.Adapter<CarsAdapter.Viewholder> {
    ArrayList<CarDomain> items;
    public CarsAdapter(ArrayList<CarDomain> items) {
        this.items = items;
    }
    Context context;
    @NonNull
    @Override
    public CarsAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        ViewholderCarsBinding binding = ViewholderCarsBinding.inflate(LayoutInflater.from(context), parent, false);
        return new Viewholder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CarsAdapter.Viewholder holder, int position) {
        holder.binding.carTitleTxt.setText(items.get(position).getTitle());
        holder.binding.priceTxt.setText("$"+items.get(position).getPrice());

        Glide.with(context)
                .load(items.get(position).getPicUrl())
                .apply(new RequestOptions().transform(new CenterCrop()))
                .into(holder.binding.carPic);

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("object", items.get(position));
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
       ViewholderCarsBinding binding;
        public Viewholder(ViewholderCarsBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
