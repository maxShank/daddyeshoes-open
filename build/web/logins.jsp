<%-- 
    Document   : login
    Created on : Jun 19, 2021, 10:53:02 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" language="java"%>
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

    
        <title>Daddy e-shoes</title>
    <style>
      *{

        padding: 0;
        margin: 0;
        box-sizing: border-box;
      }
      body{
        background-image: url(https://i.ibb.co/rc59YVn/shoes21.jpg);
        background-attachment: fixed;
        background-size: cover;

      }
      .row{
        background: transparent;
        border-radius: 3px;
        box-shadow: 12px 12px 22px 12px chocolate;
        color: whitesmoke;
      }
     
      img{
        border-top-left-radius: 8px;
        border-bottom-left-radius: 8px;

      }
      .btn1{
        border: none;
        outline: none;
        height: 50px;
        width: 100%;
        background-color: black;
        color: white;
        border-radius: 4px;
        font-weight: bold;
      }
      .btn1:hover{
        background: chocolate;
        border: 1px solid;
        color: black;

      }
    </style>
  </head>
  
    
    <body>
       
        <br>
        <div class="container col-md-5">
            <div class="row">
                <div class="card-body"> 
                    <form name="frmPageLogin" action="regController" method="POST">
                        <h1 class="text-center">Daddy's e-shoes</h1>
                        <h4 class="text-center">"masculine with style"</h4>
                        <br></br>
                    <div class="form-group">
                  <div class="col-log-7">
                    <input type="username" name="username" placeholder="Username" class="form-control my-2 p-3">
                  </div>
              </div>
              <div class="form-group">
                  <div class="col-log-7">
                    <input type="password" name="password" placeholder="Password" class="form-control my-2 p-3">
                  </div>
              </div><input type="hidden" name="actionreg" value="loginreg">
                        <input type="submit" class="btn1" value="submit" name="submit">
                  
                  <fieldset class="form-group">
                        <label>You are new  user?<a href="reg.jsp" >Create a new account</a></label>         
                    </fieldset>
              
            </form>
          </div>    
        </div>
      </div>
    </body>
                
                 
                    <%
                        String username=(String)session.getAttribute("username");
        
                        //redirect user to home page if already logged in
                        if(username!=null){
                           response.sendRedirect("main.jsp");
                    }
 
                        String status=request.getParameter("status");
                        
                        
                        if(status!=null){
                            if(status.equals("false")){
                                out.print("Incorrect login details!");           
                     }
                         else{
                             out.print("Some error occurred!");
                     }
                    }
                    %>
                </div>               
            </div>
        </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.min.js" integrity="sha384-Atwg2Pkwv9vp0ygtn1JAojH0nYbwNJLPhwyoVbhoPwBhjQPR5VtM2+xf0Uwh9KtT" crossorigin="anonymous"></script>
    
</html>
