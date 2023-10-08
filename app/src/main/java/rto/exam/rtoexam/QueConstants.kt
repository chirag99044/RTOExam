package rto.exam.rtoexam

import rto.exam.rtoexam.models.QuestionAnswer

object QueConstants {
    fun getQuestions(): ArrayList<QuestionAnswer> {
        val questionsList = ArrayList<QuestionAnswer>()

        val question1 = QuestionAnswer(
            1,
            "Driver of a motor vehicle shall drive through",
            "The right side of the road",
            "The left side of the road ",
            "The Center of the road",
            "All of the above",
            2
        )
        questionsList.add(question1)

        val question2 = QuestionAnswer(
            1,
            "When a Vehicle is parked on the road side during night",
            "The vehicle should be locked",
            "The person having licence to drive such a vehicle should be in the drivers seat",
            "The park light shall remain lit ",
            "Non of the above",
            3
        )
        questionsList.add(question2)

        val question3 = QuestionAnswer(
            1,
            "Fog lamps are used ",
            "During night.",
            "When the opposite vehicle is not using dim light \n",
            "1,2 both correct",
            "When there is mist. ",
            4
        )
        questionsList.add(question3)

        val question4 = QuestionAnswer(
            1,
            " Zebra lines are meant for..",
            "stopping vehicle.",
            "pedestrians crossing ",
            "for giving preference to vehicle ",
            "Roads on both sides ahead",
            2
        )
        questionsList.add(question4)

        val question5 = QuestionAnswer(
            1,
            "When an ambulance is approaching ..",
            "no preference need be given.",
            "allow passage if there are no vehicles from front side.",
            "the driver shall allow free passage by drawing to the side of the road",
            "Narrow bridge ahead ",
            3
        )
        questionsList.add(question5)

        val question6 = QuestionAnswer(
            1,
            " Red traffic light indicates .. ",
            "no preference need be given.",
            "slow down.",
            "vehicle can proceed with caution",
            "stop the vehicle",
            4
        )
        questionsList.add(question6)

        val question7 = QuestionAnswer(
            1,
            "Parking a vehicle in front of entrance to hospital",
            "Proper",
            "Proper if NO PARKING sign is not provided ",
            "Improper",
            "proper and improper both",
            3
        )
        questionsList.add(question7)

        val question8 = QuestionAnswer(
            1,
            "Where the slippery road sign is seen on the road, the driver shall",
            "reduce the speed by changing the gear",
            "apply brake ",
            "proceed in the same speed ",
            "stop vehicle",
            1
        )
        questionsList.add(question8)

        val question9 = QuestionAnswer(
            1,
            "Overtaking is prohibited in following circumstances",
            "during day",
            "during night",
            "when the vehicle in front is reducing speed ",
            "when it is likely to cause inconvenience or danger to other traffic ",
            4
        )
        questionsList.add(question9)

        val question10 = QuestionAnswer(
            1,
            " Overtaking when approaching a bend",
            "is permissible ",
            "not permissible",
            "is permissible with care",
            "both A and B",
            2
        )
        questionsList.add(question10)
        return questionsList
    }
}