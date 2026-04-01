# Gestor_Tarjetas_Spring_React

Backend 
Java Version 21

🔒 CORS
Configurado para aceptar peticiones desde http://localhost:3000.


LISTAR TARJETAS
http://localhost:8080/tarjeta-app/tarjetas



EJEMPLO DE POST
json{
    "estado": "ACTIVO",
    "limiteCredito": 5000.0,
    "numeroTarjeta": "1234567890123456",
    "saldoDisponible": 1000.50,
    "titular": "Juan Perez"
}

BUSCAR POR TARJETA
Buscar Por Numero de Tarjeta GET http://localhost:8080/tarjeta-app/tarjetas/buscar?numeroTarjeta=1273747575


FRONT 
INICIAR 
 npm start  
 DEPENDENCIAS
 npm i react-router-dom   
  npm i axios      
