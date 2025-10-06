let nota = (Math.random() * 10).toFixed(2);

while (nota <= 9.5) {
  console.log("Nota: " + nota);
  console.log("Você precisa ser aprovado com louvor!");
  nota = (Math.random() * 10).toFixed(2);
}

console.log("Você foi aprovado com louvor!");
console.log("Nota: " + nota);
