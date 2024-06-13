# Project for Tesys

## Overview

Tesys è un progetto che originariamente era una applicazione monolitica. Recentemente, ho trasformato l'applicazione in una architettura basata su microservizi, aggiungendo un API Gateway per gestire le richieste tra i vari servizi.

## Architecture

L'architettura del progetto è stata trasformata da monolitica a microservizi. Ogni funzionalità principale è stata suddivisa in servizi separati, ciascuno dei quali è responsabile di un insieme specifico di compiti. L'API Gateway è stato aggiunto per centralizzare la gestione delle richieste e migliorare la sicurezza e la gestione del traffico.

### Schema dell'architettura

```plaintext
+--------------+        +-----------------+       +-----------------+
|  API Client  +------->+   API Gateway   +------>+  Microservice 1 |
+--------------+        +-----------------+       +-----------------+
                           |       ^                       
                           |       |                  
                           v       |                  
                     +-----------------+       
                     |  Microservice 2 |       
                     +-----------------+       
