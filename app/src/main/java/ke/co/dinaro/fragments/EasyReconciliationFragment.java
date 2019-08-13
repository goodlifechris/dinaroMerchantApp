package ke.co.dinaro.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ke.co.dinaro.R;
import ke.co.dinaro.activities.LogInActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class EasyReconciliationFragment extends Fragment {


    @BindView(R.id.buttonGetStarted)
    Button buttonGetStarted;

    public EasyReconciliationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_easy_reconciliation, container, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.my_image_view);

        ButterKnife.bind(this,view);
        Glide.with(this).load(R.drawable.img_reconcile).into(imageView);
        return view;
    }

    @OnClick(R.id.buttonGetStarted)
    public void onViewClicked() {

        startActivity(new Intent(getContext(), LogInActivity.class));
    }
}
