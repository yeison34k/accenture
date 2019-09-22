# Aplicaión micro servicios
Aplicación desarrollada para mostrar la construcción básica de un micro servicio usando spring 

##  Herramientas usadas
* [Java 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [netBeans](https://netbeans.org/downloads/8.2/)  
* [Spring web](https://mvnrepository.com/artifact/org.springframework/spring-web) 
* [Spring test](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test) 
* [Spring mongodb](https://spring.io/projects/spring-data-mongodb) 
* [loombook](https://projectlombok.org/) 
* [dozer](https://www.arquitecturajava.com/javabeans-dto-y-dozer/) 
* [log4j](https://logging.apache.org/log4j/2.x/) 

## Pasos para crear la aplicación

1. Se crea el proyecto usando maven

![paso 1](imagenes/paso_1_crear_proyecto.PNG ) 

2. Definimos los paquetes básicos que vamos a usar en la aplicación

![Paso 2](imagenes/paso_2_definir_paquetes_basicos.PNG)

3. Definimos el archivo pom

![Paso 3](imagenes/paso_3_definir_el_pom.PNG)

4. Definimos el archivo application.properties y el puerto por sel cual se desea comunicar la aplicación

![Paso 4](imagenes/application.properties.PNG)

5.Definimos nuetra clase inicial del proyecto 

![paso 5](imagenes/paso_4_crear_clase_run_para_el_proyecto.PNG)

6. Creamos una base de datos mongodb usando el proveedor de servicio [atlas](https://cutt.ly/jwMx5IT) el cual nos permite tener una base de datos disponble 24/7, de igual forma le asignamos un usuario y una ip que puede tener acceso a la misma

![paso 6](imagenes/mongo.PNG)

7. Realizamos la conexion en el archivo application.properties 

8. Creamos las entidades sobre las cuales vamos a trabajar en este caso es Usuario dentro de esta colocamos el nombre al que va  hacer referencia en la base de datos y los campos que va a tener

9. Creamos los dto de request y response que van a ser usados a momento de hacer una petición desde el cliente

10. Definimos un archivo de configuración y realizamos la configuracón básica del dozer

11. Creamos una interfaz en el paquete de DAO y esta debe extender de MongoRepository la cual contiene los metodos basicos para el manejo de bases de datos no relacionales mongodb

12. Creamos la interfaz e inplementación de el servicios encargados de la lógica para el negocio
  * public UsuarioResponse guardar(UsuarioRequest usuario);
  * public Usuario getUsuario(Long id);
  * public Map eliminar(Long id);
  * public List<Usuario> listarUsuarios();

13. Creamos nuestra clase controller la cual contendra todos los puntos de acceso a la aplicacion (CRUD);
    Los métodos get y eliminar requieren de el codigo del usuario para su correcto funcionamiento:
  * http://localhost:8089/usuario/guardarOModificar
  * http://localhost:8089/usuario/listar
  * http://localhost:8089/usuario/get/23.json
  * http://localhost:8089//usuario/eliminar/39.json
  
 14. Creamos las pruebas unitarias correspondientes a cada punto de acceso MainAccentureJUnitTest
 
 15. Desplegamos y usamos postman para ver el correcto funcionamiento
   
   * Prueba de guardar registro
   
   ![pruebaguardado](imagenes/probando_guardado_y_actualizacion.PNG)
   
   * Prueba elimiar registro
   
   ![pruebaeliminacion](imagenes/prueb_eliminar.PNG)
   
   * Prueba cargar un usuario especifico registro
   
   ![pruebagetusuario](imagenes/probando_get.PNG)
   
   * Prueba para listar todos los usuarios del sistema
   
   ![pruebagetusuarios](imagenes/listar_todos_los_registros.PNG)




