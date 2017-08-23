package com.rtv;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class VotingStatus extends Activity {

private Button b1,b2;
final Context context = this;
SQLiteDatabase sqldb;
private TextView t3,t5,t7,t9,t11,t13;
int a= 0;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_voting_status);
		getActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#01A9DB")));
		b1 = (Button)findViewById(R.id.button1);
		b2 = (Button)findViewById(R.id.button2);
		
		t3 = (TextView)findViewById(R.id.text3);
		t5 = (TextView)findViewById(R.id.textView5);
		t7 = (TextView)findViewById(R.id.textView7);
		t9 = (TextView)findViewById(R.id.textView9);
		t11 = (TextView)findViewById(R.id.textView11);
		t13 = (TextView)findViewById(R.id.text13);
		
		sqldb=openOrCreateDatabase("VJM1",MODE_PRIVATE,null);
		try{
			
			String createTable="create table IF NOT EXISTS party1(username char(50),partyName char(50),DateTime char(50))";
			sqldb.execSQL(createTable);
			//Toast.makeText(getApplicationContext(),"Table created 2",Toast.LENGTH_LONG).show();

			
		Cursor z1 = sqldb.rawQuery("SELECT * FROM party1 where partyName = '"+"Bharatiya Janata Party"+"' ",null);
		z1.moveToNext();
	    t3.setText(""+z1.getCount());
		z1.close();
		
		Cursor z2 = sqldb.rawQuery("select * from party1 where partyName = '"+"Indian National Congress"+"' ",null);
		z2.moveToNext();
		t5.setText(""+z2.getCount());
		z2.close();
		
		Cursor z3 = sqldb.rawQuery("select * from party1 where partyName = '"+"Aam Aadmi Party"+"' ",null);
		z3.moveToNext();
		t7.setText(""+z3.getCount());
		z3.close();
		
		Cursor z4 = sqldb.rawQuery("select * from party1 where partyName = '"+"Bahujan Samaj Party"+"' ",null);
		z4.moveToNext();
		t9.setText(""+z4.getCount());
		z4.close();
		
		Cursor z5 = sqldb.rawQuery("select * from party1 where partyName = '"+"Communist Party Of India(Marxist)"+"' ",null);
		z5.moveToNext();
		t11.setText(""+z5.getCount());
		z5.close();
		
		Cursor z6 = sqldb.rawQuery("select * from party1 where partyName = '"+"National Congress Party"+"' ",null);
		z6.moveToNext();
		t13.setText(""+z6.getCount());
		z6.close();
		
		
		}catch(Exception e){Toast.makeText(getApplicationContext(), ""+e,Toast.LENGTH_LONG).show();}

		
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				sqldb=openOrCreateDatabase("VJM1",MODE_PRIVATE,null);
				
				Cursor c = sqldb.rawQuery("select * from reg2",null);
				Cursor c1 =sqldb.rawQuery("select * from party1 where username = '"+"dev"+"' ",null);
				
			 if(c1.getCount() > 0 )
				 	{
					  Intent ob = new Intent(getApplicationContext(),VotedSuccessfully.class);
					  ob.putExtra("name1","dev");
						startActivity(ob);
					  }
					  else
					  {
						  Intent ob = new Intent(getApplicationContext(),VoteForABetterIndia.class);
						  ob.putExtra("name","dev");
							startActivity(ob);  
					  }
			}
		});
		
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
						context);

					

					// set dialog message
					alertDialogBuilder
						.setMessage("Are you sure you want to Logout ?")
						.setCancelable(false)
						.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,int id) {
								Intent ob = new Intent(getApplicationContext(),MyVoteMyRight.class);
								startActivity(ob);
							}
						  })
						.setNegativeButton("No",new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,int id) {
								// if this button is clicked, just close
								// the dialog box and do nothing
								dialog.cancel();
							}
						});

						// create alert dialog
						AlertDialog alertDialog = alertDialogBuilder.create();

						// show it
						alertDialog.show();
					}
				});
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
		    .setMessage("Do you want to Logout ?")
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
