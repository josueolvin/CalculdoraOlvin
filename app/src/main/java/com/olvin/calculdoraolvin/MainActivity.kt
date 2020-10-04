package com.olvin.calculdoraolvin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var num1: Double = 0.0
    private var num2: Double= 0.0
    private var operacion: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        unoboton.setOnClickListener {numeropresionado( dijito = "1") }
        dosbutton.setOnClickListener {numeropresionado(dijito = "2") }
        tresbutton.setOnClickListener {numeropresionado(dijito = "3") }
        cuatrobutton.setOnClickListener {numeropresionado(dijito = "4") }
        cincobutton.setOnClickListener {numeropresionado(dijito = "5") }
        seisbutton.setOnClickListener {numeropresionado(dijito =  "6") }
        sietebutton.setOnClickListener() {numeropresionado(dijito = "7") }
        ochobutton.setOnClickListener {numeropresionado(dijito = "8") }
        nuevebutton.setOnClickListener {numeropresionado(dijito = "9") }
        cerobutton.setOnClickListener {numeropresionado(dijito = "0") }
        puntobutton.setOnClickListener{numeropresionado(dijito = ".") }

        sumabutton.setOnClickListener() {operacionpresionada(SUMA) }
        restabutton.setOnClickListener() {operacionpresionada(RESTA) }
        multiplicacionbutton.setOnClickListener() {operacionpresionada(MUlTIPLICACION) }
        divisionbutton.setOnClickListener() {operacionpresionada(DIVISION) }

        borrarbutton.setOnClickListener(){
            num1= 0.0
            num2= 0.0
            textView.text= "0"
            operacion = NO_OPERACION
        }

        igualbutton.setOnClickListener() {
            var resultado = when(operacion){
                SUMA -> num1 + num2
                RESTA -> num1 - num2
                MUlTIPLICACION -> num1 * num2
                DIVISION -> num1 / num2
                else -> 0
            }
            textView.text= resultado .toString()
        }
        }

    private fun numeropresionado(dijito: String ) {
        textView.text = "${textView.text }$dijito"
        if (operacion == NO_OPERACION){
           num1 = textView.text.toString().toDouble()
        }else{
            num2= textView.text.toString().toDouble()
        }
}
private fun operacionpresionada(operacion: Int){
    this.operacion = operacion

    textView.text = "0"

}
    companion object{
        const val SUMA = 1
        const val RESTA = 2
        const val MUlTIPLICACION = 3
        const val DIVISION = 4
        const val NO_OPERACION = 5
    }
}