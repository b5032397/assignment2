package com.cjhudlin

class BookReview {

String book

Date datecreated

String student

String review

    static constraints = {

	book blank:false, nullable:false

	datecreated blank:false, nullable:false

	student blank:false, nullable:false

	review blank:false, nullable:false
    }
}
