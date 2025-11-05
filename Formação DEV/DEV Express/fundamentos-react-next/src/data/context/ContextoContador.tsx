"use client";
import {createContext, useState} from "react";

export interface ContextoContadorInterface {
  contador: number;
  incrementar: () => void;
  decrementar: () => void;
}

const ContextoContador = createContext<ContextoContadorInterface>(
  {} as ContextoContadorInterface
);

export function ProvedorContador(props: any) {
  const [contador, setContador] = useState(777);

  function incrementar() {
    setContador(contador + 1);
  }

  function decrementar() {
    setContador(contador - 1);
  }

  return (
    <ContextoContador.Provider value={{contador, incrementar, decrementar}}>
      {props.children}
    </ContextoContador.Provider>
  );
}

export default ContextoContador;
