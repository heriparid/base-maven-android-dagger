package com.heriparid.android.baseapp.controllers;

import android.app.Activity;

public abstract class BaseController<T extends Activity> {

	private T mActivity;
	private final Object lock = new Object();
	
	protected T getActivity(){
		synchronized (lock) {
			return mActivity;
		}
	}
	
	public void resume(T activity){
		synchronized (lock) {
			mActivity = activity;
		}
	}
	
	public void pause(){
		synchronized (lock) {
			mActivity = null;
		}
	}
}
