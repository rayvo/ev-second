package com.cewit.ev;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import com.cewit.ev.R.id;

public class DrivingActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.driving);    
        
        final ImageButton ibtnStart = (ImageButton)findViewById(id.id_btn_stop);
        ibtnStart.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(
						DrivingActivity.this.getApplication(),
						ResultActivity.class);
				startActivity(intent);				
			}
		}); 
    }
}