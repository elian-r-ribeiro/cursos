const produto = Object.freeze({
  id: 1,
  nome: "Caneta",
  preco: 1.99,
  categoria: "Escritório",
});

produto.nome = "Lápis"; // Tentativa de modificação

console.log(produto);
