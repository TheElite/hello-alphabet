package com.example.helloalphabet;

import java.util.List;
import java.util.Observer;
import java.util.Vector;

import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.database.Observable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class MainActivity extends FragmentActivity {
	
	private PagerAdapter mPagerAdapter;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpager_layout);
        initialisePaging();

    }

    

    private void initialisePaging() {
		// TODO Auto-generated method stub
		List<Fragment> fragments = new Vector<Fragment>();
				
		fragments.add(Fragment.instantiate(this, Blank.class.getName()));
		fragments.add(Fragment.instantiate(this, A.class.getName()));		
		fragments.add(Fragment.instantiate(this, B.class.getName()));
		fragments.add(Fragment.instantiate(this, C.class.getName()));
		fragments.add(Fragment.instantiate(this, D.class.getName()));
		fragments.add(Fragment.instantiate(this, E.class.getName()));
		fragments.add(Fragment.instantiate(this, F.class.getName()));
		fragments.add(Fragment.instantiate(this, G.class.getName()));
		fragments.add(Fragment.instantiate(this, H.class.getName()));
		fragments.add(Fragment.instantiate(this, I.class.getName()));
		fragments.add(Fragment.instantiate(this, J.class.getName()));
		fragments.add(Fragment.instantiate(this, K.class.getName()));
		fragments.add(Fragment.instantiate(this, L.class.getName()));
		fragments.add(Fragment.instantiate(this, M.class.getName()));
		fragments.add(Fragment.instantiate(this, N.class.getName()));
		fragments.add(Fragment.instantiate(this, O.class.getName()));
		fragments.add(Fragment.instantiate(this, P.class.getName()));
		fragments.add(Fragment.instantiate(this, Q.class.getName()));
		fragments.add(Fragment.instantiate(this, Arrrr.class.getName()));
		fragments.add(Fragment.instantiate(this, S.class.getName()));
		fragments.add(Fragment.instantiate(this, T.class.getName()));
		fragments.add(Fragment.instantiate(this, U.class.getName()));
		fragments.add(Fragment.instantiate(this, V.class.getName()));
		fragments.add(Fragment.instantiate(this, W.class.getName()));
		fragments.add(Fragment.instantiate(this, X.class.getName()));
		fragments.add(Fragment.instantiate(this, Y.class.getName()));
		fragments.add(Fragment.instantiate(this, Z.class.getName()));
		fragments.add(Fragment.instantiate(this, Blank2.class.getName()));
		
		mPagerAdapter = new PagerAdapter(this.getSupportFragmentManager(), fragments);
	
		ViewPager pager = (ViewPager) findViewById(R.id.viewpager);
		pager.setAdapter(mPagerAdapter);
		
		pager.setCurrentItem(1);
    }    

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
	
    
}















/*
		if(pager.getCurrentItem() == 10)
			pager.setCurrentItem(3);
			
			*/
