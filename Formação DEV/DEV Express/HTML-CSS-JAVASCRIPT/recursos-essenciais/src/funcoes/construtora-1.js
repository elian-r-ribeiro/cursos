function Pessoa(nome, sobrenome) {
  this.nome = nome;
  this.sobrenome = sobrenome;

  this.falar = function () {
    console.log(`${this.nome} ${this.sobrenome} está falando...`);
  };
}

const p1 = new Pessoa("João", "Silva");

console.log(p1.nome);
console.log(p1.sobrenome);
p1.falar();
