# Arquitetura Simples no Azure

Este repositório contém os passos necessários para construir uma arquitetura simples utilizando a plataforma de nuvem Azure. A arquitetura contempla os seguintes componentes:

* **Máquina Virtual (VM)**
* **Banco de Dados SQL**
* **App Service (Web App)**

## Pré-requisitos

Antes de iniciar a construção da arquitetura, certifique-se de ter os seguintes itens:

* **Conta no Azure**: Caso ainda não tenha uma, você pode criar uma conta [aqui](https://azure.microsoft.com/en-us/free/).
* **Azure CLI**: A CLI do Azure instalada na sua máquina. Instruções para instalação podem ser encontradas [aqui](https://learn.microsoft.com/pt-br/cli/azure/install-azure-cli).
* **Editor de Código**: Recomendamos o uso do [Visual Studio Code](https://code.visualstudio.com/) ou qualquer outro editor de sua preferência.

## Passo 1: Criação do Grupo de Recursos

Um grupo de recursos no Azure é um container que contém recursos relacionados. Para iniciar, crie um grupo de recursos usando o Azure CLI:

```bash
az group create --name MeuGrupoDeRecursos --location brazilsouth
```

Isso cria o grupo de recursos na região `brazilsouth`, mas você pode escolher outra região conforme necessário.

## Passo 2: Criação da Máquina Virtual (VM)

Agora, vamos criar uma máquina virtual para hospedar nossas aplicações ou serviços.

```bash
az vm create \
  --resource-group MeuGrupoDeRecursos \
  --name MinhaVM \
  --image UbuntuLTS \
  --size Standard_B1s \
  --admin-username azureuser \
  --generate-ssh-keys
```

Esse comando criará uma máquina virtual com a imagem do Ubuntu LTS. A VM será criada com um usuário administrador `azureuser`, e a chave SSH será gerada automaticamente.

### Passo 2.1: Acessando a VM

Para acessar a máquina virtual, use o comando abaixo (substitua o `<IP_DA_VM>` pelo IP público da VM):

```bash
ssh azureuser@<IP_DA_VM>
```

## Passo 3: Criação do Banco de Dados SQL

Agora, vamos criar um banco de dados SQL no Azure.

```bash
az sql server create \
  --name meusqlserver \
  --resource-group MeuGrupoDeRecursos \
  --location brazilsouth \
  --admin-user sqladmin \
  --admin-password MinhaSenhaForte123!
```

Em seguida, criaremos o banco de dados:

```bash
az sql db create \
  --resource-group MeuGrupoDeRecursos \
  --server meusqlserver \
  --name MeuBancoDeDados \
  --service-objective S1
```

Esses comandos criam um servidor SQL com o nome `meusqlserver` e um banco de dados com o nome `MeuBancoDeDados`.

### Passo 3.1: Conectando ao Banco de Dados

Para conectar-se ao banco de dados, você pode usar ferramentas como **SQL Server Management Studio (SSMS)** ou **Azure Data Studio**. A string de conexão será fornecida no portal do Azure.

## Passo 4: Criação do App Service (Web App)

Agora, vamos criar um serviço de aplicativo para hospedar um site ou aplicação web.

```bash
az appservice plan create \
  --name MeuPlanoAppService \
  --resource-group MeuGrupoDeRecursos \
  --sku B1 \
  --is-linux
```

Em seguida, criaremos a aplicação web:

```bash
az webapp create \
  --resource-group MeuGrupoDeRecursos \
  --plan MeuPlanoAppService \
  --name MeuAppWeb \
  --runtime "NODE|14-lts"
```

Isso criará um aplicativo web usando o runtime Node.js. Você pode escolher outra stack (como Python, .NET, etc.) se necessário.

## Passo 5: Implantação de Aplicativo

A partir deste ponto, você pode realizar a implantação do seu código para o App Service, seja usando Git, GitHub, ou Azure DevOps.

Aqui está um exemplo para configurar o Git no seu App Service:

```bash
az webapp deployment source config-local-git \
  --name MeuAppWeb \
  --resource-group MeuGrupoDeRecursos
```

Isso fornecerá um URL de Git para que você possa usar um repositório Git para implantar seu código.

## Passo 6: Configuração de Monitoramento

Para monitorar a sua aplicação e recursos no Azure, recomendamos configurar o **Azure Monitor**. Você pode visualizar métricas de desempenho, logs e outras informações importantes.

```bash
az monitor metrics list \
  --resource-id /subscriptions/<subscription-id>/resourceGroups/MeuGrupoDeRecursos/providers/Microsoft.Web/sites/MeuAppWeb \
  --metric "CpuTime"
```

Isso retornará as métricas de CPU do seu aplicativo.

## Conclusão

Com isso você agora tem uma arquitetura simples no Azure composta por:

* Uma **Máquina Virtual** para hospedar serviços ou aplicações.
* Um **Banco de Dados SQL** para armazenar dados.
* Um **App Service** para hospedar um site ou aplicação web.

Com essa base, você pode expandir e adicionar mais recursos ao seu projeto, como redes virtuais, redes de armazenamento, balanceadores de carga e muito mais.
