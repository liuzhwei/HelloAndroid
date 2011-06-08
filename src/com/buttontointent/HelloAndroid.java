package com.buttontointent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class HelloAndroid extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        //布局文件里的按键
        Button button = (Button)findViewById(R.id.button1);
        //侦听按键的事件
        button.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Log.d("button", "has been clicked....");//打印调试信息
				//新建一个Intent对象
				Intent intent = new Intent();
				//指定Intent要启动的类
				intent.setClass(HelloAndroid.this, NewActivity.class);
				//启动一个新的Activity
				startActivity(intent);	
				//关闭当前的Activity
				HelloAndroid.this.finish();
			}});
    }
}