const aprovados = ["Agatha", "Aldo", "Daniel", "Raquel", "Lucas", "João"];

aprovados.forEach(exibirNome);

function exibirNome(nome, indice, array) {
  console.log(`${indice + 1}) ${nome} - ${array}`);
}
