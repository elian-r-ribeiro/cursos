const ALTO_CUSTO = 930;
const FRAGIL = false;
const preco = 1254.89;
const produtodeAltoCusto = preco > ALTO_CUSTO && FRAGIL;

if (produtodeAltoCusto) {
  console.log("Seguro contratado com sucesso!");
}

console.log("Fim!");
