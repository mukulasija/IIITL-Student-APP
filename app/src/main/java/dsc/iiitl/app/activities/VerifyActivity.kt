package dsc.iiitl.app.activities

import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import dsc.iiitl.app.R
import dsc.iiitl.app.signIn.Login
import kotlinx.android.synthetic.main.activity_verify.*

class VerifyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)
        submitBtn.setOnClickListener {
            submit()
        }
    }

    private fun goToLoginActivity() {
        startActivity(Intent(this, Login::class.java))
        finish()
    }

    private fun submit() {
        val text = "GODREJ"
        if (verifyText.text.toString().toUpperCase() == text) {
            goToLoginActivity()
        } else {
            Toast.makeText(this, "Wrong Answer", Toast.LENGTH_LONG).show()
        }
    }
}
