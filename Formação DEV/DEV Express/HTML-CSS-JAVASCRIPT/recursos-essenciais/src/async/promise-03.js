fetch("https://api.chucknorris.io/jokes/random")
  .then((resp) => resp.json())
  .then((data) => data.value)
  .then(console.log);
