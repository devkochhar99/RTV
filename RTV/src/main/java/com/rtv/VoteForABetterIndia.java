package com.rtv;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.GregorianCalendar;;

public class VoteForABetterIndia extends Activity {
	private RadioButton r1,r2,r3,r4,r5,r6,r7;
	SQLiteDatabase sqldb;
	String as;
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_vote_for_abetter_india);
		getActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#01A9DB")));
		
		r1 = (RadioButton)findViewById(R.id.radioButton1);
		r2 = (RadioButton)findViewById(R.id.radioButton2);
		
		r3 = (RadioButton)findViewById(R.id.radioButton3);
		r4 = (RadioButton)findViewById(R.id.radioButton4);
		
		r5 = (RadioButton)findViewById(R.id.radioButton5);
		r6 = (RadioButton)findViewById(R.id.radioButton6);
		
		r7 = (RadioButton)findViewById(R.id.radioButton7);
		
	}
	 
	public void sel(View v)  {
	    	boolean check = ((RadioButton)v).isChecked();
	    	
	    	switch(v.getId())  {
	    	case R.id.radioButton1:
	    		if(check)  {
	    			
	    			MediaPlayer song = MediaPlayer.create(getApplicationContext(), R.raw.beep);
	    			song.start();
	    			
	    			AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
	    			alertDialog.setCancelable(false);
	    			LinearLayout diagLayout = new LinearLayout(this);
	    			diagLayout.setOrientation(LinearLayout.VERTICAL);
	    			
	    			TextView text = new TextView(this); text.setText("Voted Successfully!!");
	    			TextView t2 = new TextView(this); t2.setText("Voted To : ");
	    			TextView t3 = new TextView(this); t3.setText("Bharatiya Janata Party");
	    			t3.setPadding(200, 0, 0, 0);
	    			
	    			t2.setPadding(15, 15, 0, 0);
	    			text.setPadding(10, 10, 10, 10);
	    			text.setGravity(Gravity.CENTER);
	    			t2.setGravity(Gravity.LEFT);
	    			text.setTextColor(Color.parseColor("#0AC92B"));
	    			text.setTextSize(20);
	    			t2.setTextSize(15);
	    			t3.setTextSize(15);
	    			
	    			diagLayout.addView(text);
	    			alertDialog.setView(diagLayout);
	    			
	    			diagLayout.addView(t2);
	    			alertDialog.setView(diagLayout);

	    			diagLayout.addView(t3);
	    			alertDialog.setView(diagLayout);
	    			
	    			TextView t4 = new TextView(this); t4.setText("Date and Time : ");
	    			TextView t5 = new TextView(this); t5.setText(Calendar.getInstance().getTime().toString());
	    			t5.setPadding(200, 0, 0, 0);
	    		
	    			t4.setPadding(15, 15, 0, 0);
	    			
	    			t4.setGravity(Gravity.LEFT);
	    			t4.setTextSize(15);
	    			
	    			
	    			diagLayout.addView(t4);
	    			alertDialog.setView(diagLayout);
	    			
	    			diagLayout.addView(t5);
	    			alertDialog.setView(diagLayout);
	    			
	    			try
					{
						sqldb=openOrCreateDatabase("VJM1",MODE_PRIVATE,null);
						//Toast.makeText(getApplicationContext(), "Database Created",Toast.LENGTH_SHORT).show();
						//String deleteTable="drop table aman1DB";
						//sqldb.execSQL(deleteTable);
						
						String createTable="create table IF NOT EXISTS party1(username char(50),partyName char(50),DateTime char(50))";
						sqldb.execSQL(createTable);
						//Toast.makeText(getApplicationContext(),"Table created 1",Toast.LENGTH_LONG).show();

						
						 Intent iin= getIntent();
					        Bundle b = iin.getExtras();

					        if(b!=null)
					        {
					            String j =(String) b.get("name");
					            as= j;
					        }
						
						Cursor c =sqldb.rawQuery("select * from party1",null);
						try{
							
							int count=c.getCount();
							
						//Toast.makeText(getApplicationContext(),"no entry",Toast.LENGTH_LONG).show();
								sqldb.execSQL("insert into party1 values('"+as+"','"+t3.getText().toString()+"','"+t5.getText().toString()+"')");
								//Toast.makeText(getApplicationContext(),"Stored"+as,Toast.LENGTH_LONG).show();

							}
						catch(Exception e) {Toast.makeText(getApplicationContext(), "ex"+e,Toast.LENGTH_SHORT).show();}
			}catch(Exception e){}
	    			
	    			alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
	    				public void onClick(DialogInterface dialog, int id) {
	    			
	    					Intent ob = new Intent(getApplicationContext(),VotedSuccessfully.class);
							  ob.putExtra("name1", as);
	    					startActivity(ob);
	    				  Toast.makeText(getApplicationContext(), "Thanks for using Our App.\nResult will be out Soon.",
	    				  Toast.LENGTH_LONG).show();
	    				  dialog.dismiss();
	    				  
	    				  
	    				  
	    				}
	    				});

	    				
	    				alertDialog.show();
	    				
	    			
	    		}
	    		break;
	    	case R.id.radioButton2:
	    		if(check) {
	    			
	    			MediaPlayer song = MediaPlayer.create(getApplicationContext(), R.raw.beep);
	    			song.start();
		AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
		alertDialog.setCancelable(false);			
		
	    			LinearLayout diagLayout = new LinearLayout(this);
	    			diagLayout.setOrientation(LinearLayout.VERTICAL);
	    			
	    			TextView text = new TextView(this); text.setText("Voted Successfully!!");
	    			TextView t2 = new TextView(this); t2.setText("Voted To : ");
	    			TextView t3 = new TextView(this); t3.setText("Indian National Congress");
	    			t3.setPadding(200, 0, 0, 0);
	    			
	    			t2.setPadding(15, 15, 0, 0);
	    			text.setPadding(10, 10, 10, 10);
	    			text.setGravity(Gravity.CENTER);
	    			t2.setGravity(Gravity.LEFT);
	    			text.setTextColor(Color.parseColor("#0AC92B"));
	    			text.setTextSize(20);
	    			t2.setTextSize(15);
	    			t3.setTextSize(15);
	    			
	    			diagLayout.addView(text);
	    			alertDialog.setView(diagLayout);
	    			
	    			diagLayout.addView(t2);
	    			alertDialog.setView(diagLayout);

	    			diagLayout.addView(t3);
	    			alertDialog.setView(diagLayout);
	    			
	    			TextView t4 = new TextView(this); t4.setText("Date and Time : ");
	    			TextView t5 = new TextView(this); t5.setText(Calendar.getInstance().getTime().toString());
	    			t5.setPadding(200, 0, 0, 0);
	    		
	    			t4.setPadding(15, 15, 0, 0);
	    			
	    			t4.setGravity(Gravity.LEFT);
	    			t4.setTextSize(15);
	    			
	    			
	    			diagLayout.addView(t4);
	    			alertDialog.setView(diagLayout);
	    			
	    			diagLayout.addView(t5);
	    			alertDialog.setView(diagLayout);
	    			
	    			try
					{
						sqldb=openOrCreateDatabase("VJM1",MODE_PRIVATE,null);
						//Toast.makeText(getApplicationContext(), "Database Created",Toast.LENGTH_SHORT).show();
						//String deleteTable="drop table aman1DB";
						//sqldb.execSQL(deleteTable);
						String createTable="create table IF NOT EXISTS party1(username char(50),partyName char(50),DateTime char(50))";
						sqldb.execSQL(createTable);
						 Intent iin= getIntent();
					        Bundle b = iin.getExtras();

					        if(b!=null)
					        {
					            String j =(String) b.get("name");
					            as= j;
					        }
						
						Cursor c =sqldb.rawQuery("select * from party1",null);
						try{
							
							int count=c.getCount();
							
						//Toast.makeText(getApplicationContext(),"no entry",Toast.LENGTH_LONG).show();
								sqldb.execSQL("insert into party1 values('"+as+"','"+t3.getText().toString()+"','"+t5.getText().toString()+"')");
								//Toast.makeText(getApplicationContext(),"Stored"+as,Toast.LENGTH_LONG).show();

							}
						catch(Exception e) {Toast.makeText(getApplicationContext(), "ex"+e,Toast.LENGTH_SHORT).show();}
			}catch(Exception e){}
	    			
	    			alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
	    				public void onClick(DialogInterface dialog, int id) {
	    					Intent ob = new Intent(getApplicationContext(),VotedSuccessfully.class);
							  ob.putExtra("name1", as);
	    					startActivity(ob);
	    				  Toast.makeText(getApplicationContext(), "Thanks for using Our App.\nResult will be out Soon.",
	    				  Toast.LENGTH_LONG).show();
	    				  dialog.dismiss();
	    				}
	    				});

	    				
	    				alertDialog.show();
	    				
	    		}
	    		break;
	    	case R.id.radioButton3:
	    		if(check) {
	    			
	    			MediaPlayer song = MediaPlayer.create(getApplicationContext(), R.raw.beep);
	    			song.start();
		AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
		alertDialog.setCancelable(false);
		
	    			LinearLayout diagLayout = new LinearLayout(this);
	    			diagLayout.setOrientation(LinearLayout.VERTICAL);
	    			
	    			TextView text = new TextView(this); text.setText("Voted Successfully!!");
	    			TextView t2 = new TextView(this); t2.setText("Voted To : ");
	    			TextView t3 = new TextView(this); t3.setText("Aam Aadmi Party");
	    			t3.setPadding(200, 0, 0, 0);
	    			
	    			t2.setPadding(15, 15, 0, 0);
	    			text.setPadding(10, 10, 10, 10);
	    			text.setGravity(Gravity.CENTER);
	    			t2.setGravity(Gravity.LEFT);
	    			text.setTextColor(Color.parseColor("#0AC92B"));
	    			text.setTextSize(20);
	    			t2.setTextSize(15);
	    			t3.setTextSize(15);
	    			
	    			diagLayout.addView(text);
	    			alertDialog.setView(diagLayout);
	    			
	    			diagLayout.addView(t2);
	    			alertDialog.setView(diagLayout);

	    			diagLayout.addView(t3);
	    			alertDialog.setView(diagLayout);
	    			
	    			TextView t4 = new TextView(this); t4.setText("Date and Time : ");
	    			TextView t5 = new TextView(this); t5.setText(Calendar.getInstance().getTime().toString());
	    			t5.setPadding(200, 0, 0, 0);
	    		
	    			t4.setPadding(15, 15, 0, 0);
	    			
	    			t4.setGravity(Gravity.LEFT);
	    			t4.setTextSize(15);
	    			
	    			
	    			diagLayout.addView(t4);
	    			alertDialog.setView(diagLayout);
	    			
	    			diagLayout.addView(t5);
	    			alertDialog.setView(diagLayout);
	    			
	    			try
					{
						sqldb=openOrCreateDatabase("VJM1",MODE_PRIVATE,null);
						//Toast.makeText(getApplicationContext(), "Database Created",Toast.LENGTH_SHORT).show();
						//String deleteTable="drop table aman1DB";
						//sqldb.execSQL(deleteTable);
						
						String createTable="create table IF NOT EXISTS party1(username char(50),partyName char(50),DateTime char(50))";
						sqldb.execSQL(createTable);
						 Intent iin= getIntent();
					        Bundle b = iin.getExtras();

					        if(b!=null)
					        {
					            String j =(String) b.get("name");
					            as= j;
					        }
						
						Cursor c =sqldb.rawQuery("select * from party1",null);
						try{
							
							int count=c.getCount();
							
						//Toast.makeText(getApplicationContext(),"no entry",Toast.LENGTH_LONG).show();
								sqldb.execSQL("insert into party1 values('"+as+"','"+t3.getText().toString()+"','"+t5.getText().toString()+"')");
								//Toast.makeText(getApplicationContext(),"Stored"+as,Toast.LENGTH_LONG).show();

							}
						catch(Exception e) {Toast.makeText(getApplicationContext(), "ex"+e,Toast.LENGTH_SHORT).show();}
			}catch(Exception e){}
	    			
	    			alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
	    				public void onClick(DialogInterface dialog, int id) {
	    					Intent ob = new Intent(getApplicationContext(),VotedSuccessfully.class);
							  ob.putExtra("name1", as);
	    					startActivity(ob);
	    				  Toast.makeText(getApplicationContext(), "Thanks for using Our App.\nResult will be out Soon.",
	    				  Toast.LENGTH_LONG).show();
	    				  dialog.dismiss();
	    				}
	    				});

	    				
	    				alertDialog.show();
	    				
	    			
	    		}
	    		break;
	    	case R.id.radioButton4:
	    		if(check) {
	    			
	    			MediaPlayer song = MediaPlayer.create(getApplicationContext(), R.raw.beep);
	    			song.start();
		AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
		alertDialog.setCancelable(false);
		
	    			LinearLayout diagLayout = new LinearLayout(this);
	    			diagLayout.setOrientation(LinearLayout.VERTICAL);
	    			
	    			TextView text = new TextView(this); text.setText("Voted Successfully!!");
	    			TextView t2 = new TextView(this); t2.setText("Voted To : ");
	    			TextView t3 = new TextView(this); t3.setText("Bahujan Samaj Party");
	    			t3.setPadding(200, 0, 0, 0);
	    			
	    			t2.setPadding(15, 15, 0, 0);
	    			text.setPadding(10, 10, 10, 10);
	    			text.setGravity(Gravity.CENTER);
	    			t2.setGravity(Gravity.LEFT);
	    			text.setTextColor(Color.parseColor("#0AC92B"));
	    			text.setTextSize(20);
	    			t2.setTextSize(15);
	    			t3.setTextSize(15);
	    			
	    			diagLayout.addView(text);
	    			alertDialog.setView(diagLayout);
	    			
	    			diagLayout.addView(t2);
	    			alertDialog.setView(diagLayout);

	    			diagLayout.addView(t3);
	    			alertDialog.setView(diagLayout);
	    			
	    			TextView t4 = new TextView(this); t4.setText("Date and Time : ");
	    			TextView t5 = new TextView(this); t5.setText(Calendar.getInstance().getTime().toString());
	    			t5.setPadding(200, 0, 0, 0);
	    		
	    			t4.setPadding(15, 15, 0, 0);
	    			
	    			t4.setGravity(Gravity.LEFT);
	    			t4.setTextSize(15);
	    			
	    			
	    			diagLayout.addView(t4);
	    			alertDialog.setView(diagLayout);
	    			
	    			diagLayout.addView(t5);
	    			alertDialog.setView(diagLayout);
	    			
	    			try
					{
						sqldb=openOrCreateDatabase("VJM1",MODE_PRIVATE,null);
						//Toast.makeText(getApplicationContext(), "Database Created",Toast.LENGTH_SHORT).show();
						//String deleteTable="drop table aman1DB";
						//sqldb.execSQL(deleteTable);
						
						String createTable="create table IF NOT EXISTS party1(username char(50),partyName char(50),DateTime char(50))";
						sqldb.execSQL(createTable);
						 Intent iin= getIntent();
					        Bundle b = iin.getExtras();

					        if(b!=null)
					        {
					            String j =(String) b.get("name");
					            as= j;
					        }
						
						Cursor c =sqldb.rawQuery("select * from party1",null);
						try{
							
							int count=c.getCount();
							
						//Toast.makeText(getApplicationContext(),"no entry",Toast.LENGTH_LONG).show();
								sqldb.execSQL("insert into party1 values('"+as+"','"+t3.getText().toString()+"','"+t5.getText().toString()+"')");
								//Toast.makeText(getApplicationContext(),"Stored"+as,Toast.LENGTH_LONG).show();

							}
						catch(Exception e) {Toast.makeText(getApplicationContext(), "ex"+e,Toast.LENGTH_SHORT).show();}
			}catch(Exception e){}
	    			
	    			alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
	    				public void onClick(DialogInterface dialog, int id) {
	    					Intent ob = new Intent(getApplicationContext(),VotedSuccessfully.class);
							  ob.putExtra("name1", as);
	    					startActivity(ob);
	    				  Toast.makeText(getApplicationContext(), "Thanks for using Our App.\nResult will be out Soon.",
	    				  Toast.LENGTH_LONG).show();
	    				  dialog.dismiss();
	    				}
	    				});

	    				
	    				alertDialog.show();
	    				
	    			
	    		}
	    		break;
	    
	    	case R.id.radioButton5:
	    		if(check) {
	    			
	    			MediaPlayer song = MediaPlayer.create(getApplicationContext(), R.raw.beep);
	    			song.start();
		AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
		alertDialog.setCancelable(false);
		
	    			LinearLayout diagLayout = new LinearLayout(this);
	    			diagLayout.setOrientation(LinearLayout.VERTICAL);
	    			
	    			TextView text = new TextView(this); text.setText("Voted Successfully!!");
	    			TextView t2 = new TextView(this); t2.setText("Voted To : ");
	    			TextView t3 = new TextView(this); t3.setText("Communist Party Of India(Marxist)");
	    			t3.setPadding(200, 0, 0, 0);
	    			
	    			t2.setPadding(15, 15, 0, 0);
	    			text.setPadding(10, 10, 10, 10);
	    			text.setGravity(Gravity.CENTER);
	    			t2.setGravity(Gravity.LEFT);
	    			text.setTextColor(Color.parseColor("#0AC92B"));
	    			text.setTextSize(20);
	    			t2.setTextSize(15);
	    			t3.setTextSize(15);
	    			
	    			diagLayout.addView(text);
	    			alertDialog.setView(diagLayout);
	    			
	    			diagLayout.addView(t2);
	    			alertDialog.setView(diagLayout);

	    			diagLayout.addView(t3);
	    			alertDialog.setView(diagLayout);
	    			
	    			TextView t4 = new TextView(this); t4.setText("Date and Time : ");
	    			TextView t5 = new TextView(this); t5.setText(Calendar.getInstance().getTime().toString());
	    			t5.setPadding(200, 0, 0, 0);
	    		
	    			t4.setPadding(15, 15, 0, 0);
	    			
	    			t4.setGravity(Gravity.LEFT);
	    			t4.setTextSize(15);
	    			
	    			
	    			diagLayout.addView(t4);
	    			alertDialog.setView(diagLayout);
	    			
	    			diagLayout.addView(t5);
	    			alertDialog.setView(diagLayout);
	    			
	    			try
					{
						sqldb=openOrCreateDatabase("VJM1",MODE_PRIVATE,null);
						//Toast.makeText(getApplicationContext(), "Database Created",Toast.LENGTH_SHORT).show();
						//String deleteTable="drop table aman1DB";
						//sqldb.execSQL(deleteTable);
						
						String createTable="create table IF NOT EXISTS party1(username char(50),partyName char(50),DateTime char(50))";
						sqldb.execSQL(createTable);
						 Intent iin= getIntent();
					        Bundle b = iin.getExtras();

					        if(b!=null)
					        {
					            String j =(String) b.get("name");
					            as= j;
					        }
						
						Cursor c =sqldb.rawQuery("select * from party1",null);
						try{
							
							int count=c.getCount();
							
						//Toast.makeText(getApplicationContext(),"no entry",Toast.LENGTH_LONG).show();
								sqldb.execSQL("insert into party1 values('"+as+"','"+t3.getText().toString()+"','"+t5.getText().toString()+"')");
								//Toast.makeText(getApplicationContext(),"Stored"+as,Toast.LENGTH_LONG).show();

							}
						catch(Exception e) {Toast.makeText(getApplicationContext(), "ex"+e,Toast.LENGTH_SHORT).show();}
			}catch(Exception e){}
	    			
	    			alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
	    				public void onClick(DialogInterface dialog, int id) {
	    					Intent ob = new Intent(getApplicationContext(),VotedSuccessfully.class);
							  ob.putExtra("name1", as);
	    					startActivity(ob);
	    				  Toast.makeText(getApplicationContext(), "Thanks for using Our App.\nResult will be out Soon.",
	    				  Toast.LENGTH_LONG).show();
	    				  dialog.dismiss();
	    				}
	    				});

	    				
	    				alertDialog.show();
	    				
	    			
	    			
	    		}
	    		break;
	    	case R.id.radioButton6:
	    		if(check) {
	    			
	    			MediaPlayer song = MediaPlayer.create(getApplicationContext(), R.raw.beep);
	    			song.start();
		AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
		alertDialog.setCancelable(false);
		
	    			LinearLayout diagLayout = new LinearLayout(this);
	    			diagLayout.setOrientation(LinearLayout.VERTICAL);
	    			
	    			TextView text = new TextView(this); text.setText("Voted Successfully!!");
	    			TextView t2 = new TextView(this); t2.setText("Voted To : ");
	    			TextView t3 = new TextView(this); t3.setText("National Congress Party");
	    			t3.setPadding(200, 0, 0, 0);
	    			
	    			t2.setPadding(15, 15, 0, 0);
	    			text.setPadding(10, 10, 10, 10);
	    			text.setGravity(Gravity.CENTER);
	    			t2.setGravity(Gravity.LEFT);
	    			text.setTextColor(Color.parseColor("#0AC92B"));
	    			text.setTextSize(20);
	    			t2.setTextSize(15);
	    			t3.setTextSize(15);
	    			
	    			diagLayout.addView(text);
	    			alertDialog.setView(diagLayout);
	    			
	    			diagLayout.addView(t2);
	    			alertDialog.setView(diagLayout);

	    			diagLayout.addView(t3);
	    			alertDialog.setView(diagLayout);
	    			
	    			TextView t4 = new TextView(this); t4.setText("Date and Time : ");
	    			TextView t5 = new TextView(this); t5.setText(Calendar.getInstance().getTime().toString());
	    			t5.setPadding(200, 0, 0, 0);
	    		
	    			t4.setPadding(15, 15, 0, 0);
	    			
	    			t4.setGravity(Gravity.LEFT);
	    			t4.setTextSize(15);
	    			
	    			
	    			diagLayout.addView(t4);
	    			alertDialog.setView(diagLayout);
	    			
	    			diagLayout.addView(t5);
	    			alertDialog.setView(diagLayout);
	    			
	    			try
					{
						sqldb=openOrCreateDatabase("VJM1",MODE_PRIVATE,null);
						//Toast.makeText(getApplicationContext(), "Database Created",Toast.LENGTH_SHORT).show();
						//String deleteTable="drop table aman1DB";
						//sqldb.execSQL(deleteTable);
						String createTable="create table IF NOT EXISTS party1(username char(50),partyName char(50),DateTime char(50))";
						sqldb.execSQL(createTable);
						 Intent iin= getIntent();
					        Bundle b = iin.getExtras();

					        if(b!=null)
					        {
					            String j =(String) b.get("name");
					            as= j;
					        }
						
						Cursor c =sqldb.rawQuery("select * from party1",null);
						try{
							
							int count=c.getCount();
							
						//Toast.makeText(getApplicationContext(),"no entry",Toast.LENGTH_LONG).show();
								sqldb.execSQL("insert into party1 values('"+as+"','"+t3.getText().toString()+"','"+t5.getText().toString()+"')");
							//	Toast.makeText(getApplicationContext(),"Stored"+as,Toast.LENGTH_LONG).show();

							}
						catch(Exception e) {Toast.makeText(getApplicationContext(), "ex"+e,Toast.LENGTH_SHORT).show();}
			}catch(Exception e){}
	    			
	    			alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
	    				public void onClick(DialogInterface dialog, int id) {
	    					Intent ob = new Intent(getApplicationContext(),VotedSuccessfully.class);
							  ob.putExtra("name1", as);
	    					startActivity(ob);
	    				  Toast.makeText(getApplicationContext(), "Thanks for using Our App.\nResult will be out Soon.",
	    				  Toast.LENGTH_LONG).show();
	    				  dialog.dismiss();
	    				}
	    				});

	    				
	    				alertDialog.show();
	    				
	    			
	    			
	    		}
	    		break;
	    	case R.id.radioButton7:
	    		if(check) {
	    			
	    			MediaPlayer song = MediaPlayer.create(getApplicationContext(), R.raw.beep);
	    			song.start();
		AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
		alertDialog.setCancelable(false);
		
	    			LinearLayout diagLayout = new LinearLayout(this);
	    			diagLayout.setOrientation(LinearLayout.VERTICAL);
	    			
	    			TextView text = new TextView(this); text.setText("Voted Successfully!!");
	    			TextView t2 = new TextView(this); t2.setText("Voted To : ");
	    			TextView t3 = new TextView(this); t3.setText("None Of The Above");
	    			t3.setPadding(200, 0, 0, 0);
	    			
	    			t2.setPadding(15, 15, 0, 0);
	    			text.setPadding(10, 10, 10, 10);
	    			text.setGravity(Gravity.CENTER);
	    			t2.setGravity(Gravity.LEFT);
	    			text.setTextColor(Color.parseColor("#0AC92B"));
	    			text.setTextSize(20);
	    			t2.setTextSize(15);
	    			t3.setTextSize(15);
	    			
	    			diagLayout.addView(text);
	    			alertDialog.setView(diagLayout);
	    			
	    			diagLayout.addView(t2);
	    			alertDialog.setView(diagLayout);

	    			diagLayout.addView(t3);
	    			alertDialog.setView(diagLayout);
	    			
	    			TextView t4 = new TextView(this); t4.setText("Date and Time : ");
	    			TextView t5 = new TextView(this); t5.setText(Calendar.getInstance().getTime().toString());
	    			t5.setPadding(200, 0, 0, 0);
	    		
	    			t4.setPadding(15, 15, 0, 0);
	    			
	    			t4.setGravity(Gravity.LEFT);
	    			t4.setTextSize(15);
	    			
	    			
	    			diagLayout.addView(t4);
	    			alertDialog.setView(diagLayout);
	    			
	    			diagLayout.addView(t5);
	    			alertDialog.setView(diagLayout);
	    			
	    			try
					{
						sqldb=openOrCreateDatabase("VJM1",MODE_PRIVATE,null);
						//Toast.makeText(getApplicationContext(), "Database Created",Toast.LENGTH_SHORT).show();
						//String deleteTable="drop table aman1DB";
						//sqldb.execSQL(deleteTable);
						
						String createTable="create table IF NOT EXISTS party1(username char(50),partyName char(50),DateTime char(50))";
						sqldb.execSQL(createTable);
						 Intent iin= getIntent();
					        Bundle b = iin.getExtras();

					        if(b!=null)
					        {
					            String j =(String) b.get("name");
					            as= j;
					        }
						
						Cursor c =sqldb.rawQuery("select * from party1",null);
						try{
							
							int count=c.getCount();
							
						//Toast.makeText(getApplicationContext(),"no entry",Toast.LENGTH_LONG).show();
								sqldb.execSQL("insert into party1 values('"+as+"','"+t3.getText().toString()+"','"+t5.getText().toString()+"')");
								//Toast.makeText(getApplicationContext(),"Stored"+as,Toast.LENGTH_LONG).show();

							}
						catch(Exception e) {Toast.makeText(getApplicationContext(), "ex"+e,Toast.LENGTH_SHORT).show();}
			}catch(Exception e){}
	    			
	    			alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
	    				public void onClick(DialogInterface dialog, int id) {
	    					Intent ob = new Intent(getApplicationContext(),VotedSuccessfully.class);
							  ob.putExtra("name1", as);
	    					startActivity(ob);
	    				  Toast.makeText(getApplicationContext(), "Thanks for using Our App.\nResult will be out Soon.",
	    				  Toast.LENGTH_LONG).show();
	    				  dialog.dismiss();
	    				}
	    				});

	    				
	    				alertDialog.show();
	    				
	    			
	    		}
	    		break;
	    default:
	    	break;
	    	
	    	}   
	    	
	}
	
	 public boolean onKeyDown(int keyCode, KeyEvent event) {
		    if (keyCode == KeyEvent.KEYCODE_BACK) {
		        exitByBackKey();

		        //moveTaskToBack(false);

		        return true;
		    }
		    return super.onKeyDown(keyCode, event);
		}

		protected void exitByBackKey() {

		    AlertDialog alertbox = new AlertDialog.Builder(this)
		    .setMessage("Are You sure you want to Logout?")
		    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {

		        // do something when the button is clicked
		        public void onClick(DialogInterface arg0, int arg1) {
		        	Intent ob = new Intent(getApplicationContext(),MyVoteMyRight.class);
		        	startActivity(ob);
		            finish();
		            //close();


		        }
		    })
		    .setNegativeButton("No", new DialogInterface.OnClickListener() {

		        // do something when the button is clicked
		        public void onClick(DialogInterface arg0, int arg1) {
		                       }
		    })
		      .show();

		}

		

}
