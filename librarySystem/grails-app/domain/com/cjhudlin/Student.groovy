package com.cjhudlin

class Student {
	
String name

String email

String userName

String password

int studentid

Course course

static hasMany=[books:Book, bookreviews:BookReview]

String toString() {
	return studentid
}

    static constraints = {

	name blank:false, nullable:false

	email blank:false, nullable:false, email:true

	userName blank:false, nullable:false

	password blank:false, nullable:false, password:true

	studentid blank:false, nullable:false

	course blank:false, nullable:false
    }
}
