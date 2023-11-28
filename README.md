# Ejercicio_JAVA-Especialista_Integracion-flinco

#Instalación
###Requisitos
* Java 11
* Maven 3.9.4 o superior
* Git
* eclipse

### Pasos para levantar el proyecto
* Descargar desde GitHub el proyecto https://github.com/flinco1/Ejercicio_JAVA-Especialista_Integracion-flinco/tree/main/ejercicio 
* Abrir con eclipse
* Crear en la carpeta de usuario (C:\Users\xxx\) el archivo ejercicioApp.mv.db
* En eclipse Abrir la clase EjercicioApplication.java, y ejecutar como aplicación.
* Endpoint: localhost:8080/servicesREST/creacionUsuarios
* Json ejemplo de entrada:
{
    "name": "Juan Rodriguez",
    "email": "juan@rodriguez21.org",
    "password": "Aa.123",
    "phones": [
        {
            "number": "1234567",
            "citycode": "1",
            "contrycode": "57"
        },
        {
            "number": "1234567",
            "citycode": "1",
            "contrycode": "57"
        }
    ]
}
