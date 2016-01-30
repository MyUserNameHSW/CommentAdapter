package com.example.adapter;

import java.util.List;

import com.example.bean.PersonBean;
import com.example.commentadapter.R;
import com.example.util.ViewHolder;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
	List<PersonBean> list;
	Context context;
	LayoutInflater mInflater;

	public MyAdapter(List<PersonBean> list, Context context) {
		this.context = context;
		this.list = list;
		mInflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return list.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ViewHolder mHolder = ViewHolder.get(context, convertView, parent,
				R.layout.adapter_item, position);
		TextView nameTextView = mHolder.getView(R.id.name);
		TextView sexTextView = mHolder.getView(R.id.sex);
		nameTextView.setText(list.get(position).getName());
		sexTextView.setText(list.get(position).getSex());
		return mHolder.getConvertView();
	}
}
