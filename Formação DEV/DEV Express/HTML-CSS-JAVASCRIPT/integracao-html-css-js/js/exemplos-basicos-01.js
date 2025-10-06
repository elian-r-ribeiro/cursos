(function () {
  const h1 = document.querySelector("h1");
  console.log(h1);

  const conteudo = document.querySelector(".conteudo");
  console.log(conteudo);

  const itensLista = document.querySelectorAll("li");
  console.log(itensLista);

  const primeiroLugar = document.querySelector("[primeiro]");
  console.log(primeiroLugar.textContent);

  const tituloConteudo = document.querySelector("#titulo-conteudo");
  console.log(tituloConteudo.textContent);

  const tituloConteudo2 = document.querySelector("div > span");
  console.log(tituloConteudo.textContent);
})();

function adicionarItem() {
  const novoItem = document.createElement("li");
  novoItem.textContent = "Ghilherme";
  novoItem.classList.add("vermelho");
  novoItem.setAttribute("novo", "true");
  const lista = document.querySelector("[aprovados]");
  lista.appendChild(novoItem);
}

function removerItensNovos() {
  const lista = document.querySelector("ul[aprovados]");
  const novosItens = document.querySelectorAll("li[novo]");
  novosItens.forEach((item) => {
    lista.removeChild(item);
  });
}
