package com.heriparid.android.baseapp.ui;

import javax.inject.Inject;

import butterknife.ButterKnife;
import butterknife.InjectView;

import com.heriparid.android.baseapp.BaseApp;
import com.heriparid.android.baseapp.R;
import com.heriparid.android.baseapp.controllers.HomeController;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.TextView;

public class HomeActivity extends FragmentActivity {

	@Inject
	HomeController mController;
	
	@InjectView(R.id.tv_label)
	TextView label;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
		
		ButterKnife.inject(this);
		
		BaseApp.INSTANCE.getObjectGraph().inject(this);
		label.setText("Hello, world!");
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		mController.resume(this);
	}
	
	@Override
	protected void onPause() {
		mController.pause();
		super.onPause();
	}
}
