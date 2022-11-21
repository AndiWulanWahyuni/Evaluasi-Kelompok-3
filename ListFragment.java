package com.example.sqlite;

import static android.os.Looper.prepare;

import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class ListFragment extends Fragment implements AdapterView.OnItemClickListener {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @androidx.annotation.Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String[] data_name = {"Dokter Spesialis Penyakit Dalam", "Dokter Spesialis Anak", "Dokter Spesialis Saraf", "Dokter Spesialis Kandungan", "Dokter Spesialis Bedah", "Dokter Spesialis THT", "Dokter Spesialis Mata", "Dokter Gigi"};

        ListView listView = (ListView) view.findViewById(R.id.lv_list);
        ArrayAdapter<String> adapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, data_name);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
        if (i == 0) {
            Intent intent = new Intent(view.getContext(), spesialisdalam.class);
            startActivity(intent);
            Toast.makeText(getActivity(), "Dokter Spesialis Penyakit Dalam", Toast.LENGTH_SHORT).show();
        }
        if (i == 1) {
            Intent intent = new Intent(view.getContext(), spesialisanak.class);
            startActivity(intent);
            Toast.makeText(getActivity(), "Dokter Spesialis Anak", Toast.LENGTH_SHORT).show();
        }
        if (i == 2) {
            Intent intent = new Intent(view.getContext(), spesialissaraf.class);
            startActivity(intent);
            Toast.makeText(getActivity(), "Dokter Spesialis Saraf", Toast.LENGTH_SHORT).show();
        }
        if (i == 3) {
            Intent intent = new Intent(view.getContext(), spesialiskandungan.class);
            startActivity(intent);
            Toast.makeText(getActivity(), "Dokter Spesialis Kandungan", Toast.LENGTH_SHORT).show();
        }
        if (i == 4) {
            Intent intent = new Intent(view.getContext(), spesialisbedah.class);
            startActivity(intent);
            Toast.makeText(getActivity(), "Dokter Spesialis Bedah", Toast.LENGTH_SHORT).show();
        }
        if (i == 5) {
            Intent intent = new Intent(view.getContext(), spesialistht.class);
            startActivity(intent);
            Toast.makeText(getActivity(), "Dokter Spesialis THT", Toast.LENGTH_SHORT).show();
        }
        if (i == 6) {
            Intent intent = new Intent(view.getContext(), spesialismata.class);
            startActivity(intent);
            Toast.makeText(getActivity(), "Dokter Spesialis Mata", Toast.LENGTH_SHORT).show();
        }
        if (i == 7) {
            Intent intent = new Intent(view.getContext(), spesialisgigi.class);
            startActivity(intent);
            Toast.makeText(getActivity(), "Dokter Gigi", Toast.LENGTH_SHORT).show();
        }
    }
}