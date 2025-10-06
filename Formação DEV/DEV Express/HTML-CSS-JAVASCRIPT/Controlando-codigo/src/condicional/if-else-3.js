const nota = (Math.random() * 10).toFixed(1);

if (nota >= 9) {
  console.log("Quadro de Honra!");
  console.log("Ganhou um desconto de 35%!");
} else if (nota >= 7) {
  console.log("Aprovado!");
} else if (nota >= 4) {
  console.log("Recuperação!");
} else {
  console.log("Reprovado!");
}

console.log(`A nota do aluno foi ${nota}!`);
