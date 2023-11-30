# Sistematizacao
Sistematização - POO


Trata-se de uma aplicação para gerenciamento de entregadores de uma empresa de logística
Intruções para utilização:

Para incluir um entregador:
- URI: http://localhost:8080/entregadores
- Método: POST
- Formulário JSON: id, veiculo, matrícula, capacidade de carga, nome

Para listar todos os entregadores:
- URI: http://localhost:8080/entregadores
- Método: GET

Para mostrar apenas um entregador
- URI: http://localhost:8080/entregadores/{id}
- Método: GET

Para excluir um entregador
- URI: http://localhost:8080/entregadores/{id}
- Método: DELETE

Para alterar um entregador
- URI: http://localhost:8080/entregadores/{id}
- Método: PUT
- Formulário JSON: id, veículo, matrícula, capacidade de carga, nome.
