package com.example.letsquizzit

object Constants
{
    fun getQuestions():ArrayList<Question>
    {
        val questionList= ArrayList<Question>()

        val que1=Question(
            1,"Kotlin was developed by?","IBM","NetBeans",
            "JetBrains","Oracle",3
        )
        questionList.add(que1)

        val que2=Question(
            2,"Kotlin is a statically-typed programming language which runs on the?","JCM","JVM",
            "JPM","JDM",2
        )
        questionList.add(que2)



        val que3=Question(
            3,"____________ feature allows removing the risk of occurrence of NullPointerException in real time?","Null Risk","Null Safety",
            "Null Pointer"," All of the above",2
        )
        questionList.add(que3)

        val que4=Question(
            4,"Kotlin is interoperable with Java because it uses JVM bytecode.","Yes","No",
            "Can be yes or no","Can not say",1
        )
        questionList.add(que4)

        return questionList
    }
}