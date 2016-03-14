package com.example.tacademy.projectdiner.QrPage;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.tacademy.projectdiner.MainActivity;
import com.example.tacademy.projectdiner.R;
import com.example.tacademy.projectdiner.ReservationPage.Reservation_Activity;
import com.example.tacademy.projectdiner.SlidingMenuPage.Menu_Settings_Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class Qr_Fragment extends Fragment {


    public Qr_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_qr, container, false);

        Button btn = (Button)view.findViewById(R.id.btn_click);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), ScoreStar_Activity.class));
            }
        });

        btn = (Button)view.findViewById(R.id.btn_close);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), MainActivity.class));
            }
        });
        return view;
    }


}
