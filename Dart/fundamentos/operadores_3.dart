main() {
  //Operadores unários
  int a = 3;
  int b = 4;
  a++; //Postfix
  --a; //Prefix

  print(a);
  print(a++ == --b);
  print(a == b);

  //Operador lógico unário (NOT)
  print(!true);
  print(!false);

  bool x = false;

  print(!x);
}
