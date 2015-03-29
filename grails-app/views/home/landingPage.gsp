<%@ page import="enums.Enums" contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Simulation</title>
</head>

<body>
<div class="container">
    <div class="row">

        <div class="form-group text-center">
            <h2>Welcome to the simulation</h2>

        </div>

        <div class="col-md-12">
            <div class="col-md-2"></div>

            <div class="col-md-8">

                <div class="form-group text-center">
                    <g:link controller="simulate" action="simulateViewPage" class="btn btn-primary btn-lg">Enter Simulation Parameters</g:link>
                </div>

            </div>

            <div class="col-md-2"></div>

        </div>
    </div>
</div>
</body>
</html>