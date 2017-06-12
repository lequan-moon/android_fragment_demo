package com.example.mypc.android_fragment_demo;

import android.app.Fragment;
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
            getFragmentManager().beginTransaction().add(R.id.contactFragmentContainer, frgContactList).commit();
        }
        if (findViewById(R.id.contactListContainer) != null) {
            FrgContactList frgContactList = new FrgContactList();
            getFragmentManager().beginTransaction().add(R.id.contactListContainer, frgContactList).commit();
        }
        if (findViewById(R.id.contactDetailContainer) != null) {
            // Default select first contact
            Bundle args = new Bundle();
            args.putString(SELECTED_KEY_TRANSFER, "0");
            FrgContactDetail frgContactDetail = new FrgContactDetail();
            frgContactDetail.setArguments(args);
            getFragmentManager().beginTransaction().add(R.id.contactDetailContainer, frgContactDetail).commit();
        }
    }

    @Override
    public void onClick(View v) {
        Fragment detailContainer = getFragmentManager().findFragmentById(R.id.contactDetailContainer);
        String id = ((TextView) v.findViewById(R.id.txtContactId)).getText().toString();

        if (detailContainer != null && detailContainer.isVisible()) {
            // 2-pane layout(landscape)
            FrgContactDetail contactDetailFragment = new FrgContactDetail();

            Bundle args = new Bundle();
            args.putString(SELECTED_KEY_TRANSFER, id);
            contactDetailFragment.setArguments(args);
            getFragmentManager().beginTransaction().replace(R.id.contactDetailContainer, contactDetailFragment).commit();
        } else {
            // 1-pane layout(portrait)
            Intent itContactDetail = new Intent(this, ActContactDetail.class);
            itContactDetail.putExtra(SELECTED_KEY_TRANSFER, id);
            startActivity(itContactDetail);
        }
    }
}
