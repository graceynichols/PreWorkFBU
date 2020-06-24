package com.example.preworkforfbu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    final String first_string = "Hello from Grace!";
    final String second_string = "Hello World";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Make the button do stuff.
        // Tell android to grab view (findViewById), set an on click listener (waits for person
        // to click) and executes given method
        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            boolean flag_text = false;
            @Override
            public void onClick(View v) {
                // Print message if you go with the info option
                Log.i("Grace", "Button (c)licked");
                // Cast as a textview so java knows it has a text color
                if (flag_text) {
                    ((TextView) findViewById(R.id.textView2)).setTextColor(getResources().getColor(R.color.colorPrimary));
                } else {
                    ((TextView) findViewById(R.id.textView2)).setTextColor(getResources().getColor(R.color.lavender));
                }
                flag_text = !flag_text;
            }
        });
        // Click to change background color
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            boolean flag_background = false;
            @Override
            public void onClick(View v) {
                // Print message if you go with the info option
                Log.i("Grace", "Background button (c)licked");
                // Cast as a textview so java knows it has a text color
                if (flag_background) {
                    (findViewById(R.id.background0)).setBackgroundColor(getResources().getColor(R.color.colorAccent));
                } else {
                    (findViewById(R.id.background0)).setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                }
                flag_background = !flag_background;
            }

        });
        // Click button2 to change text.
        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            boolean flag_string = false;
            @Override
            public void onClick(View v) {
                // Print message if you go with the info option
                Log.i("Grace", "String button (c)licked");
                // Cast as a textview so java knows it has a text color
                if (flag_string) {
                    ((TextView) findViewById(R.id.textView2)).setText(first_string);
                } else {
                    ((TextView) findViewById(R.id.textView2)).setText(second_string);
                }
                flag_string = !flag_string;
            }
        });

        // Click background to reset defaults
        findViewById(R.id.background0).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Print message if you go with the info option
                Log.i("Grace", "Background (c)licked");
                ((TextView) findViewById(R.id.textView2)).setText(first_string);
                ((TextView) findViewById(R.id.textView2)).setTextColor(getResources().getColor(R.color.colorPrimary));
                (findViewById(R.id.background0)).setBackgroundColor(getResources().getColor(R.color.colorAccent));
                // Cast as a textview so java knows it has a text color

            }

        });

        findViewById(R.id.button8).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Grab text user inputted
                String newText = ((EditText) findViewById(R.id.editText)).getText().toString();
                if (TextUtils.isEmpty(newText)) {
                    ((TextView) findViewById(R.id.textView2)).setText(first_string);
                } else {
                    ((TextView) findViewById(R.id.textView2)).setText(newText);
                }

            }
            /*
            boolean flag_string = false;
            @Override
            public void onClick(View v) {
                // Print message if you go with the info option
                Log.i("Grace", "String button (c)licked");
                // Cast as a textview so java knows it has a text color
                if (flag_string) {
                    ((TextView) findViewById(R.id.textView2)).setText(first_string);
                } else {
                    ((TextView) findViewById(R.id.textView2)).setText(second_string);
                }
                flag_string = !flag_string;
            }*/

        });


    }
}