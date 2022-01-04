# Projeto do Bootcamp - DIO 
## Criando um Gerenciador de Salas de Reuniões com Java e Angular

Neste projeto foram desenvolvidos e abordados os seguintes tópicos:

* Setup inicial de projeto com o Spring Boot Initialzr 
* Criação de modelo de dados para o mapeamento de entidades em bancos de dados
* Desenvolvimento de operações de gerenciamento de usuários (Cadastro, leitura, atualização e remoção de salas de reunião com horários de um sistema).

#### O foi utilizado:

#### Back-end:
Stack utilizada:
Spring Web
Spring Data JPA
H2 Database
Java 8
Maven
Endpoints criados na API
Criar sala de reuniao POST - /api/v1/rooms

Listar todas as salas GET - /api/v1/rooms

Buscar uma sala pelo Id GET - /api/v1/rooms/{id}

Atualizar uma sala pelo Id PUT - /api/v1/rooms/{id}

Excluir uma sala pelo id DELETE - /api/v1/rooms/{Id}

#### Front-end
##### ClientRoom

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 9.0.0-rc.7.

##### Development server

Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

##### Code scaffolding

Run `ng generate component component-name` to generate a new component. You can also use `ng generate directive|pipe|service|class|guard|interface|enum|module`.

##### Build

Run `ng build` to build the project. The build artifacts will be stored in the `dist/` directory. Use the `--prod` flag for a production build.

##### Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

##### Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).

##### Further help

To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).

##### verificar versão nodejs
node -v

###### verificar versão npm 
npm -v

###### instalar angular 9
npm install -g @angular/cli@9.0.0-rc.7

###### verificar versão angular
ng --version

###### criar projeto 
ng new client-room
