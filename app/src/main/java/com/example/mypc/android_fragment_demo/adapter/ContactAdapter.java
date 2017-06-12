package com.example.mypc.android_fragment_demo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mypc.android_fragment_demo.R;
import com.example.mypc.android_fragment_demo.model.Contact;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.List;

/**
 * Created by MyPC on 11/06/2017.
 */
public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactListViewHolder>{

    List<Contact> lstContacts;
    Context mContext;
    View.OnClickListener listener;

    public ContactAdapter(List<Contact> lstContacts, Context mContext, View.OnClickListener listener) {
        this.lstContacts = lstContacts;
        this.mContext = mContext;
        this.listener = listener;
    }

    @Override
    public ContactAdapter.ContactListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View contactItem = LayoutInflater.from(mContext).inflate(R.layout.contact_item, parent, false);
        contactItem.setOnClickListener(this.listener);
        return new ContactListViewHolder(contactItem);

    }

    @Override
    public void onBindViewHolder(ContactListViewHolder holder, int position) {
        Contact item = lstContacts.get(position);
        holder.txtContactName.setText(item.getName());
        holder.txtContactId.setText(item.getId());
        holder.imgContactThumb.setImageDrawable(mContext.getResources().getDrawable(item.getImgThumb(), null));
    }

    @Override
    public int getItemCount() {
        return lstContacts.size();
    }

    class ContactListViewHolder extends RecyclerView.ViewHolder{
        TextView txtContactName;
        CircularImageView imgContactThumb;
        TextView txtContactId;

        public ContactListViewHolder(View itemView) {
            super(itemView);
            txtContactName = (TextView) itemView.findViewById(R.id.txtContactName);
            imgContactThumb = (CircularImageView) itemView.findViewById(R.id.imgContactThumb);
            txtContactId = (TextView) itemView.findViewById(R.id.txtContactId);
        }
    }
}
