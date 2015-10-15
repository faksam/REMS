<%-- 
    Document   : Contact
    Created on : Oct 10, 2015, 7:33:00 PM
    Author     : Samuel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
    <%@include file='navigation.jsp'%>
        <title>Contact - Real Estate Management</title>
    </head>
    <body>
        <div class="container">
            <form action="/Home/Contact" method="post"><input name="__RequestVerificationToken" type="hidden" value="zGGs4JKF78S45p7ZrSp4VA_g_qj5mrwQavKcu0zJNJeV_NidJJWWQByQymTzIHj3t_eRAbd9BNOsvhl-5Y2eqDqqmumJXsDraRpwiS86xvlI9Wc9ChFdgGHrgpled55i2nfDZoM5xYXSJKyrN-FoaA2" />    <div class="form-horizontal">
                    <h1>Contact Us</h1>
                    <hr />
                    <div class="form-group">
                        <p>Your name</p>
                        <div class="col-md-10">
                            <input class="form-control" data-val="true" data-val-required="The Your name field is required." id="FromName" name="FromName" type="text" value="" />
                            <span class="field-validation-valid" data-valmsg-for="FromName" data-valmsg-replace="true"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <p>Your email</p>
                        <div class="col-md-10">
                            <input class="form-control" data-val="true" data-val-email="The Your email field is not a valid e-mail address." data-val-required="The Your email field is required." id="FromEmail" name="FromEmail" type="text" value="" />
                            <span class="field-validation-valid" data-valmsg-for="FromEmail" data-valmsg-replace="true"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <p>Message</p>
                        <div class="col-md-10">
                            <textarea class="form-control" cols="20" data-val="true" data-val-required="The Message field is required." id="Message" name="Message" rows="10">
                            </textarea>
                            <span class="field-validation-valid" data-valmsg-for="Message" data-valmsg-replace="true"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <div>
                            <input type="submit" class="btn btn-default" value="Send" />
                        </div>
                    </div>
                </div>
            </form>

        </div>
    </body>
    <%@include file='footer.jsp'%>
</html>
