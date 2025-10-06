const calculadora = {
  somar(a, b) {
    return a + b;
  },
  subtrair: function (a, b) {
    return a - b;
  },
  multiplicar: (a, b) => a * b,
};

console.log(calculadora.somar(2, 3));
console.log(calculadora.subtrair(5, 2));
console.log(calculadora.multiplicar(4, 3));
