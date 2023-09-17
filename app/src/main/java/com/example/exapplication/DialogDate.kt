package com.example.exapplication

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.format.DateUtils
import android.view.View
import android.widget.TextView
import java.util.Calendar

class DialogDate : AppCompatActivity() {

    private val dateAndTime = Calendar.getInstance()
    private lateinit var  currentTime : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dialog_date)

        currentTime = findViewById(R.id.curentTime)
    }

    fun setData(view: View){
        DatePickerDialog(
            this, dateSetListener,
            dateAndTime.get(Calendar.YEAR),
            dateAndTime.get(Calendar.MONTH),
            dateAndTime.get(Calendar.DAY_OF_MONTH)
        ).show()
    }

    fun setTime(view: View){
        TimePickerDialog(
            this, timeSetListener,
            dateAndTime.get(Calendar.HOUR_OF_DAY),
            dateAndTime.get(Calendar.MINUTE),true
        ).show()
    }

    private val dateSetListener =
        DatePickerDialog.OnDateSetListener{ _, year,monthOfYear,dayOfMonth ->
            dateAndTime.set(Calendar.YEAR,year)
            dateAndTime.set(Calendar.MONTH,monthOfYear)
            dateAndTime.set(Calendar.DAY_OF_MONTH,dayOfMonth)
            setInitialDateTime()
        }
    
    private val timeSetListener = 
        TimePickerDialog.OnTimeSetListener { _, hourOFDay, minute ->
            dateAndTime.set(Calendar.HOUR_OF_DAY,hourOFDay)
            dateAndTime.set(Calendar.MINUTE,minute)
            setInitialDateTime()
        }

    private fun setInitialDateTime(){
        currentTime.text = DateUtils.formatDateTime(
            this,
            dateAndTime.timeInMillis,
            DateUtils.FORMAT_SHOW_DATE or DateUtils.FORMAT_SHOW_YEAR or DateUtils.FORMAT_SHOW_TIME
        )
    }
}