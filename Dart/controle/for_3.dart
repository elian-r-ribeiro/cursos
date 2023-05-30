main() {
  Map<String, double> notas = {
    'João Pedro': 9.1,
    'Maria Augusta': 6.5,
    'Ana Silva': 7.1,
    'Roberto Andrade': 8.1,
    'Pedro Firmino': 9.0
  };

  for (String nome in notas.keys) {
    print('O nome do aluno é $nome e a nota é ${notas[nome]}');
  }

  for (double nota in notas.values) {
    print('A nota é: $nota');
  }

  for (var registro in notas.entries) {
    print('O(a) aluno(a) ${registro.key} tem nota ${registro.value}.');
  }
}
