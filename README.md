# Kubernetes
Kubernetes è utilizzato per orchestrare i container che eseguono i microservizi. Tutti i componenti sono containerizzati e gestiti tramite Kubernetes per garantire scalabilità, disponibilità e gestione centralizzata.

## Eureka Server
Eureka Server gestisce il service discovery, permettendo ai microservizi di registrarsi e scoprire altri servizi.

Endpoint: /eureka <br>
Tecnologie: Spring Cloud Netflix Eureka

## Setup and Installation
Prerequisites
Java 11 o superiore <br>
Maven <br>
Docker <br>
Minikube (per eseguire Kubernetes in locale) o un cluster Kubernetes <br>

## Deploy su Kubernetes
Avvia Minikube
```plaintext
minikube start
```
## Applica i file di configurazione Kubernetes
Avvia Minikube
```plaintext
kubectl apply -f k8s/eureka-server-deployment.yaml
kubectl apply -f k8s/department-deployment.yaml
kubectl apply -f k8s/employee-deployment.yaml
kubectl apply -f k8s/api-gateway-deployment.yaml
```
Posso accedere al service tramite ip di minikube o tramite un ingress in questo caso l'ingress per l'apigateway è "api.example.com"

# Opzionale
## Ottengo ip di minikube
```plaintext
minikube ip
```

## Accedi ai servizi
```plaintext
minikube service api-gateway 
```
Department Service: http://<minikube-ip>:<minikube-port>/department <br>
Employee Service: http://<minikube-ip>:<minikube-port>/employees <br>
Eureka Server Dashboard: http://<minikube-ip>:<minikube-port>/eureka <br>




