<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>The Library System</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
	<asset:stylesheet src="home.css" />
</head>
<body>
    
    <div class="svg" role="presentation">
        <div class="grails-logo-container">
            <asset:image src="libraryhome.jpg" class="grails-logo"/>
        </div>
    </div>

    <div id="content" role="main">
        <section class="row colset-2-its">
            <h1>Welcome to the Library System</h1>

	<div class="cmngmt">
		<h3> Course Management </h3>
		<p>Add / Remove / Edit Courses</p>
		<button type="button" class="btn-success">
			<g:link controller ="course" action="create"><asset:image src="course.ico"/>  Course Management</g:link>
		</button>
	</div>

	<div class="smngmt">
		<h3> Student Enrolment </h3>
		<p>Add / Remove / Edit Student details and information</p>
		<button type="button" class="btn-success">
			<g:link controller ="student" action="create"><asset:image src="student.ico"/>  Student Enrolment</g:link>
		</button>
	</div>
	
	<div class="libngmt">
		<h3> Library Management </h3>
		<p>Add / Remove / Edit Libraries</p>
		<button type="button" class="btn-success">
			<g:link controller ="library" action="create"><asset:image src="libicon.ico"/>  Library Management</g:link>
		</button>
	</div>

	<div class="libianmngmt">
		<h3> Librarian Management </h3>
		<p>Add / Remove / Edit Librarian details and information</p>
		<button type="button" class="btn-success">
			<g:link controller ="librarian" action="create"><asset:image src="librarianicon.ico"/>  Librarian Management</g:link>
		</button>
	</div>

	<div class="bmngmt">
		<h3> Book Rental Management </h3>
		<p>Add / Remove / Edit Book rental information</p>
		<button type="button" class="btn-success">
			<g:link controller ="book" action="create"><asset:image src="rent.ico"/>  Book Rental</g:link>
		</button>
	</div>

	<div class="brmngmt">
		<h3> Book Reviews </h3>
		<p>Add a book review</p>
		<button type="button" class="btn-success">
			<g:link controller ="bookReview" action="create"><asset:image src="rev.ico"/>  Book Reviews</g:link>
		</button>
	</div>

        </section>
    </div>

</body>
</html>
