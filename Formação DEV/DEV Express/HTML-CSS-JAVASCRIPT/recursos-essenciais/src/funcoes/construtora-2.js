function Contador(valorInicial = 0) {
  this.numero = valorInicial;

  this.incrementar = function () {
    this.numero++;
  };

  this.decrementar = function () {
    this.numero--;
  };
}

let contador = new Contador(10);
contador.incrementar();
contador.incrementar();
contador.decrementar();
console.log(contador.numero);
