package com.example.car_project.Activity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;
import com.example.car_project.Domain.CarDomain;
import com.example.car_project.R;
import com.example.car_project.databinding.ActivityDetailBinding;

import java.text.NumberFormat;
import java.util.Locale;

public class DetailActivity extends BaseActivity {

    ActivityDetailBinding binding;
    CarDomain object;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getIntentExtra();
        setVariable();
    }

    @SuppressLint("SetTextI18n")
    private void setVariable() {
        binding.backBtn.setOnClickListener(v -> finish());
        binding.carTitleTxt1.setText(object.getTitle());
        binding.descriptionTxt.setText(object.getDescription());
        binding.capacityTxt.setText(object.getCapacity());
        binding.topSpeedTxt.setText(object.getTopSpeed());
        binding.enginePowerTxt.setText(object.getEnginePower());
        binding.carPriceTxt.setText("$"+ NumberFormat.getNumberInstance(Locale.US).format(object.getPrice()));
        binding.ratingTxt.setText(String.valueOf(object.getRating()));

        Glide.with(DetailActivity.this)
                .load(object.getPicUrl())
                .into(binding.carPicTxt);
    }

    private void getIntentExtra() {
        object = (CarDomain) getIntent().getSerializableExtra("object");
    }
}