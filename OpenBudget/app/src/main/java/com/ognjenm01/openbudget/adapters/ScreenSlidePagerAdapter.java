package com.ognjenm01.openbudget.adapters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.ognjenm01.openbudget.firstsetup.FirstFragment;
import com.ognjenm01.openbudget.firstsetup.SecondFragment;

public class ScreenSlidePagerAdapter extends FragmentStateAdapter {
    public ScreenSlidePagerAdapter(FragmentActivity fa) {
        super(fa);
    }

    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0: return new FirstFragment();
            case 1: return new SecondFragment();
            default: return new FirstFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
