package app.kidsquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import butterknife.BindView
import butterknife.ButterKnife

class ResultActivity : AppCompatActivity() {

    @BindView(R.id.tv_name)
    lateinit var tvName :  TextView

    @BindView(R.id.tv_congrats)
    lateinit var tvCongrats :  TextView

    @BindView(R.id.tv_scores)
    lateinit var tvScores : TextView

    @BindView(R.id.btn_finish)
    lateinit var btnFinish : Button

    @BindView(R.id.img_trophy)
    lateinit var imgTrophy : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        ButterKnife.bind(this)


        val name = intent.getStringExtra(Constants.USER_NAME)
        val scores = intent.getIntExtra(Constants.CORRECT_ANSWERS,0)
        val totalQues = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)

        if(scores < 5){
            tvName.text = "Hey! $name"
            tvCongrats.text = "You can try again"
            imgTrophy.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.lose))
        }
        else{
            tvName.text = "Hey! $name"
            tvCongrats.text = "Congratulations"
            imgTrophy.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.trophy))
        }

        tvScores.text = "Your score is $scores out of $totalQues"

        btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}