# API de Saludos Personalizados

API REST desarrollada con Spring Boot que permite generar saludos personalizados a partir del nombre ingresado por el usuario mediante la URL.

## Tecnologías utilizadas

- Java 21
- Spring Boot
- Maven
- Swagger / OpenAPI

## Estructura del proyecto

```bash
src/main/java/com/zapata/dszp_SaludoPersonalizado
│
├── controller
│   └── PersonaController.java
│
├── model
│   ├── Persona.java
│   └── SaludoPer.java
│
├── repository
│   └── PersonaRepository.java
│
├── service
│   └── PersonaService.java
│
└── DszpSaludoPersonalizadoApplication.java
```

## Instalación y ejecución

### 1. Clonar el repositorio

```bash
git clone <url-del-repositorio>
```

### 2. Entrar al proyecto

```bash
cd dszp_SaludoPersonalizado
```

### 3. Ejecutar el proyecto

Desde Maven:

```bash
mvn spring-boot:run
```

O directamente desde el IDE.

## Endpoints disponibles

### Listar personas registradas

```http
GET /mensajes
```

Ejemplo:

```bash
http://localhost:8080/mensajes
```

### Generar saludo personalizado

```http
GET /mensajes/{nombre}
```

Ejemplo:

```bash
http://localhost:8080/mensajes/Santiago
```

Respuesta esperada:

```json
Hola Santiago Bienvenido a la API de saludos personalizados
```

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
