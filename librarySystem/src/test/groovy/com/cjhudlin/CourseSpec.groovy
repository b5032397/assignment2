package com.cjhudlin

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

    void courseFees() {
        when: "A course has title and fees"

	def cjhudlin=new Course(title: 'BSc Hon Computing',
		courseFees:9000)

	then: "The calculateCourseFees method will total fees"

	cjhudlin.calculatecourseFees() == 36000
    }
}
