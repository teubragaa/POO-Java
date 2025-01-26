Este pequeno repositório tem como objetivo demonstrar aplicações práticas durante o curso dos conceitos de Orientação a Objetos.

O curso aborda desde os fundamentos da POO em Java até princípios de design e tópicos mais avançados.

Tópicos principais do curso:

Fundamentos de Classes, objetos, métodos, atributos, variáveis de instância e de classe. Responsabilidades, colaborações e cartões CRC. 
Testes: Testes de unidade e uso de IDE (Eclipse). 
Conceitos avançados: Herança (classes concretas e abstratas, interfaces). 
* Encapsulamento (modificadores de acesso). 
* Polimorfismo (sobrecarga e sobreposição). 
* Associação (agregação e composição). 
* Exceções.

Princípios de design: "Tell, Don't Ask!" e "Law of Demeter".
Propriedades e anotações Java.

[Atividade 1]: Essa atividade aborda Classes e Objetos, Métodos e Atributos Estáticos e Testes Unitários: criei uma classe Pizza e CarrinhoDeCompra. 
O preço é de acordo com a quantidade de ingredientes. Utilizei List para armazenas os ingredientes e HashMap do tipo STATIC para contabilizar todos os ingredientes utilizados. 
Fiz testes unitários simples para garantir as funcionalidade do programa. 
Criei um @BeforeEach para poder zerar toda contagem de ingredientesUtilizados.

[Atividade 2]: Essa atividade aborda Encapsulamento, Acoplamento e interfaces: criei uma interface chamada FormatadorNome e criei três implementações dessa interface. 
Também criei testes de unidade que fazem os testes da classe com cada uma das implementações da interface. 

[Atividade 3]: Essa atividade aborda herança: criei uma classe chamada Produto que sobrescrevesse equals() e hashCode() de Object, de forma a serem considerados dois produtos iguais quando possuem o mesmo código

[Atividade 4]: Essa atividade aborda Tratamento de Exceções e Coleções (Map): Criei um Processador de arquivo para ler um pequeno texto separado por "->". 
O mapa retornado deve possuir como chave o texto a esquerda de "->" (como "nome") e como valor o texto a direita (como "Braga"). 
Crie uma exceção chamada LeituraArquivoException que deve ser lançada pelo método processar() caso de ocorrer algum erro na leitura do arquivo.
