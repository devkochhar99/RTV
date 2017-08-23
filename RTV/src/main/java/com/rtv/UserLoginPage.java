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

public class UserLoginPage extends Activity {

	private Button b1,b2;
	SQLiteDatabase sqldb;
	EditText t1,t2;
	
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user_login_page);
		
		getActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#01A9DB")));
		
		b1 = (Button)findViewById(R.id.button1);
		b2 = (Button)findViewById(R.id.button2);
		t1 = (EditText) findViewById(R.id.editText1);
		t2 = (EditText) findViewById(R.id.editText2);
		
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent ob = new Intent(getApplicationContext(),UserForgotPassword.class);
				startActivity(ob);
			}
		});
b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0){
					
				try
				{
					sqldb=openOrCreateDatabase("VJM1",MODE_PRIVATE,null);
					String createTable="create table IF NOT EXISTS party1(username char(50),partyName char(50),DateTime char(50))";
					sqldb.execSQL(createTable);
					
					Cursor c =sqldb.rawQuery("select * from reg1 where username = '"+t1.getText().toString()+"' and password = '"+t2.getText().toString()+"' ",null);
					Cursor c1 =sqldb.rawQuery("select * from party1 where username ='"+t1.getText().toString()+"' ",null);
					
					  if (c.getCount() > 0 )
				        {
							c.moveToFirst();
							String s = c.getString(15).toString();
							// Toast.makeText(getApplicationContext(),""+s+c.getString(18).toString(),2000).show();
							 		  
						  Toast.makeText(getApplicationContext(),"Login Successful!!!",2000).show();
						  
						 if(c1.getCount() > 0){
						  Intent ob = new Intent(getApplicationContext(),VotedSuccessfully.class);
						  ob.putExtra("name1", s);
							startActivity(ob);
						  }
						  else
						  {
							  Intent ob = new Intent(getApplicationContext(),VoteForABetterIndia.class);
							   ob.putExtra("name", s);
								startActivity(ob);  
						 }
				        }
				        	
					  else{
						  
						  Toast.makeText(getApplicationContext(),"Wrong username or password", 2000).show();
					  }
					  
				}catch(Exception e){Toast.makeText(getApplicationContext(),"Wrong Username or password", Toast.LENGTH_LONG).show();	}

			}
		});

b2.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent ob = new Intent(getApplicationContext(),UserForgotPassword.class);
		startActivity(ob);
	}
});
		
	}



}
