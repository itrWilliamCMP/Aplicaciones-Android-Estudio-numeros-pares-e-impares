package william.campos.appnumerosimparesepares

import Numeros
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val txtNumero = findViewById<EditText>(R.id.txtNumero)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val txtResultado = findViewById<TextView>(R.id.txtResultado)

        val objCalcular = Numeros()

        btnCalcular.setOnClickListener {
            val resul = objCalcular.Calcular(
                txtNumero.text.toString().toInt()
            )

            Toast.makeText(this, "El numero: $resul", Toast.LENGTH_LONG).show()

            println("El resultado es: $resul")
            txtResultado.text = "El numero: $resul"
        }
    }
}