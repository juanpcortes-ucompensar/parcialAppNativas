package com.example.multinativeapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CentralActivity  : AppCompatActivity() {

    private lateinit var buttonCalc: Button
    private lateinit var editTextWeight: EditText
    private lateinit var editTextCondition: EditText
    private lateinit var editTextTime: EditText
    private lateinit var editTextObjetive: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_central)

        Log.d("CentralActivity", "onCreate: Iniciando Central Activity")

        buttonCalc = findViewById(R.id.bt_calc)
        buttonCalc.setOnClickListener{
            if (validarCampos()){
                //Calcular rutinas
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("CentralActivity", "onStart: Central Activity está en primer plano")
    }

    override fun onPause() {
        super.onPause()
        Log.d("CentralActivity", "onPause: Central Activity está pausada")
    }

    override fun onStop() {
        super.onStop()
        Log.d("CentralActivity", "onStop: Central Activity está pausada")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("CentralActivity", "onDestroy: Central Activity está destruida")
    }

    private fun validarCampos(): Boolean {
        val peso = editTextWeight.text.toString().trim()
        val condition = editTextCondition.text.toString().trim()
        val time = editTextTime.text.toString().trim()
        val objetive = editTextObjetive.text.toString().trim()
        if (peso.isEmpty()){
            Toast.makeText(this, "El campo Peso es requerido", Toast.LENGTH_SHORT).show()
            return false
        }
        if (condition.isEmpty()){
            Toast.makeText(this, "El campo Condicion fisica es requerido", Toast.LENGTH_SHORT).show()
            return false
        }
        if (time.isEmpty()){
            Toast.makeText(this, "El campo tiempo disponible es requerido y debe tener un formato correcto: 'ejemplo@ejemplo.com'", Toast.LENGTH_SHORT).show()
            return false
        }
        if (objetive.isEmpty()){
            Toast.makeText(this, "El campo objetivo es requerido", Toast.LENGTH_SHORT).show()
            return false
        }
        return true
    }

}