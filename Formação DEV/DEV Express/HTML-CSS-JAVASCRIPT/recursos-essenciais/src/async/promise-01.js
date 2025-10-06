function promessa() {
  return new Promise((resolve) => {
    resolve("Bom dia!");
  });
}

promessa().then((resp) => {
  console.log(resp);
});
console.log("Fim!");
