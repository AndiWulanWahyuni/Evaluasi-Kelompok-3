package com.example.sqlite;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DokterAdapter extends BaseAdapter {
    private final Context context;
    private ArrayList<Dokter> dokters;

    void setDokters(ArrayList<Dokter> dokters) {
        this.dokters = dokters;
    }

    DokterAdapter (Context context) {
        this.context = context;
        dokters = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return dokters.size();
    }

    @Override
    public Object getItem(int i) {
        return dokters.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.fragment_list, viewGroup, false);
        }
        ViewHolder viewHolder = new ViewHolder(view);
        Dokter dokter = (Dokter) getItem(i);
        viewHolder.bind(dokter);
        return view;
    }

    private class ViewHolder {
        private TextView txtName;
        private TextView txtDescription;
        private ImageView imgPhoto;

        ViewHolder(View view) {
            txtName = view.findViewById(R.id.txt_name);
            txtDescription = view.findViewById(R.id.txt_description);
            imgPhoto = view.findViewById(R.id.img_photo);
        }

        void bind(Dokter dokter) {
            txtName.setText(dokter.getName());
            txtDescription.setText(dokter.getDescription());
            imgPhoto.setImageResource (dokter.getPhoto());
        }
    }
}