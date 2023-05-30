import 'dart:math';

int somarDoisNumerosAleatorios() {
  int numeroAleatorio1 = Random().nextInt(11);
  int numeroAleatorio2 = Random().nextInt(11);
  print('Os números sorteados foram: $numeroAleatorio1 e $numeroAleatorio2');
  return numeroAleatorio1 + numeroAleatorio2;
}

int somarDoisNumeros(int a, int b) {
  print('Os números escolhidos foram: $a e $b');
  return a + b;
}

main() {
  print('A soma dos números definidos é: ${somarDoisNumeros(3, 2)}');
  print('A soma dos números aleatórios é: ${somarDoisNumerosAleatorios()}');
}
