package com.rtv;


import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AdminLoginPage extends Activity {

	private Button b1,b2;
	private EditText t1,t2;
	SQLiteDatabase sqldb;
	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_admin_login_page);
		getActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#01A9DB")));
		b1 = (Button)findViewById(R.id.button1);
		b2 = (Button)findViewById(R.id.button2);
		
		t1 = (EditText) findViewById(R.id.editText1);
		t2 = (EditText) findViewById(R.id.editText2);
		
		b1.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				
				try
				{
					sqldb=openOrCreateDatabase("VJM1",MODE_PRIVATE,null);

					String createTable="create table IF NOT EXISTS reg2(username char(50),password char(50))";
					sqldb.execSQL(createTable);
					
					sqldb.execSQL("insert into reg2 values('"+"dev"+"','"+"admin"+"')");
					
					Cursor c =sqldb.rawQuery("select * from reg2 where username = '"+t1.getText().toString()+"' and password = '"+t2.getText().toString()+"' ",null);
					
					
				  if (c.getCount() > 0 )
				        {
							c.moveToFirst();
							String s = c.getString(0).toString();
							//Toast.makeText(getApplicationContext(),""+s+c.getString(1).toString(),2000).show();
							 		  
						  Toast.makeText(getApplicationContext(),"Login Successful!!!",2000).show();
						  
						 Intent ob  = new Intent(getApplicationContext(),VotingStatus.class);

						 startActivity(ob);				        
						 }
				        	
					  else{
						  
						  Toast.makeText(getApplicationContext(),"Wrong username or password", 2000).show();
					  }
					  
				}catch(Exception e){
					Toast.makeText(getApplicationContext(),"Voting Process has not been started yet.", 500).show();	
					
				}

				
			}		
		});
		
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent ob = new Intent(getApplicationContext(),AdminForgotPassword.class);
				startActivity(ob);
			}
		});

	}



}
