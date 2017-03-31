package com.cjhudlin

class Course {

String title

String code

String leader

String department

String studymode

String description

double courseFees

double calculatecourseFees(){

4*courseFees

}

static hasMany=[students:Student]

String toString() {
	return title
}

    static constraints = {

	title blank:false, nullable:false

	code blank:false, nullable:false

	department blank:false, nullable:false

	studymode blank:false, nullable:false, maxSize:20

	description blank:false, nullable:false, maxSize:5000, widget:'textarea'

	courseFees blank:false, nullable:false

    }
}
