package com.piginp.presentation

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.piginp.cleanarchitecturetest.R
import com.piginp.domain.models.SaveUserNameParam
import com.piginp.domain.usecase.GetUserNameUseCase
import com.piginp.domain.usecase.SaveUserNameUseCase

class MainActivity : AppCompatActivity() {

    private val getUserNameUseCase = GetUserNameUseCase()
    private val saveUserNameUseCase = SaveUserNameUseCase()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init() {
        val dataTv = findViewById<TextView>(R.id.data_tv)
        val dataEt = findViewById<EditText>(R.id.put_data_ed)
        val saveDataBt = findViewById<Button>(R.id.save_data_bt)
        val getDataBt = findViewById<Button>(R.id.get_data_bt)

        saveDataBt.setOnClickListener {
            val text = dataEt.text.toString()
            val param = SaveUserNameParam(text)
            val result: Boolean = saveUserNameUseCase.execute(saveUserNameParam = param)

            dataTv.text = result.toString()
        }

        getDataBt.setOnClickListener {
            val userName = getUserNameUseCase.execute()
            dataTv.text = "${userName.firstname} ${userName.lastname}"
        }

    }
}