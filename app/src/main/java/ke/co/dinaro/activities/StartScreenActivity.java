package ke.co.dinaro.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import butterknife.BindView;
import butterknife.ButterKnife;
import ke.co.dinaro.R;
import ke.co.dinaro.adapter.ViewPagerAdapter;
import ke.co.dinaro.fragments.EasyReconciliationFragment;
import ke.co.dinaro.fragments.MonitorYourSalesFragment;
import ke.co.dinaro.fragments.SplashFragment;
import ke.co.dinaro.util.ZoomOutPageTransformer;

public class StartScreenActivity extends AppCompatActivity {

    @BindView(R.id.viewpager)
    ViewPager viewpager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
        ButterKnife.bind(this);

        setUpViewpagerAndTablLayout(viewpager);

    }

    public void setUpViewpagerAndTablLayout(ViewPager viewPager) {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        // Add Fragments to adapter one by one /no tab title required

        adapter.addFragment(new SplashFragment());
        adapter.addFragment(new MonitorYourSalesFragment());
        adapter.addFragment(new EasyReconciliationFragment());

        viewPager.setAdapter(adapter);
        viewPager.setPageTransformer(true, new ZoomOutPageTransformer());
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {


            }

            @Override
            public void onPageSelected(int i) {

//
////                pageIndicatorView.setSelection(i);
//                selection = i;
//                if (selection == 2)
//                    skip.setVisibility(View.INVISIBLE);
//                else skip.setVisibility(View.VISIBLE);

            }

            @Override
            public void onPageScrollStateChanged(int i) {


            }
        });


    }
}
