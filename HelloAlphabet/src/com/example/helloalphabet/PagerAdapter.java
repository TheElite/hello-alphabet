package com.example.helloalphabet;

import java.util.List;
import java.util.Vector;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

public class PagerAdapter extends FragmentPagerAdapter {

	
	private List<Fragment> fragments;
	
	
	

	public PagerAdapter(FragmentManager fm, List<Fragment> fragments) {
		super(fm);
		// TODO Auto-generated constructor stub
		this.fragments = fragments;
	}

	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub		
		
		//if(arg0 == 1)
		//	return this.fragments.get(5);
		
		return this.fragments.get(arg0);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return this.fragments.size();
	}

}
