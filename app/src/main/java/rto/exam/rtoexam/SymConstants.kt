package rto.exam.rtoexam

import rto.exam.rtoexam.models.symolAnswer

object SymConstants {
    fun getQuestions(): ArrayList<symolAnswer> {
        val questionsList = ArrayList<symolAnswer>()

        val question1 = symolAnswer(
            1,
            R.drawable.all_motor_vehicles_prohibited,
            "stop",
            "start",
            "left",
            "right",
            1
        )
        questionsList.add(question1)

        val question2 = symolAnswer(
            1,
            R.drawable.width_limit,
            "height limit",
            "width limit",
            "no limit",
            "unlimited",
            2
        )
        questionsList.add(question2)

        val question3 = symolAnswer(
            1,
            R.drawable.u_turn_prohibited,
            "u turn prohibited",
            "right prohibited",
            "left prohibited",
            "no prohibited",
            1
        )
        questionsList.add(question3)

        val question4 = symolAnswer(
            1,
            R.drawable.speed_limit,
            "speed limit",
            "height limit",
            "width limit",
            "no prohibited",
            1
        )
        questionsList.add(question4)

        val question5 = symolAnswer(
            1,
            R.drawable.right_turn_prohibited,
            "right turn prohibited",
            "right prohibited",
            "left prohibited",
            "no prohibited",
            1
        )
        questionsList.add(question5)

        val question6 = symolAnswer(
            1,
            R.drawable.overtaking_prohibited,
            "speed limit",
            "right prohibited",
            "overtaking prohibited",
            "stop",
            3
        )
        questionsList.add(question6)

        val question7 = symolAnswer(
            1,
            R.drawable.no_entry,
            "stop",
            "right prohibited",
            "right",
            "no entry",
            4
        )
        questionsList.add(question7)

        val question8 = symolAnswer(
            1,
            R.drawable.one_way,
            "two way",
            "one way",
            "No way",
            "All are correct",
            2
        )
        questionsList.add(question8)

        val question9 = symolAnswer(
            1,
            R.drawable.load_limit,
            "one way s",
            "no parking or stopping",
            "load limit",
            "no prohibited",
            3
        )
        questionsList.add(question9)

        val question10 = symolAnswer(
            1,
            R.drawable.give_way,
            "give way",
            "cycle prohibited",
            "stop",
            "hand card prohibited",
            1
        )
        questionsList.add(question10)
        return questionsList
    }
}