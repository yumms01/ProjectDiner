package com.example.tacademy.projectdiner.QrPage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tacademy.projectdiner.R;
import com.example.tacademy.projectdiner.ReservationPage.Reservation_Main_Fragment;

public class QrActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new Qr_Fragment())
                    .commit();
        }
    }
}
