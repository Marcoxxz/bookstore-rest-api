# 📚 Spring Boot CRUD API - Book Management

Este proyecto es una **API RESTful** desarrollada con **Spring Boot** y **Maven**, que permite gestionar una colección de libros.  
Incluye operaciones CRUD y está documentada con **Swagger UI**.

---

## 🚀 Características
- Crear, leer, actualizar y eliminar libros (CRUD completo).
- API REST con JSON.
- Persistencia con **Spring Data JPA**.
- Documentación automática con **Swagger/OpenAPI**.

---

## 📂 Endpoints principales
| Método | Endpoint       | Descripción                  |
|--------|---------------|------------------------------|
| GET    | `/books`       | Obtener todos los libros     |
| GET    | `/books/{id}`  | Obtener un libro por ID      |
| POST   | `/books`       | Crear un nuevo libro         |
| PUT    | `/books/{id}`  | Actualizar un libro existente|
| DELETE | `/books/{id}`  | Eliminar un libro por ID     |

Ejemplo de JSON para crear un libro:
```json
{
  "title": "El Principito",
  "author": "Antoine de Saint-Exupéry",
  "year": 1943
}
```

---

## 🛠️ Requisitos
- Java 17+  
- Maven 3.8+  

---

## ▶️ Ejecución del proyecto
Clonar el repositorio y compilar el proyecto:
```bash
mvn clean install
```

Ejecutar la aplicación:
```bash
mvn spring-boot:run
```

La API estará disponible en:
```
http://localhost:8080
```

---

## 📖 Documentación Swagger
Una vez ejecutada la aplicación, abre en tu navegador:
```
http://localhost:8080/swagger-ui/index.html
```

---

## 📌 Tecnologías usadas
- **Spring Boot 3**  
- **Maven**  
- **Spring Data JPA**  
- **H2 Database** (base en memoria)  
- **Swagger / OpenAPI**  

---

## 📬 Autor
Proyecto de ejemplo para prácticas con Spring Boot y Maven.  
¡Modifícalo y amplíalo según tus necesidades! 🚀

