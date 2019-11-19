package com.example.esoftwarica.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

import com.example.esoftwarica.R;

import androidx.fragment.app.Fragment;

public class homeFragment extends Fragment {

    private EditText name, age, address;
    private Button btnSave;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.add_student,container,false);
//        name = view.findViewById(R.id.etName);
//        age = view.findViewById(R.id.etAge);
//        address = view.findViewById(R.id.etAddress);
//        btnSave = view.findViewById(R.id.btnSave);
//        return view;
    }
}
