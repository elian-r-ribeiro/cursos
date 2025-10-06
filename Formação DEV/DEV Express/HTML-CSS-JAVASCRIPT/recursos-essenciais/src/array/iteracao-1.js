const notas = [10, 6.5, 8, 7.5, 9.5, 8.5, 6, 7, 10, 9];
let total = 0;

for (let i = 0; i < notas.length; i++) {
  total += notas[i];
}

const media = total / notas.length;

console.log(`A média das notas é: ${media.toFixed(2)}`);
