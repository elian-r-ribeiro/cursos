int somaFn(int a, int b) {
  return a + b;
}

main() {
  // tipo nome = valor;
  int Function(int, int) soma1 = somaFn;
  print(soma1(20, 313));

  var soma2 = ([x = 1, y = 1]) {
    return x + y;
  };
  print(soma2(25, 300));
  print(soma2(25));
  print(soma2());
}
