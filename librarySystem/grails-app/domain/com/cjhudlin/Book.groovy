package com.cjhudlin

class Book {
	
String title

String subject

String author

int isbn

Date dateborrowed

Date returndate

String Student

Boolean overdue

    static constraints = {

	title blank:false, nullable:false

	subject blank:false, nullable:false

	author blank:false, nullable:false

	isbn blank:false, nullable:false

    }
}
