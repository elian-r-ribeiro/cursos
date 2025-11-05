"use client";

import useContador from "@/data/hook/useContador";

export default function LadoEsquerdo() {
  const {contador} = useContador();

  return (
    <div className="flex flex-1 flex-col bg-red-700 rounded-lg p-8 gap-10">
      <span className="text-3xl font-bold">Valor</span>
      <div className="flex gap-3">
        <span className="text-5xl font-black">{contador}</span>
      </div>
    </div>
  );
}
