<%-- 
    Document   : reg
    Created on : Jun 19, 2021, 11:02:21 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>

   <title>Daddy e-shoes registration form</title>

     <style>
      *{

        padding: 0;
        margin: 0;
        box-sizing: border-box;
      }
      body{
        background-image: url(https://i.ibb.co/5ntCN07/shoes3.jpg);
        background-attachment: fixed;
        background-size: cover;
        font-family: new time roman;

      }
      h1{
        font-size: 40px;
        color: white;
        margin-top: 20px;
        margin-bottom: 30px;
      }
       h3{
        font-size: 30px;
        color: white;
        margin-top: 10px;
        margin-bottom: 20px;
      }
     
      .label{
        font-size: 19px;
        margin-top: 20px;
        font-weight: normal;
        

      }
      .form-control{
       background: rgba(0,0,0,0.2);
       border: 0px;
       border-radius: 0px;
       border-bottom: 2px solid white;
       font-size: 15px;
       color: white;
       margin-top: 10px;

      }
      
      .btn-info{
        margin-right: 200px;
        margin-left: 200px;
        margin-top: 20px;
        width: 180px;
        font-size: 19px;
        border-radius: 1000px;
        color: darkolivegreen;
      }
      .col-md-6{
        background: rgba(0, 0, 0,0.5);
        height: 900px;
        box-shadow: 1px 1px 60px 10px chocolate;
      }
      .col-md-3{
        color: white;
      }
     
  </style>
  </head>
        <br>
        <p><b></b></p>
        <form name="frmAddreg" action="regController" method="POST">
              <div class="container">
        <div class="row">
           <div class="col-md-3"></div>
          <div class="col-md-6">
            <h1 class="text-center">Register form</h1>
             <h3 class="text-center">Welcome!</h3>
              <label class="label col-md-3 control-label">Username</label>
                  <div class="col-md-9">
                      <input type="text" class="form-control" name ="username" placeholder="username" id="username">
                  </div>
              <label class="label col-md-3 control-label">Name</label>
                  <div class="col-md-9">
                    <input type="text" class="form-control" name ="name" placeholder="name" id="name">
                  </div>
               <label class="label col-md-3 control-label">Password</label>
                  <div class="col-md-9">
                    <input type="password" class="form-control" name ="password" placeholder="password" id="password">
                    <small> password must be 8 characters</small>
                  </div>
               <label class="label col-md-3 control-label">Phone number</label>
                  <div class="col-md-9">
                    <input type="text" class="form-control" name ="phonenumber" placeholder="phonenumber" id="phonenumber">
                  </div>
              <label class="label col-md-3 control-label">E-mail</label>
                  <div class="col-md-9">
                    <input type="email" class="form-control" name ="email" placeholder="email" id="email">
                  </div>   
                <label class="label col-md-3 control-label">Address</label>
                  <div class="col-md-9">
                    <input type="text" class="form-control" name ="address" placeholder="address" id="address">
                  </div>  
                
                
                
                    <fieldset class="form-group">
                        <label><input type="hidden" name="actionreg" value="insertreg" /></label>
                    </fieldset> 
                    <input type="submit" class="btn-info" value="Submit" name="submit"/>
                    <input type="reset"™ class="btn-info" value="Cancel" name="cancel" />
              </div>               
            </div>
        </div>      
        </form>
    </body>
</html>

