function somar(x, y = 0) {
  return x + y;
}

const resultado = somar(2, 4);
const resultado2 = somar(10);
const resultado3 = somar();

console.log(resultado);
console.log(resultado2 / 2);
console.log(resultado3 + 2);
