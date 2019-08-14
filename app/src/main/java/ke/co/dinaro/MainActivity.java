package ke.co.dinaro;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ke.co.dinaro.fragments.HomeFragment;

public class MainActivity extends AppCompatActivity {

    FragmentManager fragmentManager;
    @BindView(R.id.imageviewHome)
    ImageView imageviewHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
        fragmentManager = getSupportFragmentManager();
        setFragment(new HomeFragment());

    }

    public void setFragment(Fragment fragment) {

        fragmentManager.beginTransaction().replace(R.id.frame, fragment).addToBackStack(null).commit();
    }

    @OnClick(R.id.imageviewHome)
    public void onViewClicked() {
        setFragment(new HomeFragment());

    }
}
