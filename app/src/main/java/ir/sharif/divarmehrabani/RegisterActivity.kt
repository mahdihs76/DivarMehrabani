package ir.sharif.divarmehrabani

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ir.sharif.divarmehrabani.webservices.WebserviceHelper
import kotlinx.android.synthetic.main.activity_register.*
import kotlin.concurrent.thread

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        button.setOnClickListener {
            thread {
                val response = WebserviceHelper.register("Mahdi", "mahdi2222@gmail.com", "123", "HS")
                Log.i("TAG", response.toString())
            }

        }
    }
}
