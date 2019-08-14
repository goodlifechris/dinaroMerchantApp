package ke.co.dinaro.activities;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;

import butterknife.ButterKnife;
import butterknife.OnClick;
import ke.co.dinaro.R;

public class RequestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request);
        ButterKnife.bind(this);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_back);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorWhite)));
        getSupportActionBar().setElevation(0);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Glide.with(this).load(R.drawable.img_flower).into((ImageView) findViewById(R.id.imageView));
    }

    @OnClick({R.id.btn_bank_deposit, R.id.btn_mpesa})
    public void onViewClicked(View view) {
        startActivity(new Intent(this,RequestFundActivity.class));
//        switch (view.getId()) {
//            case R.id.btn_bank_deposit:
//                break;
//            case R.id.btn_mpesa:
//                break;
//        }
    }
}
