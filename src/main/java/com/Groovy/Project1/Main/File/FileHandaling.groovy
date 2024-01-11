package com.Groovy.Project1.Main.File

class FileHandaling {



    static void main(String[] args) {

        def file = new File("D:\\Groovy\\Groovy-demo\\main.txt")
        if(!file.exists()){
            file.createNewFile()
            println "file Create Susscessfully"
        }

        Thread.sleep(8000)

        def inser = new File("D:\\Groovy\\Groovy-demo\\main.txt")
        if(inser.exists()){
            inser.withWriter('utf-8'){n->n.write("welcome to groovy")}
        }

        Thread.sleep(5000)
        def f = new File("D:\\Groovy\\Groovy-demo\\main.txt")
        if(f.exists()){
            def content = file.text
            println content
        }
        Thread.sleep(5000)
        def g = new File("D:\\Groovy\\Groovy-demo\\main.txt")
        if(g.exists()){
            file.eachLine {s->println(s)}
        }
        Thread.sleep(5000)
        def append = new File("D:\\Groovy\\Groovy-demo\\main.txt")
        if(append.exists()){
            def data = "new Data to be appare in file"
            append.append(data)
            println " Data Append Success Fully"
        }

        Thread.sleep(5000)
        def clr = new File("D:\\Groovy\\Groovy-demo\\main.txt")
        if(clr.exists()){
            def data = "new Data to be clear in file"
            clr.write("hello world how are you")
            println "File clear and new data has been inserted"
        }
        /*Thread.sleep(5000)
        def del = new File("D:\\Groovy\\Groovy-demo\\main.txt")
        if(del.exists()){
            del.delete()
            println  "File Deleted SuccessFully"
        }*/
    }
}
