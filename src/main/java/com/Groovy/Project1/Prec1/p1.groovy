
class hello {


    public static void main(String[] args){
        Student s = new Student();
        s.Name = "Ram"
        s.Contact = "123456"
        println s.Name
        println s.Contact



    }


    }

class Student implements GroovyInterceptable {
    protected dynamicProps=[:]

    void setProperty(String pName,val) {
        dynamicProps[pName] = val
    }

    def getProperty(String pName) {
        dynamicProps[pName]
    }
}
