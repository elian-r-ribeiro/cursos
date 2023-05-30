import 'dart:math';

main() {
  var nota = Random().nextInt(11);

  print('A sua nota foi: $nota');

  if (nota >= 9) {
    print('Quadro de honra!');
  } else if (nota >= 7) {
    print('Aprovado!');
  } else if (nota >= 5) {
    print('Recuperação!');
  } else if (nota >= 4) {
    print('Recuperação + trabalho!');
  } else {
    print('Reprovado!');
  }
}
