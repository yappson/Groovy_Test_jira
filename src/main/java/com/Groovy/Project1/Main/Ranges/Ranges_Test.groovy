package com.Groovy.Project1.Main.Ranges

class Range {

    static void main(String[] args) {

        def x = 1..10  // Inclusive Range
        def y = 1..<10 // exclusive Range
        def z = 'a'..'z' // char range
        def s = 10..1 // desc range
        def t = 'z'..'a' // dec char range


        println x.forEach { print it + "," }
        println(y.forEach { print it + "," })
        println(z.forEach { print it + "," })
        println(s.forEach { print it + "," })
        println(t.forEach { print it + "," })

// contains() method
        def valueToCheck = 5
        println("Does x contain $valueToCheck? ${x.contains(valueToCheck)}")

        // get() method
        def indexToGet = 3
        println("Element at index $indexToGet in x: ${x.get(indexToGet)}")

        // getFrom() method
        println("Lower value of x: ${x.getFrom()}")

        // getTo() method
        println("Upper value of x: ${x.getTo()}")

        // isReverse() method
        println("Is s a reversed Range? ${s.isReverse()}")

        // size() method
        println("Size of z: ${z.size()}")

        // subList() method
        def subListStart = 2
        def subListEnd = 6
        println("Sublist of z from $subListStart to $subListEnd: ${z.subList(subListStart, subListEnd)}")

    }

}