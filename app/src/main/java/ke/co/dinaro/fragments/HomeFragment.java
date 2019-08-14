package ke.co.dinaro.fragments;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ke.co.dinaro.MainActivity;
import ke.co.dinaro.R;
import ke.co.dinaro.activities.RequestActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    @BindView(R.id.imageView)
    ImageView imageView;
    @BindView(R.id.card_view_sales)
    CardView cardViewSales;
    @BindView(R.id.card_view_request)
    CardView cardViewRequest;
    @BindView(R.id.card_view_settlement)
    CardView cardViewSettlement;
    @BindView(R.id.imageView2)
    ImageView imageView2;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this,view);
        Glide.with(this).load(R.drawable.img_flower).into(imageView);

        return view;
    }

    @OnClick({R.id.card_view_sales, R.id.card_view_request, R.id.card_view_settlement})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.card_view_sales:
                ((MainActivity)getActivity()).setFragment(new ShowSalesBalance());
                break;
            case R.id.card_view_request:

                startActivity(new Intent(getContext(), RequestActivity.class));

                break;
            case R.id.card_view_settlement:
                ((MainActivity)getActivity()).setFragment(new SettlementFragment());

                break;
        }
    }
}
