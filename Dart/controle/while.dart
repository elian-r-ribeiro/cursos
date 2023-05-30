import 'dart:io';

main() {
  var digitado = '';

  while (digitado != 'sair') {
    stdout.write('Digite algo ou "sair": ');
    digitado = stdin.readLineSync().toString();
    print(digitado);
  }

  do {
    stdout.write('Digite algo ou "sair" 2: ');
    digitado = stdin.readLineSync().toString();
    print(digitado);
  } while (digitado != 'sair');

  print('Fim!');
}
