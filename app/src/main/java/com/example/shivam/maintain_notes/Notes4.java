package com.example.shivam.maintain_notes;
import android.app.ActionBar;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Notes4 extends AppCompatActivity {

	EditText e2,e21,e22,e23,e24,e25,e26,e27,e28,e29,e30,e31,e32,e33,e34,e35,e36,e37,e38,e39;
	EditText e40,e41,e42,e43,e44,e45,e46,e47,e48,e49,e50,e51,e52,e53,e54,e55,e56,e57,e58,e59;

	Button bdelete;
	String string="null";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_notes4);


		getSupportActionBar().setDisplayHomeAsUpEnabled(true);

		Button bsave=(Button)findViewById(R.id.button2);//Save button
		bsave.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {


			//	1- 10
				try {
					FileOutputStream fos = openFileOutput("data",Context.MODE_PRIVATE);
					e2=(EditText)findViewById(R.id.editText2);
					string=e2.getText().toString();
					fos.write(string.getBytes());
					fos.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}


				try {
					FileOutputStream fos1 = openFileOutput("data1",Context.MODE_PRIVATE);
					e21=(EditText)findViewById(R.id.editText21);
					string=e21.getText().toString();
					fos1.write(string.getBytes());
					fos1.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}


				try {
					FileOutputStream fos2 = openFileOutput("data2",Context.MODE_PRIVATE);
					e22=(EditText)findViewById(R.id.editText22);
					string=e22.getText().toString();
					fos2.write(string.getBytes());
					fos2.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}

				try {
					FileOutputStream fos3 = openFileOutput("data3",Context.MODE_PRIVATE);
					e23=(EditText)findViewById(R.id.editText23);
					string=e23.getText().toString();
					fos3.write(string.getBytes());
					fos3.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}

				try {
					FileOutputStream fos4 = openFileOutput("data4",Context.MODE_PRIVATE);
					e24=(EditText)findViewById(R.id.editText24);
					string=e24.getText().toString();
					fos4.write(string.getBytes());
					fos4.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					FileOutputStream fos5 = openFileOutput("data5",Context.MODE_PRIVATE);
					e25=(EditText)findViewById(R.id.editText25);
					string=e25.getText().toString();
					fos5.write(string.getBytes());
					fos5.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					FileOutputStream fos6 = openFileOutput("data6",Context.MODE_PRIVATE);
					e26=(EditText)findViewById(R.id.editText26);
					string=e26.getText().toString();
					fos6.write(string.getBytes());
					fos6.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					FileOutputStream fos7 = openFileOutput("data7",Context.MODE_PRIVATE);
					e27=(EditText)findViewById(R.id.editText27);
					string=e27.getText().toString();
					fos7.write(string.getBytes());
					fos7.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					FileOutputStream fos8= openFileOutput("data8",Context.MODE_PRIVATE);
					e28=(EditText)findViewById(R.id.editText28);
					string=e28.getText().toString();
					fos8.write(string.getBytes());
					fos8.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					FileOutputStream fos9 = openFileOutput("data9",Context.MODE_PRIVATE);
					e29=(EditText)findViewById(R.id.editText29);
					string=e29.getText().toString();
					fos9.write(string.getBytes());
					fos9.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
 // 11 - 20
				try {
					FileOutputStream fos = openFileOutput("data10",Context.MODE_PRIVATE);
					e30=(EditText)findViewById(R.id.editText30);
					string=e30.getText().toString();
					fos.write(string.getBytes());
					fos.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}


				try {
					FileOutputStream fos1 = openFileOutput("data11",Context.MODE_PRIVATE);
					e31=(EditText)findViewById(R.id.editText31);
					string=e31.getText().toString();
					fos1.write(string.getBytes());
					fos1.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}


				try {
					FileOutputStream fos2 = openFileOutput("data12",Context.MODE_PRIVATE);
					e32=(EditText)findViewById(R.id.editText32);
					string=e32.getText().toString();
					fos2.write(string.getBytes());
					fos2.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}

				try {
					FileOutputStream fos3 = openFileOutput("data13",Context.MODE_PRIVATE);
					e33=(EditText)findViewById(R.id.editText33);
					string=e33.getText().toString();
					fos3.write(string.getBytes());
					fos3.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}

				try {
					FileOutputStream fos4 = openFileOutput("data14",Context.MODE_PRIVATE);
					e34=(EditText)findViewById(R.id.editText34);
					string=e34.getText().toString();
					fos4.write(string.getBytes());
					fos4.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					FileOutputStream fos5 = openFileOutput("data15",Context.MODE_PRIVATE);
					e35=(EditText)findViewById(R.id.editText35);
					string=e35.getText().toString();
					fos5.write(string.getBytes());
					fos5.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					FileOutputStream fos6 = openFileOutput("data16",Context.MODE_PRIVATE);
					e36=(EditText)findViewById(R.id.editText36);
					string=e36.getText().toString();
					fos6.write(string.getBytes());
					fos6.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					FileOutputStream fos7 = openFileOutput("data17",Context.MODE_PRIVATE);
					e37=(EditText)findViewById(R.id.editText37);
					string=e37.getText().toString();
					fos7.write(string.getBytes());
					fos7.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					FileOutputStream fos8= openFileOutput("data18",Context.MODE_PRIVATE);
					e38=(EditText)findViewById(R.id.editText38);
					string=e38.getText().toString();
					fos8.write(string.getBytes());
					fos8.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					FileOutputStream fos9 = openFileOutput("data19",Context.MODE_PRIVATE);
					e39=(EditText)findViewById(R.id.editText39);
					string=e39.getText().toString();
					fos9.write(string.getBytes());
					fos9.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
//21-40
				try {
					FileOutputStream fos = openFileOutput("data20",Context.MODE_PRIVATE);
					e40=(EditText)findViewById(R.id.editText40);
					string=e40.getText().toString();
					fos.write(string.getBytes());
					fos.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}


				try {
					FileOutputStream fos1 = openFileOutput("data21",Context.MODE_PRIVATE);
					e41=(EditText)findViewById(R.id.editText41);
					string=e41.getText().toString();
					fos1.write(string.getBytes());
					fos1.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}


				try {
					FileOutputStream fos2 = openFileOutput("data22",Context.MODE_PRIVATE);
					e42=(EditText)findViewById(R.id.editText42);
					string=e42.getText().toString();
					fos2.write(string.getBytes());
					fos2.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}

				try {
					FileOutputStream fos3 = openFileOutput("data23",Context.MODE_PRIVATE);
					e43=(EditText)findViewById(R.id.editText43);
					string=e43.getText().toString();
					fos3.write(string.getBytes());
					fos3.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}

				try {
					FileOutputStream fos4 = openFileOutput("data24",Context.MODE_PRIVATE);
					e44=(EditText)findViewById(R.id.editText44);
					string=e44.getText().toString();
					fos4.write(string.getBytes());
					fos4.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					FileOutputStream fos5 = openFileOutput("data25",Context.MODE_PRIVATE);
					e45=(EditText)findViewById(R.id.editText45);
					string=e45.getText().toString();
					fos5.write(string.getBytes());
					fos5.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					FileOutputStream fos6 = openFileOutput("data26",Context.MODE_PRIVATE);
					e46=(EditText)findViewById(R.id.editText46);
					string=e46.getText().toString();
					fos6.write(string.getBytes());
					fos6.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					FileOutputStream fos7 = openFileOutput("data27",Context.MODE_PRIVATE);
					e47=(EditText)findViewById(R.id.editText47);
					string=e47.getText().toString();
					fos7.write(string.getBytes());
					fos7.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					FileOutputStream fos8= openFileOutput("data28",Context.MODE_PRIVATE);
					e48=(EditText)findViewById(R.id.editText48);
					string=e48.getText().toString();
					fos8.write(string.getBytes());
					fos8.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					FileOutputStream fos9 = openFileOutput("data29",Context.MODE_PRIVATE);
					e49=(EditText)findViewById(R.id.editText49);
					string=e49.getText().toString();
					fos9.write(string.getBytes());
					fos9.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				// 11 - 20
				try {
					FileOutputStream fos = openFileOutput("data30",Context.MODE_PRIVATE);
					e50=(EditText)findViewById(R.id.editText50);
					string=e50.getText().toString();
					fos.write(string.getBytes());
					fos.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}


				try {
					FileOutputStream fos1 = openFileOutput("data31",Context.MODE_PRIVATE);
					e51=(EditText)findViewById(R.id.editText51);
					string=e51.getText().toString();
					fos1.write(string.getBytes());
					fos1.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}


				try {
					FileOutputStream fos2 = openFileOutput("data32",Context.MODE_PRIVATE);
					e52=(EditText)findViewById(R.id.editText52);
					string=e52.getText().toString();
					fos2.write(string.getBytes());
					fos2.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}

				try {
					FileOutputStream fos3 = openFileOutput("data33",Context.MODE_PRIVATE);
					e53=(EditText)findViewById(R.id.editText53);
					string=e53.getText().toString();
					fos3.write(string.getBytes());
					fos3.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}

				try {
					FileOutputStream fos4 = openFileOutput("data34",Context.MODE_PRIVATE);
					e54=(EditText)findViewById(R.id.editText54);
					string=e54.getText().toString();
					fos4.write(string.getBytes());
					fos4.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					FileOutputStream fos5 = openFileOutput("data35",Context.MODE_PRIVATE);
					e55=(EditText)findViewById(R.id.editText55);
					string=e55.getText().toString();
					fos5.write(string.getBytes());
					fos5.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					FileOutputStream fos6 = openFileOutput("data36",Context.MODE_PRIVATE);
					e56=(EditText)findViewById(R.id.editText56);
					string=e56.getText().toString();
					fos6.write(string.getBytes());
					fos6.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					FileOutputStream fos7 = openFileOutput("data37",Context.MODE_PRIVATE);
					e57=(EditText)findViewById(R.id.editText57);
					string=e57.getText().toString();
					fos7.write(string.getBytes());
					fos7.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					FileOutputStream fos8= openFileOutput("data38",Context.MODE_PRIVATE);
					e58=(EditText)findViewById(R.id.editText58);
					string=e58.getText().toString();
					fos8.write(string.getBytes());
					fos8.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					FileOutputStream fos9 = openFileOutput("data39",Context.MODE_PRIVATE);
					e59=(EditText)findViewById(R.id.editText59);
					string=e59.getText().toString();
					fos9.write(string.getBytes());
					fos9.close();
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}

				Intent intent=new Intent(getApplicationContext(),Notes1.class);
					startActivity(intent);
					Toast.makeText(getApplicationContext(), "Saved", Toast.LENGTH_SHORT).show();
				}

		});


		Button bdelete=(Button)findViewById(R.id.bdelete);
		bdelete.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {  //Delete
				AlertDialog.Builder builder=new AlertDialog.Builder(Notes4.this);
				builder.setMessage("Are you sure?").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
							@Override
							public void onClick(DialogInterface dialogInterface, int i) {
//code 1 -10
								deleteFile("data");
								deleteFile("data1");
								deleteFile("data2");
								deleteFile("data3");
								deleteFile("data4");
								deleteFile("data5");
								deleteFile("data6");
								deleteFile("data7");
								deleteFile("data8");
								deleteFile("data9");
								//11-20
								deleteFile("data10");
								deleteFile("data11");
								deleteFile("data12");
								deleteFile("data13");
								deleteFile("data14");
								deleteFile("data15");
								deleteFile("data16");
								deleteFile("data17");
								deleteFile("data18");
								deleteFile("data19");
								//21-30
								deleteFile("data20");
								deleteFile("data21");
								deleteFile("data22");
								deleteFile("data23");
								deleteFile("data24");
								deleteFile("data25");
								deleteFile("data26");
								deleteFile("data27");
								deleteFile("data28");
								deleteFile("data29");
								//31-40
								deleteFile("data30");
								deleteFile("data31");
								deleteFile("data32");
								deleteFile("data33");
								deleteFile("data34");
								deleteFile("data35");
								deleteFile("data36");
								deleteFile("data37");
								deleteFile("data38");
								deleteFile("data39");
								Intent intent=new Intent(getApplicationContext(),Notes1.class);
								startActivity(intent);
								Toast.makeText(getApplicationContext(), "deleted", Toast.LENGTH_SHORT).show();

							}

						}
				).setNegativeButton("cancel",null);
				AlertDialog alert=builder.create();
				alert.show();
			}

		});




		try {
			FileInputStream fis=(FileInputStream)openFileInput("data");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader bufferedReader = new BufferedReader(isr);
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				e2=(EditText)findViewById(R.id.editText2);
				e2.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis1=(FileInputStream)openFileInput("data1");
			InputStreamReader isr1 = new InputStreamReader(fis1);
			BufferedReader bufferedReader1 = new BufferedReader(isr1);
			StringBuilder sb1 = new StringBuilder();
			String line;
			while ((line = bufferedReader1.readLine()) != null) {
				e21=(EditText)findViewById(R.id.editText21);
				e21.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream fis2=(FileInputStream)openFileInput("data2");
			InputStreamReader isr2 = new InputStreamReader(fis2);
			BufferedReader bufferedReader2 = new BufferedReader(isr2);
			StringBuilder sb2 = new StringBuilder();
			String line;
			while ((line = bufferedReader2.readLine()) != null) {
				e22=(EditText)findViewById(R.id.editText22);
				e22.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


		try {
			FileInputStream fis3=(FileInputStream)openFileInput("data3");
			InputStreamReader isr3 = new InputStreamReader(fis3);
			BufferedReader bufferedReader3 = new BufferedReader(isr3);
			StringBuilder sb3 = new StringBuilder();
			String line;
			while ((line = bufferedReader3.readLine()) != null) {
				e23=(EditText)findViewById(R.id.editText23);
				e23.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream fis4=(FileInputStream)openFileInput("data4");
			InputStreamReader isr4 = new InputStreamReader(fis4);
			BufferedReader bufferedReader4 = new BufferedReader(isr4);
			StringBuilder sb4 = new StringBuilder();
			String line;
			while ((line = bufferedReader4.readLine()) != null) {
				e24=(EditText)findViewById(R.id.editText24);
				e24.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream fis5=(FileInputStream)openFileInput("data5");
			InputStreamReader isr5 = new InputStreamReader(fis5);
			BufferedReader bufferedReader5 = new BufferedReader(isr5);
			StringBuilder sb5 = new StringBuilder();
			String line;
			while ((line = bufferedReader5.readLine()) != null) {
				e25=(EditText)findViewById(R.id.editText25);
				e25.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis6=(FileInputStream)openFileInput("data6");
			InputStreamReader isr6 = new InputStreamReader(fis6);
			BufferedReader bufferedReader6 = new BufferedReader(isr6);
			StringBuilder sb6 = new StringBuilder();
			String line;
			while ((line = bufferedReader6.readLine()) != null) {
				e26=(EditText)findViewById(R.id.editText26);
				e26.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis7=(FileInputStream)openFileInput("data7");
			InputStreamReader isr7 = new InputStreamReader(fis7);
			BufferedReader bufferedReader7 = new BufferedReader(isr7);
			StringBuilder sb7 = new StringBuilder();
			String line;
			while ((line = bufferedReader7.readLine()) != null) {
				e27=(EditText)findViewById(R.id.editText27);
				e27.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis8=(FileInputStream)openFileInput("data8");
			InputStreamReader isr8 = new InputStreamReader(fis8);
			BufferedReader bufferedReader8 = new BufferedReader(isr8);
			StringBuilder sb8 = new StringBuilder();
			String line;
			while ((line = bufferedReader8.readLine()) != null) {
				e28=(EditText)findViewById(R.id.editText28);
				e28.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis9=(FileInputStream)openFileInput("data9");
			InputStreamReader isr9 = new InputStreamReader(fis9);
			BufferedReader bufferedReader9 = new BufferedReader(isr9);
			StringBuilder sb9 = new StringBuilder();
			String line;
			while ((line = bufferedReader9.readLine()) != null) {
				e29=(EditText)findViewById(R.id.editText29);
				e29.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


//11-20


		try {
			FileInputStream fis=(FileInputStream)openFileInput("data10");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader bufferedReader = new BufferedReader(isr);
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				e30=(EditText)findViewById(R.id.editText30);
				e30.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis1=(FileInputStream)openFileInput("data11");
			InputStreamReader isr1 = new InputStreamReader(fis1);
			BufferedReader bufferedReader1 = new BufferedReader(isr1);
			StringBuilder sb1 = new StringBuilder();
			String line;
			while ((line = bufferedReader1.readLine()) != null) {
				e31=(EditText)findViewById(R.id.editText31);
				e31.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream fis2=(FileInputStream)openFileInput("data12");
			InputStreamReader isr2 = new InputStreamReader(fis2);
			BufferedReader bufferedReader2 = new BufferedReader(isr2);
			StringBuilder sb2 = new StringBuilder();
			String line;
			while ((line = bufferedReader2.readLine()) != null) {
				e32=(EditText)findViewById(R.id.editText32);
				e32.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


		try {
			FileInputStream fis3=(FileInputStream)openFileInput("data13");
			InputStreamReader isr3 = new InputStreamReader(fis3);
			BufferedReader bufferedReader3 = new BufferedReader(isr3);
			StringBuilder sb3 = new StringBuilder();
			String line;
			while ((line = bufferedReader3.readLine()) != null) {
				e33=(EditText)findViewById(R.id.editText33);
				e33.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream fis4=(FileInputStream)openFileInput("data14");
			InputStreamReader isr4 = new InputStreamReader(fis4);
			BufferedReader bufferedReader4 = new BufferedReader(isr4);
			StringBuilder sb4 = new StringBuilder();
			String line;
			while ((line = bufferedReader4.readLine()) != null) {
				e34=(EditText)findViewById(R.id.editText34);
				e34.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream fis5=(FileInputStream)openFileInput("data15");
			InputStreamReader isr5 = new InputStreamReader(fis5);
			BufferedReader bufferedReader5 = new BufferedReader(isr5);
			StringBuilder sb5 = new StringBuilder();
			String line;
			while ((line = bufferedReader5.readLine()) != null) {
				e35=(EditText)findViewById(R.id.editText35);
				e35.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis6=(FileInputStream)openFileInput("data16");
			InputStreamReader isr6 = new InputStreamReader(fis6);
			BufferedReader bufferedReader6 = new BufferedReader(isr6);
			StringBuilder sb6 = new StringBuilder();
			String line;
			while ((line = bufferedReader6.readLine()) != null) {
				e36=(EditText)findViewById(R.id.editText36);
				e36.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis7=(FileInputStream)openFileInput("data17");
			InputStreamReader isr7 = new InputStreamReader(fis7);
			BufferedReader bufferedReader7 = new BufferedReader(isr7);
			StringBuilder sb7 = new StringBuilder();
			String line;
			while ((line = bufferedReader7.readLine()) != null) {
				e37=(EditText)findViewById(R.id.editText37);
				e37.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis8=(FileInputStream)openFileInput("data18");
			InputStreamReader isr8 = new InputStreamReader(fis8);
			BufferedReader bufferedReader8 = new BufferedReader(isr8);
			StringBuilder sb8 = new StringBuilder();
			String line;
			while ((line = bufferedReader8.readLine()) != null) {
				e38=(EditText)findViewById(R.id.editText38);
				e38.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis9=(FileInputStream)openFileInput("data19");
			InputStreamReader isr9 = new InputStreamReader(fis9);
			BufferedReader bufferedReader9 = new BufferedReader(isr9);
			StringBuilder sb9 = new StringBuilder();
			String line;
			while ((line = bufferedReader9.readLine()) != null) {
				e39=(EditText)findViewById(R.id.editText39);
				e39.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
//21-30


		try {
			FileInputStream fis=(FileInputStream)openFileInput("data20");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader bufferedReader = new BufferedReader(isr);
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				e40=(EditText)findViewById(R.id.editText40);
				e40.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis1=(FileInputStream)openFileInput("data21");
			InputStreamReader isr1 = new InputStreamReader(fis1);
			BufferedReader bufferedReader1 = new BufferedReader(isr1);
			StringBuilder sb1 = new StringBuilder();
			String line;
			while ((line = bufferedReader1.readLine()) != null) {
				e41=(EditText)findViewById(R.id.editText41);
				e41.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream fis2=(FileInputStream)openFileInput("data22");
			InputStreamReader isr2 = new InputStreamReader(fis2);
			BufferedReader bufferedReader2 = new BufferedReader(isr2);
			StringBuilder sb2 = new StringBuilder();
			String line;
			while ((line = bufferedReader2.readLine()) != null) {
				e42=(EditText)findViewById(R.id.editText42);
				e42.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


		try {
			FileInputStream fis3=(FileInputStream)openFileInput("data23");
			InputStreamReader isr3 = new InputStreamReader(fis3);
			BufferedReader bufferedReader3 = new BufferedReader(isr3);
			StringBuilder sb3 = new StringBuilder();
			String line;
			while ((line = bufferedReader3.readLine()) != null) {
				e43=(EditText)findViewById(R.id.editText43);
				e43.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream fis4=(FileInputStream)openFileInput("data24");
			InputStreamReader isr4 = new InputStreamReader(fis4);
			BufferedReader bufferedReader4 = new BufferedReader(isr4);
			StringBuilder sb4 = new StringBuilder();
			String line;
			while ((line = bufferedReader4.readLine()) != null) {
				e44=(EditText)findViewById(R.id.editText44);
				e44.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream fis5=(FileInputStream)openFileInput("data25");
			InputStreamReader isr5 = new InputStreamReader(fis5);
			BufferedReader bufferedReader5 = new BufferedReader(isr5);
			StringBuilder sb5 = new StringBuilder();
			String line;
			while ((line = bufferedReader5.readLine()) != null) {
				e45=(EditText)findViewById(R.id.editText45);
				e45.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis6=(FileInputStream)openFileInput("data26");
			InputStreamReader isr6 = new InputStreamReader(fis6);
			BufferedReader bufferedReader6 = new BufferedReader(isr6);
			StringBuilder sb6 = new StringBuilder();
			String line;
			while ((line = bufferedReader6.readLine()) != null) {
				e46=(EditText)findViewById(R.id.editText46);
				e46.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis7=(FileInputStream)openFileInput("data27");
			InputStreamReader isr7 = new InputStreamReader(fis7);
			BufferedReader bufferedReader7 = new BufferedReader(isr7);
			StringBuilder sb7 = new StringBuilder();
			String line;
			while ((line = bufferedReader7.readLine()) != null) {
				e47=(EditText)findViewById(R.id.editText47);
				e47.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis8=(FileInputStream)openFileInput("data28");
			InputStreamReader isr8 = new InputStreamReader(fis8);
			BufferedReader bufferedReader8 = new BufferedReader(isr8);
			StringBuilder sb8 = new StringBuilder();
			String line;
			while ((line = bufferedReader8.readLine()) != null) {
				e48=(EditText)findViewById(R.id.editText48);
				e48.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis9=(FileInputStream)openFileInput("data29");
			InputStreamReader isr9 = new InputStreamReader(fis9);
			BufferedReader bufferedReader9 = new BufferedReader(isr9);
			StringBuilder sb9 = new StringBuilder();
			String line;
			while ((line = bufferedReader9.readLine()) != null) {
				e49=(EditText)findViewById(R.id.editText49);
				e49.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


//31-40


		try {
			FileInputStream fis=(FileInputStream)openFileInput("data30");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader bufferedReader = new BufferedReader(isr);
			StringBuilder sb = new StringBuilder();
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				e50=(EditText)findViewById(R.id.editText50);
				e50.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis1=(FileInputStream)openFileInput("data31");
			InputStreamReader isr1 = new InputStreamReader(fis1);
			BufferedReader bufferedReader1 = new BufferedReader(isr1);
			StringBuilder sb1 = new StringBuilder();
			String line;
			while ((line = bufferedReader1.readLine()) != null) {
				e51=(EditText)findViewById(R.id.editText51);
				e51.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream fis2=(FileInputStream)openFileInput("data32");
			InputStreamReader isr2 = new InputStreamReader(fis2);
			BufferedReader bufferedReader2 = new BufferedReader(isr2);
			StringBuilder sb2 = new StringBuilder();
			String line;
			while ((line = bufferedReader2.readLine()) != null) {
				e52=(EditText)findViewById(R.id.editText52);
				e52.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}


		try {
			FileInputStream fis3=(FileInputStream)openFileInput("data33");
			InputStreamReader isr3 = new InputStreamReader(fis3);
			BufferedReader bufferedReader3 = new BufferedReader(isr3);
			StringBuilder sb3 = new StringBuilder();
			String line;
			while ((line = bufferedReader3.readLine()) != null) {
				e53=(EditText)findViewById(R.id.editText53);
				e53.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream fis4=(FileInputStream)openFileInput("data34");
			InputStreamReader isr4 = new InputStreamReader(fis4);
			BufferedReader bufferedReader4 = new BufferedReader(isr4);
			StringBuilder sb4 = new StringBuilder();
			String line;
			while ((line = bufferedReader4.readLine()) != null) {
				e54=(EditText)findViewById(R.id.editText54);
				e54.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			FileInputStream fis5=(FileInputStream)openFileInput("data35");
			InputStreamReader isr5 = new InputStreamReader(fis5);
			BufferedReader bufferedReader5 = new BufferedReader(isr5);
			StringBuilder sb5 = new StringBuilder();
			String line;
			while ((line = bufferedReader5.readLine()) != null) {
				e55=(EditText)findViewById(R.id.editText55);
				e55.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis6=(FileInputStream)openFileInput("data36");
			InputStreamReader isr6 = new InputStreamReader(fis6);
			BufferedReader bufferedReader6 = new BufferedReader(isr6);
			StringBuilder sb6 = new StringBuilder();
			String line;
			while ((line = bufferedReader6.readLine()) != null) {
				e56=(EditText)findViewById(R.id.editText56);
				e56.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis7=(FileInputStream)openFileInput("data37");
			InputStreamReader isr7 = new InputStreamReader(fis7);
			BufferedReader bufferedReader7 = new BufferedReader(isr7);
			StringBuilder sb7 = new StringBuilder();
			String line;
			while ((line = bufferedReader7.readLine()) != null) {
				e57=(EditText)findViewById(R.id.editText57);
				e57.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis8=(FileInputStream)openFileInput("data38");
			InputStreamReader isr8 = new InputStreamReader(fis8);
			BufferedReader bufferedReader8 = new BufferedReader(isr8);
			StringBuilder sb8 = new StringBuilder();
			String line;
			while ((line = bufferedReader8.readLine()) != null) {
				e58=(EditText)findViewById(R.id.editText58);
				e58.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			FileInputStream fis9=(FileInputStream)openFileInput("data39");
			InputStreamReader isr9 = new InputStreamReader(fis9);
			BufferedReader bufferedReader9 = new BufferedReader(isr9);
			StringBuilder sb9 = new StringBuilder();
			String line;
			while ((line = bufferedReader9.readLine()) != null) {
				e59=(EditText)findViewById(R.id.editText59);
				e59.setText(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.my_options_menu, menu);
		return true;
	} // menu option
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
			case android.R.id.home:
			{
				Intent intent = new Intent(this, Notes1.class);
				startActivity(intent);
			}
			default:
				
				return true;
		}}
@Override
public  void onBackPressed() {

			AlertDialog.Builder builder=new AlertDialog.Builder(Notes4.this);
			builder.setMessage("Really exit?").setPositiveButton("Ok", new DialogInterface.OnClickListener() {
						@Override
						public void onClick(DialogInterface dialogInterface, int i) {
 Notes4.super.onBackPressed();
						}
					}
			).setNegativeButton("cancel",null).setCancelable(false);
			AlertDialog alert=builder.create();
			alert.show();
		}
}


