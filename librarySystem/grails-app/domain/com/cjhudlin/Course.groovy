package com.cjhudlin

class Course {

String title

String code

String leader

String department

String studymode

    static constraints = {

	title blank:false, nullable:false

	code blank:false, nullable:false

	department blank:false, nullable:false

	studymode blank:false, nullable:false, maxSize:20
    }
}
