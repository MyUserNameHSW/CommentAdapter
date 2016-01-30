package com.example.commentadapter;

import java.util.ArrayList;
import java.util.List;

import com.example.adapter.MyAdapter;
import com.example.bean.PersonBean;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {

	private ListView listView;
	private List<PersonBean> list;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initData();
		initView();
	}

	private void initView() {
		// TODO Auto-generated method stub
		listView = (ListView) findViewById(R.id.listview);
		Log.e("listSize", list.size()+"<--");
		MyAdapter adapter = new MyAdapter(list, MainActivity.this);
		listView.setAdapter(adapter);
	}

	private void initData() {
		// TODO Auto-generated method stub
		PersonBean bean1 = new PersonBean("姓名1", "男");
		PersonBean bean2 = new PersonBean("姓名2", "女");
		PersonBean bean3 = new PersonBean("姓名3", "男");
		PersonBean bean4 = new PersonBean("姓名4", "女");
		PersonBean bean5 = new PersonBean("姓名5", "男");
		list = new ArrayList<PersonBean>();
		list.add(bean1);
		list.add(bean2);
		list.add(bean3);
		list.add(bean4);
		list.add(bean5);
	}
}
