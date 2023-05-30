int executarPor({int? qtde, String Function(String)? fn, String? valor}) {
  String textoCompleto = '';
  for (int i = 0; i < qtde!; i++) {
    textoCompleto += fn!(valor!);
  }
  return textoCompleto.length;
}

main() {
  var meuPrint = (String valor) {
    print(valor);
    return valor;
  };
  int tamanho = executarPor(qtde: 10, fn: meuPrint, valor: 'Muito legal');
  print('O tamanho da String é: $tamanho');
}
