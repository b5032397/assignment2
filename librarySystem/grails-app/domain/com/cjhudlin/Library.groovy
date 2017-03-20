package com.cjhudlin

class Library {

String building/name

String address

String openinghours

String location

int studyspaces

    static constraints = {

	building/name blank:false, nullable:false, maxSize:25

	address blank:false, nullable:false

	openinghours blank:false, nullable:false

	location blank:false, nullable:false

	studyspaces blank:false, nullable:false
    }
}
