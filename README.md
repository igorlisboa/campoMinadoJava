# campoMinadoJava
Campo Minado feito em Java

Este Campo Minado será a Atividade Pratica Supervisionada - APS da turma do 4º semestre de Ciências da Computação.

Este repositorio é de propriedade do time formado por: Igor Lisboa, Ariadna Ferreira, Adriel Fernandes e Nickael Vereza;


Cada um ficou responsavel por uma parte do projeto, mas o time pode se ajudar e executar ou ajudar em qualquer area do projeto.

# Etapas
- Divisão das partes do projeto(Do 21/10);
- Criação do repositorio e do projeto;
- Registro do time no sistema da Faculdade;
- Execução da primeira entrega(06/11);
- Execução da segunda entrega(18/11);
- Trabalho escrito(ate dia 23/11);
- Ultimo dia para envio do projeto(26/11);



# Instruções iniciais

- Baixar git: https://git-scm.com/downloads
    Baixar e instalar git para poder usar o repostorio do github;
- Caso não tenha, criar conta no github;
- Baixar CMDER full http://cmder.net/
    cmder é muito mais avançado do que o padrão da maquina e vai ajudar bastante;
- configurar o git com seus dados do github;
- Fazer download do repositorio;
- Começar a programar;
- Sempre commitar suas alterações e avisar aos demais;
- Manter o projeto atualizado em suas maquinas.


Baixar e instalar git


- pelas linhas de comando vá ate o workspace do eclipse
- execute o comando: 
	git clone https://github.com/igorlisboa/campoMinadoJava.git
(vai baixar o projeto para seu workspace)

- acesse a pasta pelas linhas de comando
	cd CampoMinadoJava

-Vc vai esta na branch (master), criei outra para ser a base do projeto.

- Antes de prosseguir vamos configurar seu git:
	git config --global user.email "you@example.com"
  	git config --global user.name "Your Name"
 (Execute esses dois comandos colocando o email que vc usou para criar a conta no github.
 Com o --global vc ja configura toda a sua maquina com esses dados)

- Agora vc ira criar uma branch pra vc poder trabalhar:
 	git branch feature/seunome
 (troque seunome pelo seu nome ou apelido)

- entre nela para poder usar:
 	git checkout feature/seunome
 (checkout serve para trocar entre as branchs[similar a areas/linhas de trabalho])

- envie sua branch para o repositorio
	git push
(ira aparecer um erro, dizendo que essa branch ainda nao exite no repositorio, e mostrando a linha de comando que vc tem que usar para fazer isso[ela começa com git push --set-upstream], copie a linha toda cole e execute [se estiver no cmder é so selecionar e clicar com o botao direito que ja vai colar na linha de comando, ai é so dar enter])

- vai pedir seu username(usuario) e senha do github que vc acabou de criar
coloque o username, de enter
depois a senha(nao vai aparecer nada mesmo, digita e da enter que funciona assim mesmo)

- Pronto ja vai da pra trabalhar na sua branch



#No dia a dia !Importante!

- antes de começar a trabalhar vc deve entrar na branch CMPrincipar e baixar as ultimas atualizaçoes disponiveis
	git checkout CMPrincipal
	git pull
('git checkout CMPrincipal' troca a branch,
git pull baixa as atualizaçoes)

- depois vc volta para sua branch e mescla as alteraçoes da CMPrincipal com a sua:
	git checkout feature/seunome
	git merge CMPrincipal
(merge mescla as alteraçoes do CMPrincipal com as sua branch)

- sempre que terminar alguma coisa vc tem que fazer o commit e enviar para o sevidor principal
	git status (vai mostrar como esta sua branch, todos os aquivos que vc alterou ou criou)
	git add . (vai adicionar TODAS as auterações na area de commit)
	git commit -m "breve explicação do que vc fez" (-m é referente a 'mensagem', é obrigatorio escrever alguma coisa)
	git push (vai enviar sua alterações para o repositorio, dentro da sua branch)

- sempre que enviar alguma coisa importante avisar no grupo, pq o ADM precisa fazer o merge da sua branch para a CMPrincipal para todos poderem pegar.

- !IMPORTANTE! Evitem trabalhar no mesmo arquivo ao mesmo tempo para nao ter conflito, pq isso é um saco para arrumar e vai ter que ver qual é a alteração valida. 


