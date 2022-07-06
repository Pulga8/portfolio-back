# Agregar entidades al modelo

![Gerarquía de accesos](https://mermaid.ink/img/pako:eNo9j8sOgjAQRX-lmRUm8ANdmMjDxK24sy4mdJRGaMlQTJTw75aHzurm3LO4M0LlNIEEZR-MXS0uubIi3OFaWG806ptIkr1IozN1rjfesXG7VUmXJotO1hPf8bPhbMF5VBK_TPW38wUfo8xZz65B7XhtIIaWuEWjw4xxRgp8TS0pkCFq5KcK86bgDZ1GT4WeZ4C8Y9NTDDh4V75tBdLzQD8pNxgeajdr-gLh0EkD)

Diagrama hecho con [Mermaid Live Editor](https://mermaid.live/edit#pako:eNo9j8sOgjAQRX-lmRUm8ANdmMjDxK24sy4mdJRGaMlQTJTw75aHzurm3LO4M0LlNIEEZR-MXS0uubIi3OFaWG806ptIkr1IozN1rjfesXG7VUmXJotO1hPf8bPhbMF5VBK_TPW38wUfo8xZz65B7XhtIIaWuEWjw4xxRgp8TS0pkCFq5KcK86bgDZ1GT4WeZ4C8Y9NTDDh4V75tBdLzQD8pNxgeajdr-gLh0EkD)

Dada el equema que debemos seguir listaremos los pasos para agregar una entidad, utilizaremos la entidad _Persona_ como ejemplo:

1. Capa Model, Clase _Persona_.
2. Capa Respository, Interface _PersonaRepository_, también puede llamarse _IPersonaRepository_.
3. Capa Service, Clase PersonaService

> Con éstos tres pasos establecimos todo para que JPA de Hibernate cree las respectibas tablas.

4. Capa Service o Bussines, Interface IPersonaService.
5. Capa Controller, Clase PersonaController.


# Instalación de Xampp

[Recurso](https://www.how2shout.com/linux/install-xampp-on-ubuntu-22-04-lts-jammy-linux/)

# Error
**Puerto 3306 ocupado**

Entonces matamos el proceso que lo ocupa.

```sh
sudo kill $(sudo lsof -t -i:3306)
```


Listar procesos que están escuchando 

```sh
sudo lsof -i -P -n | grep LISTEN
```


**[ERROR] Incorrect definition of table mysql.event: expected column**

```sh
cd /opt/lampp/bin
sudo ./mysql_upgrade

```

**ERROR 2002 (HY000): Can't connect to local MySQL server through socket '/var/run/mysqld/mysqld.sock' (2)**

```sh
sudo apt-get install mysql-server

```
[link](https://stackoverflow.com/questions/11657829/error-2002-hy000-cant-connect-to-local-mysql-server-through-socket-var-run)


# Ejecución

Para correrlo primero debemos prender en Xampp, los servicios MySQL y Apache.

Iniciar Xampp

```sh
sudo /opt/lampp/lampp start
```

Iniciarlo con GUI

```sh
cd /opt/lampp

sudo ./manager-linux.run (or manager-linux-x64.run)
```



* Luego correr el Back de SpringBoot.

* Luego Podemos visualizarlo en el navegador en las rutas

  * http://localhost:8080/educacion/traer

  > En caso de no tener nada en la bd nos devuelve un json vacío.


Y para agregar algún dato a la bd a través de Postman haciendo un Post a la ruta

* http://localhost:8080/educacion/crear


Xampp nos ofrece un visualizador de la bd vía la ruta:

* http://localhost/phpmyadmin/index.php



# Información sobre el tema

En el módulo 8 Programacion con Spring, justo en la sección "ABML con SpringBoot + JPA + Hibernate"

# RoadMap

![Ruta de aprendizaje](/assets/roadmap_backend_2.png)



# Algunos Links utiles

[Ubuntu 16.04 - How to start xampp control panel](https://askubuntu.com/questions/890818/ubuntu-16-04-how-to-start-xampp-control-panel)


[Install XAMPP on Ubuntu 22.04 LTS Jammy Linux](https://www.how2shout.com/linux/install-xampp-on-ubuntu-22-04-lts-jammy-linux/)
