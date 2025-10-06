function somar(x) {
  return function (y) {
    return x + y;
  };
}

const somarCom4 = somar(4);

console.log(somarCom4(5));
