const gritar = (texto) => texto.toUpperCase();
const exagerar = (texto) => {
  return `${texto}!!!`;
};

console.log(gritar("hello world"));
console.log(exagerar("hello world"));
console.log(exagerar(gritar("hello world")));
