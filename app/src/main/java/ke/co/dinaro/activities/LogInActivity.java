package ke.co.dinaro.activities;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ke.co.dinaro.MainActivity;
import ke.co.dinaro.R;

public class LogInActivity extends AppCompatActivity {

    ImageView imageView;
    @BindView(R.id.buttonLogIn)
    Button buttonLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        ButterKnife.bind(this);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_black_18dp);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorWhite)));
        getSupportActionBar().setElevation(0);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        imageView = findViewById(R.id.imageView);
        Glide.with(this).load(R.drawable.img_flower).into(imageView);
    }

    @OnClick(R.id.buttonLogIn)
    public void onViewClicked() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
