package com.cjhudlin

class Book {
	
String title

String subject

String author

int isbn

Date dateborrowed

Date returndate

Student student

Boolean overdue

String toString() {
	return title
}

static hasMany=[bookreviews:BookReview]

    static constraints = {

	title blank:false, nullable:false

	subject blank:false, nullable:false

	author blank:false, nullable:false

	isbn blank:false, nullable:false

	dateborrowed blank:true, nullable:true

	student blank:false, nullable:false
	
	returndate blank:true, nullable:true

    }
}
