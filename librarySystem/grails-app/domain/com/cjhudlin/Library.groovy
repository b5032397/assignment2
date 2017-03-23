package com.cjhudlin

class Library {

String building

String address

String openinghours

String location

int studyspaces

static hasMany=[librarians:Librarian, books:Book, students:Student]

String toString() {
	return building
}

    static constraints = {

	building blank:false, nullable:false, maxSize:25

	address blank:false, nullable:false

	openinghours blank:false, nullable:false

	location blank:false, nullable:false

	studyspaces blank:false, nullable:false
    }
}
