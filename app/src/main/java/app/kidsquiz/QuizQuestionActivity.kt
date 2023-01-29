package app.kidsquiz

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.ScrollView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick

class QuizQuestionActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0
    private var mUserName : String? = null
    private var mCorrectAnswers : Int = 0
    private var mQuizType : Int  = 0

    @BindView(R.id.scrollView)
    lateinit var scrollView : ScrollView

    @BindView(R.id.progress_bar)
    @JvmField
    var progressBar: ProgressBar? = null

    @BindView(R.id.tv_progress)
    @JvmField
    var tvProgress: TextView? = null

    @BindView(R.id.tv_question)
    @JvmField
    var tvQuestion: TextView? = null

    @BindView(R.id.img_color)
    @JvmField
    var imgColor: ImageView? = null

    @BindView(R.id.tvOption1)
    @JvmField
    var tvOption1: TextView? = null

    @BindView(R.id.tvOption2)
    @JvmField
    var tvOption2: TextView? = null

    @BindView(R.id.tvOption3)
    @JvmField
    var tvOption3: TextView? = null

    @BindView(R.id.tvOption4)
    @JvmField
    var tvOption4: TextView? = null

    @BindView(R.id.btn_submit)
    @JvmField
    var btnSubmit: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

        ButterKnife.bind(this)

        mUserName = intent.getStringExtra(Constants.USER_NAME)

        mQuizType = intent.getIntExtra(Constants.QUIZ_TYPE,1)

        when(mQuizType){
            1 ->{
                mQuestionList = Constants.getQuestions()
                scrollView.background = ContextCompat.getDrawable(this,R.drawable.rainbow1)
            }
            2 ->{
                mQuestionList = ConstantsFruits.getQuestions()
                scrollView.background = ContextCompat.getDrawable(this,R.drawable.rainbow2)
            }
            3 ->{
                mQuestionList = ConstantsAnimals.getQuestions()
                scrollView.background = ContextCompat.getDrawable(this,R.drawable.rainbow1)
            }
            4 ->{
                mQuestionList = ConstantsNumbers.getQuestions()
                scrollView.background = ContextCompat.getDrawable(this,R.drawable.rainbow2)
            }
        }
        setQuestion()

    }

    private fun setQuestion() {
        defaultOptionView()
        val question: Question = mQuestionList!![mCurrentPosition - 1]
        progressBar?.progress = mCurrentPosition
        tvProgress?.text = "$mCurrentPosition / ${progressBar?.max}"
        imgColor?.setImageResource(question.image)
        tvQuestion?.text = question.question
        tvOption1?.text = question.optionOne
        tvOption2?.text = question.optionTwo
        tvOption3?.text = question.optionThree
        tvOption4?.text = question.optionFour

        tvOption1?.setOnClickListener(this)
        tvOption2?.setOnClickListener(this)
        tvOption3?.setOnClickListener(this)
        tvOption4?.setOnClickListener(this)
        btnSubmit?.setOnClickListener(this)

        if (mCurrentPosition == mQuestionList!!.size) {
            btnSubmit?.text = "FINISH"
        } else {
            btnSubmit?.text = "SUBMIT"
        }
    }

    private fun defaultOptionView() {

        tvOption1?.isClickable = true
        tvOption2?.isClickable = true
        tvOption3?.isClickable = true
        tvOption4?.isClickable = true

        val options = ArrayList<TextView>()
        tvOption1?.let {
            options.add(0, it)
        }
        tvOption2?.let {
            options.add(1, it)
        }
        tvOption3?.let {
            options.add(2, it)
        }
        tvOption4?.let {
            options.add(3, it)
        }

        for (option in options) {
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.textview_background)
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {

        defaultOptionView()
        mSelectedOptionPosition = selectedOptionNum
        tv.setTextColor(ContextCompat.getColor(this, R.color.white))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this, R.drawable.selected_option_bg)
    }

    @OnClick
    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.tvOption1 -> {
                tvOption1?.let {
                    selectedOptionView(it, 1)
                }
            }
            R.id.tvOption2 -> {
                tvOption2?.let {
                    selectedOptionView(it, 2)
                }
            }
            R.id.tvOption3 -> {
                tvOption3?.let {
                    selectedOptionView(it, 3)
                }
            }
            R.id.tvOption4 -> {
                tvOption4?.let {
                    selectedOptionView(it, 4)
                }
            }

            R.id.btn_submit -> {
                tvOption1?.isClickable = false
                tvOption2?.isClickable = false
                tvOption3?.isClickable = false
                tvOption4?.isClickable = false

                if (mSelectedOptionPosition == 0) {
                    mCurrentPosition++
                    when {
                        mCurrentPosition <= mQuestionList!!.size -> {
                        setQuestion()
                    }
                        else ->{
                    val intent  = Intent(this, ResultActivity::class.java)
                            intent.putExtra(Constants.USER_NAME,mUserName)
                            intent.putExtra(Constants.TOTAL_QUESTIONS , mQuestionList?.size)
                            intent.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                            startActivity(intent)
                            finish()
                        }
                    }
                }
                else{
                    val question = mQuestionList?.get(mCurrentPosition -1)
                    if(question!!.correctAnswer != mSelectedOptionPosition){
                        answerView(mSelectedOptionPosition , R.drawable.wrong_option_bg)
                    }
                    else{
                        mCorrectAnswers++
                    }
                    answerView(question.correctAnswer , R.drawable.correct_option_bg)

                    if(mCurrentPosition == mQuestionList!!.size){
                        btnSubmit?.text = "FINISH"
                    }
                    else{
                        btnSubmit?.text = "GO TO NEXT QUESTION"
                    }

                    mSelectedOptionPosition = 0
                }

            }
        }
    }

    private fun answerView(answer: Int, drawableView: Int) {
        when (answer) {

            1 -> {
                tvOption1?.background = ContextCompat.getDrawable(this, drawableView)
            }
            2 -> {
                tvOption2?.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 -> {
                tvOption3?.background = ContextCompat.getDrawable(this, drawableView)
            }
            4 -> {
                tvOption4?.background = ContextCompat.getDrawable(this, drawableView)
            }

        }

    }
}