package com.thefuntasty.taste.keyboard;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class TKeyboard {

	private TKeyboard() {
	}

	/**
	 * Hides the soft keyboard
	 */
	public static void hide(Activity activity) {
		View focusedView = activity.getCurrentFocus();
		if (focusedView != null) {
			InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
			inputMethodManager.hideSoftInputFromWindow(focusedView.getWindowToken(), 0);
		}
	}

	/**
	 * Hides the soft keyboard
	 */
	public static void hide(View focusedView) {
		if (focusedView != null) {
			InputMethodManager inputMethodManager = (InputMethodManager) focusedView.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
			inputMethodManager.hideSoftInputFromWindow(focusedView.getWindowToken(), 0);
		}
	}

	/**
	 * Shows the soft keyboard
	 */
	public static void show(View view) {
		InputMethodManager inputMethodManager = (InputMethodManager) view.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
		view.requestFocus();
		inputMethodManager.showSoftInput(view, 0);
	}
}
