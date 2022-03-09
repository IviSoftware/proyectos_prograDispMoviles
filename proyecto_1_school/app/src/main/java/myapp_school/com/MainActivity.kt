package myapp_school.com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var resultadoText = findViewById<TextView>(R.id.tv_result)
        val btn_suma = findViewById<Button>(R.id.btn_suma)
        val btn_resta = findViewById<Button>(R.id.btn_resta)
        val btn_multiplicacion = findViewById<Button>(R.id.btn_multiplicacion)
        val btn_divicion = findViewById<Button>(R.id.btn_dividir)


        btn_suma.setOnClickListener{
            val numberOneUser = findViewById<EditText>(R.id.txt_numberOne).text.toString().toFloat()
            val numberTwoUser = findViewById<EditText>(R.id.txt_numberTwo).text.toString().toFloat()

            val suma_resultado=sumar(numberOneUser,numberTwoUser)
            resultadoText.text= suma_resultado.toString()
        }

        btn_resta.setOnClickListener{
            val numberOneUser = findViewById<EditText>(R.id.txt_numberOne).text.toString().toFloat()
            val numberTwoUser = findViewById<EditText>(R.id.txt_numberTwo).text.toString().toFloat()

            val resta_resultado=restar(numberOneUser,numberTwoUser)
            resultadoText.text= resta_resultado.toString()
        }

        btn_multiplicacion.setOnClickListener{
            val numberOneUser = findViewById<EditText>(R.id.txt_numberOne).text.toString().toFloat()
            val numberTwoUser = findViewById<EditText>(R.id.txt_numberTwo).text.toString().toFloat()

            val multiplicacion_resultado=multiplicar(numberOneUser,numberTwoUser)
            resultadoText.text= multiplicacion_resultado.toString()
        }

        btn_divicion.setOnClickListener{
            val numberOneUser = findViewById<EditText>(R.id.txt_numberOne).text.toString().toFloat()
            val numberTwoUser = findViewById<EditText>(R.id.txt_numberTwo).text.toString().toFloat()

            if(numberTwoUser == 0f){
                resultadoText.text= "Error: No se puede dividir entre cero"
            }else{
                val divicion_resultado=dividir(numberOneUser,numberTwoUser)
                resultadoText.text= divicion_resultado.toString()
            }

        }

    }

    fun sumar(numberOne: Float, numberTwo: Float): Float {
        return numberOne + numberTwo
    }
    fun restar(numberOne: Float, numberTwo: Float): Float {
        return numberOne - numberTwo
    }
    fun multiplicar(numberOne: Float, numberTwo: Float): Float {
        return numberOne * numberTwo
    }
    fun dividir(numberOne: Float, numberTwo: Float): Float {
        return numberOne / numberTwo
    }

}
