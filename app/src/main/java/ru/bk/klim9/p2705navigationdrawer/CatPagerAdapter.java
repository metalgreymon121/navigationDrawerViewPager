package ru.bk.klim9.p2705navigationdrawer;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CatPagerAdapter extends FragmentPagerAdapter {

    final String[] mCatNames;
    final String[] mCatDescriptions;
    final int[] mTopImageResourceIds = { R.drawable.icon1,
            R.drawable.icon2, R.drawable.icon3, R.drawable.icon4 };

    public CatPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        // TODO Auto-generated constructor stub
        Resources resources = context.getResources();
        mCatNames = resources.getStringArray(R.array.catsTitles);
        mCatDescriptions = resources.getStringArray(R.array.catDescriptions);
    }

    @Override
    public Fragment getItem(int idx) {
        // TODO Auto-generated method stub
        // Store the argument values for this fragment
        Bundle arguments = new Bundle();
        arguments.putString(CatsFragment.CAT_NAMES, mCatNames[idx]);
        arguments.putString(CatsFragment.CAT_DESCRIPTIONS,
                mCatDescriptions[idx]);
        arguments.putInt(CatsFragment.TOP_IMAGE, mTopImageResourceIds[idx]);
        // Create the fragment instance and pass the arguments
        CatsFragment catsFragment = new CatsFragment();
        catsFragment.setArguments(arguments);
        // return the fragment instance
        return catsFragment;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return mCatNames.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mCatNames[position];
    }
}
