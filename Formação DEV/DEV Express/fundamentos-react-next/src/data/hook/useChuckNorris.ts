import {useEffect, useState} from "react";

export default function useChuckNorris() {
  const [piada, setPiada] = useState("Carregando...");

  async function obterPiada() {
    const resposta = await fetch("https://api.chucknorris.io/jokes/random");
    const dados = await resposta.json();
    console.log(dados);
    setPiada(dados.value);
  }

  useEffect(() => {
    obterPiada();
  }, []);

  return {
    piada,
    obterPiada,
  };
}
