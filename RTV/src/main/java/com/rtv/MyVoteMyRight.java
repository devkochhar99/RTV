package com.rtv;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;

public class MyVoteMyRight extends Activity {
	private RadioButton r1,r2;
	private Button b1;
	private TextView t3;
	final Context context = this;

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_vote_my_right);
		
		getActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#01A9DB")));
		
	r1 = (RadioButton)findViewById(R.id.radioButton1);
	r2 = (RadioButton)findViewById(R.id.radioButton2);
	
	b1 = (Button)findViewById(R.id.button1);
	

	
	b1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
		Intent ob = new Intent(getApplicationContext(),AboutUs.class);
		startActivity(ob);
		}
	});
	}
	
	public void intro(View v)  {
		//TextView t1 = (TextView)findViewById(R.id.textView2);
		
		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
				context);

			// set title
			alertDialogBuilder.setTitle("Developed By:");

			// set dialog message
			alertDialogBuilder
				.setMessage("Dev Kochhar\nRoll No.-11401091\nClass-B.Tech(CE-3)")
				.setCancelable(false)
					.setNegativeButton("OK",new DialogInterface.OnClickListener() {
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
		
	public void perform_action(View v)
    {
		//t3 = (TextView)findViewById(R.id.textView1);
		Intent ob = new Intent(getApplicationContext(),NewUserRegistration.class);
		startActivity(ob);
       
    }
	  public void select(View v)  {
	    	boolean check = ((RadioButton)v).isChecked();
	    	
	    	switch(v.getId())  {
	    	case R.id.radioButton1:
	    		if(check)  {
	    			Intent ob = new Intent(getApplicationContext(),AdminLoginPage.class);
	    			startActivity(ob);
	    		}
	    		break;
	    	case R.id.radioButton2:
	    		if(check) {
	    			Intent ob = new Intent(getApplicationContext(),UserLoginPage.class);
	    			startActivity(ob);
	    			
	    			
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
		    .setMessage("Do you want to exit application?")
		    .setPositiveButton("Yes", new DialogInterface.OnClickListener() {

		        // do something when the button is clicked
		        public void onClick(DialogInterface arg0, int arg1) {
		        	Intent intent = new Intent(Intent.ACTION_MAIN);
		            intent.addCategory(Intent.CATEGORY_HOME);
		            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);//***Change Here***
		            startActivity(intent);
		            finish();
		            System.exit(0);

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

