package com.MainLibrary

class Library {

 String location

 String openingHours

 String book

 String student

 Librarian librarian

 String toString(){"$location, $librarian, $openingHours"}

    static constraints = {

location()

openingHours()

book()

student()

librarian()
    }
}
