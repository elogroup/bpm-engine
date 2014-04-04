
Elo BPM Engine
--------------

A idéia é construir um serviço rest para viabilizar a automação de fluxos de processo de negócio e a gestão desses processos.

Features desejadas:
- Possibilitar a consulta de tarefas disponíveis (todo, ongoing, etc...) para um usuário (ou seu grupo)
- Ler "catálogo de processos" e possibilitar o CRUD de processos nesse catálogo
- Controle do fluxo de execução de uma instância de processo (ex: concluir atividade, passando dados do formulário)
- CRUD de formulários
- Comentários em terefas do fluxo (interação social)
- "GED" básico para uma instância de processo (versionamento de  documentos anexados à instância)
- Verificar como a Rest-API do Activity pode ajudar nisso (http://activiti.org/userguide/index.html#N12F85)

O projeto utiliza library Activity (http://activiti.org/) como engine para o workflow.