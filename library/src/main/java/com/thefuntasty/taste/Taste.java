package com.thefuntasty.taste;

import android.content.Context;

public class Taste {

	private static Context context;

	public static void init(Context c) {
		context = c;
	}

	private Taste() {
	}

	public static Context context() {
		if (context == null) {
			throw new IllegalStateException("Taste is not initialized. Call Taste.init(Context) in your App class.");
		}
		return context;
	}
}