#language: es
@contract_feature
Característica: Contrato Inteligente
  Como usuario de la aplicación
  Quiero ver el contrato de mi solicitud
  Para verificar los términos de mi reserva

  @view_contract_successful
  Escenario: El usuario observa el contrato
    Dado que soy un usuario que tiene una solicitud programada
    Cuando elija la opción de ver el contrato
    Entonces la aplicación debe mostrarme el contrato