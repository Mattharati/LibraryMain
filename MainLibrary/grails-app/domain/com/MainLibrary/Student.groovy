package com.MainLibrary

class Student {

String name

String email

String studentId

Course course

String toString(){"$name, $studentId, $email"}

    static constraints = {

name()

email()

studentId()

course()

    }
}
