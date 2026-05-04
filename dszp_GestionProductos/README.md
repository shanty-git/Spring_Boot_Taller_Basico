# API de Gestión de Productos y Categorías

## Descripción
Este proyecto consiste en una API REST desarrollada con Spring Boot, orientada a la gestión de productos y categorías.

La aplicación permite realizar operaciones básicas sobre los datos, como:

- Registrar nuevas categorías
- Consultar el listado de categorías
- Eliminar categorías

- Registrar nuevos productos
- Consultar el listado de productos
- Eliminar productos
- Buscar productos según una categoría específica

Toda la información es gestionada en memoria mediante listas, sin conexión a una base de datos, con fines de aprendizaje y práctica de arquitectura REST.

## Tecnologías utilizadas

- Java
- Spring Boot
- Maven
- OpenAPI / Swagger
- Eclipse IDE

## Estructura del proyecto

El proyecto está organizado siguiendo una arquitectura por capas:

### Model
Contiene las clases que representan las entidades del sistema:

- `Producto`
- `Categoria`

### Repository
Contiene la lógica de almacenamiento en memoria:

- `ProductoRepository`
- `CategoriaRepository`

### Service
Contiene la lógica de negocio:

- `ProductoService`
- `CategoriaService`

### Controller
Contiene los endpoints de la API REST:

- `ProductoController`
- `CategoriaController`

## Endpoints disponibles

### Categorías

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| GET | `/categoria` | Listar categorías |
| POST | `/categoria` | Registrar categoría |
| DELETE | `/categoria/{id}` | Eliminar categoría |

### Productos

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| GET | `/producto` | Listar productos |
| POST | `/producto` | Registrar producto |
| DELETE | `/producto/{id}` | Eliminar producto |
| GET | `/producto/categoria/{id}` | Buscar productos por categoría |

---

## Documentación de la API

Una vez ejecutada la aplicación, la documentación interactiva puede consultarse en:

http://localhost:8080/swagger-ui/index.html

# Autor

Proyecto desarrollado con fines académicos para el aprendizaje de APIs REST con Spring Boot.

Nombre: David Santiago Zapata Perez

Código: 20232578003

Institución: Universidad Distrital Francisco José de Caldas

Asignatura: Programación por componentes

Docente: Noé Arcos Muñoz

Grupo: 578-302
