package com.example.mytabviewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.mytabviewpager.Controllers.Fragments.NewsFragment;
import com.example.mytabviewpager.Controllers.Fragments.ParameterFragment;
import com.example.mytabviewpager.Controllers.Fragments.ProfileFragment;

/**
 * Created by Yassine Abou on 3/10/2021.
 */
public class PageAdapter extends FragmentPagerAdapter {
    public PageAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return NewsFragment.newInstance();
            case 1:
                return ParameterFragment.newInstance();
            case 2:
                return ProfileFragment.newInstance();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "news";
            case 1:
                return "Profile";
            case 2:
                return "Parameter";
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
