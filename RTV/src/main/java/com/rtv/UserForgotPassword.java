package com.rtv;

import java.util.Random;

import com.rtv.AdminForgotPassword.MyAsyncClass;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.v4.app.NotificationCompat;
import android.telephony.SmsManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.Toast;
import android.widget.TabHost.TabSpec;


public class UserForgotPassword extends Activity 
{
	private TabHost myTabHost; 
	private Button b1,b2,b3,b4;
	EditText t1,t2,t3,t4;
	SQLiteDatabase sqldb;
	String uniquecode;
	GMailSender sender;
	NotificationManager mNotificationManager;
	NotificationCompat.Builder mBuilder;
	Context context;
	
	@SuppressLint("NewApi")
	@Override 
	protected void onCreate(Bundle savedInstanceState) 
	{
		
		super.onCreate(savedInstanceState); 
		setContentView(R.layout.activity_user_forgot_password);
		getActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#01A9DB")));
		
		b1= (Button)findViewById(R.id.button_creat);
		b2= (Button)findViewById(R.id.proceed);
		b3= (Button)findViewById(R.id.proceed1);
		b4= (Button)findViewById(R.id.button_creat1);
		
		t1 = (EditText) findViewById(R.id.creat_lat);
		t2 = (EditText) findViewById(R.id.editText1);
		t3 = (EditText) findViewById(R.id.creat_lat1);
		t4 = (EditText) findViewById(R.id.editText2);
		
		// Add your mail Id and Password
        sender = new GMailSender("devkochhar99@gmail.com", "rjaDr@9253134933");

   StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.
           Builder().permitAll().build();

        StrictMode.setThreadPolicy(policy);
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				try {
                    new MyAsyncClass().execute();

              } catch (Exception ex) {
Toast.makeText(getApplicationContext(), ex.toString(), 100).show();
              }
	
		String email=t1.getText().toString();
	
			Random rNo = new Random();
			 final int code = rNo.nextInt((99999 - 10000) + 1) + 10000;
			 uniquecode = String.valueOf(code);
			//uniquecode=String.valueOf(1);
			t1.setEnabled(false);
			b1.setEnabled(false);
			t2.setVisibility(0);
			b2.setVisibility(0);
			}
		});
		
	b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				try
				{
					String uniquecode1=t2.getText().toString();
					if(uniquecode1.equals(""))
					{
						Toast.makeText(getApplicationContext(),"Enter Unique Code",Toast.LENGTH_LONG).show();
					}
					else
					{
						if(uniquecode1.equals(uniquecode))
						{

							String password="";
							sqldb=openOrCreateDatabase("VJM1",MODE_PRIVATE,null);
							String createTable="create table IF NOT EXISTS reg1(name char(50),age char(3),gender char(20),dob char(50),pob char(50),fatherName char(100),motherName char(100),hno char(50),flatno char(50),street char(100),town char(100),tehsil char(100),district char(100),pincode char(6),state char(50),username char(100),email char(100),mobno char(100),password char(50),confirmpass char(50),document char(100))";
							sqldb.execSQL(createTable);
							Cursor c =sqldb.rawQuery("select * from reg1 where email = '"+t1.getText().toString()+"' ",null);
							int count=c.getCount();
							if (c.getCount() > 0) 
					        {
							    c.moveToFirst();
							    password=c.getString(18);
							    Toast.makeText(getApplicationContext(),"Code Matched.\nYour Password is - ",Toast.LENGTH_LONG).show();
							    
							    Toast.makeText(getApplicationContext()," \""+password+"\"", Toast.LENGTH_LONG).show();
							    Intent i=new Intent(getApplicationContext(),MyVoteMyRight.class);
								startActivity(i);
							} 
					        else 
					        {
								Toast.makeText(getApplicationContext(),"Sorry ! Your E- Mail ID is not registered with us.",Toast.LENGTH_LONG).show();
					        }
						}
						else
						{
							Toast.makeText(getApplicationContext(),"Wrong Code",Toast.LENGTH_LONG).show();
							t2.setText("");
						}
						
					}
			}
				catch(Exception ex)
				{
					Toast.makeText(getApplicationContext(),ex.toString(),Toast.LENGTH_LONG).show();
				}
			}
		});
		
	b3.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			try
			{
				String uniquecode1=t4.getText().toString();
				if(uniquecode1.equals(""))
				{
					Toast.makeText(getApplicationContext(),"Enter Unique Code",Toast.LENGTH_LONG).show();
				}
				else
				{
					if(uniquecode1.equals(uniquecode))
					{

						String password="";
						sqldb=openOrCreateDatabase("VJM1",MODE_PRIVATE,null);
						String createTable="create table IF NOT EXISTS reg1(name char(50),age char(3),gender char(20),dob char(50),pob char(50),fatherName char(100),motherName char(100),hno char(50),flatno char(50),street char(100),town char(100),tehsil char(100),district char(100),pincode char(6),state char(50),username char(100),email char(100),mobno char(100),password char(50),confirmpass char(50),document char(100))";
						sqldb.execSQL(createTable);
						
						Cursor c =sqldb.rawQuery("select * from reg1 where mobno = '"+t3.getText().toString()+"' ",null);
						int count=c.getCount();
						if (c.getCount() > 0) 
				        {
						    c.moveToFirst();
						    password=c.getString(18);
						    Toast.makeText(getApplicationContext(),"Code Matched.\nYour Password is - ",Toast.LENGTH_LONG).show();
							   
						    Toast.makeText(getApplicationContext(), "\""+password+"\"", Toast.LENGTH_LONG).show();
						    Intent i=new Intent(getApplicationContext(),MyVoteMyRight.class);
							startActivity(i);
						} 
				        else 
				        {
							Toast.makeText(getApplicationContext(),"Sorry ! Your Mobile No. is not registered with us.",Toast.LENGTH_LONG).show();
				        }
					   
					}
					else
					{
						Toast.makeText(getApplicationContext(),"Wrong Code",Toast.LENGTH_LONG).show();
						t4.setText("");
					}
					
				}
		}
			catch(Exception ex)
			{
				Toast.makeText(getApplicationContext(),ex.toString(),Toast.LENGTH_LONG).show();
			}
		}
	});
	
	b4.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			try
			{
				
				sqldb=openOrCreateDatabase("VJM1",MODE_PRIVATE,null);
				String createTable="create table IF NOT EXISTS reg1(name char(50),age char(3),gender char(20),dob char(50),pob char(50),fatherName char(100),motherName char(100),hno char(50),flatno char(50),street char(100),town char(100),tehsil char(100),district char(100),pincode char(6),state char(50),username char(100),email char(100),mobno char(100),password char(50),confirmpass char(50),document char(100))";
				sqldb.execSQL(createTable);
				
				Cursor c =sqldb.rawQuery("select * from reg1 where mobno = '"+t3.getText().toString()+"' ",null);
				if (c.getCount() > 0) 
		        {
					String phoneno=t3.getText().toString();
					if(phoneno.equals(""))
					{
						Toast.makeText(getApplicationContext(),"Enter Phone No.",Toast.LENGTH_LONG).show();
					}
					else if(phoneno.length()!=10)
					{
						Toast.makeText(getApplicationContext(),"Wrong Phone No. Entered",Toast.LENGTH_LONG).show();
					}
					else
					{
						 Random rNo = new Random();
						 final int code = rNo.nextInt((99999 - 10000) + 1) + 10000;
						 uniquecode = String.valueOf(code);
						 SmsManager smsManager = SmsManager.getDefault();
						 smsManager.sendTextMessage(phoneno, null,"Verification Code is- "+uniquecode+"\nSend By RTV", null, null);
						 Toast.makeText(getApplicationContext(),"Msg Sent",Toast.LENGTH_LONG).show();
						 
						
						//uniquecode=String.valueOf(1);
						t3.setEnabled(false);
						b4.setEnabled(false);
						t4.setVisibility(0);
						b3.setVisibility(0);
						
					}
				} 
		        else 
		        {
					Toast.makeText(getApplicationContext(),"Sorry ! Your Mobile No. is not registered with us.Please Register First.",Toast.LENGTH_LONG).show();
					Intent ob = new Intent(getApplicationContext(),MyVoteMyRight.class);
					startActivity(ob);
		        }
				
			}
			catch(Exception ex)
			{
				Toast.makeText(getApplicationContext(),ex.toString(),Toast.LENGTH_LONG).show();
				Toast.makeText(getApplicationContext(),"Msg not Sent",Toast.LENGTH_LONG).show();
			}			
		}
	});
	
		
		
		myTabHost =(TabHost) findViewById(R.id.TabHost01); 
		// Before adding tabs, it is imperative to call the method setup()
		myTabHost.setup(); 
		// Adding tabs 
		// tab1 settings 
		TabSpec spec = myTabHost.newTabSpec("tab_creation"); 
		// text and image of tab 
		spec.setIndicator("E-Mail",getResources().getDrawable(android.R.drawable.ic_menu_add)); 
		// specify layout of tab 
		spec.setContent(R.id.onglet1);
		// adding tab in TabHost 
		myTabHost.addTab(spec);
		// otherwise : 
		myTabHost.addTab(myTabHost.newTabSpec("tab_inser").setIndicator("Mobile No.",getResources().getDrawable(android.R.drawable.ic_menu_edit)).setContent(R.id.Onglet2));
	
		}
	
	class MyAsyncClass extends AsyncTask<Void, Void, Void> {
		 
        ProgressDialog pDialog;

        @Override
        protected void onPreExecute() {
             super.onPreExecute();

             pDialog = new ProgressDialog(UserForgotPassword.this);
             pDialog.setMessage("Please wait...");
             pDialog.show();

        }

        @Override
        protected Void doInBackground(Void... mApi) {
             try {
    // Add subject, Body, your mail Id, and receiver mail Id.
    sender.sendMail("Verification Code", "Verification Code is - "+uniquecode+"\nSend By RTV", "devkochhar99@gmail.com",t1.getText().toString());

             }

             catch (Exception ex) {

             }
             return null;
        }

        @Override
        protected void onPostExecute(Void result) {
             super.onPostExecute(result);
             pDialog.cancel();
Toast.makeText(getApplicationContext(), "Email send", 100).show();
        }
  }
}


