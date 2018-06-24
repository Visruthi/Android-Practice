package com.example.practice;

import android.os.Bundle;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.telephony.gsm.SmsManager;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class One extends Activity {
Button b;
EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        b=(Button)findViewById(R.id.button1);
        e1=(EditText)findViewById(R.id.editView1);
        e2=(EditText)findViewById(R.id.editView2);
        
        
        
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String es1=e1.getText().toString();
				String es2=e2.getText().toString();
				Intent i=new Intent(getApplicationContext(),One.class);
				PendingIntent p=PendingIntent.getActivity(getApplicationContext(), 0, i, 0);
				SmsManager sms =SmsManager.getDefault();
				sms.sendTextMessage(es1, null, es2, p, null);
				Toast.makeText(getApplicationContext(), "MESSAGE SENT", Toast.LENGTH_LONG).show();
			}
		});
    }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.one, menu);
        return true;
    }
    
}
