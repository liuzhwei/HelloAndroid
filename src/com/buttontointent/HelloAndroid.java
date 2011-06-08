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
        
        //�����ļ���İ���
        Button button = (Button)findViewById(R.id.button1);
        //�����������¼�
        button.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Log.d("button", "has been clicked....");//��ӡ������Ϣ
				//�½�һ��Intent����
				Intent intent = new Intent();
				//ָ��IntentҪ��������
				intent.setClass(HelloAndroid.this, NewActivity.class);
				//����һ���µ�Activity
				startActivity(intent);	
				//�رյ�ǰ��Activity
				HelloAndroid.this.finish();
			}});
    }
}