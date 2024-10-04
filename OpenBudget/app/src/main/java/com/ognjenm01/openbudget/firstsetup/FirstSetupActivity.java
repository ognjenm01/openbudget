package com.ognjenm01.openbudget.firstsetup;

import android.os.Bundle;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.ognjenm01.openbudget.R;
import com.ognjenm01.openbudget.adapters.ScreenSlidePagerAdapter;
import com.ognjenm01.openbudget.databinding.ActivityFirstSetupBinding;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;

public class FirstSetupActivity extends FragmentActivity {
    private ActivityFirstSetupBinding binding;

    private ViewPager2 viewPager;

    private FragmentStateAdapter pagerAdapter;

    private WormDotsIndicator dotsIndicator;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityFirstSetupBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        viewPager = findViewById(R.id.pager);
        pagerAdapter = new ScreenSlidePagerAdapter(this);
        viewPager.setAdapter(pagerAdapter);
        dotsIndicator = findViewById(R.id.dotsIndicator);
        dotsIndicator.setViewPager2(viewPager);
        //NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_first_setup);
        //appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        //NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
    }
}