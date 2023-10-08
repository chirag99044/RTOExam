package rto.exam.rtoexam.models

data class Exam (
    val id: Int,
    val imgquestion: Int,
    val txtquestion: String,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctOption: Int
)