<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title>Admin Template</title>
        <link href='http://fonts.googleapis.com/css?family=Belgrano' rel='stylesheet' type='text/css'>
           <link href="style1.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div id="loginpanelwrap">

            <div class="loginheader">
                <div class="logintitle"><a href="#">Hello Admin</a></div>
            </div>


            <div class="loginform">
                <form action="AdminLogin" method="post">
                    <caption style="text-align: center"><%=(request.getAttribute("mess") == null) ? "" : request.getAttribute("mess")%></caption>
                    
                    <div class="loginform_row">                 
                        <label>Username:</label>
                        <input type="text" class="loginform_input" name="username" />
                    </div>
                    <div class="loginform_row">
                        <label>Password:</label>
                        <input type="password" class="loginform_input" name="password" />
                    </div>
                    <div class="loginform_row">
                        <input type="submit" class="loginform_submit" value="Login" />
                    </div> 
                    <div class="clear"></div>
                </form>
            </div>


        </div>


    </body>
</html>