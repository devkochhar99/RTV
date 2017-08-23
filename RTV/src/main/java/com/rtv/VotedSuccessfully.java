package com.rtv;



import android.net.Uri;
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
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RatingBar.OnRatingBarChangeListener;

public class VotedSuccessfully extends Activity implements OnRatingBarChangeListener {
	private Button b1;
	private RatingBar r1;
	final Context context = this;
	SQLiteDatabase sqldb;
	String as1;
	
	TextView t4,t5;
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_voted_successfully);
		
		getActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#01A9DB")));
		
		b1 = (Button)findViewById(R.id.button1);
		
		t4 = (TextView) findViewById(R.id.textView4);
		t5 = (TextView) findViewById(R.id.textView5);
		
		
		r1 = (RatingBar)findViewById(R.id.ratingBar1);
		
		 r1.setOnRatingBarChangeListener(this);
		 
			try
			{
				 Intent iin1= getIntent();
			        Bundle b1 = iin1.getExtras();

			        if(b1!=null)
			        {
			            String j =(String) b1.get("name1");
			            as1= j;
			        }
				
				sqldb=openOrCreateDatabase("VJM1",MODE_PRIVATE,null);
				//Toast.makeText(getApplicationContext(), "Database Created",Toast.LENGTH_SHORT).show();
				//String deleteTable="drop table aman1DB";
				//sqldb.execSQL(deleteTable);
				
				Cursor c =sqldb.rawQuery("select * from party1 where username = '"+as1+"' ",null);
			
				//Toast.makeText(getApplicationContext(),count,Toast.LENGTH_LONG).show();
				  if (c.getCount() > 0 )
			        {
					  c.moveToFirst();
	
						String s = c.getString(0).toString();
						// Toast.makeText(getApplicationContext(),""+s+c.getString(1).toString()+c.getString(2).toString(),Toast.LENGTH_LONG).show();
					t4.setText(c.getString(1));
					t5.setText(c.getString(2));
					 
			        }
				  c.close();
			}catch(Exception e){Toast.makeText(getApplicationContext(),""+e, Toast.LENGTH_LONG).show();	}
		
		b1.setOnClickListener(new OnClickListener() {
			
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

		@Override
		public void onRatingChanged(RatingBar arg0, float arg1, boolean arg2) {
			// TODO Auto-generated method stub
			float rating=r1.getRating(); 
			Toast.makeText(getApplicationContext(),String.valueOf(rating),Toast.LENGTH_LONG).show();
			

			Intent intent = new Intent(Intent.ACTION_SENDTO); // it's not ACTION_SEND
			intent.setType("text/plain");
			intent.putExtra(Intent.EXTRA_SUBJECT, "Rating Your App");
			intent.putExtra(Intent.EXTRA_TEXT, "Rating - "+rating+"\nSend By RTV");
			intent.setData(Uri.parse("mailto:devkochhar99@gmail.com")); // or just "mailto:" for blank
			intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // this will make such that when user returns to your app, your app is displayed, instead of the email app.
			startActivity(intent);
		}

}
