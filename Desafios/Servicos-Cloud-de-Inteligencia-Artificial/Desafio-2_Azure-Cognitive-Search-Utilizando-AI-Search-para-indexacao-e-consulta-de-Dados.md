# Projeto Rede Nacional de Café - Pesquisa de Satisfação do Cliente

Este projeto visa utilizar as ferramentas de **Pesquisa Cognitiva do Azure** para indexar, pesquisar e analisar avaliações de cafés (cafffereviews) com o objetivo de entender a satisfação dos clientes em uma rede nacional de cafés.

O projeto faz uso de um **Storage Account** para armazenar os dados brutos e da **Pesquisa Cognitiva do Azure** para indexar e realizar buscas inteligentes.

## Pré-requisitos

Antes de iniciar, é necessário ter acesso às ferramentas e recursos do Azure. Certifique-se de que você tem:

- Uma **conta do Azure** com permissões para criar e gerenciar recursos.
- Acesso ao **Azure Cognitive Search** (Pesquisa Cognitiva do Azure).
- Um **Storage Account** configurado no Azure para armazenar os dados.
- Dados de avaliações de cafés (cafffereviews), preferencialmente em formatos como JSON ou CSV.

## Passos para Configuração

### 1. Criar um Storage Account no Azure

1. Acesse o **portal do Azure**.
2. Na barra de pesquisa, procure por **Storage Account** e clique em **Criar**.
3. Preencha as informações necessárias:
   - **Nome da conta de armazenamento**: Escolha um nome único.
   - **Localização**: Selecione a região mais próxima de sua base de usuários.
   - **Tipo de conta**: Use o tipo padrão de armazenamento (StorageV2).
4. Clique em **Revisar + Criar** e depois em **Criar**.

### 2. Fazer o Upload dos Dados (cafffereviews) no Storage Account

1. Navegue até o **Storage Account** recém-criado.
2. No menu esquerdo, clique em **Containers** e crie um novo container, por exemplo, `reviews-data`.
3. Faça o upload dos dados de avaliações de café (arquivo JSON ou CSV) para esse container.

### 3. Criar e Configurar a Pesquisa Cognitiva do Azure

1. No portal do Azure, pesquise por **Azure Cognitive Search** e clique em **Criar**.
2. Preencha as informações necessárias para criar o serviço de pesquisa:
   - **Nome**: Dê um nome único para o serviço de pesquisa.
   - **Localização**: Escolha a mesma região do Storage Account.
   - **Tipo de recurso**: Selecione o tipo adequado de pesquisa com base no seu orçamento e necessidades.
3. Clique em **Revisar + Criar** e depois em **Criar**.

### 4. Conectar o Storage Account à Pesquisa Cognitiva

1. Após a criação do serviço de **Pesquisa Cognitiva**, acesse-o no portal do Azure.
2. No painel do serviço de pesquisa, clique em **Fontes de Dados**.
3. Clique em **Adicionar Fonte de Dados** e configure a fonte apontando para o **Storage Account** que contém as avaliações de cafés.
4. Defina o tipo de arquivo (JSON ou CSV) que está sendo indexado.
5. Crie o **Index** que será utilizado para pesquisar as avaliações. Para isso, defina os campos que você deseja indexar, como:
   - **ID da avaliação**
   - **Data**
   - **Avaliação** (Nota)
   - **Comentário**
   - **Nome do café**
   
### 5. Criar o Índice de Pesquisa

1. Na seção **Índices** do serviço de **Pesquisa Cognitiva**, clique em **Adicionar Índice**.
2. Defina o esquema de indexação:
   - O índice deve incluir os campos relevantes para sua pesquisa de satisfação, como:
     - **ID**
     - **Texto** (Comentário)
     - **Nota** (Avaliação de 1 a 5)
     - **Data**
   - Escolha os tipos de campo (e.g., `Edm.String` para texto, `Edm.Int32` para inteiros).
   - Configure se cada campo será **pesquisável**, **filtrável**, **ordenável**, etc.

### 6. Configurar o Pipeline de Indexação

1. Configure o **Indexador** para que ele leia automaticamente os dados do Storage Account e crie o índice.
2. O indexador pode ser configurado para rodar em intervalos regulares (diariamente, semanalmente, etc.) ou ser acionado manualmente conforme necessário.
3. Depois que o índice for criado, execute o indexador para processar os dados.

### 7. Realizar a Pesquisa

Agora que o índice foi criado, você pode começar a fazer pesquisas nas avaliações de cafés.

1. Acesse a página de **Consulta** no portal do Azure.
2. Utilize a API de consulta para realizar buscas sobre os dados indexados, por exemplo:
   - Busque por cafés com a melhor avaliação.
   - Encontre comentários específicos sobre cafés.
   - Filtre avaliações por data ou notas específicas.

Exemplo de consulta:

```http
GET https://[seu-serviço-de-pesquisa].search.windows.net/indexes/[nome-do-índice]/docs?search=delicioso&$filter=rating%20ge%204&api-version=2021-04-30-Preview
````

### 8. Analisar os Resultados

Com os dados indexados e a pesquisa configurada, agora você pode começar a explorar as tendências nas avaliações. Isso pode incluir:

    Identificar padrões de satisfação (ex.: cafés mais bem avaliados).

    Realizar análises de sentimentos nos comentários (pode ser feito com ferramentas adicionais de IA, como a API de Análise de Sentimento do Azure).

    Extrair insights para melhorar o atendimento e a qualidade dos produtos.

### Conclusão

Este laboratório mostrou como utilizar ferramentas de IA, como a Pesquisa Cognitiva do Azure, para processar e analisar grandes volumes de dados de maneira eficiente. Usando um Storage Account para armazenar as avaliações de cafés e um Índice Inteligente para facilitar a pesquisa, você pode explorar as avaliações de clientes e gerar insights valiosos para o negócio.
