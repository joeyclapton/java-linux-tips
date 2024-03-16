Annotations SpringBoot:

- @RequestMapping("/endpoint")
  - Define a criação de uma nova rota

- @RestController
  - Define a classe responsável pela requisição

- @GetMapping("/method-name")
  - Define uma requisição do tipo GET

- @ComponentScan(basePackages = "source/...")
 - Define um novo local a ser observado pelo springboot

- @PathVariable
  - Define nome da variável para passagem de parâmetros

- @RequestParam
  - Define nome da variável para passagem de parâmetros do tipo query-params

Anotações:
- O springboot faz um "scan" para definir de onde o projeto irá ser observado
- Para fazer customização de outros pacotes, usamos a annotation @ComponentScan
