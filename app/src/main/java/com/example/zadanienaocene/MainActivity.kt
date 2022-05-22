package com.example.zadanienaocene


import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var licznik = 1;


        findViewById<Button>(R.id.backButton).setOnClickListener {
            if (licznik == 1)
                licznik = 5;
            else licznik -= 1;

            if (licznik == 1)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.capy1);
            else if (licznik == 2)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.capy2);
            else if (licznik == 3)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.capy3);
            else if (licznik == 4)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.capy4);
            else if (licznik == 5)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.capy5);
        }
        findViewById<Button>(R.id.nextButton).setOnClickListener {
            if (licznik == 5)
                licznik = 1;
            else
                licznik += 1;

            if (licznik == 1)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.capy1);
            else if (licznik == 2)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.capy2);
            else if (licznik == 3)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.capy3);
            else if (licznik == 4)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.capy4);
            else if (licznik == 5)
                findViewById<ImageView>(R.id.imageView).setImageResource(R.drawable.capy5);
        }
        findViewById<CheckBox>(R.id.CheckBoxPokazObrazek).setOnClickListener {
            if (findViewById<CheckBox>(R.id.CheckBoxPokazObrazek).isChecked == false) {
                findViewById<ImageView>(R.id.imageView).visibility = View.VISIBLE
            } else {
                findViewById<ImageView>(R.id.imageView).visibility = View.INVISIBLE
            }
        }
        findViewById<CheckBox>(R.id.checkBoxprzezroczystosc).setOnClickListener {
            if (findViewById<EditText>(R.id.Input).text.toString() == "") {
                Toast.makeText(this, "pole nie moze byc puste", Toast.LENGTH_SHORT).show()
            } else if (findViewById<EditText>(R.id.Input).text.toString().toInt() < 0) {
                Toast.makeText(this, "liczby musza byc dodatnie", Toast.LENGTH_SHORT).show()
            } else if (findViewById<EditText>(R.id.Input).text.toString().toInt() >= 0) {
                findViewById<ImageView>(R.id.imageView).alpha =
                    findViewById<EditText>(R.id.Input).text.toString().toFloat() / 100
            }
        }
    }
}

