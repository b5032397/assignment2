package com.cjhudlin

class BookReview {

Book book

Date datecreated

Student student

String review

String toString() {
	return review
}

    static constraints = {

	book blank:false, nullable:false

	datecreated blank:false, nullable:false

	student blank:false, nullable:false

	review blank:false, nullable:false, maxSize:5000, widget:'textarea'
    }
}
