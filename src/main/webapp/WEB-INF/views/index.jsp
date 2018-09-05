<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootswatch/4.1.3/flatly/bootstrap.min.css" />
<link rel="stylesheet" href="/styles.css" />
<title>EventHub</title>

<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
  <a class="navbar-brand" href="#"></a>
  <img src="https://s8.postimg.cc/b01di3h9x/newlogo.png" alt="" height="65" width="70">
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

<img src="https://s8.postimg.cc/4vegir6x1/header.png" alt="party">

<div class="jumbotron">
  <center>
  <h1> Choose Your artist </h1> 
  
  <form action="/display" method="get">
  
  <div class="input-group">
    <select name="name" class="custom-select" id="inputGroupSelect">
    <option selected>Choose Here</option>
    <option value="BTS">BTS</option>
    <option value="Aubrey & The Three Migos">Aubrey & The Three Migos</option>
    <option value="P!NK">P!NK</option>
    <option value="Nick Cannon">Nick Cannon</option>
    </select>
  <div class="input-group-append">
    <button class="btn btn-outline-primary" type="submit">Find Your Tickets</button>
  
	</div>
	<div class="container">

  </div>
	 </div>
	 
	 </form>
	 
	 </div>
</body>
</html>