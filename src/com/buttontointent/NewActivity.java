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
		
		//�����ļ��еİ���
		Button button1 = (Button)findViewById(R.id.button1);
		//�����������¼�
		button1.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//�½�һ��Intent����
				Intent goBack = new Intent();
				//ָ��IntentҪ��������
				goBack.setClass(NewActivity.this, HelloAndroid.class);
				//��������µ�Activity
				startActivity(goBack);
				//�رյ�ǰ��Activity
				NewActivity.this.finish();
				
			}});
		
	}

}
