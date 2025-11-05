"use client";

import UseChuckNorris from "@/data/hook/useChuckNorris";

export default function ChuckNorrisJoke() {
  const {piada, obterPiada} = UseChuckNorris();

  return (
    <div>
      <span className="text-2xl">{piada}</span>
      <button onClick={obterPiada} className="botao azul">
        Obter piada
      </button>
    </div>
  );
}
