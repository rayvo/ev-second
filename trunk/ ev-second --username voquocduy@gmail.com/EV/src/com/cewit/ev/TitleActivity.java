package com.cewit.ev;

import com.cewit.ev.R.id;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class TitleActivity extends Activity {
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.title);
        final ImageButton ibtnSNS = (ImageButton)findViewById(id.id_btn_sns_login);
        ibtnSNS.setOnClickListener(new OnClickListener() {			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(
						TitleActivity.this.getApplication(),
						LoginOneActivity.class);
				startActivity(intent);				
			}
		}); 
        final ImageButton ibtnGuest = (ImageButton)findViewById(id.id_btn_guest_login);
        ibtnGuest.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(
						TitleActivity.this.getApplication(),
						MainActivity.class);
				startActivity(intent);							
			}
		}); 
        
    }
}
