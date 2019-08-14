package ke.co.dinaro.fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import butterknife.ButterKnife;
import butterknife.OnClick;
import ke.co.dinaro.R;
import ke.co.dinaro.activities.ViewReceiptActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class SettlementFragment extends Fragment {


    public SettlementFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_settlement, container, false);
        Glide.with(this).load(R.drawable.img_flower).into((ImageView) view.findViewById(R.id.imageView));

        ButterKnife.bind(this,view);
        return view;
}

    @OnClick(R.id.firstrecord)
    void onViewClicked() {

        startActivity(new Intent(getActivity(), ViewReceiptActivity.class));
    }
}
