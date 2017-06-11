package com.example.mypc.android_fragment_demo;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mypc.android_fragment_demo.fragment.FrgContactDetail;
import com.example.mypc.android_fragment_demo.fragment.FrgContactList;

public class MainActivity extends FragmentActivity implements View.OnClickListener {
    public static String SELECTED_KEY_TRANSFER = "selected_contact_id";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (findViewById(R.id.contactFragmentContainer) != null) {
            FrgContactList frgContactList = new FrgContactList();
            getSupportFragmentManager().beginTransaction().add(R.id.contactFragmentContainer, frgContactList).commit();
        }
        if (findViewById(R.id.contactListContainer) != null) {
            FrgContactList frgContactList = new FrgContactList();
            getSupportFragmentManager().beginTransaction().add(R.id.contactListContainer, frgContactList).commit();
        }
        if (findViewById(R.id.contactDetailContainer) != null) {
            FrgContactDetail frgContactDetail = new FrgContactDetail();
            getSupportFragmentManager().beginTransaction().add(R.id.contactDetailContainer, frgContactDetail).commit();
        }
    }

    @Override
    public void onClick(View v) {
        FrgContactDetail contactDetailFragment = (FrgContactDetail) getSupportFragmentManager()
                .findFragmentById(R.id.contactDetailContainer);
        String id = ((TextView) v.findViewById(R.id.txtContactId)).getText().toString();

        if (contactDetailFragment != null && contactDetailFragment.isVisible()) {
            // 2-pane layout(landscape)
            contactDetailFragment.updateContactInfo(id);
        } else {
            // 1-pane layout(portrait)
            FrgContactDetail frgContactDetail = new FrgContactDetail();
            Bundle args = new Bundle();
            args.putString(MainActivity.SELECTED_KEY_TRANSFER, id);
            frgContactDetail.setArguments(args);

            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.contactFragmentContainer, frgContactDetail)
                    .addToBackStack(null)
                    .commit();
        }
    }
}
