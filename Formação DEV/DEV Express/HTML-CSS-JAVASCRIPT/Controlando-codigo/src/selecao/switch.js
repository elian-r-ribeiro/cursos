const nota = (Math.random() * 10).toFixed(2);
let conceito = "";

switch (Math.floor(nota)) {
  case 10:
  case 9:
    conceito = "A";
    break;
  case 8:
    conceito = "B";
    break;
  case 7:
  case 6:
    conceito = "C";
    break;
  case 5:
  case 4:
    conceito = "D";
    break;
  case 3:
  case 2:
    conceito = "E";
    break;
  case 1:
  default:
    conceito = "F";
}

console.log(`Nota: ${nota}`);
console.log(`Conceito: ${conceito}`);
