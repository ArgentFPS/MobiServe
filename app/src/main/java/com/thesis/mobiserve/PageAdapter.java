package com.thesis.mobiserve;



import androidx.annotation.NonNull;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PageAdapter extends FragmentPagerAdapter {

    private int numoftabs;

    public PageAdapter(@NonNull FragmentManager fm, int Numoftabs) {
        super(fm);
        this.numoftabs = Numoftabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new LoginFragment( );
            case 1:
                return new SignupFragment();
            default:
                return null;



        }

    }

    @Override
    public int getCount() {
        return numoftabs;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {

        return POSITION_NONE;
    }
}
