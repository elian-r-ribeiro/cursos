main() {
  //Operadores aritiméticos (binário / infix)
  int a = 7;
  int b = 3;
  int resultado = a + b;

  print(resultado);
  print(a - b);
  print(a * b);
  print(a / b);
  print(a % b);
  print(33 % 2);
  print(34 % 2);
  print(a + (b * a) - (a / b));

  //Operadores lógicos
  bool ehFragil = true;
  bool ehCaro = false;

  print(ehFragil && ehCaro); //AND -> E
  print(ehCaro || ehCaro); //OR -> OU
  print(ehFragil ^ ehCaro); //XOR -> OU EXCLUSIVO
  print(!ehFragil); //NOT -> Unário / Prefix
  print(!!ehFragil);
}
