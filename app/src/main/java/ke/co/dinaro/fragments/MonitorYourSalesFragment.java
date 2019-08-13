package ke.co.dinaro.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import ke.co.dinaro.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MonitorYourSalesFragment extends Fragment {


    public MonitorYourSalesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_monitor_your_sales, container, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.my_image_view);

        Glide.with(this).load(R.drawable.ic_monitor).into(imageView);
        return view;
    }

}
