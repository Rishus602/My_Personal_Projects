<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
    <meta name="viewport"
        content="width=device-width, initial-scale=1">
    <!-- Bootstrap CSS library -->
    <!-- <link rel="stylesheet" href=
"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity=
"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
        crossorigin="anonymous"> -->





        <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Josefin+Sans:ital,wght@0,600;1,300&display=swap" rel="stylesheet">
    



    <link rel="stylesheet" href="CSS/style.css">


    <title>Website</title>

    <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
  
</head>
<body>

<?php  include 'menu.php';  ?>

<!-- -------------------------------------------------- -->


<div id="demo" class="carousel slide" data-ride="carousel">

  <!-- Indicators -->
  <ul class="carousel-indicators">
    <li data-target="#demo" data-slide-to="0" class="active"></li>
    <li data-target="#demo" data-slide-to="1"></li>
    <li data-target="#demo" data-slide-to="2"></li>
  </ul>
  
  <!-- The slideshow -->
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="Images/image_1.jpg" alt="Los Angeles" width="1100" height="500">
    </div>
    <div class="carousel-item">
      <img src="Images/image_2.jpg" alt="Chicago" width="1100" height="500">
    </div>
    <div class="carousel-item">
      <img src="Images/image_3.jpg" alt="New York" width="1100" height="500">
    </div>
  </div>
  
  <!-- Left and right controls -->
  <a class="carousel-control-prev" href="#demo" data-slide="prev">
    <span class="carousel-control-prev-icon"></span>
  </a>
  <a class="carousel-control-next" href="#demo" data-slide="next">
    <span class="carousel-control-next-icon"></span>
  </a>
</div>


<section class= "my-5">
    <div class="py-5">
        <h2 class="text-center">About Us</h2>
    </div>
<div class = "container-fluid">
    <div class = "row">
        <div class="col-lg-6 col-md-6 col-12">
            <img src="Images/image_4.jpg" class = "img-fluid aboutimg">
        </div>

        <div class="col-lg-6 col-md-6 col-12">
            <h2 class="display-4">We Are the Team</h2>
            <p class = "py-3">Lorem ipsum dolor sit amet consectetur adipisicing elit. Ratione suscipit esse totam voluptate quidem, accusantium ab deserunt, corporis fugit ullam iste numquam optio hic in. Aut nisi deleniti aliquam porro.</p>
            <a href = "about.php" class = "btn btn-success">  wanna know about us </a>
        </div>
</div>
</div>
</section>


<section class= "my-5">
    <div class="py-5">
        <h2 class="text-center">Our Services</h2>
    </div>

    <div class="container-fluid">
        <div class="row">
            <div class="col-lg-4 col-md-4 col-12">
            <div class="card" >
  <img class="card-img-top" src="Images/image_12.jpg" alt="Card image">
  <div class="card-body">
    <h4 class="card-title">Parikh Mahajan</h4>
    <p class="card-text">Web Developer</p>
    <a href="https://www.instagram.com/__parikh__/" class="btn btn-primary" target="_blank">See Profile</a>
  </div>
</div>
</div>


<div class="col-lg-4 col-md-4 col-12">
            <div class="card" >
  <img class="card-img-top" src="Images/image_1.jpg" alt="Card image">
  <div class="card-body">
    <h4 class="card-title">Neelanchal Saini</h4>
    <p class="card-text">Content Developer</p>
    <a href="https://www.instagram.com/i_am_neelanchalsaini/" class="btn btn-primary" target="_blank">See Profile</a>
  </div>
</div>
</div>

<div class="col-lg-4 col-md-4 col-12">
            <div class="card" >
  <img class="card-img-top" src="Images/image_3.jpg" alt="Card image">
  <div class="card-body">
    <h4 class="card-title">Taksh</h4>
    <p class="card-text">Frontend Developer</p>
    <a href="#" class="btn btn-primary">See Profile</a>
  </div>
</div>
            </div>
        </div>
</div>

</section>


<section class= "my-5">
    <div class="py-5">
        <h2 class="text-center">Our Galary</h2>

</div>
<div class= " container-fluid">
    <div class="row">
    <div class="col-lg-4 col-md-4 col-12">
            <img src="Images/image_5.jpg" class = "img-fluid pb-4">
        </div>
        <div class="col-lg-4 col-md-4 col-12">
            <img src="Images/image_6.jpg" class = "img-fluid pb-4">
        </div>
        <div class="col-lg-4 col-md-4 col-12">
            <img src="Images/image_7.jpg" class = "img-fluid pb-4">
        </div>
        <div class="col-lg-4 col-md-4 col-12">
            <img src="Images/image_3.jpg" class = "img-fluid pb-4">
        </div>
        <div class="col-lg-4 col-md-4 col-12">
            <img src="Images/image_4.jpg" class = "img-fluid pb-4">
        </div>
        <div class="col-lg-4 col-md-4 col-12">
            <img src="Images/image_1.jpg" class = "img-fluid pb-4">
        </div>
        <div class="col-lg-4 col-md-4 col-12">
            <img src="Images/image_2.jpg" class = "img-fluid pb-4">
        </div>
        <div class="col-lg-4 col-md-4 col-12">
            <img src="Images/image_12.jpg" class = "img-fluid pb-4">
        </div>    
        <div class="col-lg-4 col-md-4 col-12">
            <img src="Images/image_13.jpg" class = "img-fluid pb-4">
        </div>
</div>
</div>


</section>


<section class= "my-5">
    <div class="py-5">
        <h2 class="text-center">Contact Us</h2>
</div>


<div class="w-50 m-auto ">
    <form action="userinfo.php" method="post">
        <div class="form-group">
            <label>Username</label>
            <input type = "text" name= "user" autocomplete="off" class="form-control">
</div>

<div class="form-group">
            <label>Email Id</label>
            <input type = "email" name= "email" autocomplete="off" class="form-control">
</div>

<div class="form-group">
            <label>Mobile</label>
            <input type = "number" name= "mobile" autocomplete="off" class="form-control">
</div>

<div class="form-group">
            <label>Comments</label>
            <textarea class= "form-control" name = "comments">
</textarea>
</div>


<button type="submit" class="btn btn-success">Submit</button>
</section>


<footer>
    <p class="p-3 bg-dark text-white text-center"> @webPortal </p>

</footer>

<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>



  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>


  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>