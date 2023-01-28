package app.kidsquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick

class MainActivity : AppCompatActivity() {

    @BindView(R.id.btn_start)
    lateinit var btnStart: Button

    @BindView(R.id.et_name)
    lateinit var etName: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)

    }

    @OnClick(R.id.btn_start)
    fun onClick() {
        if (etName.text.isEmpty()) {
            Toast.makeText(this, "Please Enter Name", Toast.LENGTH_SHORT).show()
        }
        else{
            val intent = Intent(this,SelectOptionActivity ::class.java)
            intent.putExtra(Constants.USER_NAME, etName.text.toString())
            startActivity(intent)
            finish()
        }
    }
}