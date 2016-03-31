package com.MainLibrary

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Student)
class StudentSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
when: "a Student has name, studentId, email"

def student=new Student(name:'Matt',
studentId: 'b3028830',
email: 'b3028830@my.shu.ac.uk')




then: "the to String method will merge them together. "

student.toString()=='Matt, b3028830, b3028830@my.shu.ac.uk'

    }
}
