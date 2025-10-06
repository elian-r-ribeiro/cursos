const calculadora = {
  resultado: 0,
  somar(a) {
    return (this.resultado += a);
  },
  zerar() {
    return (this.resultado = 0);
  },
};

console.log(calculadora.somar(2));
console.log(calculadora.somar(2));
console.log(calculadora.somar(2));
console.log(calculadora.somar(2));
console.log(calculadora.zerar());
