<%-- 
    Document   : adminindex
    Created on : Jul 23, 2017, 8:02:04 PM
    Author     : Rafif
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.program.models.LaundryModel"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="../../favicon.ico">

        <title>Dashboard Admin</title>

        <!-- Bootstrap core CSS -->
        <link href="/SpringWebMVC/assets/bs4allpa/css/bootstrap.css" rel="stylesheet">
        <link rel="stylesheet" href="/SpringWebMVC/assets/font-awesome/css/font-awesome.css">
        <link href="/SpringWebMVC/assets/css/dashboard.css" rel="stylesheet">


    </head>

    <body>
        <nav class="navbar navbar-toggleable-md navbar-inverse fixed-top bg-inverse">
            <button class="navbar-toggler navbar-toggler-right hidden-lg-up" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <a class="navbar-brand" href="#">Dashboard</a>

           
        </nav>

        <div class="container-fluid">
            <div class="row">
                <nav class="col-sm-3 col-md-2 hidden-xs-down bg-faded sidebar">
                    <ul class="nav nav-pills flex-column">
                        <li class="nav-item">
                            <a class="nav-link active" href="#">Jobs <span class="sr-only">(current)</span></a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Sedang Di kerjakan</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Done List</a>
                        </li>
                        
                    </ul>

                    <ul class="nav nav-pills flex-column">
                        
                        <li class="nav-item">
                            <a class="nav-link" href="/SpringWebMVC/adminlogin/_out">Log Out</a>
                        </li>
                    </ul>
                </nav>

                <main class="col-sm-9 offset-sm-3 col-md-10 offset-md-2 pt-3">
                    <h1>Dashboard</h1>


                    <h2>Section title</h2>
                    <div class="table-responsive">
                        <table class="table table-striped">
                            <thead>
                                <tr>
                                    <th>id </th>
                                    <th>id laundry</th>
                                    <th>id pelanggan</th>
                                    <th>id jenis jasa</th>
                                    <th>status</th>
                                    <th>action</th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:set var="item" value="${laundry}"/>
                                    <%
                                        ArrayList<LaundryModel> dataList = (ArrayList<LaundryModel>) pageContext.getAttribute("item");
                                        if(dataList == null){
                                    %> 
                                    <tr>
                                        <td>-</td>
                                        <td>-</td>
                                        <td>-</td>
                                        <td>-</td>
                                        <td>-</td>
                                    </tr>
                                <% } else { 
                                   for (LaundryModel model0 : dataList) {
                                       
                                  %>
                                    <tr>
                                        <td><%= model0.getId() %></td>
                                        <td><%= model0.getId_laundry() %></td>
                                        <td><%= model0.getId_pelanggan() %></td>
                                        <td><%= model0.getId_jenisjasa() %></td>
                                        <td><%= model0.getStatus() %></td>
                                        <td>button</td>
                                    </tr>
                                    <% }
                                   
                                        }%>
                                </tbody>
                            </table>
                        </div>
                    </main>
                </div>
            </div>

            <!-- Bootstrap core JavaScript
            ================================================== -->
            <!-- Placed at the end of the document so the pages load faster -->
            <script src="/SpringWebMVC/assets/js/jquery-3.2.1.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
            <script src="/SpringWebMVC/assets/js/theter.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
            <script src="/SpringWebMVC/assets/bs4allpa/js/bootstrap.min.js"></script>
        </body>
    </html>

