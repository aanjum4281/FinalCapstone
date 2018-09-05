<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/flatly/bootstrap.min.css" />
<link rel="stylesheet" href="/styles.css" />
<title>EventHub</title>

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <a class="navbar-brand" href="#"></a>
  <img src="https://s8.postimg.cc/b01di3h9x/newlogo.png" alt="" height="50" width="50">
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarColor01" aria-controls="navbarColor01" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarColor01">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="/">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/favorites">Favorites</a>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="text" placeholder="Search Events">
      <button class="btn btn-secondary my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>
</head> 
</head>

<body>

<div class="jumbotron">
<img src="https://png2.kisspng.com/20180314/wle/kisspng-tourism-flat-design-computer-icons-beach-flat-views-of-the-city-vector-5aa9abc15443f4.2639112415210689933452.png" alt="" height="150" width="200">
  <hr class="my-4">
  <p>Find Your Next Experience!</p>
	</div>
	<div class="container">
 
<form action="/results" method="post">

<div class="input-group">
    <select name="genre" class="custom-select" id="inputGroupSelect">
    <option selected>Select Your Genre</option>
    <option value="1">Genre 1</option>
    <option value="2">Genre 2</option>
    <option value="2">Genre 3</option>
    </select>
  <div class="input-group-append">
    <button class="btn btn-outline-primary" type="submit">Find Your Tickets</button>
  </div>
	 </div>
</body>
</html>
