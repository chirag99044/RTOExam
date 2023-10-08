package rto.exam.rtoexam

import rto.exam.rtoexam.models.Exam
import rto.exam.rtoexam.models.QuestionAnswer


object ExmConstants {
    fun getQuestions(): ArrayList<Exam> {
        val questionsList = ArrayList<Exam>()

        val question1 = Exam(
            1,
            0,
            "Validity of learners licence ?",
            "6 day",
            "6 year",
            "6 month",
            "60 day",
            3
        )
        questionsList.add(question1)

        val question2 = Exam(
            2,
            R.drawable.stop,
            "",
            "start",
            "stop",
            "right",
            "left",
            2
        )
        questionsList.add(question2)

        val question3 = Exam(
            2,
            0,
            "On a road designated as one way ",
            "Parking is prohibited",
            "overtaking is prohibited ",
            "Should not drive in reverse gear ",
            "Non of the above",
            3
        )
        questionsList.add(question3)

        val question4 = Exam(
            2,
            0,
            "You can overtake a vehicle in front",
            "Through the right side of that vehicle ",
            "Through the left side",
            "Through the left side, if the road is wide ",
            "All are correct",
            1
        )
        questionsList.add(question4)

        val question5 = Exam(
            2,
            R.drawable.width_limit,
            "",
            "range limit",
            "No limit",
            "height limit",
            "width limit",
            4
        )
        questionsList.add(question5)

        val question6 = Exam(
            2,
            0,
            " In a road without footpath, the pedestrians ",
            "Should walk on the left side of the road ",
            "Should walk on the right side of the road",
            "May walk on either side of the road",
            "Not walk allowed",
            2
        )
        questionsList.add(question6)

        val question7 = Exam(
            2,
           0,
            "Free passage should be given to the following types of vehicles",
            "Police vehicles.",
            "Express, Super Express buses",
            "Ambulance and fire service vehicles ",
            "normal vehicles",
            3
        )
        questionsList.add(question7)

        val question8 = Exam(
            2,
            R.drawable.u_turn_prohibited,
            "",
            "u turn prohibited",
            "right prohibited",
            "left prohibited",
            "no prohibited",
            1
        )
        questionsList.add(question8)

        val question9 = Exam(
            2,
            0,
            "Driver of a vehicle may overtake ?",
            "while driving down hill",
            "If the road is sufficiently wide ",
            "anytime overtake",
            "When the driver of the vehicle in front shows the signal to overtake ",
            4
        )
        questionsList.add(question9)

        val question10 = Exam(
            2,
          0,
            "Driver of a motor vehicle shall drive through",
            "The park light shall remain lit",
            "The person having licence to drive such a vehicle should be in the drivers seat",
            "The vehicle should be locked ",
            "All are incorrect",
            1
        )
        questionsList.add(question10)

        return questionsList
    }
}