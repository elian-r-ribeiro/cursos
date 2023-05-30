import 'dart:io';

main() {
  // Área da circunferência = PI * raio * raio
  stdout.write('Informe o raio: ');
  var entradaDoUsuario = stdin.readLineSync()!;
  const pi = 3.1415;
  final raio = double.parse(entradaDoUsuario);
  final area = pi * raio * raio;

  print('O valor do raio é: ' + area.toString());
}
