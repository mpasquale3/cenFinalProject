# 📝 Spring Boot Todo App (Docker + Kubernetes)

This is a simple Spring Boot-based to-do list app that supports adding tasks and viewing them via a styled HTML interface.

The project demonstrates:

- Spring Boot backend + static frontend
- Maven for build automation
- Docker containerization
- Kubernetes deployment with Minikube
- Bonus: Custom CSS theme ✨

---

## 🛠️ Tech Stack

- Java 17 / Spring Boot 3
- Maven
- Docker
- Kubernetes (Minikube)
- IntelliJ IDEA

---

## 🚀 How to Run It Locally

### 1. Build the JAR
```bash
mvn clean package


2. Build Docker Image

docker build -t mpasquale3/todo-app .

3. Load image into Minikube

minikube start
minikube image load "mpasquale3/todo-app:latest"

4. Apply Kubernetes Resources

kubectl apply -f todo-deployment.yaml
kubectl apply -f todo-service.yaml

5. Access the App

minikube service todo-service
