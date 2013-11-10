package com.example.hacku4;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.initial);
	
	Button btn,btn1,btn2,btn3,btn4,btn5;
	
	Intent in=new Intent(this, ManagerService.class);
	in.putExtra("switchon", true);
	
	startService(in);
	
	
	//btn5=(Button)findViewById(R.id.button5);
	
	
	
	btn1=(Button)findViewById(R.id.button1);
	btn2=(Button)findViewById(R.id.button2);
	btn3=(Button)findViewById(R.id.button3);
	//btn4=(Button)findViewById(R.id.button4);
	
	
	
	
	
	
	
	
	
	
	btn3.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		
			
			Intent inm=new Intent(getApplicationContext(), ManagerService.class);
			
			stopService(inm);
			
			inm.putExtra("switchon", true);
			startService(inm);
			
			
		}
	});
	
	
	
	
	
	
	btn1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			Intent in=new Intent(getApplicationContext(), new_ser.class);
			
			startActivity(in);
		}
	});
	
	
	
	btn2.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
		
			Intent in2=new Intent(getApplicationContext(), exit_ser.class);
			startActivity(in2);
			
			
			
		}
	});
	
	
	
	
	
	}
	
	
	
	
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	
	Intent ijk=new Intent(getApplicationContext(), ManagerService.class);
	
	stopService(ijk);
	ijk.putExtra("switchon", true);
	startService(ijk);
	
	
	
	}
	
	

@Override
protected void onDestroy() {
	// TODO Auto-generated method stub
	super.onDestroy();

Intent in=new Intent(getApplicationContext(), ManagerService.class);

stopService(in);



}
	
	
	
	
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
