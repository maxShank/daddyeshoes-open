<%-- 
    Document   : itemPage
    Created on : Jun 24, 2021, 10:03:36 AM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%--<%@page import="com.model.Item" %>--%>

<!DOCTYPE html>
<html lang="en">
    <head>

        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    </head>
    <style>
        *{

            padding: 0;
            margin: 0;
            box-sizing: border-box;
        }
        body{
            background-image: url(http://localhost:8080/webprojectv2/image/companylogo.jpg);
            background-attachment: fixed;
            background-size: cover;
            height:scale;
            width:scale;
        }
    </style>
    <body>

        <div id="wrapper">

            <div id="content">
                <h2><b>Item Information</b></h2>


                <table>

                    <tr>  
                        <th id="th">Item ID</th> 
                        <th id="th">Item Name</th>
                        <th id="th">Description</th>
                        <th id="th">Quantity</th>
                        <th id="th">Image</th>
                        <th id="th">Price RM</th>
                        <th id="th" colspan="2">ACTION</th>
                    </tr>

                    <c:forEach items="${items}" var="item">
                        <tr>
                            <td><c:out value="${item.itemid}" /></td>
                            <td><c:out value="${item.name}" /></td>
                            <td><c:out value="${item.description}" /></td>
                            <td><c:out value="${item.quantity}" /></td>
                            <td><c:out value="${item.imagesource}" /></td>
                            <td><c:out value="${item.price}" /></td> 
                            <td><button type="submit" class="button" data-toggle="modal" data-target="#edit">
                                    <a href="itemController?action=edit&itemid=<c:out value="${item.itemid}" />">Edit</a></button>&nbsp</td>
                            <td><button><a href="itemController?action=delete&itemid=<c:out value="${item.itemid}" />">Delete</a></button>&nbsp</td>   
                        </tr>
                    </c:forEach>

                </table>

                <br><br>

                <div class="modal fade" id="edit" role="dialog">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                                <h4 class="modal-title">Edit Item Information </h4>
                            </div>

                            <div class="modal-body">
                                <form id = "formEditCust" action="itemController?action=edit" method="post">
                                    <div class="form-group">
                                        <label>Item ID</label>
                                        <input type="hidden" name="itemid" value="<c:out value="${item.itemid}" />" />
                                        <input type="text"   class="form-control" name="icno" placeholder="Eg:item2" value="<c:out value="${item.itemid}" />"  />

                                    </div>
                                    <div class="form-group">
                                        <label>Name</label>
                                        <input type = "text" class="form-control" name="name" placeholder="Eg:Name" value="<c:out value="${item.name}" />" />
                                    </div>
                                    <div class="form-group">
                                        <label> Description </label>
                                        <input type="text" class="form-control" name="contact" placeholder="Eg:Black shoes" value="<c:out value="${item.description}" />"/>
                                    </div>
                                    <div class="form-group">
                                        <label>Quantity</label>
                                        <input type="num" class="form-control"  name="quantity" placeholder="Eg:4" value="<c:out value="${item.quantity}" />"/>
                                    </div>
                                    <div class="form-group">
                                        <label> Image </label>
                                        <input type="file" class="form-control" name="image"  value="<c:out value="${item.imagesource}" />"/>
                                    </div>
                                    <div class="form-group">
                                        <label>Price</label>
                                        <input type="num" class="form-control"  name="price" placeholder="Eg: 40" value="<c:out value="${item.price}" />"/>
                                    </div>

                                    <button type="submit" id="myBtn" class="btn btn-primary">Save</button>
                                </form>
                            </div>             
                        </div>
                    </div>
                </div>

                <button type="button" class="button" data-toggle="modal" data-target="#add">Add</button>
                <div class="modal fade" id="add" role="dialog">
                    <div class="modal-dialog">
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                                <h4 class="modal-title">Add Item Information </h4>
                            </div>

                            <div class="modal-body">
                                <form onsubmit="return Validate()" name="formAddItem" action="itemController" method="post">

                                    <div class="form-group">
                                        <label>Item ID</label>
                                        <input type="text" id="itemId" class="form-control" name="itemId" placeholder="Eg: item5" required/>
                                    </div>
                                    <div class="form-group">
                                        <label>Name</label>
                                        <input type = "text" id="name" class="form-control" name="name" placeholder="Eg: Name" required />
                                    </div>
                                    <div class="form-group">
                                        <label> Description</label>
                                        <input type="text" id="description" class="form-control" name="description" placeholder="Eg: Blue shoes"  required/>
                                    </div>
                                    <div class="form-group">
                                        <label>Quantity</label>
                                        <input type="num" class="form-control"  name="quantity" placeholder="Eg:4" />
                                    </div>
                                    <div class="form-group">
                                        <label> Image </label>
                                        <input type="file" class="form-control" name="image"  />
                                    </div>
                                    <div class="form-group">
                                        <label>Price</label>
                                        <input type="num" class="form-control"  name="price" placeholder="Eg: 40" />
                                    </div>

                                    <input type="hidden" name="action" value="insert" />

                                    <button type="submit" id="myBtn" class="btn btn-primary">Save</button>
                                </form>
                            </div> 

                        </div>
                    </div>
                </div>
            </div>
        </div>






</body>
</html>
