enum DiaSemana {
    DOMINGO = "Domingo",
    SEGUNDA = "Segunda",
    TERÇA = "Terça",
    QUARTA = "Quarta",
    QUINTA = "Quinta",
    SEXTA = "Sexta",
    SABADO = "Sábado"
}

let diaSemana: DiaSemana = DiaSemana.SEGUNDA;

console.log(diaSemana);

diaSemana = DiaSemana.DOMINGO;

console.log(diaSemana);

diaSemana = DiaSemana.SABADO;

console.log(diaSemana);

enum genero {
    MASCULINO,
    FEMININO,
    OUTRO
}

let generoUsuario: genero = genero.MASCULINO;

console.log(generoUsuario);
