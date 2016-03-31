package com.MainLibrary

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Library)
class LibrarySpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void toString() {
when: "a Library has location, librarian, openingHours"

def library=new Library(location:'Sheffield',
librarian: 'Jeff',
openingHours: '24/7')




then: "the to String method will merge them together. "

library.toString()=='Sheffield, Jeff, 24/7'

    }
}
