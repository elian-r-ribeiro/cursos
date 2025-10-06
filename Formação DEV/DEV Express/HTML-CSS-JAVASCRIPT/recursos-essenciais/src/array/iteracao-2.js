const notas = [10, 6.5, 8, 7.5, 9.5, 8.5, 6, 7, 10, 9];

let total = 0;

for (let nota of notas) {
  console.log(nota);
}

for (let i in notas) {
  console.log(i);
}

const media = total / notas.length;

console.log(`A média das notas é: ${media.toFixed(2)}`);
