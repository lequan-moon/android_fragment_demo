package com.example.mypc.android_fragment_demo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mypc.android_fragment_demo.R;
import com.example.mypc.android_fragment_demo.adapter.ContactAdapter;
import com.example.mypc.android_fragment_demo.model.Contact;

/**
 * Created by MyPC on 11/06/2017.
 */

public class FrgContactList extends Fragment {
    RecyclerView rcvContactList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frg_contact_list, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rcvContactList = (RecyclerView) view.findViewById(R.id.rcvContactList);
        ContactAdapter contactAdapter = new ContactAdapter(Contact.dummyData(), getContext(), (View.OnClickListener) getActivity());
        rcvContactList.setLayoutManager(new LinearLayoutManager(getContext()));
        rcvContactList.setItemAnimator(new DefaultItemAnimator());
        rcvContactList.setAdapter(contactAdapter);
    }
}
