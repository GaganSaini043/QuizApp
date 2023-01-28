package app.kidsquiz

object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"

    fun getQuestions() : ArrayList<Question>{
        val questionList = ArrayList<Question>()

        //que 1
        val ques1 = Question(
            1,"What is this Color ?",
            R.drawable.blue,
            "Green","Red",
            "Blue","Black",
            3
        )
        questionList.add(ques1)

        //que 2
        val ques2 = Question(
            2,"What is this Color ?",
            R.drawable.green,
            "Blue","Green",
            "Black","Red",

            2
        )
        questionList.add(ques2)

        //que 3
        val ques3 = Question(
            3,"What is this Color ?",
            R.drawable.red,
            "Red", "Blue",
            "Black","Green",
            1
        )
        questionList.add(ques3)

        //que 4
        val ques4 = Question(
            4,"What is this Color ?",
            R.drawable.black,
            "Blue", "Green",
            "Red", "Black",
            4
        )
        questionList.add(ques4)

        //que 5
        val ques5 = Question(
            5,"What is this Color ?",
            R.drawable.yellow,
            "Green","Red",
            "Yellow","Black",
            3
        )
        questionList.add(ques5)

        //que 6
        val ques6 = Question(
            6,"What is this Color ?",
            R.drawable.white,
            "White","Red",
            "Blue","Black",
            1
        )
        questionList.add(ques6)

        //que 7
        val ques7 = Question(
            7,"What is this Color ?",
            R.drawable.gray,
            "Green","Red",
            "Blue","Gray",
            4
        )
        questionList.add(ques7)

        //que 8
        val ques8 = Question(
            8,"What is this Color ?",
            R.drawable.oranges,
           "Red",
            "Orange","Black",
            "Green",
            2
        )
        questionList.add(ques8)

        //que 9
        val ques9 = Question(
            9,"What is this Color ?",
            R.drawable.brown,
            "Orange",
            "Green","Brown",
            "Black",
            3
        )
        questionList.add(ques9)

        //que 10
        val ques10 = Question(
            10,"What is this Color ?",
            R.drawable.purple,
            "Purple",
            "Green","Brown",
            "Orange",
            1
        )
        questionList.add(ques10)

        //que 11
        val ques11 = Question(
            11,"What is this Color ?",
            R.drawable.pink,
            "Brown",
            "Orange","Purple",
            "Pink",
            4
        )
        questionList.add(ques11)

        return questionList
    }
}