

<%@page import="logica.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edicion de Personas</title>
    </head>
    <body>
        <h1>Persona a editar</h1>
        <%
            Persona per = (Persona) request.getSession().getAttribute("persona");
            
        %>
      

        <form action="<%= request.getContextPath()%>/SvEditar?id=<%=per.getId()%>" method="POST">
            <p><label for="dni">Dni: </label><input type="number" name="dni" required value="<%=per.getDni()%>"></p>
            <p><label>Nombre: </label><input type="text" name="nombre" required value="<%=per.getNombre()%>"></p>
            <p><label>Apellido: </label><input type="text" name="apellido" required value="<%=per.getApellido()%>"></p>
            <p><label>Teléfono: </label><input type="number" name="telefono" required value="<%=per.getTelefono()%>"></p>
            <button type="submit">Enviar</button>
        </form>
    </body>
</html>
