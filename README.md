cenFinalProject 
This project is a simple to-do list application built using Spring Boot. It allows users to add tasks through a styled HTML interface, with each task displayed immediately upon submission. The frontend was designed to have an earthy, calming aesthetic, using soft tones of green, blue, and brown.
The goal of the project was to practice the full software development workflow, including writing, building, packaging, containerizing, and deploying an application using professional tools. The application was developed in IntelliJ IDEA, built using Maven, and containerized using Docker. From there, it was deployed into a local Kubernetes cluster using Minikube.
To make the application accessible through the browser, I wrote two Kubernetes configuration files in YAML. The first defined the deployment, including the container image and how many replicas should run. The second defined the service that exposed the application to a specific port so it could be accessed from the browser. All steps were performed and tested locally.
The technologies used in this project include:
•	Java 17
•	Spring Boot
•	Maven
•	Docker
•	Kubernetes (minikube)
•	IntelliJ IDEA

Steps to run the application locally:
1.	Build the JAR using Maven:
a.	Mvn clean package
2.	Build the Docker Image:
a.	Docker build -t mpasquale3/todo-app .
3.	Start minikube and load the image into the cluster:
a.	Minikube start
b.	Minikube image load “mpasquale3/todo-app:latest”
4.	Apply the deployment and service configurations:
a.	Kubectl apply -f todo-deployment.yaml
b.	Kubectl apply -f todo-service.yaml
5.	Open the application in a browser:
a.	Minikube service todo-service
This command will automatically open the application in a browser window using the port exposed by the Kubernetes service. From there, users can interact with the to-do list, adding and viewing tasks in real time.
This project helped me better understand how backend code, containerization, and orchestration tools all work together in a modern software development environment.

