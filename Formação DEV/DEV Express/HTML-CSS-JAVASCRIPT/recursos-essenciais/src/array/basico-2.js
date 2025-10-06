const coisas = ["texto", 1, false, [1, 2, 3], { nome: "Sicrano" }];

console.log(coisas.length);

coisas.push("novo item");
coisas.push(10);
coisas.unshift("primeiro item");

console.log(coisas);

const removido = coisas.pop();

console.log(removido);
console.log(coisas);
