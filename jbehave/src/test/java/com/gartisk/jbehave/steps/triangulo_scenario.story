Informar tipo de Triangulo

Scenario: Triangulo Equilatero
Given Usuário da entrada com valores a, b, c respectivamente 3, 3, 3 
When o Sistema entao irá computar o resultado
Then o Sistema devera responder EQUILATERO

Scenario: Triangulo Isosceles
Given Usuário da entrada com valores a, b, c respectivamente 3, 3, 2 
When o Sistema entao irá computar o resultado
Then o Sistema devera responder ISOSCELES

Scenario: Triangulo Escaleno
Given Usuário da entrada com valores a, b, c respectivamente 3, 4, 5 
When o Sistema entao irá computar o resultado
Then o Sistema devera responder ESCALENO

Scenario: Triangulo Invalido
Given Usuário da entrada com valores a, b, c respectivamente 0, 0, 0 
When o Sistema entao irá computar o resultado
Then o Sistema devera responder INVALIDO