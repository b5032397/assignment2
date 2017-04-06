package com.cjhudlin

class Book {
	
String title

String subject

String author

String isbn

Date dateborrowed

Date returndate

Student student

Boolean overdue

Library library

String toString() {
	return title
}

static hasMany=[bookreviews:BookReview]

    static constraints = {

	title blank:false, nullable:false

	subject blank:false, nullable:false

	author blank:false, nullable:false

	isbn blank:false, nullable:false

	dateborrowed blank:false, nullable:false

	student blank:false, nullable:false
	
	returndate blank:false, nullable:false

	library blank:false, nullable:false

    }
}
