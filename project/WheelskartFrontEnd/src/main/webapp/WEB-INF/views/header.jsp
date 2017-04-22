<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script type="text/javascript">

</script>
<style type="text/css">

@import url("//cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css");

html, body {
    height: 100%;
}
body {    
    padding-top: 75px;
}
body.navbar-more-show  {
	overflow: hidden;
}

.animate {
    -webkit-transition: all 0.3s ease-in-out;
	-moz-transition: all 0.3s ease-in-out;
	-o-transition: all 0.3s ease-in-out;
	-ms-transition: all 0.3s ease-in-out;
	transition: all 0.3s ease-in-out;
}
.navbar {
    height: calc(100%);
	max-height: 300px;
	-webkit-transform: translate(0px, calc(-100% + 69px));
	transform: translate(0px, calc(-100% + 69px));
}
.navbar .container:not(.navbar-more) {
    padding: 0px;
}
.navbar-more-overlay {
	background-color: rgba(102, 102, 102, 0.55);
	display: none;
	height: 100%;
	left: 0px;
	position: fixed;
	top: 0px;
	width: 100%;
	z-index: 1029;
}
.navbar-more-show > .navbar-more-overlay {
	display: block;
}
.navbar-more-show > .navbar {
	-webkit-transform: translate(0px, 0px);
	transform: translate(0px, 0px);
}
.navbar-nav.mobile-bar {
	list-style: none;
	-ms-box-orient: horizontal;
	display: -webkit-box;
	display: -moz-box;
	display: -ms-flexbox;
	display: -moz-flex;
	display: -webkit-flex;
	display: flex;
	-webkit-justify-content: space-around;
	justify-content: space-around;
	-webkit-flex-flow: row wrap;
	flex-flow: row wrap;
	-webkit-align-items: stretch;
	align-items: stretch;
	margin: 0px 0px;
}
.navbar-nav.mobile-bar > li {
	-webkit-flex-grow: 1;
	flex-grow: 1;
	text-align: center;
}
.navbar-nav.mobile-bar > li > a > span.menu-icon {
	display: block;
	font-size: 1.8em;
}
.navbar-more {
	background-color: rgb(255, 255, 255);
	height: calc(100% - 69px);
	overflow: auto;
}
.navbar-more .navbar-form {
	border-width: 0px;
}
.navbar-more .navbar-nav > li > a {
    color: rgb(64, 64, 64);   
}
.navbar-more > .navbar-nav > li > a > span.menu-icon {
	margin-left: 10px;
	margin-right: 10px;
}

@media (min-width: 768px) {
	.navbar {
        height: auto;
		-webkit-transform: translate(0px, 0px);
		transform: translate(0px, 0px);
	}
	.navbar-nav.mobile-bar {
		display: block;
		max-height: 64px;
		margin: 0px -15px;
	}
	.navbar-nav.mobile-bar > li > a > span.menu-icon {
		display: none;
	}
}
</style>
<title>Insert title here</title>
</head>
<body>
This is a header

</body>
</html>