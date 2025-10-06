function saudarDepoisDe(tempoEmSegundos = 2) {
  return new Promise((resolve) => {
    setTimeout(() => {
      resolve("teste");
    }, tempoEmSegundos * 1000);
  });
}

saudarDepoisDe(5).then((resposta) => {
  console.log(resposta);
});

console.log("Fim!");
