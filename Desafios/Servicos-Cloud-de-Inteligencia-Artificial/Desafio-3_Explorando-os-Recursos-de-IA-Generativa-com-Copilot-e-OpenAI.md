# Guia de uso de IA Generativa com Microsoft Copilot e Azure OpenAI

Um guia simples de uso para explorar a **IA generativa** com **Microsoft Copilot**, **Azure OpenAI** e **filtros de conteúdo em Azure OpenAI**.

## Requisitos

- Conta no [Azure](https://portal.azure.com/)
- Acesso ao serviço **Azure OpenAI**
- IDE para código (ex: Visual Studio Code, Jupyter Notebook, etc.)
- Microsoft Copilot (opcional, mas recomendado)

## Passo 1: Explorar IA Generativa com Microsoft Copilot

### O que é o Microsoft Copilot?

O **Microsoft Copilot** é uma ferramenta integrada a diversas aplicações da Microsoft (como Word, Excel e Visual Studio Code) que utiliza IA para sugerir conteúdos, automatizar tarefas e aprimorar o fluxo de trabalho.

### Exemplo de Uso:

1. **Abrir o Visual Studio Code**.
2. **Instalar o Copilot**: Se ainda não tiver, instale a extensão do Copilot.
3. **Escrever um código simples**: Comece a digitar algo, como uma função em Python, e o Copilot irá sugerir automaticamente complementos ou até completar o código para você.

Exemplo de código simples para Python:

```python
# Exemplo de função simples em Python sugerida pelo Copilot
def saudacao(nome):
    return f"Olá, {nome}! Bem-vindo à IA generativa."
````

Basta começar a digitar, e o Copilot vai sugerir a continuação ou melhorar o código!

## Passo 2: Explorar o Azure OpenAI

### O que é o Azure OpenAI?

O **Azure OpenAI** oferece acesso a poderosas APIs de inteligência artificial, incluindo modelos como o GPT-4. Ele permite criar aplicativos que usam IA generativa, como chatbots, geradores de texto e assistentes virtuais.

### Exemplo de Uso:

1. **Criar uma conta no Azure** e acessar o portal.
2. **Configurar o serviço Azure OpenAI**: No portal, crie um recurso de **Azure OpenAI** e obtenha a chave de API.
3. **Instalar as bibliotecas necessárias**:

```bash
pip install openai
```

4. **Configurar o código para usar a API**:

```python
import openai

# Substitua 'your-api-key' pela sua chave de API do Azure OpenAI
openai.api_key = 'your-api-key'

# Exemplo simples de uso do modelo GPT-4
response = openai.Completion.create(
  engine="gpt-4",  # ou o modelo desejado
  prompt="Explique o que é IA generativa.",
  max_tokens=100
)

print(response.choices[0].text.strip())
```

Esse código gera uma resposta explicando IA generativa usando o modelo GPT-4 do Azure OpenAI.

## Passo 3: Explorar Filtros de Conteúdo em Azure OpenAI

### O que são os Filtros de Conteúdo?

Os filtros de conteúdo no Azure OpenAI são usados para garantir que o conteúdo gerado pelos modelos esteja em conformidade com normas de segurança e ética, prevenindo a criação de respostas inapropriadas ou ofensivas.

### Exemplo de Uso de Filtro de Conteúdo:

1. Ao usar o modelo da Azure OpenAI, você pode configurar filtros de segurança como:

```python
response = openai.Completion.create(
  engine="gpt-4", 
  prompt="Fale sobre o uso de IA em crimes cibernéticos.",
  max_tokens=100,
  stop=["\n"],
  temperature=0.7,
  n=1,
  logprobs=1
)

# Filtro para verificar se a resposta é segura
def is_safe_response(response_text):
    forbidden_keywords = ["crime", "ilícito", "violência"]
    for keyword in forbidden_keywords:
        if keyword in response_text.lower():
            return False
    return True

response_text = response.choices[0].text.strip()

if is_safe_response(response_text):
    print(response_text)
else:
    print("A resposta foi filtrada devido ao conteúdo inseguro.")
```

Este código verifica se a resposta gerada pelo modelo contém palavras-chave impróprias, ajudando a garantir que o conteúdo gerado esteja dentro dos padrões esperados.

## Conclusão

Agora você tem um passo a passo para explorar a **IA generativa com Microsoft Copilot**, interagir com **Azure OpenAI** e aplicar **filtros de conteúdo** para garantir segurança no uso da IA. Experimente os exemplos fornecidos e personalize conforme sua necessidade!

---

## Referências

* [Microsoft Copilot](https://copilot.microsoft.com/)
* [Azure OpenAI](https://azure.microsoft.com/en-us/services/openai/)
* [Documentação do OpenAI](https://beta.openai.com/docs/)

