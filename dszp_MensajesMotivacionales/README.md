# API de Mensajes Motivacionales

API REST desarrollada Spring Boot que devuelve un mensaje motivacional aleatorio cada vez que el usuario accede a la URL del servicio.

## Descripción

Este proyecto implementa un servicio web que contiene una colección de mensajes motivacionales predefinidos en memoria. 

Cada vez que se realiza una petición HTTP al endpoint principal, el sistema selecciona uno de los mensajes de forma aleatoria y lo retorna como respuesta.

## Características

- Generación de mensajes aleatorios.
- API REST simple.
- Datos almacenados en memoria.
- Inicialización automática de mensajes al arrancar la aplicación.

## Tecnologías utilizadas

- Java
- Spring Boot
- Maven
- OpenAPI / Swagger
- Eclipse IDE

## Estructura del proyecto

```bash
src/main/java/com/zapata/dszp_MensajesMotivacionales
│
├── controller
│   └── MensajeController.java
│
├── service
│   └── MensajeService.java
│
├── repository
│   └── MensajeRepository.java
│
├── model
│   └── Mensaje.java
│
└── DszpMensajesMotivacionalesApplication.java
```

## Instalación y ejecución

### 1. Clonar el repositorio

```bash
git clone URL_DEL_REPOSITORIO
```

### 2. Entrar al proyecto

```bash
cd dszp_MensajesMotivacionales
```

### 3. Ejecutar la aplicación

Con Maven:

```bash
mvn spring-boot:run
```

## Uso de la API

### Obtener un mensaje motivacional

**GET**

```http
http://localhost:8080/motivacional
```

### Ejemplo de respuesta

```text
El éxito no es definitivo; el fracaso no es fatal. Lo que realmente cuenta es tener valor para continuar
```

## Funcionamiento interno

Cuando la aplicación inicia:

1. Se cargan mensajes motivacionales predefinidos.
2. Estos mensajes se almacenan en una lista en memoria.
3. Cada petición selecciona un mensaje aleatorio.
4. El mensaje es enviado como respuesta al cliente.

## Documentación Swagger

Una vez ejecutada la aplicación, la documentación puede consultarse en:
```bash
http://localhost:8080/swagger-ui/index.html
```

## Autor

Proyecto desarrollado con fines académicos para el aprendizaje de APIs REST con Spring Boot.

Nombre: David Santiago Zapata Perez

Código: 20232578003

Institución: Universidad Distrital Francisco José de Caldas

Asignatura: Programación por componentes

Docente: Noé Arcos Muñoz

Grupo: 578-302
