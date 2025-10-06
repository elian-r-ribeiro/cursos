const trabalhoTerca = true;
const trabalhoQuinta = true;

// Operador lógico "E" (AND) => &&
const comprarTV55 = trabalhoTerca && trabalhoQuinta;
console.log("Comprou a TV de 55?", comprarTV55);

// Operador lógico "OU" (OR) => ||
const comprarSorvete = trabalhoTerca || trabalhoQuinta;
console.log("Comprou o sorvete?", comprarSorvete);

// Operador lógico OU exclusivo (XOR) => (Não temos exatamente um operador XOR em JavaScript, mas podemos simular)
const comprarTV42 = trabalhoTerca != trabalhoQuinta; // XOR simulado
console.log("Comprou a TV de 42?", comprarTV42);

// Operador lógico "NÃO" (NOT) => !
const maisSaudavel = !comprarSorvete;
console.log("Mais saudável?", maisSaudavel);
