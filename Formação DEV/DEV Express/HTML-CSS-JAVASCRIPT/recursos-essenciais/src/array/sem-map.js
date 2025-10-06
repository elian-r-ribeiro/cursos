const numeros = [3, 7, 11];

const dobroSemMap = [];

for (let i = 0; i < numeros.length; i++) {
  dobroSemMap.push(numeros[i] * 2);
}

console.log(dobroSemMap);

const dobro = (n) => n * 2;

const dobroMap = numeros.map(dobro);

console.log(dobroMap);
