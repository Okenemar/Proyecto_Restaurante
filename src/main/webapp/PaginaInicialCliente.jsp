<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Herrero Martinez - Restaurante de lujo</title>
<!-- Enlaces a los archivos de Bootstrap -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"></script>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<style>
body {
	background-color: #1C1C1C;
	color: black;
}

.navbar {
	background-color: #3A3A3A;
}

.carousel-control-prev-icon {
	padding: 5px;
	background-color: gray;
	box-shadow: 0px 0px 10px black;
	color: black !important;
	background-color: gray;
}

.carousel-control-next-icon {
	padding: 5px;
	background-color: gray;
	box-shadow: 0px 0px 10px black;
	color: black !important;
	background-color: gray;
}

.insta {
	width: 5vw;
	height: 5vh;
}

.twitter {
	width: 5vw;
	height: 5vh;
}

.facebook {
	width: 5vw;
	height: 5vh;
}
.social-icon,
#menu {
    position: relative;
    display: flex;
    justify-content: center;
    align-items: center;
    margin: 10px 0;
    flex-wrap: wrap;
}

.social-icon__item,
.menu__item {
    list-style: none;
}

.social-icon__link {
    font-size: 2rem;
    color: #fff;
    margin: 0 10px;
    display: inline-block;
    transition: 0.5s;
}

.social-icon__link:hover {
    transform: translateY(-10px);
}


</style>
</head>
<body>
	<!-- Barra de navegación -->
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#">Herrero Martinez</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse justify-content-right"
			id="navbarNav">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link" href="#about">Acerca
						de nosotros</a></li>
				<li class="nav-item"><a class="nav-link" href="#menu">Menú</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#reservations">Reservas</a>
				</li>
				<li class="nav-item"><a class="nav-link" href="#events">Eventos
						y promociones</a></li>
				<li class="nav-item"><a class="nav-link" href="#location">Ubicación
						y horarios</a></li>
				<li class="nav-item"><a href="LoginEmpleado"
					class="btn btn-dark">Log in</a></li>
			</ul>
		</div>
	</nav>


	<!-- Página de inicio -->
	<header class="jumbotron jumbotron-fluid bg-light">
		<div class="container text-center">
			<h1 class="display-4 font-weight-bold">Herrero Martinez</h1>
			<p>¡Bienvenidos a Herrero Martinez, el restaurante de lujo donde
				los mejores sabores se unen con una experiencia única! Aquí
				encontrarán un ambiente elegante y sofisticado, ideal para disfrutar
				de una cena especial, una celebración importante o simplemente una
				velada romántica. Nuestro equipo de chefs expertos preparan cada
				plato con la máxima atención y dedicación, utilizando los mejores
				ingredientes locales y técnicas culinarias de vanguardia para crear
				una explosión de sabores y texturas en cada bocado. Además, nuestra
				extensa carta de vinos cuidadosamente seleccionados, junto con el
				servicio excepcional de nuestro personal, aseguran que su
				experiencia sea inolvidable. Estamos emocionados de tenerlos en
				nuestro restaurante y esperamos que disfruten de la deliciosa comida
				y la elegante atmósfera que ofrecemos en Herrero Martinez. ¡Gracias
				por visitarnos!</p>
		</div>
		<!-- Carrusel de fotos -->
		<center>
			<div id="carouselExampleCaptions" class="carousel slide"
				data-bs-ride="carousel">
				<div class="carousel-indicators">
					<button type="button" data-bs-target="#carouselExampleCaptions"
						data-bs-slide-to="0" class="active" aria-current="true"
						aria-label="Slide 1"></button>
					<button type="button" data-bs-target="#carouselExampleCaptions"
						data-bs-slide-to="1" aria-label="Slide 2"></button>
					<button type="button" data-bs-target="#carouselExampleCaptions"
						data-bs-slide-to="2" aria-label="Slide 3"></button>
				</div>
				<div class="carousel-inner">
					<div class="carousel-item active">
						<img
							src="https://img.freepik.com/foto-gratis/minimalista-plana-pone-ravioles-negros-plato_23-2148425610.jpg?w=1380&t=st=1683103284~exp=1683103884~hmac=af07da12bed9769e1fbdc3fbbf4a6c99826e990f364b030511ec07f703a224a6"
							class="d-block w-50 h-50" alt="">
						<div class="carousel-caption d-none d-md-block">
							<h5>Raviolis negros</h5>
							<p>Deliciosos raviolis rellenos de chipiron y foie .</p>
						</div>
					</div>
					<div class="carousel-item">
						<img
							src="https://img.freepik.com/foto-gratis/bistec-al-huevo-benedictino-pure-batata-salsa-champinones_637285-9511.jpg?w=1380&t=st=1683103482~exp=1683104082~hmac=2a98c808cd8f698029f8b7d486b0639d7543f3224310f2de5c86e50c0db9dbf3"
							class="d-block w-50 h-50" alt="">
						<div class="carousel-caption d-none d-md-block">
							<h5>Solomillo</h5>
							<p class="justify content">Carne de primera calidad montado</p>
							<p class="justify content">sobre una ligera crema de
								zanahoria</p>
							<p class="justify content">y acompañado de un huevo poche</p>
						</div>
					</div>
					<div class="carousel-item">
						<img
							src="https://img.freepik.com/foto-gratis/vista-frontal-deliciosa-comida-pescado-cocido_23-2148708626.jpg"
							class="d-block w-50 h-50" alt="">
						<div class="carousel-caption d-none d-md-block">
							<h5>Salmón ahumado</h5>
							<p>El salmón más fresco acompañado de granada.</p>
						</div>
					</div>
				</div>
				<button class="carousel-control-prev" type="button"
					data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
					<span class="carousel-control-prev-icon" aria-hidden="true"></span>
					<span class="visually-hidden"></span>
				</button>
				<button class="carousel-control-next" type="button"
					data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
					<span class="carousel-control-next-icon" aria-hidden="true"></span>
					<span class="visually-hidden"></span>
				</button>
			</div>
		</center>
		<br> <br> <br> <br>
	</header>
	<!-- Footer -->
	<footer>
		<br> <br>
		<div class="container" style="color: white;">
			<div class="row">
				<div class="col-md-6 text-center">
					<h4>Información de Contacto</h4>
					<p>
						<strong>Herrero Martinez</strong>
					</p>
					<p>
						<i class="fa fa-phone"></i> Teléfono: 943 11 83 19
					</p>
					<p>
						<i class="fa fa-map-marker"></i> Dirección: Calle la concha 123,
						Donosti/San Sebastian
					</p>
				</div>
				<div class="col-md-6 text-center">
					<h4>Redes Sociales</h4>
					<ul class="social-icon">
						<li class="social-icon__item"><a class="social-icon__link"
							href="#">           <ion-icon name="logo-facebook"></ion-icon>
								       
						</a></li>  
						    
						<li class="social-icon__item"><a class="social-icon__link"
							href="#">           <ion-icon name="logo-twitter"></ion-icon>
								       
						</a></li>      
						<li class="social-icon__item"><a class="social-icon__link"
							href="#">           <ion-icon name="logo-linkedin"></ion-icon>
								       
						</a></li>      
						<li class="social-icon__item"><a class="social-icon__link"
							href="#">           <ion-icon name="logo-instagram"></ion-icon>
								       
						</a></li>    
					</ul>


				</div>

			</div>
		</div>
		<br> <br> <br> <br>
	</footer>

</body>
</html>

