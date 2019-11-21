package com.example.esoftwarica.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.esoftwarica.R;
import com.example.esoftwarica.adapter.MainAdapter;
import com.example.esoftwarica.fragments.aboutUsFragment;
import com.example.esoftwarica.fragments.addStudentFragment;
import com.example.esoftwarica.fragments.homeFragment;
import com.example.esoftwarica.model.modelStudent;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static List<modelStudent> studentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Home");

        BottomNavigationView bottomNav = findViewById(R.id.bottomNavigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);



        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new homeFragment()).commit();


        studentList = new ArrayList<>();
        studentList.add(new modelStudent("Amit Pradhan", "KTM", "Male", 23, R.drawable.male));
        studentList.add(new modelStudent("Gagan Dai", "Khokana", "Male", 22, R.drawable.male));
        studentList.add(new modelStudent("Daisyna Shrestha", "Lalitpur", "Female", 20, R.drawable.female));
        studentList.add(new modelStudent("Bibel Dahal", "Gaighat", "Male", 21, R.drawable.male));




    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment = null;
                    switch(menuItem.getItemId()){
                        case R.id.home:
                            selectedFragment = new homeFragment();
                            setTitle("Home");
                            break;

                        case R.id.addStudent:
                            selectedFragment = new addStudentFragment();
                            setTitle("Add Student");
                            break;

                        case R.id.about:
                            selectedFragment = new aboutUsFragment();
                            setTitle("About Us");
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, selectedFragment).commit();
                    return true;
                }
            };
}
