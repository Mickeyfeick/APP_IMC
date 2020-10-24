package com.example.calculadora_peso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener{
    var peso:Int = 73
    var altura:Int = 183
    var edad:Int  = 19
    var sexo:String = "SIN"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvPeso.text = "$peso"
        tvAnios.text = "$edad"
        tvAltura.text =  "$altura"

        seekBarAltura.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                if (progress <= 100){
                    seekBarAltura.setProgress(100)
                    tvAltura.text = "100"
                }else{
                    tvAltura.text = "$progress"
                }
            }



            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }
        })

        btn_menosPeso.setOnClickListener(this)
        btn_masPeso.setOnClickListener(this)
        btn_edadMas.setOnClickListener(this)
        btn_edadMenos.setOnClickListener(this)
        btn_calcular.setOnClickListener(this)
        btnImgMaculino.setOnClickListener(this)
        btnImgFemenino.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.btn_menosPeso->{
                peso--
                tvPeso.text = peso.toString()
            }
            R.id.btn_masPeso->{
                peso++
                tvPeso.text = peso.toString()
            }
            R.id.btn_edadMenos->{
            edad--
            tvAnios.text = edad.toString()
            }
            R.id.btn_edadMas->{
                edad++
                tvAnios.text = edad.toString()
            }
            R.id.btnImgFemenino->sexo="F"
            R.id.btnImgMaculino->sexo="M"
            R.id.btn_calcular->{
                val imc = calculaIMC(peso,altura)
                val intencion = Intent(this, Informacion::class.java)
                intencion.putExtra("imc", imc)
                intencion.putExtra("peso", peso)
                intencion.putExtra("altura", altura)
                intencion.putExtra("sexo", sexo)
                intencion.putExtra("edad", edad)
                startActivity(intencion)
            }
        }
    }
     fun calculaIMC(peso:Int, altura:Int):Float{
         val pesoF = peso.toFloat()
         val alturaF = altura.toFloat()/100
         val imc = pesoF / (alturaF * alturaF)
         return imc.toFloat()
     }

}