import { useState } from "react";

export default function Formulario() {

    const [nome, setNome] = useState("Pedro");

    return(
        <div className="flex flex-col gap-4">
            <label>{nome}</label>
            <input 
                type="text"
                value={nome}
                className="input" 
                placeholder="Informe seu nome" 
                onChange={(e) => setNome(e.target.value)}
            />
            <button className="botao azul" onClick={() => setNome("Ana")}>
                Alterar
            </button>
        </div>
    )
}