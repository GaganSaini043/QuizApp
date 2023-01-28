package app.kidsquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife

class ResultActivity : AppCompatActivity() {

    @BindView(R.id.tv_name)
    lateinit var tvName :  TextView

    @BindView(R.id.tv_scores)
    lateinit var tvScores : TextView

    @BindView(R.id.btn_finish)
    lateinit var btnFinish : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        ButterKnife.bind(this)

        tvName.text = intent.getStringExtra(Constants.USER_NAME)
        val scores = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)
        val totalques = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)

        tvScores.text = "Your score is $scores out of $totalques"

        btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}