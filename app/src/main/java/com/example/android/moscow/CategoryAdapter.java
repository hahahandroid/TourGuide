package com.example.android.moscow;

/**
 * Created by kate on 02/07/18.
 */

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new RedSquareFragment();
        } else if (position == 1) {
            return new MetroFragment();
        } else if (position == 2) {
            return new VDNHFragment();
        } else {
            return new MSUFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_red_square);
        } else if (position == 1) {
            return mContext.getString(R.string.category_metro);
        } else if (position == 2) {
            return mContext.getString(R.string.category_vdnh);
        } else {
            return mContext.getString(R.string.category_msu);
        }
    }
}

