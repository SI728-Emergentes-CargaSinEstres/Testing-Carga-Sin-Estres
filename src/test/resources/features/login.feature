#language: es
@login_feature
Característica: Login
  Como usuario registrado de Carga Sin Estrés
  Quiero iniciar sesión en mi cuenta
  Para acceder a mis opciones según mi tipo de cuenta

  @login
  Escenario: Iniciar sesión
    Dado que soy un usuario tipo cliente registrado en la plataforma
    Cuando ingreso mi dirección de correo electronico "lu@gmail.com" y contraseña: "Password123"
    Entonces soy redirigido a la página de inicio