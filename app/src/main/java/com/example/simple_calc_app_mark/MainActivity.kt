package com.example.simple_calc_app_mark

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var txtdisplayans: TextView
    private lateinit var edtfirstno: EditText
    private lateinit var edtsecondno: EditText
    private lateinit var addbtn: Button
    private lateinit var muliplybtn: Button
    private lateinit var dividebtn: Button
    private lateinit var subtractbtn: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtdisplayans = findViewById(R.id.txtdisplay)
        edtfirstno = findViewById(R.id.edtfirstnumber)
        edtsecondno = findViewById(R.id.edtsecondnumber)
        addbtn = findViewById(R.id.btnadd)
        muliplybtn = findViewById(R.id.btnmultiply)
        dividebtn = findViewById(R.id.btndivide)
        subtractbtn = findViewById(R.id.btnsubtract)

        addbtn.setOnClickListener {
            //Toast.makeText(this, "trying to add", Toast.LENGTH_SHORT).show()

            var first_num = edtfirstno.text.toString().trim()
            var second_num = edtsecondno.text.toString().trim()

            //user validation
            if (first_num.isEmpty() || second_num.isEmpty()){
                Toast.makeText(this, "ENTER A NUMBER!", Toast.LENGTH_SHORT).show()

            }
        else{
                //Toast.makeText(this, "trying to add two numbers", Toast.LENGTH_SHORT).show()
            var ans = first_num.toDouble() + second_num.toDouble()
                txtdisplayans.text = ans.toString()

            }


        }

        muliplybtn.setOnClickListener {

            var first_num = edtfirstno.text.toString().trim()
            var second_num = edtsecondno.text.toString().trim()

            if (first_num.isEmpty() || second_num.isEmpty()){
                Toast.makeText(this, "ENTER A NUMBER!", Toast.LENGTH_SHORT).show()

            }
            else{
                //Toast.makeText(this, "trying to multiply two numbers", Toast.LENGTH_SHORT).show()
                var ans = first_num.toDouble() * second_num.toDouble()
                txtdisplayans.text = ans.toString()
            }



        }

        dividebtn.setOnClickListener {

            var first_num = edtfirstno.text.toString().trim()
            var second_num = edtsecondno.text.toString().trim()

            if (first_num.isEmpty() || second_num.isEmpty()){
                Toast.makeText(this, "ENTER A NUMBER!", Toast.LENGTH_SHORT).show()

            }
            else{
                //Toast.makeText(this, "trying divide two numbers", Toast.LENGTH_SHORT).show()
                var ans = first_num.toDouble() / second_num.toDouble()
                txtdisplayans.text = ans.toString()
            }



        }

        subtractbtn.setOnClickListener {

            var first_num = edtfirstno.text.toString().trim()
            var second_num = edtsecondno.text.toString().trim()

            if (first_num.isEmpty() || second_num.isEmpty()){
                Toast.makeText(this, "ENTER A NUMBER!", Toast.LENGTH_SHORT).show()

            }
            else{
                //Toast.makeText(this, "trying subtract two numbers", Toast.LENGTH_SHORT).show()
                var ans = first_num.toDouble() - second_num.toDouble()
                txtdisplayans.text = ans.toString()
            }



        }



    }
}