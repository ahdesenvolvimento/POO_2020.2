# POO_2020.2

## Respostas poo_03_exercicio
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
