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

![paso 1](paso_1_crear_proyecto.PNG ) 

2. Definimos los paquetes básicos que vamos a usar en la aplicación

![Paso 2](paso_2_definir_paquetes_basicos.PNG)

3. DEfinimos el archivo pom

![Paso 3](paso_3_definir_el_pom.PNG)

4. Definimos el archivo application.properties y el puerto por sel cual se desea comunicar la aplicación

![Paso 4](application.properties.PNG)

5.Definimos nuetra clase inicial del proyecto 

![paso 5](paso_4_crear_clase_run_para_el_proyecto.PNG)

6. Creamos una base de datos mongodb usando el proveedor de servicio [atlas](https://cutt.ly/jwMx5IT) el cual nos permite tener una base de datos disponble 24/7

![paso 6](mongo.PNG)

7. Realizamos la conexion en el archivo application.properties 
