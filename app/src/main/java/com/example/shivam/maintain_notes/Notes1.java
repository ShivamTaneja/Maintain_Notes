package com.example.shivam.maintain_notes;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import static android.R.attr.data;

public class Notes1 extends AppCompatActivity  {

	Button b6,b61,b62,b63,b64,b65,b66,b67,b68,b69;
	@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_notes1);



		b6=(Button)findViewById(R.id.button6);

		try {
			FileInputStream fis=(FileInputStream)openFileInput("data");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader bufferedReader = new BufferedReader(isr);
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				b6.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		b6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent=new Intent(getApplicationContext(),Notes4.class);
				startActivity(intent);
			}
		});

		b61=(Button)findViewById(R.id.button61);

		try {
			FileInputStream fis=(FileInputStream)openFileInput("3data");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader bufferedReader = new BufferedReader(isr);
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				b61.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		b61.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent=new Intent(getApplicationContext(),Notes3.class);
				startActivity(intent);

			}
		});




		b62=(Button)findViewById(R.id.button62);

		try {
			FileInputStream fis=(FileInputStream)openFileInput("5data");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader bufferedReader = new BufferedReader(isr);
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				b62.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		b62.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent=new Intent(getApplicationContext(),Notes5.class);
				startActivity(intent);

			}
		});

		b63=(Button)findViewById(R.id.button63);

		try {
			FileInputStream fis=(FileInputStream)openFileInput("6data");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader bufferedReader = new BufferedReader(isr);
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				b63.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		b63.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent=new Intent(getApplicationContext(),Notes6.class);
				startActivity(intent);

			}
		});



		b64=(Button)findViewById(R.id.button64);
		try {
			FileInputStream fis=(FileInputStream)openFileInput("7data");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader bufferedReader = new BufferedReader(isr);
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				b64.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		b64.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent=new Intent(getApplicationContext(),Notes7.class);
				startActivity(intent);

			}
		});

		b65=(Button)findViewById(R.id.button65);
		try {
			FileInputStream fis=(FileInputStream)openFileInput("8data");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader bufferedReader = new BufferedReader(isr);
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				b65.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		b65.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent=new Intent(getApplicationContext(),Notes8.class);
				startActivity(intent);

			}
		});



		b66=(Button)findViewById(R.id.button66);

		try {
			FileInputStream fis=(FileInputStream)openFileInput("9data");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader bufferedReader = new BufferedReader(isr);
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				b66.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		b66.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent=new Intent(getApplicationContext(),Notes9.class);
				startActivity(intent);

			}
		});

		b67=(Button)findViewById(R.id.button67);

		try {
			FileInputStream fis=(FileInputStream)openFileInput("10data");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader bufferedReader = new BufferedReader(isr);
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				b67.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		b67.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent=new Intent(getApplicationContext(),Notes10.class);
				startActivity(intent);

			}
		});


		b68=(Button)findViewById(R.id.button68);

		try {
			FileInputStream fis=(FileInputStream)openFileInput("11data");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader bufferedReader = new BufferedReader(isr);
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				b68.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		b68.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent=new Intent(getApplicationContext(),Notes11.class);
				startActivity(intent);

			}
		});

		b69=(Button)findViewById(R.id.button69);

		try {
			FileInputStream fis=(FileInputStream)openFileInput("12data");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader bufferedReader = new BufferedReader(isr);
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				b69.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		b69.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent=new Intent(getApplicationContext(),Notes12.class);
				startActivity(intent);

			}
		});
			}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.my_options_menu, menu);
		return true;
	}  // menu option


	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId())
		{

			case R.id.Aboutme:
			{
				Toast.makeText(this, "My name is Shivam Taneja , Pursuing BE in IT from UIET(PU),Chandigarh", Toast.LENGTH_LONG).show();
				return true;
			}
			case R.id.Contactme:
			{
				Toast.makeText(this, "E-mail me :shivamtaneja1990@gmail.com", Toast.LENGTH_LONG).show();
				return true;
			}
			case R.id.rate_me:
			{
				Intent intent = new Intent(this, Notes2.class);
				startActivity(intent);
				Toast.makeText(this, "Please give me stars", Toast.LENGTH_SHORT).show();
				return true;
			}

			default:
				Toast.makeText(this, "Choose correct options", Toast.LENGTH_SHORT).show();
				return true;
		}


}

	/**
	 * Back button listener.
	 * Will close the application if the back button pressed twice.
	 */

	@Override
	public void onBackPressed()
	{


			Intent intent = new Intent(Intent.ACTION_MAIN);
			intent.addCategory(Intent.CATEGORY_HOME);
			intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
			startActivity(intent);
			finish();


	}
}









