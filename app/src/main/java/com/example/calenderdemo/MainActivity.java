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
                    return SecondFragment.newInstance("SecondFragment, Instance 2");
                case 2:
                    return ThirdFragment.newInstance("ThirdFragment, Instance 3");
                case 3:
                    return FourthFragment.newInstance("FourthFragment, Instance 4");
                case 4:
                    return FifthFragment.newInstance("FifthFragment, Instance 5");
                case 5:
                    return SixthFragment.newInstance("SixthFragment, Instance 6");
                case 6:
                    return SeventhFragment.newInstance("SeventhFragment, Instance 7");
                case 7:
                    return EigthFragment.newInstance("EigthFragment, Instance 8");
                case 8:
                    return NinthFragment.newInstance("NinethFragment, Instance 9");
                case 9:
                    return TenthFragment.newInstance("TenthFragment, Instance 10");
                case 10:
                    return EleventhFragment.newInstance("EleventhFragment, Instance 11");
                case 11:
                    return TwelvethFragment.newInstance("TwelevethFragment, Instance 12");

                default:
                    return FirstFragment.newInstance("FirstFragment, Default");
            }
        }

        @Override
        public int getCount() {
            return 13;
        }
    }
}
