# Ecossistema de Animais na Floresta

Este é um programa que simula um ecossistema de animais em uma floresta. Os animais têm comportamentos específicos que afetam seu movimento e interação com outros animais e elementos do ambiente. Abaixo, você encontrará informações detalhadas sobre o funcionamento do ecossistema, o tamanho do terreno e as siglas dos animais que aparecerão no ambiente.

## Tamanho do Terreno🌎🗺

O terreno onde os animais vivem possui um tamanho fixo. O tamanho do terreno é definido durante a criação do ecossistema, e no exemplo fornecido, o tamanho é configurado para 10 unidades. Isso significa que o terreno tem 10 unidades de largura e 10 unidades de altura.

## Comportamento dos Animais

### Leão (Sigla: L) 🦁
Espécie: Predador
Vida Inicial: 5
Movimento: O leão se move apenas nas direções padrão: para cima, para baixo, para a esquerda e para a direita. Ele escolhe uma direção aleatória a cada passo.
Comportamento: O leão procura por presas (coelhos, galinhas, veados) próximas e as ataca quando estão na mesma posição.

### Tigre (Sigla: T)🐯
Espécie: Predador
Vida Inicial: 5
Movimento: O tigre se move apenas nas direções padrão: para cima, para baixo, para a esquerda e para a direita. Ele escolhe uma direção aleatória a cada passo.
Comportamento: O tigre também procura por presas (coelhos, galinhas, veados) próximas e as ataca quando estão na mesma posição.

### Coelho (Sigla: C)🐰
Espécie: Presa
Vida Inicial: 1
Movimento: O coelho pode se mover em todas as direções: para cima, para baixo, para a esquerda, para a direita e nas diagonais. Ele escolhe uma direção aleatória a cada passo.
Comportamento Especial: O coelho pode se esconder em arbustos para evitar ser atacado por predadores.

### Galinha (Sigla: G)🐔
Espécie: Presa
Vida Inicial: 1
Movimento: A galinha pode se mover em todas as direções, incluindo as diagonais. Ela escolhe uma direção aleatória a cada passo.
Comportamento Especial: A galinha pode se esconder em arbustos para evitar ser atacada por predadores.

### Veado (Sigla: V)🦌
Espécie: Presa
Vida Inicial: 3
Movimento: O veado se move apenas nas direções padrão: para cima, para baixo, para a esquerda e para a direita. Ele escolhe uma direção aleatória a cada passo.
Comportamento Especial: O veado é uma presa mais resistente e pode sobreviver a mais ataques de predadores do que os coelhos e galinhas.

## Interaçöes ↗ ↘ ↙ 🗡
Os animais podem interagir entre si de acordo com suas espécies. Predadores (leões e tigres) caçam presas (coelhos, galinhas e veados) quando estão na mesma posição. Os arbustos fornecem um local de esconderijo para presas, como coelhos e galinhas, evitando ataques de predadores. As plantas também estão presentes no ambiente e podem aumentar a vida dos coelhos e galinhas quando estão na mesma posição.
Este ecossistema é simulado em um loop infinito, onde os animais continuam suas ações até que não haja mais animais vivos no terreno. O terreno é exibido periodicamente para acompanhar o movimento e as interações dos animais.
