package com.thefuntasty.taste.res;

import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.annotation.ArrayRes;
import android.support.annotation.ColorRes;
import android.support.annotation.DimenRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.IntegerRes;
import android.support.annotation.PluralsRes;
import android.support.annotation.StringRes;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v4.graphics.drawable.DrawableCompat;

import com.thefuntasty.taste.Taste;


public class TRes {

	public static Resources resources() {
		return Taste.context().getResources();
	}

	public static AssetManager assets() {
		return Taste.context().getAssets();
	}

	public static String string(@StringRes int id) {
		return Taste.context().getString(id);
	}

	public static String string(@StringRes int id, Object... formatArgs) {
		return Taste.context().getString(id, formatArgs);
	}

	public static String[] array(@ArrayRes int id) {
		return resources().getStringArray(id);
	}

	public static float dimen(@DimenRes int id) {
		return resources().getDimension(id);
	}

	public static int color(@ColorRes int id) {
		return ContextCompat.getColor(Taste.context(), id);
	}

	public static int pixel(@DimenRes int id) {
		return resources().getDimensionPixelSize(id);
	}

	public static int integer(@IntegerRes int id) {
		return resources().getInteger(id);
	}

	public static String plurals(@PluralsRes int id, int quantity) {
		return resources().getQuantityString(id, quantity);
	}

	public static String plurals(@PluralsRes int id, int quantity, Object... formatArgs) {
		return resources().getQuantityString(id, quantity, formatArgs);
	}

	public static Drawable drawable(@DrawableRes int id) {
		return ResourcesCompat.getDrawable(resources(), id, null);
	}

	public static Drawable drawable(String name) {
		return drawable(drawableIdentifier(name));
	}

	@DrawableRes
	public static int drawableIdentifier(String name) {
		return resources().getIdentifier(name, "drawable", Taste.context().getPackageName());
	}

	public static Drawable drawableTint(@DrawableRes int id, @ColorRes int color) {
		Drawable drawable = DrawableCompat.wrap(drawable(id));
		DrawableCompat.setTint(drawable, color(color));
		return drawable;
	}

	public static int orientation() {
		return resources().getConfiguration().orientation;
	}
}
