<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
	<%@taglib  uri="http://www.springframework.org/tags/form" prefix="f" %>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>md-sos</title>

    <!-- Bootstrap Core CSS -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="resources/css/sb-admin.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="resources/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <div id="wrapper">

        <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="index.html"><strong><big>MD-sos</big></strong></a>
            </div>
            <!-- Top Menu Items -->
            <ul class="nav navbar-right top-nav">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-envelope"></i> <b class="caret"></b></a>
                    <ul class="dropdown-menu message-dropdown">
                        <li class="message-preview">
                            <a href="#">
                                <div class="media">
                                    <span class="pull-left">
                                        <img class="media-object" src="http://placehold.it/50x50" alt="">
                                    </span>
                                    <div class="media-body">
                                        <h5 class="media-heading"><strong>Atoui Ilyes</strong>
                                        </h5>
                                        <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
                                        <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="message-preview">
                            <a href="#">
                                <div class="media">
                                    <span class="pull-left">
                                        <img class="media-object" src="http://placehold.it/50x50" alt="">
                                    </span>
                                    <div class="media-body">
                                        <h5 class="media-heading"><strong>Atoui Ilyes</strong>
                                        </h5>
                                        <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
                                        <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="message-preview">
                            <a href="#">
                                <div class="media">
                                    <span class="pull-left">
                                        <img class="media-object" src="http://placehold.it/50x50" alt="">
                                    </span>
                                    <div class="media-body">
                                        <h5 class="media-heading"><strong>Atoui Ilyes</strong>
                                        </h5>
                                        <p class="small text-muted"><i class="fa fa-clock-o"></i> Yesterday at 4:32 PM</p>
                                        <p>Lorem ipsum dolor sit amet, consectetur...</p>
                                    </div>
                                </div>
                            </a>
                        </li>
                        <li class="message-footer">
                            <a href="#">Read All New Messages</a>
                        </li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-bell"></i> <b class="caret"></b></a>
                    <ul class="dropdown-menu alert-dropdown">
                        <li>
                            <a href="#">Alert Name <span class="label label-default">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Alert Name <span class="label label-primary">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Alert Name <span class="label label-success">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Alert Name <span class="label label-info">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Alert Name <span class="label label-warning">Alert Badge</span></a>
                        </li>
                        <li>
                            <a href="#">Alert Name <span class="label label-danger">Alert Badge</span></a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="#">View All</a>
                        </li>
                    </ul>
                </li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> Atoui Ilyes <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li>
                            <a href="#"><i class="fa fa-fw fa-user"></i> Profile</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-fw fa-envelope"></i> Inbox</a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-fw fa-gear"></i> Settings</a>
                        </li>
                        <li class="divider"></li>
                        <li>
                            <a href="login.html"><i class="fa fa-fw fa-power-off"></i> Log Out</a>
                        </li>
                    </ul>
                </li>
            </ul>
            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
                     <li>
                        <a ><img src="resources/icones/menu.png" > tableau de bord</a>
                    </li>
                    <li>
                        <a href="index.html"><img src="resources/icones/home.png" >  Acceuil</a>
                    </li>
					
                    <li>
                        <a href="listeutilisateur.html"><img src="resources/icones/user.png"> Listes des Utilisateurs</a>
                    </li>
                    <li>
                        <a href="listeSOS.html"><img src="resources/icones/emergency.png"> Demandes d'urgences</a>
                    </li>
                    <li>
                        <a href="listeMedecins.html"><img src="resources/icones/doctor.png"> Liste des  M�decins</a>
                    </li>
                    <li>
                        <a href="listePmpiers.html"><img src="resources/icones/fireman.png"> Liste des pompiers</a>
                    </li>
					 <li>
                        <a href="listePpoliciers.html"><img src="resources/icones/cop.png"> Liste des policiers</a>
                    </li>
                    <li>
                        <a href="javascript:;" data-toggle="collapse" data-target="#demo"><i class="fa fa-fw fa-arrows-v"></i> Dropdown <i class="fa fa-fw fa-caret-down"></i></a>
                        <ul id="demo" class="collapse">
                            <li>
                                <a href="#">Dropdown Item</a>
                            </li>
                            <li>
                                <a href="#">Dropdown Item</a>
                            </li>
                        </ul>
                    </li>
                    <li>
                        <a href="blank-page.html"><i class="fa fa-fw fa-file"></i> Blank Page</a>
                    </li>
                    <li>
                        <a href="index-rtl.html"><i class="fa fa-fw fa-dashboard"></i> RTL Dashboard</a>
                    </li>
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </nav>

        <div id="page-wrapper">

            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                           <img src="resources/icones/emergency2.png"> Liste des fiches de santes
                        </h1>
                        <ol class="breadcrumb">
                            <li>
                                <i class="fa fa-dashboard"></i>  <a href="index.html">tableau de bord</a>
                            </li>
                            <li class="active">
                                <i class="fa fa-table"></i> Liste des fiches de santes
                            </li>
                        </ol>
                    </div>
                </div>
                <!-- /.row -->

                <div class="row">
                    
                    <div class="col-lg-6">
                        
                        <div class="table-responsive">
                            <table class="table table-bordered table-hover table-striped">
                                <thead>
                                    <tr>
                                        <th >Email </th>
                                        <th >Nom</th>
                                        <th >numero d'assurence maladique</th>
										<th >groupe sanguin</th>
										<th >Donneur d'organes</th>
										<th>Assurence maladie</th>
										<th>Pathologies</th>
										<th>Antecedents familiaux</th>
										<th>Allergies</th>
										<th>traitements en cours</th>
										<th>Medecin de famille</th>
										<th>certification</th>
                                    </tr>
                                </thead>
                                <tbody>
                                
                                 <c:forEach items="${fichesantes}" var="fichesante">
                                    <tr>
                                        <td>${fichesante.email}</td>
                                        <td>${fichesante.sname}</td>
                                        <td>${fichesante.snassurance}</td>
                                        <td>${fichesante.stypesang}</td>
                                        <td>${fichesante.sdonorgane}</td>
                                        <td>${fichesante.stypeassurence}</td>
                                        <td>${fichesante.spathologie1} <br> ${fichesante.spathologie2}</td>
                                        <td>${fichesante.santfamil1} <br> ${fichesante.santfamil1}</td>
                                        <td>${fichesante.sallergie1} <br> ${fichesante.sallergie2}</td>
                                        <td>${fichesante.straitement}</td>
                                        <td>${fichesante.smedecin}</td>
										<td>${fichesante.certification}</td>
										
										
										
                                    </tr>
                            </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    
                    
                <!-- /.row -->
</div>

			<div class="col-sm-4">
                        <div class="panel panel-green">
                            <div class="panel-heading">
                                <h3 class="panel-title"><img src="resources/icones/singlefichesante.png"> Fiche de Sante</h3>
	                            </div>
                    <br>
                    
                    <div class="form-group input-group">
                    			<span class="input-group-addon">Email</span>
                                <div class="form-group has-success" >
                                 <p class="form-control">spacelass@gmail.com</p>
                                 </div> 
                                 </div>
                                 
                                  <div class="form-group input-group">
                                 <span class="input-group-addon">Nom</span>
                                <div class="form-group has-success" >
                                 <p class="form-control">ilyes</p>
                                 </div>
                                 </div>
                                 
                                 <div class="form-group input-group">
                                 <span class="input-group-addon">Numero d'aussrence maladique</span>
                                <div class="form-group has-success" >
                                 <p class="form-control">09488733</p>
                                 </div>
                                 </div>
                                 
                                  <div class="form-group input-group">
                                 <span class="input-group-addon"><img src="resources/icones/blooddrop.png">groupe sanguin</span>
                                <div class="form-group has-success" >
                                 <p class="form-control">A+</p>
                                 </div>
                                 </div>
                                 
                                  <div class="form-group input-group">
                                 <span class="input-group-addon">Donneur d'organne</span>
                                <div class="form-group has-success" >
                                 <p class="form-control">ilyes</p>
                                 </div>
                                 </div>
                                 
                                   <div class="form-group input-group">
                                 <span class="input-group-addon">Assurence maladie</span>
                                <div class="form-group has-success" >
                                 <p class="form-control">CNAM</p>
                                 </div>
                                 </div>
                                 
                                  <div class="form-group input-group">
                                 <span class="input-group-addon">Pathologies</span>
                                <div class="form-group has-success" >
                                 <p class="form-control">diabetes</p>
                                 </div>
                                 </div>
                                 
                                  <div class="form-group input-group">
                                 <span class="input-group-addon">Allergies</span>
                                <div class="form-group has-success" >
                                 <p class="form-control">ggg</p>
                                 </div>
                                 </div>
                                 
                                 <div class="form-group input-group">
                                 <span class="input-group-addon"><img src="resources/icones/medication.png">Traitement en cours</span>
                                <div class="form-group has-success" >
                                 <p class="form-control">ggg</p>
                                 </div>
                                 </div>
                                 
                                 <div class="form-group input-group">
                                 <span class="input-group-addon">Antecedents familiaux</span>
                                <div class="form-group has-success" >
                                 <p class="form-control">sss</p>
                                 </div>
                                 </div>
                                 
                                 <div class="form-group input-group">
                                 <span class="input-group-addon"><img src="resources/icones/doctor3.png">Medecin de famille</span>
                                <div class="form-group has-success" >
                                 <p class="form-control">mlouka</p>
                                 </div>
                                 </div>
                                 
                                 <div class="form-group input-group">
                                 <span class="input-group-addon">certification</span>
                                <div class="form-group has-success" >
                                 <p class="form-control">non</p>
                                 </div>
                                 </div>
							</div>
                    
					 </div> </div>
            <!-- /.container-fluid -->

        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="resources/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="resources/js/bootstrap.min.js"></script>

<script >
    $(function() {
		
    });
    
    function deletePolicier(id){
    	if (confirm("Etes vous s�r de vouloir supprimer cet declaration?")){
    		window.location.href='deleteDeclaration.html?id='+id;
    	}
    }
    </script>
</body>

</html>
