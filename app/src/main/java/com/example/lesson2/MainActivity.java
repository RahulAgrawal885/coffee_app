package com.example.lesson2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);//o/p number as string

    }

    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    int quantity = 0;


    public void increment(View view) {

        quantity += 1;
        display(quantity);
    }

    public void decrement(View view) {

        quantity = quantity - 1;
        display(quantity);
    }

    public void submitOrder(View view) {
        //int numberofCoffee = quantity;
        //display(numberofCoffee);
        //displayPrice(quantity * 5);
        String message = "You ordered " + quantity + " coffee \n" + "You have to pay $" + (quantity*5) +"\n" + "Enjoy your Day";
        displayMessage(message);
    }

    public void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
}