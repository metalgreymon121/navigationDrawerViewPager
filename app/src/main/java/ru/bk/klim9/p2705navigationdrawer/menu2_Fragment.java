package ru.bk.klim9.p2705navigationdrawer;

import android.support.v4.app.Fragment;;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.astuetz.PagerSlidingTabStrip;


public class menu2_Fragment extends Fragment {

    View rootView;

    //
    private CatPagerAdapter mCatPagerAdapter;
    private ViewPager mViewPager;
    //
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.menu2_layout,container,false);

        //
        mCatPagerAdapter = new CatPagerAdapter(getChildFragmentManager(), getActivity());

        mViewPager = (ViewPager) rootView.findViewById(R.id.pager);
        mViewPager.setAdapter(mCatPagerAdapter);
        //

        // Подключение библиотеки
        PagerSlidingTabStrip tabs = (PagerSlidingTabStrip) rootView.findViewById(R.id.tabs);
        tabs.setViewPager(mViewPager);
        //tabs.setDividerColorResource(R.color.yellowColor);
        //tabs.setDividerColor(R.color.yellowColor);
        //
        return rootView;
    }
}
