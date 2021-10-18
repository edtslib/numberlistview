package id.co.edtslib.numberlistview.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.co.edtslib.numberlistview.NumberListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberListView = findViewById<NumberListView>(R.id.numberListView)
        numberListView.add("Tap <b>Pay Now with GoPay</b>.")
        numberListView.add("<b>Gojek</b> app will open. ")
        numberListView.add("Check Your Payment Detail then tap <b>Next.</b>")

    }
}