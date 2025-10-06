const usuario = Object.freeze({
  id: 1,
  nome: "Juan",
  email: "juan@gmail.com",
  admin: true,
});
const numeros = [1, 2, 3, 4, 5];

const novoUsuario = { ...usuario, admin: false };
const maisNumeros = [...numeros, 6, 7, 8];

console.log(usuario);
console.log(novoUsuario);
console.log(numeros);
console.log(maisNumeros);
