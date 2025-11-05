"use client";

import useContador from "@/data/hook/useContador";

export default function LadoDireito() {
  const {incrementar, decrementar} = useContador();

  return (
    <div className="flex flex-1 flex-col bg-blue-700 rounded-lg p-8 gap-10">
      <span className="text-3xl font-bold">Ações</span>
      <div className="flex gap-3">
        <button className="botao vermelho" onClick={incrementar}>
          Incremento
        </button>
        <button className="botao vermelho" onClick={decrementar}>
          Decremento
        </button>
      </div>
    </div>
  );
}
