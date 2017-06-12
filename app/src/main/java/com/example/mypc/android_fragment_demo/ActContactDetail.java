package com.example.mypc.android_fragment_demo;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mypc.android_fragment_demo.fragment.FrgContactDetail;

public class ActContactDetail extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_contact_detail);

        String selectedContactId = getIntent().getStringExtra(MainActivity.SELECTED_KEY_TRANSFER);

        if (findViewById(R.id.contactDetailFragmentContainer) != null) {
            FrgContactDetail frgContactDetail = new FrgContactDetail();
            Bundle args = new Bundle();
            args.putString(MainActivity.SELECTED_KEY_TRANSFER, selectedContactId);
            frgContactDetail.setArguments(args);
            getFragmentManager().beginTransaction().add(R.id.contactDetailFragmentContainer, frgContactDetail).commit();

        }
    }
}
