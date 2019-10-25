package com.example.calenderdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.v1);
        viewPager.setAdapter(new MyPagerAdpter(getSupportFragmentManager()));
    }

    private class MyPagerAdpter extends FragmentPagerAdapter {

        public MyPagerAdpter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return FirstFragment.newInstance("FirstFragment, Instance 1");
                case 1:
                    return SecondFragment.newInstance("SecondFragment, Instance 1");
                case 2:
                    return ThirdFragment.newInstance("ThirdFragment, Instance 1");
                case 3:
                    return ThirdFragment.newInstance("ThirdFragment, Instance 2");
                case 4:
                    return ThirdFragment.newInstance("ThirdFragment, Instance 3");
                default:
                    return ThirdFragment.newInstance("ThirdFragment, Default");
            }
        }

        @Override
        public int getCount() {
            return 5;
        }
    }
}
