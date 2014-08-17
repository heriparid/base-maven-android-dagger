package com.heriparid.android.baseapp.modules;

import com.heriparid.android.baseapp.ui.HomeActivity;

import dagger.Module;

@Module(
	injects = {
		HomeActivity.class
	},
	library = true
)
public class AndroidModule {

}
