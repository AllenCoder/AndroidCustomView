package com.allen.comparsechart.util;

import android.content.Context;

public class DisplayUtils {
	private DisplayUtils() {
	}

	/**
	 * dip 在不同分辨率的px值
	 * @param context
	 * @param dpValue
	 * @return
	 */
	public static int dip2px(Context context, float dpValue) {
		final float scale = context.getResources().getDisplayMetrics().density;
		return (int) (dpValue * scale + 0.5f);
	}

	public static float dp2px(Context context, float dpValue) {
		final float scale = context.getResources().getDisplayMetrics().density;
		return  (dpValue * scale + 0.5f);
	}
	/**
	 * px在不同分辨率的dip值
	 * @param context
	 * @param pxValue
	 * @return
	 */
	public static int px2dip(Context context, float pxValue) {
		final float scale = context.getResources().getDisplayMetrics().density;
		return (int) (pxValue / scale + 0.5f);
	}

	public static int getScreenWidth(Context context) {
		return context.getResources().getDisplayMetrics().widthPixels;
	}


	public static int getScreenHeight(Context context) {
		return context.getResources().getDisplayMetrics().heightPixels;
	}
}
