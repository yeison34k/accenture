# Aplicación microservicios
Aplicación desarrollada para mostrar la construcción básica de un microservicio usando spring.

## Url JavaDoc de la aplicación
[JAVADOC](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

##  Herramientas usadas
* [Java 8](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
* [netBeans](https://netbeans.org/downloads/8.2/)  
* [Spring web](https://mvnrepository.com/artifact/org.springframework/spring-web) 
* [Spring test](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-test) 
* [Spring mongodb](https://spring.io/projects/spring-data-mongodb) 
* [loombook](https://projectlombok.org/) 
* [dozer](https://www.arquitecturajava.com/javabeans-dto-y-dozer/) 
* [log4j](https://logging.apache.org/log4j/2.x/) 
* [Postman](https://www.getpostman.com) 

## Pasos para crear la aplicación

1. Se crea el proyecto usando maven.

![paso 1](imagenes/paso_1_crear_proyecto.PNG ) 

2. Se definen los paquetes básicos que vamos a usar en la aplicación.

![Paso 2](imagenes/paso_2_definir_paquetes_basicos.PNG)

3. Se realiza la configuración e instalación de las dependencias que vamos a usar.

![Paso 3](imagenes/paso_3_definir_el_pom.PNG)

4. Se define el archivo application.properties y el puerto por el cual se desea comunicar la aplicación.

![Paso 4](imagenes/application.properties.PNG)

5.Se define la clase inicial del proyecto MainAccenture.

6. Se crea una base de datos mongodb usando el proveedor de servicio [atlas](https://cutt.ly/jwMx5IT) el cual nos permite tener una base de datos disponble 24/7; de igual forma le asignamos un usuario y una ip que puede tener acceso a la misma.

![paso 6](imagenes/mongo.PNG)

7. Se realiza la conexión en el archivo application.properties. 
  * mongodb://accenture:w46nrBtzrpDWeY0c@cluster0-shard-00-00-zhb9q.mongodb.net:27017,cluster0-shard-00-01-zhb9q.mongodb.net:27017,cluster0-shard-00-02-zhb9q.mongodb.net:27017/Accenture?ssl=true&replicaSet=Cluster0-shard-0&authSource=admin&retryWrites=true

8. Se crean las  entidades sobre las cuales vamos a trabajar, en este caso es Usuario, dentro de esta colocamos el nombre al que va hacer referencia en la base de datos y los campos que va a tener.

9. Se crean los DTO de request y response que van a ser usados al momento de hacer una petición desde el cliente.

10. Se definen un archivo de configuración y realizamos la configuracón básica del dozer para manejo de entidades y dto.

11. Se crea una interfaz en el paquete de DAO y esta debe extender de MongoRepository, la cual contiene los métodos básicos para el manejo de bases de datos no relacionales mongodb.

12. Se crea la interfaz e inplementación de el servicios encargados de la lógica para el negocio
 ```
  public UsuarioResponse guardar(UsuarioRequest usuario);
  public Usuario getUsuario(Long id);
  public Map eliminar(Long id);
  public List<Usuario> listarUsuarios();
 ```

13. Se crea un clase controller,  la cual contendrá todos los puntos de acceso a la aplicación (CRUD). Los métodos get y eliminar     requieren de el código del usuario para su correcto funcionamiento:
  * http://localhost:8089/usuario/guardarOModificar
  * http://localhost:8089/usuario/listar
  * http://localhost:8089/usuario/get/23.json
  * http://localhost:8089//usuario/eliminar/39.json
  
 14. Se crean las pruebas unitarias correspondientes a cada punto de acceso MainAccentureJUnitTest
 
 15. Se despliega y usamos postman para ver el correcto funcionamiento.
   
   * Prueba de guardar registro.
   
   ![pruebaguardado](imagenes/probando_guardado_y_actualizacion.PNG)
   
   * Prueba elimiar registro.
   
   ![pruebaeliminacion](imagenes/prueb_eliminar.PNG)
   
   * Prueba para cargar un usuario especifico.
   
   ![pruebagetusuario](imagenes/probando_get.PNG)
   
   * Prueba para listar todos los usuarios del sistema.
   
   ![pruebagetusuarios](imagenes/listar_todos_los_registros.PNG)




