package com.rtv;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class NewUserRegistration extends Activity implements
        View.OnClickListener {

	
    Button btnDatePicker,b3,b2,b1;
    EditText txtDate,t1,t2,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20;
    private int mYear, mMonth, mDay;
    private Spinner spinner1,spinner2;
    private Context context;
    SQLiteDatabase sqldb;
   
  
    @SuppressLint("NewApi")
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user_registration);
        getActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#01A9DB")));
        
      	addListenerOnButton();
      	addListenerOnSpinnerItemSelection();
      	
        btnDatePicker=(Button)findViewById(R.id.btn_date);
        txtDate=(EditText)findViewById(R.id.editText3);
        b1 = (Button)findViewById(R.id.button1);
        b3 = (Button)findViewById(R.id.button3);
        b2 = (Button)findViewById(R.id.button2);
        
        t1 = (EditText)findViewById(R.id.editText1);
        t2 = (EditText)findViewById(R.id.editText2);
        t4 = (EditText)findViewById(R.id.editText4);
        t5 = (EditText)findViewById(R.id.editText5);
        t6 = (EditText)findViewById(R.id.editText6);
        t7 = (EditText)findViewById(R.id.editText7);
        t8 = (EditText)findViewById(R.id.editText8);
        t9 = (EditText)findViewById(R.id.editText9);
        t10 = (EditText)findViewById(R.id.editText10);
        t11 = (EditText)findViewById(R.id.editText11);
        t12 = (EditText)findViewById(R.id.editText12);
        t13 = (EditText)findViewById(R.id.editText13);
        t14= (EditText)findViewById(R.id.editText14);
        t15= (EditText)findViewById(R.id.editText15);
        t16 = (EditText)findViewById(R.id.editText16);
        t17 = (EditText)findViewById(R.id.editText17);
        t18 = (EditText)findViewById(R.id.editText18);
        t19 = (EditText)findViewById(R.id.editText19);
        t20 = (EditText)findViewById(R.id.editText20);
        
        
        
        b1.setOnClickListener(new OnClickListener() {
    		
    		public void onClick(View arg0) {
    			// TODO Auto-generated method stub
    				
    			try
				{
    				
    				String Name=t1.getText().toString();
					String age=t2.getText().toString();
					String gender = spinner1.getSelectedItem().toString();
					String dob=txtDate.getText().toString();
					String pob=t4.getText().toString();
					String fatherName=t5.getText().toString();
					String motherName=t6.getText().toString();
					String hno=t7.getText().toString();
					String flatno=t8.getText().toString();
					String street=t9.getText().toString();
					String town=t10.getText().toString();
					String tehsil=t11.getText().toString();
					String district=t12.getText().toString();
					String pincode=t13.getText().toString();
					String state=t14.getText().toString();
					String username = t15.getText().toString();
					String email=t16.getText().toString();	
					String mobno=t17.getText().toString();	
					String password=t18.getText().toString();
					String confirmpass=t19.getText().toString();
					String document=t20.getText().toString();
					

					
					sqldb=openOrCreateDatabase("VJM1",MODE_PRIVATE,null);
					
					
					String createTable="create table IF NOT EXISTS reg1(name char(50),age char(3),gender char(20),dob char(50),pob char(50),fatherName char(100),motherName char(100),hno char(50),flatno char(50),street char(100),town char(100),tehsil char(100),district char(100),pincode char(6),state char(50),username char(100),email char(100),mobno char(100),password char(50),confirmpass char(50),document char(100), PRIMARY KEY (username, email,mobno,document))";
					sqldb.execSQL(createTable);
					
					
					Cursor c =sqldb.rawQuery("select * from reg1",null);
					try{
						
				        if(t1.getText().toString().length()<1 || t2.getText().toString().length()<1||t4.getText().toString().length()<1 || t5.getText().toString().length()<1||t6.getText().toString().length()<1 || t7.getText().toString().length()<1||t9.getText().toString().length()<1 || t10.getText().toString().length()<1||t11.getText().toString().length()<1 ||t12.getText().toString().length()<1|| t13.getText().toString().length()<1||t14.getText().toString().length()<1 || t15.getText().toString().length()<1||t16.getText().toString().length()<1 || t17.getText().toString().length()<1||t18.getText().toString().length()<1 || t19.getText().toString().length()<1||t20.getText().toString().length()<1){
				            // Display toast 
				            Toast.makeText(getApplicationContext(), "Enter Complete Details!!",Toast.LENGTH_LONG).show();
				          }
				        else if(Integer.parseInt(t2.getText().toString())<18)
				        {
				        	Toast.makeText(getApplicationContext(), "Sorry.You are not eligible to Vote!!",Toast.LENGTH_LONG).show();
				        	Intent ob = new Intent(getApplicationContext(),MyVoteMyRight.class);
			  	        	startActivity(ob);
				        }
				        else  if(!t18.getText().toString().equals(t19.getText().toString())){
				        	Toast.makeText(getApplicationContext(), "Password and confirm password do not match",Toast.LENGTH_LONG).show(); 	
				        }
				        else  if(!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()){
				        	Toast.makeText(getApplicationContext(), "Invalid E Mail ID Entered",Toast.LENGTH_LONG).show(); 
				        }
				        else if(t17.getText().toString().length()<10){
				        	
				        	Toast.makeText(getApplicationContext(), "Invalid Mobile No. Entered",Toast.LENGTH_LONG).show();
				        }
				        else if(t13.getText().toString().length()<6){
				        	
				        	Toast.makeText(getApplicationContext(), "Invalid Pin Code Entered",Toast.LENGTH_LONG).show();
				        }
				        else if(t15.getText().toString().equals("dev"))
				        {
				        	Toast.makeText(getApplicationContext(), "Username already registered",Toast.LENGTH_LONG).show();
				        }
				        else{
						success();
				       }
					}catch(Exception e) {Toast.makeText(getApplicationContext(),""+e,Toast.LENGTH_SHORT).show();}
		}catch(Exception e){Toast.makeText(getApplicationContext(),""+e,Toast.LENGTH_SHORT).show();}

    }
    	});
        
        
        b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				clean();
			}
		});
        
        
        btnDatePicker.setOnClickListener(this);
        
 b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub

					 exitByBackKey();
    }
 });
        
    }

    @Override
    public void onClick(View v) {

        if (v == btnDatePicker) {

            // Get Current Date
            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);


            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {

                            txtDate.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                        }
                    }, mYear, mMonth, mDay);
            datePickerDialog.show();
        }
      
    }
    public void addListenerOnSpinnerItemSelection() {
  		spinner1 = (Spinner) findViewById(R.id.spinner1);
  		spinner2 = (Spinner) findViewById(R.id.spinner2);
  		
  	  }

  	  // get the selected dropdown list value
  	  public void addListenerOnButton() {

  		spinner1 = (Spinner) findViewById(R.id.spinner1);
  		spinner2 = (Spinner) findViewById(R.id.spinner2);
  		
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
  	    .setMessage("Do you want to leave this page without registering ?")
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
  	
  	protected void success() {
  		
        AlertDialog.Builder builder = new AlertDialog.Builder(this);  
        //Uncomment the below code to Set the message and title from the strings.xml file  
        //builder.setMessage(R.string.dialog_message) .setTitle(R.string.dialog_title);  
        builder.setTitle("Warning !!!");
        //Setting message manually and performing action on button click  
        builder.setMessage("It is recommended to re-check your filled details as you would not be able to change the details thereafter.\n\nPlease login if and only if you want to cast your vote as you will be provided only one chance to vote.\n\nAre you sure you want to continue ?")  
            .setCancelable(false)  
            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {  
                public void onClick(DialogInterface dialog, int id) {  
                	Cursor c =sqldb.rawQuery("select * from reg1",null);
					try{
						
							String Name=t1.getText().toString();
							String age=t2.getText().toString();
							String gender = spinner1.getSelectedItem().toString();
							String dob=txtDate.getText().toString();
							String pob=t4.getText().toString();
							String fatherName=t5.getText().toString();
							String motherName=t6.getText().toString();
							String hno=t7.getText().toString();
							String flatno=t8.getText().toString();
							String street=t9.getText().toString();
							String town=t10.getText().toString();
							String tehsil=t11.getText().toString();
							String district=t12.getText().toString();
							String pincode=t13.getText().toString();
							String state=t14.getText().toString();
							String username = t15.getText().toString();
							String email=t16.getText().toString();	
							String mobno=t17.getText().toString();	
							String password=t18.getText().toString();
							String confirmpass=t19.getText().toString();
							String document=t20.getText().toString();
						
						int count=c.getCount();
						
							sqldb.execSQL("insert into reg1 values('"+Name +"','"+age +"','"+gender +"','"+dob +"','"+pob +"','"+fatherName +"','"+motherName +"','"+hno+"','"+flatno +"','"+street+"','"+town +"','"+tehsil +"','"+district +"','"+pincode +"','"+state+"','"+username+"','"+email+"','"+mobno +"','"+password +"','"+confirmpass +"','"+document +"')");	
	    					Toast.makeText(getApplicationContext(), "Account Created Successfully",Toast.LENGTH_LONG).show();
	    					Intent ob = new Intent(getApplicationContext(),MyVoteMyRight.class);
							startActivity(ob);
									
						
							
					}catch(Exception e) {Toast.makeText(getApplicationContext(),""+e,Toast.LENGTH_SHORT).show();}
                }  
            })  
            .setNegativeButton("No", new DialogInterface.OnClickListener() {  
                public void onClick(DialogInterface dialog, int id) {  
                //  Action for 'NO' Button  
                	dialog.cancel();
                 
             }  
            });  
  
        //Creating dialog box  
        AlertDialog alert = builder.create();  
        //Setting the title manually  
        //alert.setTitle("AlertDialogExample");  
        alert.show(); 
  	}
  	
  	public void clean()
  	{
  		
  		t1.setText("");
      	t2.setText("");
      	txtDate.setText("");
      	t4.setText("");
      	t5.setText("");
      	t6.setText("");
      	t7.setText("");
      	t8.setText("");
      	t9.setText("");
      	t10.setText("");
      	t11.setText("");
      	t12.setText("");
      	t13.setText("");
      	t14.setText("");
      	t15.setText("");
      	t16.setText("");
      	t17.setText("");
      	t18.setText("");
      	t19.setText("");
      	t20.setText("");
  	}
  	
  	/*
  	
  	public void created() {
  		
  		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
				context);

			// set title
			alertDialogBuilder.setTitle("Account Created Successfully!!");

			// set dialog message
			alertDialogBuilder
				.setMessage("Please login if and only if you want to cast your vote as you would be provided only one chance to vote and once you entered the voting page(comes immidiately after loging in),you will not be able to logout or bo back.")
				.setCancelable(false)
					.setNegativeButton("OK",new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,int id) {
						Intent ob = new Intent(getApplicationContext(),MyVoteMyRight.class);
						startActivity(ob);
					}
       });

				// create alert dialog
				AlertDialog alertDialog = alertDialogBuilder.create();

				// show it
				alertDialog.show();
  	}
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	protected void complete()  {
  		AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
				context);

			// set title
			

			// set dialog message
			alertDialogBuilder
				.setMessage("Please enter complete details and then press /'Create Account'/ Button")
				.setCancelable(false)
					.setNegativeButton("OK",new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,int id) {
						dialog.cancel();
					}
       });

				// create alert dialog
				AlertDialog alertDialog = alertDialogBuilder.create();

				// show it
				alertDialog.show();
  		
  	}
  	
  	*/
}
