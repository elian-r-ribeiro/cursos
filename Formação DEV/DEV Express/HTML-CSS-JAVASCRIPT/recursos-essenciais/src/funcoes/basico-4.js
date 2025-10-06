function principal() {
  console.log("Função principal executada");
  secundario();
  console.log("Função principal finalizada");
}

function secundario() {
  console.log("Função secundário executada");
  terciaria();
}

function terciaria() {
  console.log("Função terciária executada");
}

principal();
