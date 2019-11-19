package com.example.esoftwarica.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.esoftwarica.R;
import com.example.esoftwarica.fragments.aboutUsFragment;
import com.example.esoftwarica.fragments.addStudentFragment;
import com.example.esoftwarica.fragments.homeFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottomNavigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    Fragment selectedFragment = null;
                    switch(menuItem.getItemId()){
                        case R.id.home:
                            selectedFragment = new homeFragment();
                            break;

                        case R.id.addStudent:
                            selectedFragment = new addStudentFragment();
                            break;

                        case R.id.about:
                            selectedFragment = new aboutUsFragment();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, selectedFragment).commit();
                    return true;
                }
            };

//    private void readFromFile(){
//        try {
//            FileInputStream fos = openFileInput("Word.txt");
//            InputStreamReader isr = new InputStreamReader(fos);
//            BufferedReader br = new BufferedReader(isr);
//            String line="";
//            while ((line=br.readLine()) != null){
//                String[] parts = line.split("->");
//                dictionary.put(parts[0], parts[1]);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
}
