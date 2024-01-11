package com.Groovy.Project1.Main.String

class String_Test {

    public static void main(String[] args){

        String s1 = "Hello World"
        String s2  = "How Are You"
        String s3 = " This Is A String Test"

        // Concatenation
        println "_____________________"
        println "Concatenation : " + s1 + " " + s2
        println()

        // String Repetition
        println "_____________________"
        println "Repetition : "+s1*5
        println()

        // String Length
        println "_____________________"
        println "Length of a String is : "+ s1.length()
        println()

        // Center it basically provide padding
        println "_____________________"
        println " Center "+s1.center(30)
        println()



    }
}
