<%-- 
    Document   : formSignup
    Created on : Jul 6, 2017, 8:12:27 AM
    Author     : Rafif
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.css">
        <meta name="viewport" content="width=device-width, initial-scale=1">
     <link rel="stylesheet" href="assets/css/skeleton.css">
         <link rel="stylesheet" href="assets/css/normalize.css">
         <link rel="stylesheet" href="assets/css/signup.css">
           <link rel="stylesheet" href="assets/pure/pure-min.css">
           <script src="assets/js/jquery-3.2.1.min.js"></script>
     <title>Sign up to Launderret</title>
    </head>
    <body>

      <div class="header">
          <div class="home-menu pure-menu pure-menu-horizontal pure-menu-fixed">
              <ul class="pure-menu-list"><li class="pure-menu-item pure-menu-heading">
                <a class="pure-menu-heading" href="l#"><i class="fa fa-rocket" aria-hidden="true"></i>launderette</a></li>
              </ul>
          </div>
      </div>

    <br>
    <div class="daftar">
     <div class="docs-example docs-example-forms">
       <form class="pure-form" name="addItem" method="post" action="formSignup">
         <div class="row">
           <div class="six columns">
             <label for="text">Nama Anda</label>
             <input class="u-full-width" type="text" placeholder="Name" name="nama_u" required>
           </div>
           <div class="six columns">
             <label for="text">Username Anda</label>
             <input class="u-full-width" type="text" placeholder="Username" name="username_u" required>
           </div>
         </div>
         <div class="row">
           <div class="six columns">
             <label for="text">password</label>
             <input class="u-full-width" type="password" placeholder="" name="password_u" required>
           </div>
         </div>
         <hr>
         <div class="row">
           <div class="six columns">
             <label for="exampleEmailInput">email</label>
             <input class="u-full-width" type="text" placeholder="example@mail.com" name="email_u" required>
           </div>
           <div class="six columns">
             <label for="text">nomor handphone / telphone</label>
             <input class="u-full-width" type="text" placeholder="+62" name="tanggal" required>
           </div>
         </div>
         <label for="exampleMessage">Alamat Anda</label>
         <textarea class="u-full-width" placeholder="alamat" name="alamat_u"></textarea>
         <div class="pure-controls">
          <label for="cb" class="pure-checkbox">
              <input id="cb" type="checkbox"> Ya, Saya Sudah baca term dan kondisi
          </label>
        </div>
         <button class="button-primary" type="submit">Sign up</button>
       </form>
     </div>
   </div>
    </body>
</html>

