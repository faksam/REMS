<%-- 
    Document   : searchUser
    Created on : Oct 10, 2015, 6:47:48 PM
    Author     : Samuel
--%>

<%@page import="java.util.List"%>
<%@page import="org.jdom2.Element"%>
<%@page import="java.io.File"%>
<%@page import="BL.myLib"%>
<%@page import="org.jdom2.input.SAXBuilder"%>
<%@page import="org.jdom2.Document"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            if((session.getAttribute("Manager")== null) )
                response.sendRedirect("index.jsp");
       %>
        
    <%@include file='navigation.jsp'%>
    <title>Search User - Real Estate Management</title>
    </head>
    <body>
      
        <div class="container">
        
        <h1>Search User</h1>
        
        <div class="row">
                <div class="panel panel-primary filterable">
                    <div class="panel-heading">
                        <h3 class="panel-title">Property Types</h3>
                        <div class="pull-right">
                            <button class="btn btn-default btn-xs btn-filter"><span class="glyphicon glyphicon-filter"></span> Filter</button>
                        </div>
                    </div>
                    <table class="table">
                        <script>
                            $(document).ready(function () {
                                $('.filterable .btn-filter').click(function () {
                                    var $panel = $(this).parents('.filterable'),
                                            $filters = $panel.find('.filters input'),
                                            $tbody = $panel.find('.table tbody');
                                    if ($filters.prop('disabled') == true) {
                                        $filters.prop('disabled', false);
                                        $filters.first().focus();
                                    } else {
                                        $filters.val('').prop('disabled', true);
                                        $tbody.find('.no-result').remove();
                                        $tbody.find('tr').show();
                                    }
                                });

                                $('.filterable .filters input').keyup(function (e) {
                                    /* Ignore tab key */
                                    var code = e.keyCode || e.which;
                                    if (code == '9')
                                        return;
                                    /* Useful DOM data and selectors */
                                    var $input = $(this),
                                            inputContent = $input.val().toLowerCase(),
                                            $panel = $input.parents('.filterable'),
                                            column = $panel.find('.filters th').index($input.parents('th')),
                                            $table = $panel.find('.table'),
                                            $rows = $table.find('tbody tr');
                                    /* Dirtiest filter function ever ;) */
                                    var $filteredRows = $rows.filter(function () {
                                        var value = $(this).find('td').eq(column).text().toLowerCase();
                                        return value.indexOf(inputContent) === -1;
                                    });
                                    /* Clean previous no-result if exist */
                                    $table.find('tbody .no-result').remove();
                                    /* Show all rows, hide filtered ones (never do that outside of a demo ! xD) */
                                    $rows.show();
                                    $filteredRows.hide();
                                    /* Prepend no-result row if all rows are filtered */
                                    if ($filteredRows.length === $rows.length) {
                                        $table.find('tbody').prepend($('<tr class="no-result text-center"><td colspan="' + $table.find('.filters th').length + '">No result found</td></tr>'));
                                    }
                                });
                            });
                        </script>
                        <thead>
                            <tr class="filters">
                                <th><input type="text" class="form-control" placeholder="Name" ></th>
                                <th><input type="text" class="form-control" placeholder="Username" ></th>
                                <th><input type="text" class="form-control" placeholder="Type of User" ></th>
                                <% if((session.getAttribute("Manager")!=null)){ %>
                                 <th><input type="text" class="form-control" placeholder="Update/Delete" disabled></th>

                               <% }%>
                            </tr>

                        </thead>
                        <tbody>
                            <%                        
                            try {
                                    Document xmlDoc = new Document();
                                    SAXBuilder saxBuilder = new SAXBuilder();
                                    xmlDoc = saxBuilder.build(new File(myLib.getxmlFile()));

                                    Element rootElement = xmlDoc.getRootElement();
                                    Element Landlords = rootElement.getChild("landlords");
                                    Element Tenants = rootElement.getChild("tenants");
                                    
                                    List<Element> _nodes = Landlords.getChildren();
                                    for (int i = 0; i < _nodes.size(); i++) {
                                        Element node = (Element) _nodes.get(i);

                                        
                                        String Name = node.getChildText("name");
                                        String Username = node.getChildText("username");
                                        String Type = node.getChildText("type");

                            %>
        <tr>
            <td><%=Name%></td>
            <td><%=Username%></td>
            <td><%=Type%></td>
             <td>
                <a onclick='return confirm("You want to Update this User?")' href="updateUser.jsp?Name=<%=Name%>&Type=<%=Type%>&Username=<%=Username%>">
                    Update
                </a> | 
                <a onclick='return confirm("Do you want to Delete this User?")' href="deleteUser.jsp?Name=<%=Name%>&Type=<%=Type%>&Username=<%=Username%>">
                    Delete
                </a>
            </td>
        </tr>
                            <%

                                    }
                                    List<Element> _nodes0 = Tenants.getChildren();
                                    for (int i = 0; i < _nodes0.size(); i++) {
                                        Element node = (Element) _nodes0.get(i);

                                        String Name = node.getChildText("name");
                                        String Username = node.getChildText("username");
                                        String Type = node.getChildText("type");

                            %>
                            <tr>
                                <td><%=Name%></td>
                                <td><%=Username%></td>
                                <td><%=Type%></td>
                                <td>
                                    <a onclick='return confirm("You want to Update this User?")' href="updateUser.jsp?Name=<%=Name%>&Type=<%=Type%>&Username=<%=Username%>">
                                        Update
                                    </a> | 
                                    <a onclick='return confirm("Do you want to Delete this User?")' href="deleteUser.jsp?Name=<%=Name%>&Type=<%=Type%>&Username=<%=Username%>">
                                        Delete
                                    </a>
                                </td>
                            </tr>
                            <%

                                    }

                                    System.out.println("Finished search!");
                                } catch (Exception e) {
                                    // TODO: handle exception
                                }
                            %>
                        </tbody>
                    </table>

                </div>
            </div>
        </div>
    </body>
    <%@include file='footer.jsp'%>
</html>
