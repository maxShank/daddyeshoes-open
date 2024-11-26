<%-- 
    Document   : addTracking
    Created on : 18 Jun 2021, 12:18:51 pm
    Author     : Name: Mohammad Alif Akhbar Bin Mohd Nizam
 Program: SMSK with IM
 Course: CSF3104
 Lab: 
 Date:

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        
        
        <title>Adding Tracking....</title>

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
                        <a class="logo-black___30Qp_ big___2Azet" href="#">
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
            <div class="col-6">

                <c:if test="${tracking != null}">
                    <form  action="update" method="post">
                    </c:if>

                    <c:if test="${tracking == null}">
                        <form   action="insert" method="post">
                        </c:if>

                        <table border="0">
                            <tbody>

                                <c:if test="${tracking != null}">
                                <input type="text" name="id"  readonly value="<c:out value='${tracking.id}' />" />
                            </c:if>
                            <c:if test="${tracking == null}">

                                <tr>
                                    <td>Product ID: </td>
                                    <td><input type="text" name="productid" value="<c:out value='${product.id}'/>" size="40"></td>
                                </tr>

                                <tr>
                                    <td>Is ready to checkout.</td>
                                    <td><input type="hidden" name="status" value="Order Received" size="40"></td>
                                </tr> 

                                <tr>

                                    <td><input type="hidden" name="location" value="Not Available" size="40"></td>
                                </tr> 



                            </c:if>
                            <c:if test="${tracking != null}">


                                <tr>
                                    <td>Status: </td>
                                    <td><input type="text" name="status" value="<c:out value='${tracking.status}' />" size="40"></td>
                                </tr> 

                                <tr>
                                    <td>Location: </td>
                                    <td><input type="text" name="location" value="<c:out value='${tracking.location}' />" size="40"></td>
                                </tr> 

                                <tr>

                                </c:if>


                            <tr>

                                <td><input type="hidden" name="date" value="<%= (new java.sql.Date(System.currentTimeMillis()).toString())%>" size="40"></td>
                            </tr> 




                            <tr>
                                <td>
                                    <input class="btn btn-dark" type="submit" name="submit" value="Submit">
                                </td>
                            </tr>                     
                            </tbody>

                        </table>

                    </form>

            </div>
            <div class="col-3 side"></div>
        </div>



        <script type="text/javascript">
            function numberOnly() {

            }
        </script>









        <div class="footer">
            <p>&copy daddy-e-shoes</p>
        </div>

    </body>
</html>
