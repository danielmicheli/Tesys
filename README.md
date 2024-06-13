# Project for Tesys

## Overview

Tesys è un progetto che originariamente era una applicazione monolitica. Recentemente, abbiamo trasformato l'applicazione in una architettura basata su microservizi, aggiungendo un API Gateway per gestire le richieste tra i vari servizi e un Eureka Server per il service discovery.


## Architecture

L'architettura del progetto è stata trasformata da monolitica a microservizi. Ogni funzionalità principale è stata suddivisa in servizi separati, ciascuno dei quali è responsabile di un insieme specifico di compiti. L'API Gateway è stato aggiunto per centralizzare la gestione delle richieste e migliorare la sicurezza e la gestione del traffico. Un Eureka Server è stato aggiunto per gestire il service discovery dei microservizi.

### Schema dell'architettura

```plaintext
+--------------+        +-----------------+       +-----------------+
|  API Client  +------->+   API Gateway   +------>+    Department   |
+--------------+        +-----------------+       +-----------------+
                           |       ^                      |     
                           |       |                      |
                           v       |                      |
                     +-----------------+           +-----------------+
                     |  Eureka Server  |           |     Employee    |
                     +-----------------+           +-----------------+
   ```                               
# Microservices
## Department Service
Gestisce tutte le operazioni relative ai dipartimenti.

Endpoint: /department <br>
Tecnologie: Spring Boot, Microsoft SQL Server

## Employee Service
Gestisce tutte le operazioni relative ai dipendenti.

Endpoint: /employee <br>
Tecnologie: Spring Boot, Microsoft SQL Server

## API Gateway
L'API Gateway è il punto di ingresso per tutte le richieste client. Smista le richieste ai vari microservizi.

## Eureka Server
Eureka Server gestisce il service discovery, permettendo ai microservizi di registrarsi e scoprire altri servizi.

Endpoint: /eureka <br>
Tecnologie: Spring Cloud Netflix Eureka

## Utilizzo di Docker
Costruisci i container Docker:

```plaintext
docker-compose build
```
Avvia i servizi:
```plaintext
docker-compose up
```
## Usage
Una volta avviati i servizi, puoi accedere agli endpoint tramite l'API Gateway.

Department Service: http://localhost:8080/department <br>
Employee Service: http://localhost:8080/employees <br>
Eureka Server Dashboard: http://localhost:8083
