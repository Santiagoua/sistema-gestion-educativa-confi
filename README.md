# Sistema de Gestión Educativa - Confi 📚

Este es un sistema basado en microservicios desarrollado con **Spring Boot 3**, **WebFlux** y **MongoDB**, diseñado para registrar, consultar y administrar libros y autores. Cuenta con un **API Gateway**, pruebas automatizadas, integración continua y despliegue mediante Docker y GitHub Actions.

---

## 🧱 Estructura del Proyecto

```bash
sistema-gestion-educativa-confi/
│
├── libro-service/        # Microservicio para gestionar libros
├── autor-service/        # Microservicio para gestionar autores
├── gateway-service/      # API Gateway con Spring Cloud Gateway
├── docker-compose.yml    # Orquestación de servicios con Docker
└── .github/workflows/    # Workflows para CI con GitHub Actions
🚀 Tecnologías Utilizadas
Spring Boot 3 + WebFlux

MongoDB

Spring Cloud Gateway (opcional: Eureka)

JUnit + Mockito + WebTestClient

Docker + Docker Compose

GitHub Actions (CI/CD)

JDK 17

Maven

⚙️ Endpoints Principales
📚 Libro Service
POST /libros – Crear un libro

GET /libros – Listar todos los libros

GET /libros/{id} – Buscar libro por ID

PUT /libros/{id}/autor – Asignar un autor a un libro

👨‍🏫 Autor Service
POST /autores – Crear un autor

🌐 API Gateway
Encamina las rutas:

/libros/** → libro-service

/autores/** → autor-service

🐳 Cómo levantar el proyecto con Docker
bash
Copiar
Editar
docker-compose up --build
Esto levanta:

MongoDB

libro-service (en el puerto 8081)

autor-service (en el puerto 8082)

gateway-service (en el puerto 8080)

✅ Pruebas Automatizadas
Ejecutar pruebas locales con Maven:

bash
Copiar
Editar
mvn test
GitHub Actions compila y ejecuta pruebas en cada push/pull request a main.

🩺 Monitorización
Cada microservicio incluye Spring Boot Actuator con /actuator/health expuesto.

🔐 Seguridad (Opcional)
Puedes extender el sistema con autenticación JWT en el gateway o en los servicios.

📦 Contribuir
Haz un fork del repositorio

Crea tu rama: git checkout -b mi-nueva-feature

Realiza tus cambios y haz commit: git commit -m 'Agrega nueva feature'

Haz push a tu rama: git push origin mi-nueva-feature

Abre un Pull Request
