let x = 3;
let y = 7;

function somar(a, b, funcao) {
  let resultado = a + b;
  if (funcao !== null && typeof funcao === "function") {
    return funcao(resultado);
  } else {
    return resultado;
  }
}

const dobro = function (numero) {
  return numero * 2;
};

console.log(somar(x, y));
console.log(somar(x, y, dobro));
