package com.cewit.ev;

import com.cewit.ev.R.id;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final ImageButton ibtnStart = (ImageButton)findViewById(id.id_btn_start);
        ibtnStart.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(
						MainActivity.this.getApplication(),
						DrivingActivity.class);
				startActivity(intent);				
			}
		}); 
        
        final ImageButton ibtnSetting = (ImageButton) findViewById(id.id_btn_config);
        ibtnSetting.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(
						MainActivity.this.getApplication(),
						ConfigActivity.class);
				startActivity(intent);	
			}
		});
        
    }
}