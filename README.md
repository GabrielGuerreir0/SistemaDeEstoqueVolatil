# Sistema de Estoque

Este é um sistema de gerenciamento de estoque simples, implementado em Java. O sistema é volátil, ou seja, todos os dados são perdidos ao ser encerrado.

## Estrutura do Sistema

### Classe `Setor`

Representa um setor dentro do estoque.

#### Atributos
- `nome`: Nome do setor.
- `descricao`: Descrição do setor.
- `localizacao`: Localização do setor.
- `responsavel`: Nome do responsável pelo setor.
- `produtos`: Lista de produtos associados ao setor.

#### Funcionalidades
- **Criar Setor**: Adiciona um novo setor ao estoque.
- **Excluir Setor**: Remove um setor existente do estoque.
- **Listar Setores**: Exibe todos os setores presentes no estoque.

### Classe `Estoque`

Representa o estoque geral.

#### Atributos
- `nome`: Nome do estoque.
- `localizacao`: Localização do estoque.
- `setores`: Lista de setores dentro do estoque.

#### Funcionalidades
- **Criar Estoque**: Inicializa um novo objeto de estoque.
- **Excluir Estoque**: Remove um estoque existente.
- **Listar Estoques**: Exibe todos os estoques disponíveis (se aplicável em um sistema com múltiplos estoques).

### Classe `Produto`

Representa os produtos armazenados nos setores do estoque.

#### Atributos
- `nome`: Nome do produto.
- `descricao`: Descrição do produto.
- `preco_v`: Preço de venda do produto.
- `preco_c`: Preço de custo do produto.
- `codigo`: Código de identificação do produto.
- `quantidade`: Quantidade do produto em estoque.
- `fornecedor`: Nome do fornecedor do produto.

#### Funcionalidades
- **Criar Produto**: Adiciona um novo produto a um setor.
- **Excluir Produto**: Remove um produto existente de um setor.
- **Listar Produtos**: Exibe todos os produtos presentes em um setor.

## Características do Sistema

- **Volatilidade dos Dados**: Todos os dados são perdidos quando o sistema é encerrado.
- **Organização em Setores**: Produtos são organizados em setores, facilitando a gestão e localização.
- **Gestão de Produtos**: Inclui funcionalidades para gerenciamento de produtos, incluindo preços, quantidades e informações do fornecedor.

## Uso

1. **Criar um Estoque**: Inicialize um objeto `Estoque` com nome e localização.
2. **Adicionar Setores**: Adicione objetos `Setor` ao estoque.
3. **Adicionar Produtos**: Adicione produtos aos setores.

## Nota

Este é um sistema básico de exemplo, sem persistência de dados ou funcionalidades avançadas. Ideal para aprendizado ou como ponto de partida para projetos mais complexos.

## Licença

Este projeto está sob domínio público. Sinta-se à vontade para usar e modificar.
