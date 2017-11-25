package com.example.shivam.maintain_notes;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
public class Notes2 extends AppCompatActivity {

    Button b4;
	TextView t1;
	RatingBar r1;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_notes2);
		t1=(TextView)findViewById(R.id.value);
		r1=(RatingBar)findViewById(R.id.ratingBar);
		r1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
			@Override
			public void onRatingChanged(RatingBar ratingBar, float Rating, boolean b) {
				t1.setText("Value is :"+Rating);
			}
		});
		b4=(Button)findViewById(R.id.button4);
		b4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(getApplicationContext(), Notes1.class);
				startActivity(intent);
			}
		});
	}
}
