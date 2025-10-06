// https://www.youtube.com/watch?v=cqbojozBMvs

async function principal(url) {
  const titulo = await obterTituloDaPagina(url);
  console.log(titulo);
}

async function obterTituloDaPagina(url) {
  const req = await fetch(url);
  const html = await req.text();
  const titulo = html.split("<title>")[1].split("</title>")[0];
  return titulo;
}

principal("https://www.youtube.com/watch?v=cqbojozBMvs");
