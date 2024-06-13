# Project for Tesys

## Overview

Lo scopo del progetto era quella di trasformare la mia applicazione monolitica in un applicazione a microservizi contenitorizzata tramite Docker, aggiungendo un API Gateway per gestire le richieste tra i vari servizi.

## Architecture

L'architettura del progetto è stata trasformata da monolitica a microservizi. Ogni funzionalità principale è stata suddivisa in servizi separati, ciascuno dei quali è responsabile di un insieme specifico di compiti. L'API Gateway è stato aggiunto per centralizzare la gestione delle richieste e migliorare la sicurezza e la gestione del traffico.

### Schema dell'architettura

```plaintext
+--------------+        +-----------------+       +-----------------+
|  API Client  +------->+   API Gateway   +------>+    Department   |
+--------------+        +-----------------+       +-----------------+
                           |       ^                       
                           |       |                  
                           v       |                  
                     +-----------------+       
                     |     Employee    |       
                     +-----------------+

### Microservices
## Department Service
Gestisce tutte le operazioni relative ai dipartimenti.

Endpoint: /department
Tecnologie: Spring Boot, Microsoft SQL Server

## Employee Service
Gestisce tutte le operazioni relative ai dipendenti.

Endpoint: /employee
Tecnologie: Spring Boot, Microsoft SQL Server


## API Gateway
L'API Gateway è il punto di ingresso per tutte le richieste client. Smista le richieste ai vari microservizi. 