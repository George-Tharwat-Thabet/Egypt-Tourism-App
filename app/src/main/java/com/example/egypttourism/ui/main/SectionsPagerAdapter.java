package com.example.egypttourism.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.egypttourism.R;
import com.example.egypttourism.ReligiousTouristPlacesFragment;
import com.example.egypttourism.TouristAreasFragment;
import com.example.egypttourism.hotelsFragment;
import com.example.egypttourism.resturantsFragment;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2, R.string.tab_text_3, R.string.tab_text_4};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int positions) { // لعرض كل الfragments اللي اتعملت يدويا

        Fragment AllFragment = null;
        switch (positions){
            case 0:
                AllFragment = new resturantsFragment();
                break;
            case 1:
                AllFragment = new hotelsFragment();
                break;
            case 2:
                AllFragment = new TouristAreasFragment();
                break;
            case 3:
                AllFragment = new ReligiousTouristPlacesFragment();
                break;
        }

        return AllFragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 4;
    }
}