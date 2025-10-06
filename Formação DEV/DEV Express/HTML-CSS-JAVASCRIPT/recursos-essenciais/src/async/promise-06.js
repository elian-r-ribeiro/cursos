function promessa() {
  return new Promise((resolve, deny) => {
    if (Math.random() < 0.5) {
      resolve("Bom dia!");
    } else {
      deny("Sai fora!");
    }
  });
}

promessa()
  .then((resp) => console.log(resp))
  .catch((e) => console.log(e));
console.log("Fim!");
