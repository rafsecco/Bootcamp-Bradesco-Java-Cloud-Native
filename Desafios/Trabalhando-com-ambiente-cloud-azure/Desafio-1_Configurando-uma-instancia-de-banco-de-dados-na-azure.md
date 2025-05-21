# Configuração de Instância de Banco de Dados no Microsoft Azure

Processo de criação e configuração de uma instância de banco de dados no Microsoft Azure, utilizando o serviço Azure SQL Database. A seguir estão os passos detalhados para a configuração da instância e o acesso ao banco de dados.

## Pré-requisitos

Antes de iniciar, verifique se você possui os seguintes pré-requisitos:

* Conta no [Microsoft Azure](https://azure.microsoft.com).
* Permissões adequadas para criar e configurar recursos no Azure (uma conta com acesso de administrador ou permissões para criar recursos em seu grupo de recursos).
* Ferramentas de linha de comando do Azure (Azure CLI) ou o [Azure Portal](https://portal.azure.com) para gerenciamento.

## Passo 1: Criar um Banco de Dados SQL no Azure

### 1.1 Acessar o Azure Portal

1. Vá até o [Azure Portal](https://portal.azure.com).
2. No painel principal, clique em **Criar um recurso**.

### 1.2 Criar um Servidor SQL

1. No campo de pesquisa, digite “SQL” e selecione **Banco de Dados SQL**.
2. Clique em **Criar**.
3. Preencha as informações solicitadas:

   * **Assinatura**: Selecione a assinatura desejada.
   * **Grupo de recursos**: Escolha um grupo de recursos existente ou crie um novo.
   * **Nome do Banco de Dados**: Escolha um nome para o seu banco de dados.
   * **Servidor**: Crie um novo servidor ou selecione um servidor existente. Para criar um novo, forneça as informações de:

     * **Nome do servidor** (ex: meu-banco-server)
     * **Localização** (ex: Brasil, São Paulo)
     * **Login de administrador** e **Senha**.
4. Clique em **Revisar + Criar** para revisar as configurações e, em seguida, clique em **Criar**.

### 1.3 Configurar o Banco de Dados

Após a criação, o banco de dados será provisionado. Você pode configurá-lo conforme as necessidades do seu projeto, ajustando:

* **Configurações de desempenho** (nível de serviço, número de DTUs ou vCores)
* **Firewall**: Configure as regras de firewall para permitir o acesso do seu IP local ou de máquinas específicas.
* **Backup e recuperação**: Defina as configurações de backup, de acordo com a política de retenção.

## Passo 2: Conectar-se ao Banco de Dados

### 2.1 Usando SQL Server Management Studio (SSMS)

1. Baixe e instale o [SQL Server Management Studio (SSMS)](https://docs.microsoft.com/pt-br/sql/ssms/download-sql-server-management-studio-ssms).
2. Abra o SSMS e, no campo **Servidor**, insira o nome do servidor SQL criado anteriormente.

   * Exemplo: `meu-banco-server.database.windows.net`
3. Para autenticação, selecione **Autenticação SQL Server** e insira o login e senha do administrador.
4. Clique em **Conectar**.

### 2.2 Usando Azure CLI

Você também pode usar o Azure CLI para conectar-se ao banco de dados. Primeiro, verifique se o `az` CLI está instalado:

```bash
az --version
```

Em seguida, use o seguinte comando para se conectar:

```bash
az sql db connect \
  --resource-group <nome_do_grupo_de_recursos> \
  --server <nome_do_servidor> \
  --name <nome_do_banco_de_dados>
```

## Passo 3: Configuração de Acesso e Segurança

### 3.1 Definir Regras de Firewall

No Azure Portal, vá até **Firewall e redes virtuais** para configurar as regras de acesso. Certifique-se de liberar o seu endereço IP ou uma faixa de IPs para garantir que você possa acessar a instância.

### 3.2 Habilitar Autenticação Multi-Fator (MFA)

Se necessário, configure autenticação multifatorial para uma camada extra de segurança, garantindo que apenas usuários autorizados possam acessar o banco de dados.

### 3.3 Configuração de Backup e Recuperação

No portal, em **Configurações** > **Backup**, configure as políticas de backup do banco de dados conforme necessário. O Azure oferece backups automáticos, mas você também pode configurar backups manuais ou ajustados às suas necessidades.

## Passo 4: Criar e Gerenciar Tabelas e Dados

Após configurar o banco de dados, você pode começar a criar tabelas e inserir dados. Isso pode ser feito através de ferramentas como:

* SQL Server Management Studio (SSMS)
* Azure Data Studio
* Scripts SQL através do Azure CLI

### Exemplo de Script SQL para Criar Tabela:

```sql
CREATE TABLE Produtos (
    ID INT PRIMARY KEY,
    Nome NVARCHAR(100),
    Preco DECIMAL(10, 2)
);

INSERT INTO Produtos (ID, Nome, Preco)
VALUES (1, 'Cadeira', 199.90),
       (2, 'Mesa', 299.90);
```

## Passo 5: Monitoramento e Manutenção

O Azure oferece várias ferramentas para monitorar o desempenho e a saúde do banco de dados:

* **Azure Monitor**: Para métricas e logs detalhados.
* **SQL Analytics**: Para análise de desempenho e recomendações de otimização.

### 5.1 Ativar Alertas

No Azure Portal, você pode configurar alertas para monitorar métricas como uso de CPU, memória, e desempenho de consultas SQL. Isso ajuda a identificar rapidamente problemas de performance ou falhas no sistema.

## Passo 6: Encerramento e Limpeza

Se você não precisar mais da instância de banco de dados, lembre-se de excluir os recursos para evitar cobranças. No Azure Portal, vá até o recurso de **Banco de Dados SQL** e clique em **Excluir**.

---


