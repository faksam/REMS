<%-- 
    Document   : AddProperty
    Created on : Oct 8, 2015, 10:22:49 AM
    Author     : Samuel
--%>

<%@page import="java.util.List"%>
<%@page import="org.jdom2.Element"%>
<%@page import="java.io.File"%>
<%@page import="org.jdom2.input.SAXBuilder"%>
<%@page import="org.jdom2.Document"%>
<%@page import="BL.myLib"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        
    <%@include file='navigation.jsp'%>
        <title>Add Property - Real Estate Management</title>

    </head>
    <body>
      
        <div class="container">
            <h1>All Properties</h1>
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
                                <th><input type="text" class="form-control" placeholder="Image" disabled></th>
                                <th><input type="text" class="form-control" placeholder="Address" ></th>
                                <th><input type="text" class="form-control" placeholder="Price" ></th>
                                <th><input type="text" class="form-control" placeholder="Description" ></th>
                                <th><input type="text" class="form-control" placeholder="Status" ></th>
                                <th><input type="text" class="form-control" placeholder="Landlord" ></th>
                                <th><input type="text" class="form-control" placeholder="Property Type" ></th>
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
                                    Element properties = rootElement.getChild("properties");
                                    Element VacantLands = properties.getChild("vacantLandProperties");
                                    Element Residentials = properties.getChild("residentialProperties");
                                    Element Commercials = properties.getChild("commercialProperties");

                                    List<Element> lstNodes = VacantLands.getChildren();
                                    for (int i = 0; i < lstNodes.size(); i++) {
                                        Element node = (Element) lstNodes.get(i);

                                        String Address = node.getChildText("address");
                                        String Price = node.getChildText("price");
                                        String Description = node.getChildText("description");
                                        String Status = node.getChildText("status");
                                        String Landlord = node.getChildText("landlord");
                                        String Type = node.getChildText("type");

                            %>
                            <tr>
                                <td>No image yet</td>
                                <td><%=Address%></td>
                                <td><%=Price%></td>
                                <td><%=Description%></td>
                                <td><%=Status%></td>
                                <td><%=Landlord%></td>
                                <td><%=Type%></td>
                                <% if((session.getAttribute("Manager")!=null)){ %>
                                 <td><a href="updateProperty.jsp?Address=<%=Address%>&Type=<%=Type%>">Update</a> | <a href="deleteProperty.jsp?Address=<%=Address%>&Type=<%=Type%>">Delete</a></td>
                            
                               <% }%>
                                </tr>
                            <%

                                    }
                                    
                                    List<Element> _nodes = Residentials.getChildren();
                                    for (int i = 0; i < _nodes.size(); i++) {
                                        Element node = (Element) _nodes.get(i);

                                        String Address = node.getChildText("address");
                                        String Price = node.getChildText("price");
                                        String Description = node.getChildText("description");
                                        String Status = node.getChildText("status");
                                        String Landlord = node.getChildText("landlord");
                                        String Type = node.getChildText("type");

                            %>
                            <tr>
                                <td>No image yet</td>
                                <td><%=Address%></td>
                                <td><%=Price%></td>
                                <td><%=Description%></td>
                                <td><%=Status%></td>
                                <td><%=Landlord%></td>
                                <td><%=Type%></td>
                                <% if((session.getAttribute("Manager")!=null)){ %>
                                 <td><a href="updateProperty.jsp?Address=<%=Address%>&Type=<%=Type%>">Update</a> | <a href="deleteProperty.jsp?Address=<%=Address%>&Type=<%=Type%>">Delete</a></td>
                            
                               <% }%>
                            </tr>
                            <%

                                    }
                                    List<Element> _nodes0 = Commercials.getChildren();
                                    for (int i = 0; i < _nodes0.size(); i++) {
                                        Element node = (Element) _nodes0.get(i);

                                        String Address = node.getChildText("address");
                                        String Price = node.getChildText("price");
                                        String Description = node.getChildText("description");
                                        String Status = node.getChildText("status");
                                        String Landlord = node.getChildText("landlord");
                                        String Type = node.getChildText("type");

                            %>
                            <tr>
                                <td>No image yet</td>
                                <td><%=Address%></td>
                                <td><%=Price%></td>
                                <td><%=Description%></td>
                                <td><%=Status%></td>
                                <td><%=Landlord%></td>
                                <td><%=Type%></td>
                            <% if((session.getAttribute("Manager")!=null)){ %>
                                 <td><a href="updateProperty.jsp?Address=<%=Address%>&Type=<%=Type%>">Update</a> | <a href="deleteProperty.jsp?Address=<%=Address%>&Type=<%=Type%>">Delete</a></td>
                            
                               <% }%>    
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
