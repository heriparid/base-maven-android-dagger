package com.heriparid.android.baseapp;

import com.heriparid.android.baseapp.modules.AndroidModule;

import dagger.ObjectGraph;
import android.app.Application;

public class BaseApp extends Application {

	public static BaseApp INSTANCE;
	
	private ObjectGraph graph;
	
	@Override
	public void onCreate() {
		super.onCreate();
		INSTANCE = this;
		
		graph = ObjectGraph.create(new AndroidModule());
	}
	
	public ObjectGraph getObjectGraph(){
		return graph;
	}
	
	
}
