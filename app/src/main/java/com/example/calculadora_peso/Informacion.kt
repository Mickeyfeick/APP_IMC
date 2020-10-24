package com.example.calculadora_peso

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_informacion.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class Informacion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_informacion)
        
        val intencion = intent
        val imc = intencion.getFloatExtra("imc", 0.0F)
        tvResultado.text = "$imc"
        var sexo = intencion.getStringExtra("sexo")
        sexo = sexo.toString()
        val edad = intencion.getIntExtra("edad", 19)
        interpretar(sexo, edad, imc)

        btnreCalcular.setOnClickListener{
            val reabrirImc = Intent(this, MainActivity::class.java)
            startActivity(reabrirImc)
        }
    }


    fun interpretar(sexo:String, edad:Int, imc:Float){
        Log.d("valorS","$sexo")
        if(sexo == "F"){
            if (edad >= 19 && edad <= 24){
                if(imc >=18.9 && imc <=22.1){
                    tvInfoArriba.text = "Óptimo"
                    tvIMCRango.text = "18.9 - 22.1 kg/m²"
                    tvMensaje.text = "Tienes un excelente peso.\n¡Felicidades sigue así!"
                }
                if(imc >22.1 && imc <=25){
                    tvInfoArriba.text = "Normal"
                    tvIMCRango.text = "22.1 - 25 kg/m²"
                    tvMensaje.text = "Tienes un buen peso.\n¡Buen trabajo!"
                }
                if(imc >25 && imc <= 29.6){
                    tvInfoArriba.text = "Normal - Malo"
                    tvInfoArriba.setTextColor(Color.parseColor("#ffee4d"))
                    tvIMCRango.text = "25 - 29.6 kg/m²"
                    tvMensaje.text = "Tienes un peso poco saludable.\n¡Ten cuidado!"
                }
                if(imc > 29.6 ){
                    tvInfoArriba.text = "Malo (Obesidad)"
                    tvIMCRango.text = ">29.6 kg/m²"
                    tvInfoArriba.setTextColor(Color.parseColor("#f70000"))
                    tvMensaje.text = "Tienes un problema con tu peso.\n¡Cuidate!"
                }
            }
            if (edad >= 25 && edad <= 29){
                if(imc >=18.9 && imc <=22){
                    tvInfoArriba.text = "Óptimo"
                    tvIMCRango.text = "18.9 - 22 kg/m²"
                    tvMensaje.text = "Tienes un excelente peso.\n¡Felicidades sigue así!"
                }
                if(imc >22 && imc <=25.4){
                    tvInfoArriba.text = "Normal"
                    tvIMCRango.text = "22 - 25.4 kg/m²"
                    tvMensaje.text = "Tienes un buen peso.\n¡Buen trabajo!"
                }
                if(imc >25.4 && imc <= 29.6){
                    tvInfoArriba.text = "Normal - Malo"
                    tvInfoArriba.setTextColor(Color.parseColor("#ffee4d"))
                    tvIMCRango.text = "25.4 - 29.8 kg/m²"
                    tvMensaje.text = "Tienes un peso poco saludable.\n¡Ten cuidado!"
                }
                if(imc > 29.8 ){
                    tvInfoArriba.text = "Malo (Obesidad)"
                    tvIMCRango.text = ">29.8 kg/m²"
                    tvInfoArriba.setTextColor(Color.parseColor("#f70000"))
                    tvMensaje.text = "Tienes un problema con tu peso.\n¡Cuidate!"
                }
            }
            if (edad >= 30 && edad <= 34){
                if(imc >=19.7 && imc <=22.7){
                    tvInfoArriba.text = "Óptimo"
                    tvIMCRango.text = "19.7 - 22.7 kg/m²"
                    tvMensaje.text = "Tienes un excelente peso.\n¡Felicidades sigue así!"
                }
                if(imc >22.7 && imc <=26.4){
                    tvInfoArriba.text = "Normal"
                    tvIMCRango.text = "22.7 - 26.4 kg/m²"
                    tvInfoArriba.setTextColor(Color.parseColor("#ffee4d"))
                    tvMensaje.text = "Tienes un buen peso.\n¡Buen trabajo!"
                }
                if(imc >26.4 && imc <= 30.5){
                    tvInfoArriba.text = "Normal - Malo"
                    tvIMCRango.text = "26.4  - 30.5 kg/m²"
                    tvMensaje.text = "Tienes un peso poco saludable.\n¡Ten cuidado!"
                }
                if(imc > 30.5){
                    tvInfoArriba.text = "Malo (Obesidad)"
                    tvIMCRango.text = ">30.5 kg/m²"
                    tvInfoArriba.setTextColor(Color.parseColor("#f70000"))
                    tvMensaje.text = "Tienes un problema con tu peso.\n¡Cuidate!"
                }
            }
            if (edad >= 35 && edad <= 39){
                if(imc >=21 && imc <=24){
                    tvInfoArriba.text = "Óptimo"
                    tvIMCRango.text = "21 - 24 kg/m²"
                    tvMensaje.text = "Tienes un excelente peso.\n¡Felicidades sigue así!"
                }
                if(imc >24 && imc <=27.7){
                    tvInfoArriba.text = "Normal"
                    tvIMCRango.text = "24 - 27.7 kg/m²"
                    tvMensaje.text = "Tienes un buen peso.\n¡Buen trabajo!"
                }
                if(imc >27.7 && imc <= 31.5){
                    tvInfoArriba.text = "Normal - Malo"
                    tvInfoArriba.setTextColor(Color.parseColor("#ffee4d"))
                    tvIMCRango.text = "27.7 - 31.5 kg/m²"
                    tvMensaje.text = "Tienes un peso poco saludable.\n¡Ten cuidado!"
                }
                if(imc > 30.5){
                    tvInfoArriba.text = "Malo (Obesidad)"
                    tvIMCRango.text = ">30.5 kg/m²"
                    tvInfoArriba.setTextColor(Color.parseColor("#f70000"))
                    tvMensaje.text = "Tienes un problema con tu peso.\n¡Cuidate!"
                }
            }
            if (edad >= 40 && edad <= 44){
                if(imc >=22.6 && imc <=25.6){
                    tvInfoArriba.text = "Óptimo"
                    tvIMCRango.text = "22.6 - 25.6 kg/m²"
                    tvMensaje.text = "Tienes un excelente peso.\n¡Felicidades sigue así!"
                }
                if(imc >25.6 && imc <=29.3){
                    tvInfoArriba.text = "Normal"
                    tvIMCRango.text = "25.6 - 29.3 kg/m²"
                    tvMensaje.text = "Tienes un buen peso.\n¡Buen trabajo!"
                }
                if(imc >29.3 && imc <= 32.8){
                    tvInfoArriba.text = "Normal - Malo"
                    tvInfoArriba.setTextColor(Color.parseColor("#ffee4d"))
                    tvIMCRango.text = "29.3 - 32.8 kg/m²"
                    tvMensaje.text = "Tienes un peso poco saludable.\n¡Ten cuidado!"
                }
                if(imc > 32.8){
                    tvInfoArriba.text = "Malo (Obesidad)"
                    tvIMCRango.text = ">32.8 kg/m²"
                    tvInfoArriba.setTextColor(Color.parseColor("#f70000"))
                    tvMensaje.text = "Tienes un problema con tu peso.\n¡Cuidate!"
                }
            }
            if (edad >= 45 && edad <= 49){
                if(imc >=24.3 && imc <=27.3){
                    tvInfoArriba.text = "Óptimo"
                    tvIMCRango.text = "24.3 - 27.3 kg/m²"
                    tvMensaje.text = "Tienes un excelente peso.\n¡Felicidades sigue así!"
                }
                if(imc >27.3 && imc <=30.9){
                    tvInfoArriba.text = "Normal"
                    tvIMCRango.text = "27.3 - 30.9 kg/m²"
                    tvMensaje.text = "Tienes un buen peso.\n¡Buen trabajo!"
                }
                if(imc >30.9&& imc <= 34.1){
                    tvInfoArriba.text = "Normal - Malo"
                    tvInfoArriba.setTextColor(Color.parseColor("#ffee4d"))
                    tvIMCRango.text = "30.9 - 34.1 kg/m²"
                    tvMensaje.text = "Tienes un peso poco saludable.\n¡Ten cuidado!"
                }
                if(imc > 34.1){
                    tvInfoArriba.text = "Malo (Obesidad)"
                    tvIMCRango.text = ">34.1 kg/m²"
                    tvInfoArriba.setTextColor(Color.parseColor("#f70000"))
                    tvMensaje.text = "Tienes un problema con tu peso.\n¡Cuidate!"
                }
            }
            if (edad >= 50 && edad <= 54){
                if(imc >=26.6 && imc <=29.7){
                    tvInfoArriba.text = "Óptimo"
                    tvIMCRango.text = "26.6 - 29.7 kg/m²"
                    tvMensaje.text = "Tienes un excelente peso.\n¡Felicidades sigue así!"
                }
                if(imc >29.7 && imc <=33.1){
                    tvInfoArriba.text = "Normal"
                    tvIMCRango.text = "29.7 - 33.1 kg/m²"
                    tvMensaje.text = "Tienes un buen peso.\n¡Buen trabajo!"
                }
                if(imc >33.1&& imc <= 36.2){
                    tvInfoArriba.text = "Normal - Malo"
                    tvInfoArriba.setTextColor(Color.parseColor("#ffee4d"))
                    tvIMCRango.text = "33.1 - 36.2 kg/m²"
                    tvMensaje.text = "Tienes un peso poco saludable.\n¡Ten cuidado!"
                }
                if(imc > 36.2){
                    tvInfoArriba.text = "Malo (Obesidad)"
                    tvIMCRango.text = ">36.2 kg/m²"
                    tvInfoArriba.setTextColor(Color.parseColor("#f70000"))
                    tvMensaje.text = "Tienes un problema con tu peso.\n¡Cuidate!"
                }
            }
            if (edad >= 55 && edad <= 50){
                if(imc >=27.4 && imc <=30.7){
                    tvInfoArriba.text = "Óptimo"
                    tvIMCRango.text = "27.4 - 30.7 kg/m²"
                    tvMensaje.text = "Tienes un excelente peso.\n¡Felicidades sigue así!"
                }
                if(imc >30.7 && imc <=34){
                    tvInfoArriba.text = "Normal"
                    tvIMCRango.text = "30.7 - 34 kg/m²"
                    tvMensaje.text = "Tienes un buen peso.\n¡Buen trabajo!"
                }
                if(imc >34 && imc <= 37.3){
                    tvInfoArriba.text = "Normal - Malo"
                    tvInfoArriba.setTextColor(Color.parseColor("#ffee4d"))
                    tvIMCRango.text = "34 - 37.3 kg/m²"
                    tvMensaje.text = "Tienes un peso poco saludable.\n¡Ten cuidado!"
                }
                if(imc > 37.3){
                    tvInfoArriba.text = "Malo (Obesidad)"
                    tvIMCRango.text = ">37.3 kg/m²"
                    tvInfoArriba.setTextColor(Color.parseColor("#f70000"))
                    tvMensaje.text = "Tienes un problema con tu peso.\n¡Cuidate!"
                }
            }
            if (edad >= 60){
                if(imc >=27.6 && imc <=31){
                    tvInfoArriba.text = "Óptimo"
                    tvIMCRango.text = "27.6 - 31 kg/m²"
                    tvMensaje.text = "Tienes un excelente peso.\n¡Felicidades sigue así!"
                }
                if(imc >31 && imc <=34.4){
                    tvInfoArriba.text = "Normal"
                    tvIMCRango.text = "31 - 34.4 kg/m²"
                    tvMensaje.text = "Tienes un buen peso.\n¡Buen trabajo!"
                }
                if(imc >34.4 && imc <= 38){
                    tvInfoArriba.text = "Normal - Malo"
                    tvInfoArriba.setTextColor(Color.parseColor("#ffee4d"))
                    tvIMCRango.text = "34.4 - 38 kg/m²"
                    tvMensaje.text = "Tienes un peso poco saludable.\n¡Ten cuidado!"
                }
                if(imc > 38){
                    tvInfoArriba.text = "Malo (Obesidad)"
                    tvIMCRango.text = ">38 kg/m²"
                    tvInfoArriba.setTextColor(Color.parseColor("#f70000"))
                    tvMensaje.text = "Tienes un problema con tu peso.\n¡Cuidate!"
                }
            }
        }
        if(sexo == "M"){
            if (edad >= 19 && edad <= 24){
                if(imc >=10.8 && imc <=14.9){
                    tvInfoArriba.text = "Óptimo"
                    tvIMCRango.text = "10.8 - 14.9 kg/m²"
                    tvMensaje.text = "Tienes un excelente peso.\n¡Felicidades sigue así!"
                }
                if(imc >14.9 && imc <=19){
                    tvInfoArriba.text = "Normal"
                    tvIMCRango.text = "14.9 - 19 kg/m²"
                    tvMensaje.text = "Tienes un buen peso.\n¡Buen trabajo!"
                }
                if(imc >19 && imc <= 23.3){
                    tvInfoArriba.text = "Normal - Malo"
                    tvInfoArriba.setTextColor(Color.parseColor("#ffee4d"))
                    tvIMCRango.text = "19 - 23.3 kg/m²"
                    tvMensaje.text = "Tienes un peso poco saludable.\n¡Ten cuidado!"
                }
                if(imc > 23.3 ){
                    tvInfoArriba.text = "Malo (Obesidad)"
                    tvIMCRango.text = ">23.3 kg/m²"
                    tvInfoArriba.setTextColor(Color.parseColor("#f70000"))
                    tvMensaje.text = "Tienes un problema con tu peso.\n¡Cuidate!"
                }
            }
            if (edad >= 25 && edad <= 29){
                if(imc >=12.8 && imc <=16.5){
                    tvInfoArriba.text = "Óptimo"
                    tvIMCRango.text = "12.8 - 16.5 kg/m²"
                    tvMensaje.text = "Tienes un excelente peso.\n¡Felicidades sigue así!"
                }
                if(imc >16.5&& imc <=20.3){
                    tvInfoArriba.text = "Normal"
                    tvIMCRango.text = "16.5 - 20.3 kg/m²"
                    tvMensaje.text = "Tienes un buen peso.\n¡Buen trabajo!"
                }
                if(imc >20.3 && imc <= 24.4){
                    tvInfoArriba.text = "Normal - Malo"
                    tvInfoArriba.setTextColor(Color.parseColor("#ffee4d"))
                    tvIMCRango.text = "20.3 - 24.4 kg/m²"
                    tvMensaje.text = "Tienes un peso poco saludable.\n¡Ten cuidado!"
                }
                if(imc > 24.4 ){
                    tvInfoArriba.text = "Malo (Obesidad)"
                    tvIMCRango.text = ">24.4 kg/m²"
                    tvInfoArriba.setTextColor(Color.parseColor("#f70000"))
                    tvMensaje.text = "Tienes un problema con tu peso.\n¡Cuidate!"
                }
            }
            if (edad >= 30 && edad <= 34){
                if(imc >=14.5 && imc <=18){
                    tvInfoArriba.text = "Óptimo"
                    tvIMCRango.text = "14.5  - 18 kg/m²"
                    tvMensaje.text = "Tienes un excelente peso.\n¡Felicidades sigue así!"
                }
                if(imc >18 && imc <=21.5){
                    tvInfoArriba.text = "Normal"
                    tvIMCRango.text = "18 - 21.5 kg/m²"
                    tvMensaje.text = "Tienes un buen peso.\n¡Buen trabajo!"
                }
                if(imc >21.5 && imc <= 25.2){
                    tvInfoArriba.text = "Normal - Malo"
                    tvInfoArriba.setTextColor(Color.parseColor("#ffee4d"))
                    tvIMCRango.text = "21.5 - 25.2 kg/m²"
                    tvMensaje.text = "Tienes un peso poco saludable.\n¡Ten cuidado!"
                }
                if(imc > 25.2 ){
                    tvInfoArriba.text = "Malo (Obesidad)"
                    tvIMCRango.text = ">25.2 kg/m²"
                    tvInfoArriba.setTextColor(Color.parseColor("#f70000"))
                    tvMensaje.text = "Tienes un problema con tu peso.\n¡Cuidate!"
                }
            }
            if (edad >= 35 && edad <= 39){
                if(imc >=16.1 && imc <= 19.4){
                    tvInfoArriba.text = "Óptimo"
                    tvIMCRango.text = "16.1  - 19.4 kg/m²"
                    tvMensaje.text = "Tienes un excelente peso.\n¡Felicidades sigue así!"
                }
                if(imc >19.4&& imc <=22.6){
                    tvInfoArriba.text = "Normal"
                    tvIMCRango.text = "19.4 - 22.6 kg/m²"
                    tvMensaje.text = "Tienes un buen peso.\n¡Buen trabajo!"
                }
                if(imc >22.6 && imc <= 26.1){
                    tvInfoArriba.text = "Normal - Malo"
                    tvInfoArriba.setTextColor(Color.parseColor("#ffee4d"))
                    tvIMCRango.text = "22.6 - 26.1 kg/m²"
                    tvMensaje.text = "Tienes un peso poco saludable.\n¡Ten cuidado!"
                }
                if(imc > 26.1 ){
                    tvInfoArriba.text = "Malo (Obesidad)"
                    tvIMCRango.text = ">26.1 kg/m²"
                    tvInfoArriba.setTextColor(Color.parseColor("#f70000"))
                    tvMensaje.text = "Tienes un problema con tu peso.\n¡Cuidate!"
                }
            }
            if (edad >= 40 && edad <= 44){
                if(imc >=17.5 && imc <= 20.5){
                    tvInfoArriba.text = "Óptimo"
                    tvIMCRango.text = "17.5  - 20.5 kg/m²"
                    tvMensaje.text = "Tienes un excelente peso.\n¡Felicidades sigue así!"
                }
                if(imc >20.5 && imc <=23.6){
                    tvInfoArriba.text = "Normal"
                    tvIMCRango.text = "20.5 - 23.6 kg/m²"
                    tvMensaje.text = "Tienes un buen peso.\n¡Buen trabajo!"
                }
                if(imc >23.6 && imc <= 26.9){
                    tvInfoArriba.text = "Normal - Malo"
                    tvInfoArriba.setTextColor(Color.parseColor("#ffee4d"))
                    tvIMCRango.text = "23.6 - 26.9 kg/m²"
                    tvMensaje.text = "Tienes un peso poco saludable.\n¡Ten cuidado!"
                }
                if(imc > 26.9 ){
                    tvInfoArriba.text = "Malo (Obesidad)"
                    tvIMCRango.text = ">26.9 kg/m²"
                    tvInfoArriba.setTextColor(Color.parseColor("#f70000"))
                    tvMensaje.text = "Tienes un problema con tu peso.\n¡Cuidate!"
                }
            }
            if (edad >= 45 && edad <= 49){
                if(imc >=18.6 && imc <= 21.5){
                    tvInfoArriba.text = "Óptimo"
                    tvIMCRango.text = "18.6 - 21.5 kg/m²"
                    tvMensaje.text = "Tienes un excelente peso.\n¡Felicidades sigue así!"
                }
                if(imc >21.5 && imc <=24.5){
                    tvInfoArriba.text = "Normal"
                    tvIMCRango.text = "21.5 - 24.5 kg/m²"
                    tvMensaje.text = "Tienes un buen peso.\n¡Buen trabajo!"
                }
                if(imc >24.5 && imc <= 27.6){
                    tvInfoArriba.text = "Normal - Malo"
                    tvInfoArriba.setTextColor(Color.parseColor("#ffee4d"))
                    tvIMCRango.text = "24.5 - 27.6 kg/m²"
                    tvMensaje.text = "Tienes un peso poco saludable.\n¡Ten cuidado!"
                }
                if(imc > 27.6 ){
                    tvInfoArriba.text = "Malo (Obesidad)"
                    tvIMCRango.text = ">27.6 kg/m²"
                    tvInfoArriba.setTextColor(Color.parseColor("#f70000"))
                    tvMensaje.text = "Tienes un problema con tu peso.\n¡Cuidate!"
                }
            }
            if (edad >= 50 && edad <= 54){
                if(imc >=19.8 && imc <= 22.7){
                    tvInfoArriba.text = "Óptimo"
                    tvIMCRango.text = "19.8 - 22.7 kg/m²"
                    tvMensaje.text = "Tienes un excelente peso.\n¡Felicidades sigue así!"
                }
                if(imc > 22.7 && imc <=25.6){
                    tvInfoArriba.text = "Normal"
                    tvIMCRango.text = "22.7 - 25.6 kg/m²"
                    tvMensaje.text = "Tienes un buen peso.\n¡Buen trabajo!"
                }
                if(imc >25.6 && imc <= 28.7){
                    tvInfoArriba.text = "Normal - Malo"
                    tvInfoArriba.setTextColor(Color.parseColor("#ffee4d"))
                    tvIMCRango.text = "25.6 - 28.7 kg/m²"
                    tvMensaje.text = "Tienes un peso poco saludable.\n¡Ten cuidado!"
                }
                if(imc > 28.7 ){
                    tvInfoArriba.text = "Malo (Obesidad)"
                    tvIMCRango.text = ">28.7 kg/m²"
                    tvInfoArriba.setTextColor(Color.parseColor("#f70000"))
                    tvMensaje.text = "Tienes un problema con tu peso.\n¡Cuidate!"
                }
            }
            if (edad >= 55 && edad <= 59){
                if(imc >= 20.2 && imc <= 23.2){
                    tvInfoArriba.text = "Óptimo"
                    tvIMCRango.text = "20.2 - 23.2 kg/m²"
                    tvMensaje.text = "Tienes un excelente peso.\n¡Felicidades sigue así!"
                }
                if(imc > 23.2 && imc <=26.2){
                    tvInfoArriba.text = "Normal"
                    tvIMCRango.text = "23.2 - 26.2 kg/m²"
                    tvMensaje.text = "Tienes un buen peso.\n¡Buen trabajo!"
                }
                if(imc >26.2 && imc <= 29.3){
                    tvInfoArriba.text = "Normal - Malo"
                    tvInfoArriba.setTextColor(Color.parseColor("#ffee4d"))
                    tvIMCRango.text = "26.2 - 29.3 kg/m²"
                    tvMensaje.text = "Tienes un peso poco saludable.\n¡Ten cuidado!"
                }
                if(imc > 29.3 ){
                    tvInfoArriba.text = "Malo (Obesidad)"
                    tvIMCRango.text = ">29.3 kg/m²"
                    tvInfoArriba.setTextColor(Color.parseColor("#f70000"))
                    tvMensaje.text = "Tienes un problema con tu peso.\n¡Cuidate!"
                }
            }
            if (edad >= 60){
                if(imc >= 20.3 && imc <= 23.5){
                    tvInfoArriba.text = "Óptimo"
                    tvIMCRango.text = "20.3 - 23.5 kg/m²"
                    tvMensaje.text = "Tienes un excelente peso.\n¡Felicidades sigue así!"
                }
                if(imc > 23.5 && imc <=26.7){
                    tvInfoArriba.text = "Normal"
                    tvIMCRango.text = "23.5 - 26.7 kg/m²"
                    tvMensaje.text = "Tienes un buen peso.\n¡Buen trabajo!"
                }
                if(imc >26.7 && imc <= 29.8){
                    tvInfoArriba.text = "Normal - Malo"
                    tvInfoArriba.setTextColor(Color.parseColor("#ffee4d"))
                    tvIMCRango.text = "26.7 - 29.8 kg/m²"
                    tvMensaje.text = "Tienes un peso poco saludable.\n¡Ten cuidado!"
                }
                if(imc > 29.8 ){
                    tvInfoArriba.text = "Malo (Obesidad)"
                    tvIMCRango.text = ">29.8 kg/m²"
                    tvInfoArriba.setTextColor(Color.parseColor("#f70000"))
                    tvMensaje.text = "Tienes un problema con tu peso.\n¡Cuidate!"
                }
            }
        }
    }

}