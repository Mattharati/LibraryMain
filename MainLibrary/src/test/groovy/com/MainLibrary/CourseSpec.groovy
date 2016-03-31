package com.MainLibrary

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Course)
class CourseSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

void toString() {

when: "A Course has title, code and department"

def course=new Course(title: 'Computing',

code: 'com123',

department: 'ASEC')

then: "the to String method will merge them. "

course.toString()== 'Computing, com123, ASEC'
    }
}
