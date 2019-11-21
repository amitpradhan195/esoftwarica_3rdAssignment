package com.example.esoftwarica.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;

import com.example.esoftwarica.R;

import com.example.esoftwarica.activity.MainActivity;
import com.example.esoftwarica.adapter.MainAdapter;
import com.example.esoftwarica.model.modelStudent;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import static com.example.esoftwarica.activity.MainActivity.*;
//import static com.example.esoftwarica.activity.MainActivity.studentList;

public class homeFragment extends Fragment {

//    private EditText name, age, address;
//    private Button btnSave;
//
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.student_list,container,false);

        RecyclerView recyclerView = (RecyclerView)v.findViewById(R.id.rvStudent);
        MainAdapter adapterStudent = new MainAdapter(getActivity(), MainActivity.studentList);
        recyclerView.setAdapter(adapterStudent);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return v;
    }
}
