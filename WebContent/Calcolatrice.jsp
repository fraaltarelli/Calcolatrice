<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
body {
    background-image:
        url('https://cdn.crunchify.com/wp-content/uploads/2013/03/Crunchify.bg_.300.png');
}
</style>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calcolatrice</title>
</head>

<body>
        
    <div align="center" style="margin-top: 50px;">  
    <form action="Calcolatrice">
            Primo numero:  <input type="text"   name="primonumero" size="10px" autocomplete="off"> <br>
            Secondo numero:  <input type="text"  name="secondonumero" size="10px" autocomplete="off"> <br>
        <input type="submit" formaction= "Calcolatrice" value="addizione">   
        <input type="submit" formaction= "Calcolatrice2" value="sottrazione">
        <input type="submit" formaction= "Calcolatrice3" value="moltiplicazione">
        <input type="submit" formaction= "Calcolatrice4" value="divisione">
    </form>
        
        
    </div>
    
    
    
    <div align="center" style="margin-top: 50px;"> 
    <p style="color:Tomato;">Risultato<p/>
    <p><%out.print(request.getAttribute("risultato"));%></p>
    <p><%out.print(request.getAttribute("errore"));%></p>
    </div>
    
 
</body>
</html>