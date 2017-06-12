package com.example.mypc.android_fragment_demo.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mypc.android_fragment_demo.MainActivity;
import com.example.mypc.android_fragment_demo.R;
import com.example.mypc.android_fragment_demo.model.Contact;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.zip.Inflater;

/**
 * Created by MyPC on 11/06/2017.
 */
public class FrgContactDetail extends Fragment {
    TextView txtContactName;
    TextView txtPhoneNumber;
    TextView txtEmail;
    CircularImageView profilePic;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        String selectedContactId = getArguments().getString(MainActivity.SELECTED_KEY_TRANSFER);

        View detailFragment = inflater.inflate(R.layout.frg_contact_detail, container, false);
        txtContactName = (TextView) detailFragment.findViewById(R.id.txtContactName);
        txtPhoneNumber = (TextView) detailFragment.findViewById(R.id.txtPhoneNumber);
        txtEmail = (TextView) detailFragment.findViewById(R.id.txtEmail);
        profilePic = (CircularImageView) detailFragment.findViewById(R.id.profilePic);


        updateContactInfo(selectedContactId);

        return detailFragment;
    }

    public void updateContactInfo(String contactId) {
        Contact selectedItem = Contact.dummyData().get(Integer.valueOf(contactId));

        txtContactName.setText(selectedItem.getName());
        txtPhoneNumber.setText(selectedItem.getPhoneNumber());
        txtEmail.setText(selectedItem.getEmail());
        profilePic.setImageDrawable(getResources().getDrawable(selectedItem.getImgThumb(), null));
    }
}
