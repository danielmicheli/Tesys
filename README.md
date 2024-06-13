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
