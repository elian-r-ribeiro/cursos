import 'dart:math';

main() {
  var nota = Random().nextInt(11);
  print('A nota sorteada foi $nota');

  switch (nota) {
    case 10:
      print('Quadro de Honra!');
      break;
    case 9:
      print('Muito bom!');
      break;
    case 8:
      print('Excelente!');
      break;
    case 7:
      print('Boa!');
      break;
    case 6:
      print('Mais ou menos.');
      break;
    case 5:
      print('Mais sorte da próxima vez.');
      break;
    case 4:
      print('Estude mais!');
      break;
    case 3:
      print('Se esforce mais!');
      break;
    case 2:
      print('Difícil em rapaz!');
      break;
    case 1:
      print('Peça ajuda dos seus colegas!');
      break;
    case 0:
      print('Burro!');
      break;
    default:
      print('Nota inválida!');
  }
}
