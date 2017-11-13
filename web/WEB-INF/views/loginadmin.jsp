<%-- 
    Document   : loginadmin
    Created on : Jul 23, 2017, 12:54:36 PM
    Author     : Rafif
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <link rel="icon" href="../../favicon.ico">

        <title>Admin Login</title>

        <link rel="stylesheet" href="/SpringWebMVC/assets/font-awesome/css/font-awesome.css">
        <link href="/SpringWebMVC/assets/bs4allpa/css/bootstrap.css" rel="stylesheet">
        <link rel="stylesheet" href="/SpringWebMVC/assets/font-awesome/css/font-awesome.css">
        <link href="/SpringWebMVC/assets/css/sign.css" rel="stylesheet">
        <link href="/SpringWebMVC/assets/css/cover2.css" rel="stylesheet">
    </head>

    <body>

        <div class="site-wrapper">
            <div class="site-wrapper-inner">
                <div class="cover-container">


                    <div class="inner cover">
                        <form class="form-signin" method="post" action="">
                            <h2 class="form-signin-heading"><i class="fa fa-user-secret fa-lg" aria-hidden="true"></i>
                                Admin or Employee Only</h2>
                            <label for="inputEmail" class="sr-only">username</label>
                            <input type="text" name="username_p" class="form-control" placeholder="username" required autofocus>
                            <label for="inputPassword" class="sr-only">Password</label>
                            <input type="password" name="password_p" id="inputPassword" class="form-control" placeholder="Password" required>
                            <div class="checkbox">
                                <label>
                                    Don't Have Account <a href="/SpringWebMVC/addAdmin">Contact Manager</a>
                                </label>
                            </div>
                            <button class="btn btn-lg btn-outline-primary btn-secondaary" type="submit">Sign in</button>
                        </form>
                    </div>

                    <div class="mastfoot">
                        <div class="inner">
                            <p>Copy Right Reserved <a href="#">Aditya A. Rafif</a>, Powered by <a href="#">bootstrap 4 alpha </a>.</p>
                        </div>
                    </div>

                </div>

            </div>

        </div>

        <!-- Bootstrap core JavaScript
        ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="/SpringWebMVC/assets/js/jquery-3.2.1.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
        <script>window.jQuery || document.write('<script src="/SpringWebMVC/assets/js/jquery-3.2.1.min.js"><\/script>')</script>
        <script src="/SpringWebMVC/assets/js/theter.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
        <script src="/SpringWebMVC/assets/bs4allpa/js/bootstrap.min.js"></script>

    </body>
</html>
