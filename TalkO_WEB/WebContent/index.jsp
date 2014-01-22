<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%@ page import = "Database.*" %>
<%
	//update
	Database.query_update db_update = new Database.query_update();
	//db_update.create_table("Create Table msg(channel varchar(16), id varchar(32), msg varchar(32))");
	//db_update.insert_table("insert into msg values ('SBS', 'ID', '들어감')");
%>

<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no" />
    <meta http-equiv="Content-Type" content="text/html" charset="euc-kr"/>
    <link rel="stylesheet" href="http://code.jquery.com/mobile/1.0rc2/jquery.mobile-1.0rc2.min.css" />
    <style>
    </style>
    <script src="http://code.jquery.com/jquery-1.7.js"></script>
    <script src="http://code.jquery.com/mobile/1.0rc2/jquery.mobile-1.0rc2.min.js"></script>
</head>
<body>
    <div data-role="page">
        <div data-role="header" data-position="fixed">
            <div data-role="navbar">
                <ul>
                    <li><a href="index.jsp">메인</a></li>
                    <li><a href="#">프로파일</a></li>
                    <li><a href="#">친구</a></li>
                    <li><a href="#">설정</a></li>
                </ul>
            </div>
        </div>
        <!-- <div data-role="content" data-theme="c"> -->
        <div data-role="content">
            <ul data-role="listview" data-inset="true" data-filter="true">
                <li data-role="list-divider">채널</li>
                <li><a href="SBS.jsp">SBS</a></li>
                <li><a href="#">KBS1</a></li>
                <li><a href="#">KBS2</a></li>
                <li><a href="#">MBC</a></li>
            </ul>
        </div>
        
        <!--  
        <div data-role="footer" data-position="fixed">
            <div data-role="navbar">
                <ul>
                    <li><a href="#">One</a></li>
                    <li><a href="#">Two</a></li>
                    <li><a href="#">Three</a></li>
                    <li><a href="#">Four</a></li>
                    <li><a href="#">Five</a></li>
                </ul>
            </div>
        </div>
        -->
        
    </div>
</body>
</html>