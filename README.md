Integrantes: Vinícius Figueiredo e Arthur Crossy
Descrição Geral
Esta aplicação tem como objetivo registrar dados em um arquivo externo, armazenando informações como nome, data de criação, data de conclusão, status e prioridade de cada registro. Os dados são persistidos em um formato estruturado para facilitar a leitura e análise posterior.
Também foram acrescidos: O envolvimento e a criação e manipulação de entidades de tarefas e categorias, utilizando técnicas avançadas de estrutura de dados, como a Árvore B+ para implementar índices e relacionamentos.

Funcionalidades
Criação de registros: Permite adicionar novos registros ao sistema, definindo os atributos nome, data de criação, status e prioridade. A data de conclusão é inicializada como nula e pode ser atualizada posteriormente.
Leitura de registros: Carrega os registros existentes do arquivo para a memória, permitindo a visualização e manipulação dos dados.
Atualização de registros: Permite modificar os atributos de um registro existente, como status ou data de conclusão.
Remoção de registros: Permite excluir registros indesejados do sistema.
Persistência de dados: Salva as alterações realizadas nos registros no arquivo externo de forma persistente.

Tecnologias Utilizadas
Linguagem de programação: Java

Classes criadas no TP3: 

Classe ArquivoRotulo

ela constroi o arquivo de rotulos, e tem seu CRUD de rotulos implementado, juntamente com os métodos para manipular os rotulos.

Classe ElementoLista

estrutura lista invertida implementada.

Classe Rotulo

entidade criada com seus atributos e métodos de serialização e deserialização, toString e print.

Classe TarefaRotulo

Classe que monta o par TarefaRotulo, que permite a busca de tarefas por rótulo.

Classe RotuloTarefa

Classe que monta o par RotuloTarefa, que permite a busca de tarefas por rótulo.

Classe MenuRotulo

Classe que constroi a interface de rotulos acessada no menu do programa.

Classe ParNomeIDRotulo

Classe que constroi o Relacionamento entre nome, ID e rotulos

Classe ParNomeIDTarefa

Classe que constroi o Relacionamento entre nome, ID e tarefas


As operações mais "difíceis" foram as que envolvem a lista invertida, pois é a novidade desse TP. Para implementar o relacionamento utilizando árvore b+, não tive tanta dificuldade, pois a estrutura já foi introduzida no TP 2. 

Para concluir, vocês devem, necessariamente, responder ao seguinte checklist (copie as perguntas abaixo para o seu relatório e responda sim/não em frente a elas):

O índice invertido com os termos das tarefas foi criado usando a classe ListaInvertida? Sim
O CRUD de rótulos foi implementado? Sim
No arquivo de tarefas, os rótulos são incluídos, alterados e excluídos em uma árvore B+? Sim
É possível buscar tarefas por palavras usando o índice invertido? Sim
É possível buscar tarefas por rótulos usando uma árvore B+? Sim
O trabalho está completo? Sim
O trabalho é original e não a cópia de um trabalho de um colega? Sim
