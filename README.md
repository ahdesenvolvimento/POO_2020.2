# POO_2020.2

# Desconsiderar a pasta Atividades

## As respostas escritas da atividade poo_exercicio_02 estão em arquivos de texto que eu criei dento da pasta

## Respostas poo_exercicio_03
### 1
- Não, pois um atributo de classe sempre será inicializado pelo valor 0
### 2
- Não irá compilar, pois está passando um parametro para o construtor sendo que o mesmo não é exigido, neste caso
### 3
- Irá imprimir 0, pois é o valor do atributo, no construtor ele está usando o THIS no print, fazendo referência ao atributo
### 4
- No trecho valor = valor + valor, o que está acontecendo é que o parametro será incrementado e não o atributo valor
para isso colocar o THIS ficando this.valor = this.valor + valor;
### 5
- O erro se dá pois a classe é inicializada por um construtor e no trecho de código, não tem nenhum parametro para o construtor, por isso
da erro
### 6
- a) Resultado é 90 90, pois o c1 perdeu a referencia e apontou para c2, logo qualquer operação em c1 iria afetar c2 e vice-versa
- b) A referencia é perdida

## Respostas poo_exercicio_04
### 1
- Imprime o valor do index
### 2
- Erro de execução, pois da uma exception em tempo de execução

## Respostas poo_exercicio_05
### 1
- Erro, pois primeiro precisa ser importado os pacotes

# Respostas poo_exercicio_06_parte_2
### 4)a
- Todo boi é animal, mas nem todo animal é boi
### 4)b
= Não, pois não é possivel converter animal para peixe

### 5)c
- pois todo peixe e bovino é animal

### 11
= V, V, V, V, V

### 12
- Exibe o metodo 1 da classe b

### 13
- Da erro, pois o metodo 2 não existe na classe a

### 14
- Irá chamar o metodo 1 na classe a no metodo 1 da classe b

### 16
- Pois para ter a sobrecarga de metodos, precisam ter parametros diferentes

### 17
- Não está tendo a sobrecarga, por isso da erro na execução, para ajeitar, basta reduzir ou aumentar o numero de parametros ou então mudar o tipo dos parametros


## Respostas poo_exercicio_07
### 7
- Sim, pois o método transferir faz uso de outros dois metodos que estão devidamente validados.

### 11
- Erro, pois por ser a mesma exceção, ja diz que ja foi capturado

### 12
- O programa entra no primeiro try, nesse try ele gera um exception, no primeiro catch esse exception é capturado, o processo é repetido, o segundo try gera outro exception que é capturado pelo segundo catch, no fim do segundo catch, tem o print de A, no fim do segundo catch tem o print de B e fora do escopo do try e catch tem o print de C

### 13
### a)
- Os pontos falhos apresentados, são uteis principalmente para o estudo de programação, porém deixam o código feio e as vezes não utilizavel em outras plataformas

### b)
- Pois deixa o código mais robusto e utilizavel em varias plataformas

## Respostas poo_exercicio_07

### 1
- Não, podem ser somente herdadas, pois as classes abstratas servem como uma base

### 2
- Classes que herdam de uma classe abstrata são obrigadas a implementar seus métodos, no caso dessa questão basta que a ClasseConcreta implemente o método imprimaAlgo() da ClasseAbstrata

### 3
- Erro de compilação

### 6
- Pois se está criando um array de figuras geometricas e não instanciando a classe
