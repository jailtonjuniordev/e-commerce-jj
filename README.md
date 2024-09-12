# E-commerce JJDev

Este é um projeto de uma plataforma de e-commerce full-stack, construída com uma arquitetura de microsserviços utilizando **Spring Boot** no backend e **ReactJS** no frontend. A plataforma suporta funcionalidades como gerenciamento de produtos, processamento de pedidos, registro de clientes, integração com diferentes métodos de pagamento, e muito mais.

## **Índice**

- [Visão Geral](#visão-geral)
- [Funcionalidades](#funcionalidades)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Arquitetura](#arquitetura)
- [Instalação e Configuração](#instalação-e-configuração)
- [Uso](#uso)
- [Contribuição](#contribuição)
- [Licença](#licença)
- [Contato](#contato)

## **Visão Geral**

Este projeto visa fornecer uma plataforma escalável de e-commerce que pode ser utilizada por lojistas para vender seus produtos online. O sistema é dividido em múltiplos microsserviços para garantir modularidade, flexibilidade e facilidade de manutenção.

## **Funcionalidades**

- **Cadastro e gerenciamento de produtos**: Adição, edição e remoção de produtos pelo administrador.
- **Gerenciamento de clientes**: Registro, autenticação e perfil de cliente.
- **Processamento de pedidos**: Criação, atualização e gerenciamento de pedidos.
- **Sistema de pagamento**: Integração com diferentes provedores de pagamento.
- **Avaliação de produtos**: Clientes podem avaliar e comentar sobre produtos.
- **Notificações**: Envio de notificações para clientes e administradores.
- **Autenticação e autorização**: Controle de acesso baseado em roles (clientes e administradores).
- **Gateway de API**: Roteamento centralizado de requisições para diferentes microsserviços.

## **Tecnologias Utilizadas**

### **Backend**
- **Spring Boot**: Framework para construção de microsserviços em Java.
- **PostgreSQL**: Banco de dados relacional.
- **Kafka**: Sistema de mensageria para comunicação entre microsserviços.
- **Spring Security**: Autenticação e autorização.
- **Docker**: Containerização de aplicações.

### **Frontend**
- **React**: Biblioteca JavaScript para construção de interfaces de usuário.
- **Tailwind CSS**: Framework CSS para estilização rápida e eficiente.
- **Axios**: Cliente HTTP para fazer requisições à API.

## **Arquitetura**

A plataforma é composta pelos seguintes microsserviços:

1. **Serviço de Produtos**: Gerencia o catálogo de produtos.
2. **Serviço de Pedidos**: Gerencia a criação e atualização de pedidos.
3. **Serviço de Clientes**: Gerencia o registro e autenticação de clientes.
4. **Serviço de Estoque**: Monitora e atualiza a quantidade de produtos disponíveis.
5. **Serviço de Notificações**: Envia notificações para clientes e vendedores.
6. **Serviço de Pagamentos**: Processa pagamentos e gerencia transações.
7. **Serviço de Autenticação**: Gerencia a autenticação e autorização de usuários.
8. **API Gateway**: Roteia as requisições para os microsserviços apropriados.

## **Instalação e Configuração**

### Consultar com o desenvolvedor para deploy e para receber o manual de utilização.
