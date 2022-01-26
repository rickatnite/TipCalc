package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initButton15();
        initButton18();
        initButton20();
    }

    //how to display with correct decimal format? this didn't work but should:
    //DecimalFormat df = new DecimalFormat("#.##");
    //double tip20 = Double.valueOf(df.format(bill * 0.2));
    //double billWith20 = Double.valueOf(df.format(bill + tip20));


private void initButton15() {
        Button button15 = findViewById(R.id.fifteenButton); //creates button with findViewById reference
        button15.setOnClickListener(new View.OnClickListener() { //set the button listener

            @Override
            public void onClick(View view) {
                EditText editBillAmount = findViewById(R.id.editTextBillAmount); //bill amount user input
                TextView textDisplay = findViewById(R.id.totalsTextView); //text to display as Tip: $99.99, Total Bill: $99.99
                double bill = Double.parseDouble(editBillAmount.getText().toString()); //get string of bill amount from user input and convert to double
                double tip15 = bill * 0.15; //calculates tip amount for 15% of bill
                double billWith15 = bill + tip15; //calculates total bill with 15% tip

                String s_tip15 = String.valueOf(tip15); //convert tip amt to string
                String s_total15 = String.valueOf(billWith15); //convert total to string
                //String billDisplay = editBillAmount.getText().toString(); //do we need this?

                Resources res = getResources(); // Asks the system for access to the values files
                String displayTip15 = res.getString(R.string.display_15, s_tip15, s_total15); // Creates the display string with args from strings.xml
                textDisplay.setText(displayTip15); //textview display from string arg

            }
        }
        );
    }


    private void initButton18() {
        Button button18 = findViewById(R.id.eighteenButton); //creates button with findViewById reference
        button18.setOnClickListener(new View.OnClickListener() { //set the button listener

            @Override
            public void onClick(View view) {
                EditText editBillAmount = findViewById(R.id.editTextBillAmount); //bill amount user input
                TextView textDisplay = findViewById(R.id.totalsTextView); //text to display as Tip: $99.99, Total Bill: $99.99
                double bill = Double.parseDouble(editBillAmount.getText().toString()); //get string of bill amount from user input and convert to double
                double tip18 = bill * 0.18; //calculates tip amount for 18% of bill
                double billWith18 = bill + tip18; //calculates total bill with 18% tip

                String s_tip18 = String.valueOf(tip18); //convert tip amt to string
                String s_total18 = String.valueOf(billWith18); //convert total to string
                //String billDisplay = editBillAmount.getText().toString(); //do we need this?

                Resources res = getResources(); // Asks the system for access to the values files
                String displayTip18 = res.getString(R.string.display_18, s_tip18, s_total18); // Creates the display string with args from strings.xml
                textDisplay.setText(displayTip18); //textview display from string arg

            }
        }
        );
    }



    private void initButton20() {
        Button button20 = findViewById(R.id.twentyButton); //creates button with findViewById reference
        button20.setOnClickListener(new View.OnClickListener() { //set the button listener

            @Override
            public void onClick(View view) {
                EditText editBillAmount = findViewById(R.id.editTextBillAmount); //bill amount user input
                TextView textDisplay = findViewById(R.id.totalsTextView); //text to display as Tip: $99.99, Total Bill: $99.99

                double bill = Double.parseDouble(editBillAmount.getText().toString()); //get string of bill amount from user input and convert to double
                double tip20 = bill * 0.2; //calculates tip amount for 20% of bill
                double billWith20 = bill + tip20; //calculates total bill with 20% tip
                String s_tip20 = String.valueOf(tip20); //convert tip amt to string
                String s_total20 = String.valueOf(billWith20); //convert total to string
                //String billDisplay = editBillAmount.getText().toString(); //do we need this?

                Resources res = getResources(); // Asks the system for access to the values files
                String displayTip20 = res.getString(R.string.display_20, s_tip20, s_total20); // Creates the display string with args from strings.xml
                textDisplay.setText(displayTip20); //textview display from string arg
            }
        }
        );
    }



}