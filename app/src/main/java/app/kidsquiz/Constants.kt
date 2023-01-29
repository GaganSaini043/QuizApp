package app.kidsquiz

//Colors Data
object Constants {

    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS : String = "total_questions"
    const val CORRECT_ANSWERS : String = "correct_answers"
    const val QUIZ_TYPE : String = "quiz_type"

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
            R.drawable.orange,
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

//Fruits Data
object ConstantsFruits{

    fun getQuestions() : ArrayList<Question>{
        val questionList = ArrayList<Question>()

        //que 1
        val ques1 = Question(
            1,"What fruit is this ?",
            R.drawable.apple,
            "Apple","Banana",
            "Orange","Kiwi",
            1
        )
        questionList.add(ques1)

        //que 2
        val ques2 = Question(
            2,"What fruit is this ?",
            R.drawable.oranges,
            "Banana","Pineapple",
            "Papaya","Orange",

            4
        )
        questionList.add(ques2)

        //que 3
        val ques3 = Question(
            3,"What fruit is this ?",
            R.drawable.papaya,
            "Watermelon", "Apple",
            "Papaya","Orange",
            3
        )
        questionList.add(ques3)

        //que 4
        val ques4 = Question(
            4,"What fruit is this ?",
            R.drawable.banana,
            "Apple", "Kiwi",
            "Banana", "Strawberry",
            3
        )
        questionList.add(ques4)

        //que 5
        val ques5 = Question(
            5,"What fruit is this ?",
            R.drawable.watermelon,
            "Watermelon","Pineapple",
            "Papaya","Orange",
            1
        )
        questionList.add(ques5)

        //que 6
        val ques6 = Question(
            6,"What fruit is this ?",
            R.drawable.pineapple,
            "Banana","Apple",
            "Kiwi","Pineapple",
            4
        )
        questionList.add(ques6)

        //que 7
        val ques7 = Question(
            7,"What fruit is this ?",
            R.drawable.kiwi,
            "Kiwi","Strawberry",
            "Watermelon","Apple",
            1
        )
        questionList.add(ques7)

        //que 8
        val ques8 = Question(
            8,"What fruit is this ?",
            R.drawable.grapes,
            "Apple", "Orange",
            "Kiwi", "Grapes",
            4
        )
        questionList.add(ques8)

        //que 9
        val ques9 = Question(
            9,"What fruit is this ?",
            R.drawable.mango,
            "Orange", "Mango",
            "Banana", "Apple",
            2
        )
        questionList.add(ques9)

        //que 10
        val ques10 = Question(
            10,"What fruit is this ?",
            R.drawable.strawberry,
            "Apple",
            "Orange","Pineapple",
            "Strawberry",
            4
        )
        questionList.add(ques10)

        return questionList
    }

}

//Animals Data
object ConstantsAnimals{

    fun getQuestions() : ArrayList<Question>{
        val questionList = ArrayList<Question>()

        //que 1
        val ques1 = Question(
            1,"Which Animal is this ?",
            R.drawable.cow,
            "Cow","Cat",
            "Lion","Dog",
            1
        )
        questionList.add(ques1)

        //que 2
        val ques2 = Question(
            2,"Which Animal is this ?",
            R.drawable.cat,
            "Dog","Giraffe",
            "Zebra","Cat",

            4
        )
        questionList.add(ques2)

        //que 3
        val ques3 = Question(
            3,"Which Animal is this ?",
            R.drawable.dog,
            "Cat", "Cow",
            "Dog","Tiger",
            3
        )
        questionList.add(ques3)

        //que 4
        val ques4 = Question(
            4,"Which Animal is this ?",
            R.drawable.giraffe,
            "Deer", "Bear",
            "Giraffe", "Lion",
            3
        )
        questionList.add(ques4)

        //que 5
        val ques5 = Question(
            5,"Which Animal is this ?",
            R.drawable.bear,
            "Bear","Dog",
            "Deer","Cat",
            1
        )
        questionList.add(ques5)

        //que 6
        val ques6 = Question(
            6,"Which Animal is this ?",
            R.drawable.zebra,
            "Deer","Lion",
            "Cow","Zebra",
            4
        )
        questionList.add(ques6)

        //que 7
        val ques7 = Question(
            7,"Which Animal is this ?",
            R.drawable.monkey,
            "Monkey","Lion",
            "Cat","Dog",
            1
        )
        questionList.add(ques7)

        //que 8
        val ques8 = Question(
            8,"What fruit is this ?",
            R.drawable.camel,
            "Cat", "Cow",
            "Tiger", "Camel",
            4
        )
        questionList.add(ques8)

        //que 9
        val ques9 = Question(
            9,"What fruit is this ?",
            R.drawable.lion,
            "Cat", "Lion",
            "Dog", "Camel",
            2
        )
        questionList.add(ques9)

        //que 10
        val ques10 = Question(
            10,"Which Animal is this ?",
            R.drawable.deer,
            "Deer","Lion",
            "Cat","Dog",
            1
        )
        questionList.add(ques10)

        return questionList
    }

}


//Animals Data
object ConstantsNumbers{

    fun getQuestions() : ArrayList<Question>{
        val questionList = ArrayList<Question>()

        //que 1
        val ques1 = Question(
            1,"What Number is this ?",
            R.drawable.two,
            "Two","Four",
            "Ten","Six",
            1
        )
        questionList.add(ques1)

        //que 2
        val ques2 = Question(
            2,"What Number is this ?",
            R.drawable.four,
            "One","Ten",
            "Zero","Four",

            4
        )
        questionList.add(ques2)

        //que 3
        val ques3 = Question(
            3,"What Number is this ?",
            R.drawable.six,
            "Seven", "Ten",
            "Six","Two",
            3
        )
        questionList.add(ques3)

        //que 4
        val ques4 = Question(
            4,"What Number is this ?",
            R.drawable.one,
            "Three", "Four",
            "One", "Ten",
            3
        )
        questionList.add(ques4)

        //que 5
        val ques5 = Question(
            5,"What Number is this ?",
            R.drawable.seven,
            "Seven","Two",
            "Six","One",
            1
        )
        questionList.add(ques5)

        //que 6
        val ques6 = Question(
            6,"What Number is this ?",
            R.drawable.ten,
            "Nine","One",
            "Two","Ten",
            4
        )
        questionList.add(ques6)

        //que 7
        val ques7 = Question(
            7,"What Number is this ?",
            R.drawable.nine,
            "Nine","Five",
            "Two","Four",
            1
        )
        questionList.add(ques7)

        //que 8
        val ques8 = Question(
            8,"What Number is this ?",
            R.drawable.five,
            "One", "Six",
            "Four", "Five",
            4
        )
        questionList.add(ques8)

        //que 9
        val ques9 = Question(
            9,"What Number is this ?",
            R.drawable.three,
            "Four", "Three",
            "Eight", "One",
            2
        )
        questionList.add(ques9)

        //que 10
        val ques10 = Question(
            10,"What Number is this ?",
            R.drawable.eight,
            "Eight","Five",
            "Three","Four",
            1
        )
        questionList.add(ques10)

        return questionList
    }

}