const MIN = 0;
const MAX = 100;
let soma = 0;

for (let i = MIN; i <= MAX; i++) {
  if (i % 2 === 0) {
    soma += i;
  }
}

console.log(`A soma dos números pares entre ${MIN} e ${MAX} é: ${soma}`);
