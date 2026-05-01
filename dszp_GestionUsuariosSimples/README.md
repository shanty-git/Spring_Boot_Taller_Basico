# API Gestión de Usuarios

Proyecto desarrollado con :contentReference[oaicite:0]{index=0} **Spring Boot** que implementa una API REST básica para la gestión de usuarios.

Este servicio permite realizar operaciones CRUD básicas sobre usuarios, específicamente:

- Crear usuarios (**POST**)
- Consultar/listar usuarios (**GET**)
- Eliminar usuarios (**DELETE**)

## Características del proyecto

La API permite administrar usuarios con la siguiente estructura:

| Campo  | Tipo  |
|--------|-------|
| id     | Long  |
| nombre | String|
| edad   | int   |
| correo | String|


## Tecnologías utilizadas

- Spring Boot
- Swagger / OpenAPI
- Java
- Maven


## Documentación de la API

Una vez ejecutado el proyecto, la documentación interactiva de Swagger se encuentra disponible en:

http://localhost:8080/swagger-ui/index.html


Desde allí podrás probar todos los endpoints directamente desde el navegador.


## Endpoints disponibles

### Obtener usuarios

GET /usuarios

Permite consultar todos los usuarios registrados.

### Crear usuario

POST /usuarios

Ejemplo de body:

{
  "id": 1,
  "nombre": "David",
  "edad": 22,
  "correo": "david@email.com"
}

### Eliminar usuario

DELETE /usuarios/{id}

Permite eliminar un usuario por su identificador.

## Diagrama de clases

A continuación se muestra el diagrama de clases del proyecto:

![Diagrama de clases](Diagramas/GestionUsuariosSimple.drawio.png)


## Ejecución del proyecto

1. Clonar el repositorio:

git clone URL_DEL_REPOSITORIO


2. Entrar al proyecto:

cd Proyecto_GestionUsuariosSimples

3. Ejecutar la aplicación desde tu IDE o con Maven.

4. Abrir Swagger en el navegador:

http://localhost:8080/swagger-ui/index.html

## Autor

Proyecto desarrollado con fines académicos para el aprendizaje de APIs REST con Spring Boot.

Nombre: David Santiago Zapata Perez

Código: 20232578003

Institución: Universidad Distrital Francisco José de Caldas

Asignatura: Programación por componentes

Grupo: 578-302
