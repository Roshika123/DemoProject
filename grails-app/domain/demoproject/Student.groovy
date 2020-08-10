package demoproject

class Student {

    String name
    String grade
    String rollNumber
    String address
    String email

    static constraints = {

        name blank: false, maxSize: 255
        grade blank: false, maxSize: 255
        rollNumber nullable: false,unique: true
        address blank: false
        email nullable: true, email: true, unique: true
    }
}
