// https://www.youtube.com/watch?v=cqbojozBMvs

fetch("https://www.youtube.com/watch?v=cqbojozBMvs")
  .then((resp) => resp.text())
  .then((html) => html.split("<title>")[1])
  .then((html) => html.split("</title>")[0])
  .then(console.log);
