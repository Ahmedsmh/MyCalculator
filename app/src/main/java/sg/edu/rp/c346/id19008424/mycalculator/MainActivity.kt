package sg.edu.rp.c346.id19008424.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var grade = 'e'


    var msg = ""
    var addNum = 0.0
    var addBoolean = false
    var subNum = 0.0
    var subBoolean = false
    var divNum = 0.0
    var divBoolean = false
    var mulNum = 0.0
    var mulBoolean = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlus.setOnClickListener {
            addNum = tvNum.text.toString().toDouble()
            addBoolean = true
            msg = ""
            tvNum.text = ""
        }
        btnSub.setOnClickListener {
            subNum = tvNum.text.toString().toDouble()
            subBoolean = true
            msg = ""
            tvNum.text = ""
        }
        btnMultiply.setOnClickListener {
            mulNum = tvNum.text.toString().toDouble()
            mulBoolean = true
            msg = ""
            tvNum.text = ""
        }
        btnDivide.setOnClickListener {
            divNum = tvNum.text.toString().toDouble()
            divBoolean = true
            msg = ""
            tvNum.text = ""
        }
        btnEqual.setOnClickListener {
            if (addBoolean == true){
                tvNum.text = ((tvNum.text.toString().toDouble() + addNum).toString())
            }
            else if (subBoolean == true){
                var ans = subNum - tvNum.text.toString().toDouble()
                tvNum.text = ans.toString()
            }
            else if (mulBoolean == true){
                var ans1 = mulNum * tvNum.text.toString().toDouble()
                tvNum.text = ans1.toString()
            }
            else if (divBoolean == true){
                var ans2 = divNum / tvNum.text.toString().toDouble()
                tvNum.text = ans2.toString()
            }

        }
        btnAC.setOnClickListener {
            tvNum.text = 0.toString()
            msg = ""
            addNum = 0.0
            addBoolean = false
            subNum = 0.0
            subBoolean = false
            divNum = 0.0
            divBoolean = false
            mulNum = 0.0
            mulBoolean = false
        }
    }
    fun onNumClick(view: View){

        val btnSelected = view as Button
        when(btnSelected.id){
            btn0.id -> msg += "0"
            btn1.id -> msg += "1"
            btn2.id -> msg += "2"
            btn3.id -> msg += "3"
            btn4.id -> msg += "4"
            btn5.id -> msg += "5"
            btn6.id -> msg += "6"
            btn7.id -> msg += "7"
            btn8.id -> msg += "8"
            btn9.id -> msg += "9"
            btnDot.id -> msg += "."
        }
        tvNum.text = msg

    }
    fun onPlus(view: View){
        val btnSelected = view as Button
    }

}