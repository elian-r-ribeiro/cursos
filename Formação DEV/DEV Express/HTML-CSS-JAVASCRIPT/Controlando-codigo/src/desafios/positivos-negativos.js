const MIN = -30;
const MAX = 40;
let qtdePos = 0;
let qtdeNeg = 0;

for (let i = MIN; i <= MAX; i++) {
  if (i < 0) {
    qtdeNeg++;
  } else if (i > 0) {
    qtdePos++;
  }
}

console.log(
  `A quantidade de números positivos entre ${MIN} e ${MAX} é: ${qtdePos}`
);
console.log(
  `A quantidade de números negativos entre ${MIN} e ${MAX} é: ${qtdeNeg}`
);
