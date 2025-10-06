const calculadora = {
  resultado: 0,
  somar(a) {
    this.resultado += a;
    return this;
  },
};

const r = calculadora.somar(2).somar(2).somar(2).somar(2);
console.log(r);
