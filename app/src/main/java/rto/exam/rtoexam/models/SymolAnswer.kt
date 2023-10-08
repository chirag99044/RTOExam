package rto.exam.rtoexam.models

data class symolAnswer(
    val id: Int,
    val question: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctOption: Int
)