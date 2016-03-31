package com.MainLibrary

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Librarian)
class LibrarianSpec extends Specification {

void toString() {

when: "A librarian has name, email and telephone"

def librarian=new Librarian(name: 'jeff',

email: 'jeff@hotmail.co.uk',

telephone: '01147654321')

then: "the to String method will merge them. "

librarian.toString()== 'jeff, jeff@hotmail.co.uk, 01147654321'
    }
}
