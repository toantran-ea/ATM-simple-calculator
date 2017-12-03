package mobi.toan.calcapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAdd.setOnClickListener { resultTextView.text = Computer().add(firstNumber.text.toString().toDouble(), secondNumber.text.toString().toDouble()).toString() }
        buttonSub.setOnClickListener { resultTextView.text = Computer().sub(firstNumber.text.toString().toDouble(), secondNumber.text.toString().toDouble()).toString() }
        buttonMul.setOnClickListener { resultTextView.text = Computer().mul(firstNumber.text.toString().toDouble(), secondNumber.text.toString().toDouble()).toString() }
        buttonDiv.setOnClickListener { resultTextView.text = Computer().div(firstNumber.text.toString().toDouble(), secondNumber.text.toString().toDouble()).toString() }
    }
}
