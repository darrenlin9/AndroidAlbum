package com.dlin2.photoalbum;

import android.os.Bundle;
import android.os.SystemClock;
import android.app.Activity;
import android.graphics.BitmapFactory;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.view.Window;
import android.widget.ImageButton;
public class Photo extends Activity {
	Button btn1, btn2;
	ImageButton ib;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		ib = (ImageButton)findViewById(R.id.img1);
		btn1 = (Button) findViewById(R.id.b1);
		btn2 = (Button) findViewById(R.id.b2);
		btn1.setOnClickListener(onClickListener);
        btn2.setOnClickListener(onClickListener);
	}
	public OnClickListener onClickListener = new OnClickListener() 
	{
		 int counter = 0;
		 // The images are located in res/drawable-xxhdpi
		 final Integer pics[] = 
			{
			R.drawable.alhambra, 
			R.drawable.colossus,
			R.drawable.great_wall,
			R.drawable.louvre,
			R.drawable.oracle,
			R.drawable.petra,
			R.drawable.pyramids
			}; 
		 
	     @Override
	     public void onClick(final View v)
	     {
	         switch(v.getId())
	         {
	             case R.id.b1:
	            	 if(counter < 6)
						{
							counter++;
							ib.setImageResource(pics[counter]);
						}
	             break;
	             case R.id.b2:
	            	 if(counter > 0)
	            	 {
	            		 counter--;
	            		 ib.setImageResource(pics[counter]);
	            	 }
	             break;
	         }
	   }
	};
	@Override
	public boolean onCreateOptionsMenu(Menu menu) 
	{
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.photo, menu);
		return true;
	}
}
