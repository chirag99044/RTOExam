package rto.exam.rtoexam

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import rto.exam.rtoexam.models.Exam
import java.io.Serializable

class ExamActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int = 1
    private var mQuestionList: ArrayList<Exam>? = null
    private var mSelectedOptionPosition: Int = 0

    private lateinit var tv_option_one: TextView
    private lateinit var tv_option_two: TextView
    private lateinit var tv_option_three: TextView
    private lateinit var tv_option_four: TextView
    private lateinit var btn_submit: Button
    private lateinit var tv_progress: TextView
    private lateinit var progressBar: ProgressBar
    private lateinit var imgtv_question: ImageView
    private lateinit var txttv_question: TextView

    private var checkSelectOption = 0

    val openOption = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exam)

        tv_option_one = findViewById(R.id.tv_option_one)
        tv_option_two = findViewById(R.id.tv_option_two)
        tv_option_three = findViewById(R.id.tv_option_three)
        tv_option_four = findViewById(R.id.tv_option_four)
        btn_submit = findViewById(R.id.btn_submit)
        imgtv_question = findViewById(R.id.imgtv_question)
        txttv_question = findViewById(R.id.txttv_question)
        tv_progress = findViewById(R.id.tv_progress)
        progressBar = findViewById(R.id.progressBar)

        mQuestionList = ExmConstants.getQuestions()
        setQuestion()

        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)
        btn_submit.setOnClickListener(this)
    }

    @SuppressLint("SetTextI18n")
    private fun setQuestion() {

        val question = mQuestionList!![mCurrentPosition - 1]

        defaultOptionsView()
        if (mCurrentPosition == mQuestionList!!.size) {
            btn_submit.text = "Finish"
        } else {
            btn_submit.text = "Submit"
        }

        progressBar.progress = mCurrentPosition
        tv_progress.text = "$mCurrentPosition" + "/" + progressBar.max

        imgtv_question.setImageResource(question.imgquestion)
        txttv_question.text = question.txtquestion
        tv_option_one.text = question.optionOne
        tv_option_two.text = question.optionTwo
        tv_option_three.text = question.optionThree
        tv_option_four.text = question.optionFour
    }

    private fun defaultOptionsView() {

        val options = ArrayList<TextView>()
        options.add(0, tv_option_one)
        options.add(1, tv_option_two)
        options.add(2, tv_option_three)
        options.add(3, tv_option_four)

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.tv_option_one -> {
                selectedOptionView(tv_option_one, 1)
                putExtra(tv_option_one)
            }
            R.id.tv_option_two -> {
                selectedOptionView(tv_option_two, 2)
                putExtra(tv_option_two)
            }
            R.id.tv_option_three -> {
                selectedOptionView(tv_option_three, 3)
                putExtra(tv_option_three)
            }
            R.id.tv_option_four -> {
                selectedOptionView(tv_option_four, 4)
                putExtra(tv_option_four)
            }

            R.id.btn_submit -> {
                if (checkSelectOption != 0) {
                    checkSelectOption = 0
                    if (mSelectedOptionPosition == 0) {
                        mCurrentPosition++

                        when {
                            mCurrentPosition <= mQuestionList!!.size -> {
                                setQuestion()
                            }
                            else -> {
                                Toast.makeText(
                                    this,
                                    "You have successfully completed the Quiz", Toast.LENGTH_SHORT
                                ).show()
                                val intent = Intent(this, ResultActivity::class.java)
                                startActivity(intent)
                            }
                        }
                    }
                }
                else {
                    Toast.makeText(this, "Please select Option", Toast.LENGTH_SHORT).show()
                }
            }
                else -> {
                    val question = mQuestionList?.get(mCurrentPosition - 1)
                    if (question!!.correctOption != mSelectedOptionPosition) {
                         answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                    }
                    answerView(question.correctOption, R.drawable.correct_option_border_bg)
                    if (mCurrentPosition == mQuestionList!!.size) {
                        btn_submit.text = "Finish"
                    } else {
                        btn_submit.text = "Go to next question"
                    }
                    mSelectedOptionPosition = 0
                }
        }
    }

    private fun putExtra(Options: TextView) {
        openOption.add(Options.text.toString())
        if (openOption.size == 10) {
            val intent = Intent(this, ResultActivity::class.java)
//            val bundle = Bundle()
//            bundle.putParcelableArrayList("StudentDetails", openOption);
            intent.putStringArrayListExtra("UserAns", openOption)
            startActivity(intent)
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int) {
       // defaultOptionsView()
        //mSelectedOptionPosition = selectedOptionNum

        if (checkSelectOption == 0) {
            checkSelectOption++
            tv.setTextColor(Color.parseColor("#363A43"))
            tv.setTypeface(tv.typeface, Typeface.BOLD)
            tv.background = ContextCompat.getDrawable(
                this,
                R.drawable.selected_option_border_bg
            )
        }
        else
            Toast.makeText(this,"Only one Option is selected At a time",Toast.LENGTH_SHORT).show()
    }

    private fun answerView(answer: Int, drawableView: Int) {
        when (answer) {
            1 -> {
                tv_option_one.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            2 -> {
                tv_option_two.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            3 -> {
                tv_option_three.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            4 -> {
                tv_option_four.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
        }
    }
}