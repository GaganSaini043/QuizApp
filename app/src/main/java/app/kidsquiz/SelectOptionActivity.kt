package app.kidsquiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.LinearLayout
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_option)

        ButterKnife.bind(this)
        linearColor.setOnClickListener(this)
        linearFruits.setOnClickListener(this)
        linearAnimals.setOnClickListener(this)
        linearNumbers.setOnClickListener(this)


    }

    override fun onClick(view: View?) {
         when(view?.id){
             R.id.linear_colors->{
                 val intent = Intent(this,QuizQuestionActivity ::class.java)
                 intent.putExtra(Constants.USER_NAME, intent.getStringExtra(Constants.USER_NAME))
                 startActivity(intent)
             }
             R.id.linear_fruits->{
                 val intent = Intent(this,QuizQuestionActivity ::class.java)
                 intent.putExtra(Constants.USER_NAME, intent.getStringExtra(Constants.USER_NAME))
                 startActivity(intent)
             }
             R.id.linear_animals->{
                 val intent = Intent(this,QuizQuestionActivity ::class.java)
                 intent.putExtra(Constants.USER_NAME, intent.getStringExtra(Constants.USER_NAME))
                 startActivity(intent)
             }
             R.id.linear_numbers->{
                 val intent = Intent(this,QuizQuestionActivity ::class.java)
                 intent.putExtra(Constants.USER_NAME, intent.getStringExtra(Constants.USER_NAME))
                 startActivity(intent)
             }
         }

    }

}