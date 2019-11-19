package com.example.esoftwarica.adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragmentList = new ArrayList<>();
    private List<String> fragmentTitle = new ArrayList<>();

    public  MainAdapter(FragmentManager fm) { super(fm);}

    public Fragment getItem(int i){return fragmentList.get(i);}

    public int getCount(){return fragmentList.size();}

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitle.get(position);
    }

    public void addFragment (Fragment fragment, String title){
        fragmentList.add(fragment);
        fragmentTitle.add(title);
    }

}
