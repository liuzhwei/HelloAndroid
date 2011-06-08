package com.buttontointent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class NewActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.comeon);
		
		//布局文件中的按键
		Button button1 = (Button)findViewById(R.id.button1);
		//侦听按键的事件
		button1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//新建一个Intent对象
				Intent goBack = new Intent();
				//指定Intent要启动的类
				goBack.setClass(NewActivity.this, HelloAndroid.class);
				//启动这个新的Activity
				startActivity(goBack);
				//关闭当前的Activity
				NewActivity.this.finish();
				
			}});
		
	}

}
