/*
-List
-Set
-Map
*/
main() {
  var aprovados = ['Ana', 'Carlos', 'Daniel', 'Rafael'];
  print(aprovados);
  print(aprovados.elementAt(2));
  print(aprovados[0]);
  print(aprovados.length);

  var telefones = {
    'João': '+55 (11) 10 98765-4321',
    'Pedro': '+55 (10) 7 9999-8888',
    'Maria': '+55 (21) 0 1234-5678',
  };
  print(telefones);
  print(telefones[0]);
  print(telefones.length);
  print(telefones.values);
  print(telefones.keys);
  print(telefones.entries);

  var times = {'Vasco', 'Flamengo', 'Fortaleza', 'São Paulo'};
  times.add('Palmeiras');
  print(times.length);
  print(times.contains('Vasco'));
  print(times.elementAt(2));
  print(times.first);
  print(times.last);
  print(times);
}
