// 1 Pergunte ao usuário qual é o dia da semana. Se a resposta for "Sábado" ou "Domingo", mostre "Bom fim de semana!". Caso contrário, mostre "Boa semana!".

let diaDaSemana = prompt("Qual o dia da semana")

if (diaDaSemana == "Sábado") {
    alert("Bom fim de semana!");
} else if (diaDaSemana == "Domingo") {
    alert("Bom fim de semana!");
} else {
    alert("Boa semana!");
}

// 2 Verifique se um número digitado pelo usuário é positivo ou negativo. Mostre um alerta informando.

let numero = prompt("Digite um número positico ou negativo")

if (numero < 0) {
    alert(`O número ${numero} é negativo.`);
} else {
    alert(`O número ${numero} é positivo.`);
}

// 5 Crie um sistema de pontuação para um jogo. Se a pontuação for maior ou igual a 100, mostre "Parabéns, você venceu!". Caso contrário, mostre "Tente novamente para ganhar.".

let pontuacao = 110

if (pontuacao >= 100) {
    alert("Parabéns, você venceu!");
} else {
    alert("Tente novamente para ganhar.");
}

// 3 Crie uma mensagem que informa o usuário sobre o saldo da conta, usando uma template string para incluir o valor do saldo.

let saldoDaConta = 1000
alert(`Seu saldo é de R$${saldoDaConta}.`);

// 4 Peça ao usuário para inserir seu nome usando prompt. Em seguida, mostre um alerta de boas-vindas usando esse nome.

let nome = prompt("Digite seu nome");
alert(`Boas vindas ${nome}`);
