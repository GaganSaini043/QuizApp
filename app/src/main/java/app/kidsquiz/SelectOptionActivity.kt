package app.kidsquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.LinearLayout
import android.widget.Toast
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick

class SelectOptionActivity : AppCompatActivity(), OnClickListener{

    @BindView(R.id.linear_colors)
    lateinit var linearColor : LinearLayout

    @BindView(R.id.linear_fruits)
    lateinit var linearFruits : LinearLayout

    @BindView(R.id.linear_animals)
    lateinit var linearAnimals : LinearLayout

    @BindView(R.id.linear_numbers)
    lateinit var linearNumbers : LinearLayout

    private var mUsername : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_option)

        ButterKnife.bind(this)
        linearColor.setOnClickListener(this)
        linearFruits.setOnClickListener(this)
        linearAnimals.setOnClickListener(this)
        linearNumbers.setOnClickListener(this)

        mUsername = intent.getStringExtra(Constants.USER_NAME)

    }

    override fun onClick(view: View?) {
         when(view?.id){
             R.id.linear_colors->{
                 val intent = Intent(this,QuizQuestionActivity ::class.java)
                 intent.putExtra(Constants.USER_NAME, mUsername)
                 intent.putExtra(Constants.QUIZ_TYPE,1)
                 startActivity(intent)
             }
             R.id.linear_fruits->{
                 val intent = Intent(this,QuizQuestionActivity ::class.java)
                 intent.putExtra(Constants.USER_NAME, mUsername)
                 intent.putExtra(Constants.QUIZ_TYPE,2)
                 startActivity(intent)
             }
             R.id.linear_animals->{
                 val intent = Intent(this,QuizQuestionActivity ::class.java)
                 intent.putExtra(Constants.USER_NAME, mUsername)
                 intent.putExtra(Constants.QUIZ_TYPE,3)
                 startActivity(intent)
             }
             R.id.linear_numbers->{
                 val intent = Intent(this,QuizQuestionActivity ::class.java)
                 intent.putExtra(Constants.USER_NAME, mUsername)
                 intent.putExtra(Constants.QUIZ_TYPE,4)
                 startActivity(intent)
             }
         }

    }

}