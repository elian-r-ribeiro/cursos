const nota = (Math.random() * 10).toFixed(1);

if (nota >= 9) {
  console.log("Quadro de Honra!");
  console.log("Ganhou um desconto de 35%!");
} else {
  if (nota >= 7) {
    console.log("Aprovado!");
    console.log("Parabéns!");
  } else {
    if (nota >= 4) {
      console.log("Recuperação!");
      console.log("Estude mais!");
    } else {
      console.log("Reprovado!");
      console.log("Estude mais!");
    }
  }
}

console.log(`A nota do aluno foi ${nota}!`);
