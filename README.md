# Lista de Exercícios

Identificação
Professor: MSc. Iago Rodrigues

Aluno: Sol de Lótus

Disciplina: Programação Orientada a Objetos

Atividade: Atividade Extra 01 - Herança e Polimorfismo

Descrição da Atividade
Desenvolver um sistema simples de gerenciamento de zoológico, onde existem diferentes tipos de animais, cada um com suas características e habilidades específicas. 

O sistema deve ser capaz de adicionar, listar e remover animais do zoológico.

## Instruções

1. Sua implementação deve estar dentro da pasta `src/main/java`.
2. Não modifique nenhum código dentro da pasta `src/test/java`.
3. A submissão **não deve ser feita após o prazo** (nem 1 minuto a mais).

---

O zoológico tem três tipos de animais: Gatos, Cães e Passarinhos. Cada tipo de animal possui um nome, som característico e uma habilidade:

Cat:

Nome: "Whiskers"

Som: "meow"

Habilidade: "agility"


Dog:

Nome: "Buddy"

Som: "au"

Habilidade: "sniff"


Bird:

Nome: "Tweety"

Som: "piu"

Habilidade: "fly"

Todas as classes de animais devem herdar de uma superclasse chamada Animal. 

A classe Animal deve conter os seguintes atributos: id (do tipo long), name (String), age (int) weight (double), abilities (ArrayList abilities). 

Além disso, a classe Animal deve conter um método para retornar o som que o animal faz e outro método que, dada uma habilidade, retorna se o animal pode ou não realizar tal habilidade

String sound(): Retorna o som que o animal faz.

String performAbility(String ability): Dado uma habilidade, retorna se o animal pode ou não realizar tal habilidade da seguinte forma: se tem a habilidade -> "Buddy can sniff" (nome + "can" + habilidade) ou se não tem -> "Buddy can't agility" (nome + "can't" + habilidade)

A classe Zoo será responsável pelo gerenciamento dos animais. Ela deve conter um ArrayList de animais: ArrayList animals (um ArrayList que armazena os animais do zoológico)

Além disso, a classe Zoo deve ser capaz de:

1. void addAnimal(Animal animal): Adiciona um animal à lista.
2. ArrayList listAnimals(): Retorna a lista de animais.
3. boolean removeAnimal(long id): Remove um animal da lista dado um ID.

Instruções adicionais:
1. Implemente a superclasse Animal e as subclasses Gato, Cachorro e Passarinho conforme as especificações acima.
2. Implemente a classe Zoo com os atributos e métodos detalhados acima.
