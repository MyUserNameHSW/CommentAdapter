package com.example.util;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author HSW
 *
 */
public class ViewHolder {
	private SparseArray<View> mViews;
	private int mPosition;
	private View convertView;

	public ViewHolder(Context context, ViewGroup parent, int layoutId,
			int position) {
		// TODO Auto-generated constructor stub
		this.mPosition = position;
		this.mViews = new SparseArray<View>();
		convertView = LayoutInflater.from(context).inflate(layoutId, parent,
				false);
		convertView.setTag(this);
	}

	/**
	 * 判断convertView是否为空
	 * @param context
	 * @param convertView
	 * @param parent
	 * @param layoutId
	 * @param position
	 * @return
	 */
	public static ViewHolder get(Context context, View convertView,
			ViewGroup parent, int layoutId, int position) {
		if (convertView == null) {
			return new ViewHolder(context, parent, layoutId, position);
		} else {
			ViewHolder holder = (ViewHolder) convertView.getTag();
			holder.mPosition = position;
			return holder;
		}
	}

	/**
	 * 初始化item里面的layout
	 * @param viewId
	 * @return
	 */
	public <T extends View> T getView(int viewId) {
		View view = mViews.get(viewId);
		if (view == null) {
			view = convertView.findViewById(viewId);
			mViews.put(viewId, view);
		}
		return (T) view;
	}

	public View getConvertView() {
		return convertView;
	}
}
