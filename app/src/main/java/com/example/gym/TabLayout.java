package com.example.gym;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class TabLayout extends AppCompatActivity {

    com.google.android.material.tabs.TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);

        tabLayout = findViewById(R.id.tabs);
        viewPager = findViewById(R.id.view_pager);

        FrontFragment frontFragment = new FrontFragment();
        BackFragment backFragment = new BackFragment();

        tabLayout.setupWithViewPager(viewPager);

        PageAdapter adapter = new PageAdapter(getSupportFragmentManager(), 0);
        adapter.AddFragment(frontFragment, "Front");
        adapter.AddFragment(backFragment, "Back");
        viewPager.setAdapter(adapter);

    }

    private class PageAdapter extends FragmentPagerAdapter {

        public List<Fragment> fragments = new ArrayList<>();
        public List<String> Title = new ArrayList<>();

        public void AddFragment(Fragment fragment, String title) {
            fragments.add(fragment);
            Title.add(title);
        }

        public PageAdapter(@NonNull FragmentManager fm, int behavior) {
            super(fm, behavior);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return Title.get(position);
        }
    }
}