# CSManagementSystem
Customer Support Management System, this project is for students of java, using data structures studied for making a real life project.

## Features
### 1. Service Request History (Stack)
- **Data Structure:** Stack implemented using a linked list.
- **Functionality:** Each entry in the stack contains:
- **ID:** Unique identifier for the service request.
- **Description:** Details of the request.
- **Date and Time:** When the request was made.
- **Methods:**
  - Add Request: Pushes a new service request onto the stack.
  - Remove Request: Pops the most recent service request from the stack.
### 2. Customer Service Queue (Queue)
- **Data Structure:** Queue implemented using a linked list.
- **Functionality:** Each entry in the queue contains:
- **Name:** Customer’s name.
- **ID Number:** Customer’s identification number.
- **Reason:** Reason for the customer’s visit.
- **Methods:**
  - Add Customer: Enqueues a new customer for service.
  - Attend Customer: Dequeues the next customer for service.

---

Desenvolva um programa em Java que simule um sistema de gerenciamento de atendimento ao cliente utilizando uma lista para Implementar uma pilha e uma fila. A pilha será usada para armazenar um histórico de solicitações de serviço, enquanto a fila será usada para gerenciar a ordem de atendimento dos clientes.

### Pilha - Histórico de Solicitações:
- Implemente uma pilha usando uma lista encadeada.
- Cada elemento deve conter informações da solicitação (ID da solicitação, descrição, data e hora).
- Inclua métodos para adicionar e remover solicitações do histórico.

### Fila - Ordem de Atendimento:
- Implemente uma fila usando uma lista encadeada.
- Cada elemento deve conter informações do cliente (nome, número de identificação, motivo do atendimento).
- Inclua métodos para adicionar clientes à fila e atender o próximo cliente.
