<%-- 
    Document   : item
    Created on : Jun 19, 2021, 8:37:37 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

        <title>Items</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>

        <style>

            * {
                box-sizing: border-box;
            }

            body {
                font-family: 'Roboto', sans-serif;
            }




            .header___1FxHS.fixed___3SAJN {
                position: fixed;
            }

            .header___1FxHS {
                left: 0;
                position: absolute;
                width: 100%;
                z-index: 101;
                top: 0;
                transition: transform .2s;
            }

            .header-desktop___3T36B {
                display: block;
                background-color: #000;
            }
            .glass-header-top-white___3LWiN {
                font-family: "Roboto",Helvetica, Arial, sans-serif;
                font-weight: 400;
                font-size: 11px;
                display: block;
                background: #000;
                padding: 0 20px;
                transform: translateY(0);
                will-change: transform;
                transition: transform 400ms;
                position: relative;
                z-index: 100;
                margin-left: 100px;
            }
            .glass-header-top-white___3LWiN .inner___1T3DW {
                align-items: center;
                display: flex;
                justify-content: flex-end;
                height: 32px;
                margin: 0 auto;
                width: 100%;
            }
            .glass-header-top-white___3LWiN .inner___1T3DW a {
                padding: 0 10px;
                display: flex;
                align-items: center;
                height: 100%;
                text-transform: lowercase;
                text-decoration: none;
                -webkit-font-smoothing: antialiased;
                cursor: pointer;
                color: #fff;
                font-size: 13px;
            }

            .glass-header-bottom-desktop-white___38y1Y {
                height: 48px;
                padding-top: 0;
                background-color: #000;
                color: #fff;

                transform: translateY(0);
                transition: 400ms transform;
                will-change: transform;
                position: relative;
            }
            .glass-header-bottom-desktop-white___38y1Y .inner___2IOZ- {
                max-width: none;
                padding: 0 20px;
                justify-content: space-between;
                position: relative;

            }
            .inner___2IOZ- {
                box-sizing: border-box;
                display: flex;
                height: 100%;
                max-width: 1220px;
                margin: 0 auto;
                padding: 0 16px;
                width: 100%;
            }

            .glass-header-bottom-desktop-white___38y1Y .inner___2IOZ- .main-menu___1xu8m {
                display: flex;
                padding-left: 40px;
                flex: 1;
            }
            .main-menu___1xu8m {
                flex: 1;
            }

            .glass-navigation-flyout-white___20EjX {
                display: inline-block;
                height: 45px;
                margin-top: 3px;
                background-color: #000;
                color: #fff;
                -webkit-user-select: none;
                -moz-user-select: none;
                -ms-user-select: none;
                user-select: none;
                margin-right: 20px;
                width: -webkit-max-content;
                width: -moz-max-content;
                width: max-content;
            }
            .glass-navigation-flyout-white___20EjX a.label {
                position: relative;
                letter-spacing: 1.87px;
                text-transform: uppercase;
                -webkit-font-smoothing: antialiased;
                font-family: "Roboto",Helvetica, Arial, sans-serif;
                font-weight: 400;
                font-size: 36px;
                line-height: 45px;
                margin: 0 3px;
                color: #fff;
            }
            .logo-black___30Qp_ {
                width: 50px;
                text-decoration: none;
                display: flex;
                flex-direction: row;
                flex-shrink: 0;
                align-items: center;
                background-image: url(https://i.ibb.co/MPs9fd4/logodaddy.jpg);
                background-repeat: no-repeat;
                background-position: left center;
                background-size: contain;
                transition: top .45s ease;
            }

            .row.main{
                margin-top: 80px;
            }
            .logo-black___30Qp_.big___2Azet {
                width: 70px;
                top: -15px;
                position: relative;
            }

            /*            main body*/
            /* Style the header */

            /* Container for flexboxes */
            .row {
                display: -webkit-flex;
                display: flex;
                border-style: none;
            }

            /* Create three unequal columns that sits next to each other */
            .column {
                padding: 20px;
                /* Should be removed. Only for demonstration */
            }

            /* Left and right column */
            .col-3.side {

                background-color: #3C1321;

            }

            /* Middle column */
            .col-6.middle {


            }

            /* Style the footer */
            .footer {
                background-color: #000;
                padding: 10px;
                text-align: center;
                color: #fff;
            }

            label.trackingheader{
                padding: 20px;
                text-transform: uppercase;
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

        <div class="header___1FxHS fixed___3SAJN">
            <div class="header-desktop___3T36B">
                <div class="glass-header-top-white___3LWiN">
                    <div class="inner___1T3DW">
                        <a href="<%=request.getContextPath()%>/profilereg.jsp">POPCORN_212</a>
                        <a>logout</a>
                    </div>
                </div>
                <div class="glass-header-bottom-desktop-white___38y1Y">
                    <div class="inner___2IOZ-">
                        <a class="logo-black___30Qp_ big___2Azet" href="<%=request.getContextPath()%>/item.jsp">
                        </a>
                        <div class="main-menu___1xu8m">

                            <div class="glass-navigation-flyout-white___20EjX">
                                <a href="<%=request.getContextPath()%>/item.jsp" class="label">HOMEPAGE</a>
                            </div>
                            <div class="glass-navigation-flyout-white___20EjX">
                                <a href="<%=request.getContextPath()%>/checkTracking.jsp" class="label">TRACKING</a>
                            </div>



                        </div>
                    </div>
                </div>
            </div>
        </div>


        <div class="row main">
            <div class="col-3 side"></div>
            <div class="col-6 middle" >

                <form class="d-flex justify-content-center" type="post" action="itemDAO" >
                    <table border=0 cellpadding="10" style="background-color:#e6f7ff" >
                        <thead>
                            <tr>
                                <th> Image </th>
                                <th> Name </th>
                                <th> Description </th>
                                <th> Among available </th>
                                <th> Insert wanted quantity </th>
                                <th> Price RM</th>

                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${items}" var="item">
                                <tr>
                                    <td><c:out value="${item.imagesource}" /> </td>
                                    <td><c:out value="${item.name}" /> </td>
                                    <td><c:out value="${item.description}" /> </td>
                                    <td><c:out value="${item.quantity}" /> </td>
                                    <td><input type="text" name="number" value=""/></td>
                                    <td><c:out value="${item.price}" /> </td>

                                </tr>
                            </c:forEach>
                            <tr>
                                <td>
                                    <input type="submit" value="Submit" name="submit" />
                                    <input type="reset" value="Cancel" name="cancel" />
                                </td>
                            </tr>  
                        </tbody>
                    </table>
                </form>
            </div>
            <div class="col-3 side" ></div>
        </div>


        <div class="footer">
            <p>Footer</p>
        </div>

    </body>
</html>
