<%@page import="org.springframework.web.context.request.SessionScope"%>
<%@page import="org.springframework.messaging.simp.user.UserSessionRegistry"%>
<%@page import="sun.net.www.protocol.http.HttpURLConnection"%>
<%@page import="com.program.models.PelangganModel"%>
<%@page import="com.program.models.JenisJasaModel"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%-- 
    Document   : formSignup
    Created on : Jul 6, 2017, 8:12:27 AM
    Author     : Rafif
--%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="/SpringWebMVC/assets/font-awesome/css/font-awesome.css">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="/SpringWebMVC/assets/css/skeleton.css">
        <link rel="stylesheet" href="/SpringWebMVC/assets/css/normalize.css">
        <link rel="stylesheet" href="/SpringWebMVC/assets/css/order.css">
        <link rel="stylesheet" href="/SpringWebMVC/assets/pure/pure-min.css">
        <link rel="stylesheet" href="/SpringWebMVC/assets/css/bootstrap.css">
        <link rel="stylesheet" href="/SpringWebMVC/assets/SemanticUI/semantic.css">

        <script src="/SpringWebMVC/assets/SemanticUI/semantic.min.js"></script>
        <script src="/SpringWebMVC/assets/js/jquery-3.2.1.min.js"></script>
        <title>Launderret</title>
    </head>
    <body>
        <%
            PelangganModel model = new PelangganModel();
            model = (PelangganModel) session.getAttribute("userSession");
        %>

        <div class="header">
            <div class="home-menu pure-menu pure-menu-horizontal pure-menu-fixed">
                <ul class="pure-menu-list"><li class="pure-menu-item pure-menu-heading" padding-right="2000px">
                        <a class="pure-menu-heading" href="#"><i class="fa fa-rocket" aria-hidden="true"></i> Launderrete</a></li>
                        <% if (model.getActive() != 0) { %>
                    <li class="pure-menu-item"><a href="#" class="pure-menu-link"><i class="fa fa-rocket fa-lg" aria-hidden="true"></i> GO! - Laundry </a></li>
                        <% } %>
                    <li class="pure-menu-item pure-menu-has-chilldren pure-menu-allow-hover">
                        <a href="#" class="pure-menu-link"><i class="fa fa-book" aria-hidden="true"></i>Notifikasi</a>
                        <ul class="pure-menu-children">
                            <% if (model.getActive() == 0) { %>
                            <li class="pure-menu-item"><a href="#" class="pure-menu-link"> Silahkan Aktivasi Terlebih Dahulu</a></li>
                                <%} else {%>
                            <li class="pure-menu-item"><a href="#" class="pure-menu-link"> Klik GO! - Laundry untuk laundry</a></li>
                                <% }%>
                        </ul>
                    </li>
                    <li class="pure-menu-item pure-menu-has-chilldren pure-menu-allow-hover">
                        <a href="#" class="pure-menu-link"><i class="fa fa-users fa-lg" aria-hidden="true"></i> <%= model.getNama_u()%></a>


                        <ul class="pure-menu-children">
                            <li class="pure-menu-item"><a href="#" class="pure-menu-link"><i class="fa fa-wrench" aria-hidden="true"></i> Edit</a></li>
                            <li class="pure-menu-item"><a href="#" class="pure-menu-link"><i class="fa fa-user" aria-hidden="true"></i> profile</a></li>
                            <li class="pure-menu-item"><a href="/SpringWebMVC/login/_out" class="pure-menu-link"><i class="fa fa-sign-out" aria-hidden="true"></i> sign out</a></li>

                        </ul>
                </ul>
            </div>
        </div>


        <!-- -->

        <!-- tengah -->
        <div class="daftar">
            <div class="ui container">
                <div class="center aligned column">
                    Pilih Jasa Laundry Anda
                </div>

                <table class="ui celled padded table">
                    <thead>
                        <tr><th class="single line">Paket</th>
                            <th>Jenis Laundry</th>
                            <th>Harga per 1kg</th>
                            <th>Waktu</th>
                            <th>Deskripsi</th>
                            <th>Kode</th>
                        </tr></thead>
                    <tbody>
                        <tr>
                            <td>
                                <h2 class="ui center aligned header">A</h2>
                            </td>
                            <td class="single line">
                                Cuci Strika Express
                            </td>
                            <td class="single line">
                                Rp.8000
                            </td>
                            <td class="right aligned">
                                1 hari <br>
                                <a href="#">bila tidak Hujan</a>
                            </td>
                            <td>Driver kami akan pick laundry + Cuci dengan prioritas cepat + Strika + Antar Kembali</td>
                            <td>
                                1
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <h2 class="ui center aligned header">B</h2>
                            </td>
                            <td class="single line">
                                Cuci Strika
                            </td>
                            <td class="single line">
                                Rp.6000
                            </td>
                            <td class="right aligned">
                                2 hari <br>
                                <a href="#">bila tidak Hujan</a>
                            </td>
                            <td>Driver kami akan pick laundry + Cuci + Strika + Antar Kembali</td>
                            <td>
                                2
                            </td>
                        </tr>
                        <tr>
                            <td>
                                <h2 class="ui center aligned header">C</h2>
                            </td>
                            <td class="single line">
                                Cuci saja
                            </td>
                            <td class="single line">
                                Rp.3500
                            </td>
                            <td class="right aligned">
                                2 hari <br>
                                <a href="#">bila tidak Hujan</a>
                            </td>
                            <td>Driver kami akan pick laundry + Cuci saja+ Antar Kembali</td>
                            <td>3</td>
                        </tr>
                    </tbody>
                </table>
                <form class="form-signin" method="post" action="">
                    <input type="hidden" name="id_pelanggan" value="<%= model.getId_u() %>">
                    
                    <input style="width: 30%;" class="form-control" type="text" placeholder="masukan kode" name="id_jenisjasa" required>
                    <button class="ui primary-button" type="submit">pilih</button>
                </form>
            </div>
        </div>
        <!-- footer -->
        <div class="ui inverted brown vertical footer mini segment" id="foot">
            <div class="ui container">
                <div class="ui stackable inverted equal height stackable grid">
                    <div class="three wide column">
                        <h2 class="ui image header">
                            <img src="/SpringWebMVC/img/logolaunderret.png" class="ui huge image">
                        </h2>
                    </div>
                    <div class="three wide column">
                        <h4 class="ui inverted header">Tentang kami</h4>
                        <div class="ui inverted link list">
                            <a href="#" class="item">Cara Laundry</a>
                            <a href="#" class="item">Promo</a>
                            <a href="#" class="item">Paket Laundry</a>
                        </div>
                        <h4 class="ui inverted header">Informasi kami</h4>
                        <div class="ui inverted link list">
                            <a href="#" class="item">Kantor</a>
                            <a href="#" class="item">Cabang</a>
                        </div>
                    </div>
                    <div class="three wide column">
                        <h4 class="ui inverted header">Layanan kami</h4>
                        <div class="ui inverted link list">
                            <a href="#" class="item">Order Laundry</a>
                            <a href="#" class="item">Cek Laundry Anda</a>
                            <br>
                        </div>
                        <h4 class="ui inverted header">Costumer Care</h4>
                        <div class="ui big inverted link list">
                            <i class="call icon"></i> (021) 8552 1221</p>
                        </div>
                    </div>
                    <div class="seven wide column">
                        <h4 class="ui inverted header">Kantor Pusat</h4>
                        <p><i class="marker icon"></i>Jl. Boulevard Jend. Sudirman No. 1110, Lippo Village 1200, Kec. Kelapa Dua, Bencongan, Tangerang, Banten 15811, Indonesia</p>
                        <br>
                        <div class="ui inverted list">
                            <p><i class="pin icon"></i>Contact center. (021) 1231 3132</p>
                            <p><i class="call icon"></i> Office. (021) 8552 1221</p>
                            <p><i class="mail outline icon"></i> Email. Olaund@gmail.com</p>

                        </div>
                        <div class="ui inverted big link horizontal list">
                            <a href="#" class="item"><i class="facebook f icon"></i></a>
                            <a href="#" class="item"><i class="linkedin icon"></i></a>
                            <a href="#" class="item"><i class="git icon"></i></a>
                        </div>
                    </div>
                </div>
                <!--<h4 class="ui inverted header">Copyright 2016 Team OLaund. All right reserved.</h4>-->
            </div>
        </div>
        <script src="/SpringWebMVC/assets/js/bootstrap.min.js"></script>
    </body>
</html>

