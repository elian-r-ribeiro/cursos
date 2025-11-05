'use client';

import { useState } from "react";
import Filho from "./Filho";

export default function Pai() {

    const [resposta, setResposta] = useState("");

    function receberResposta(reposta: string) {
        setResposta(reposta);
    };

    return (
        <div>
            <span className="text-3xl font-bold">Quem descobriu o Brasil?</span>
            <div className="flex text-lg gap-2">
                <span className="text-zinc-500">Resposta:</span>
                <span className="font-semibold">{resposta}</span>
            </div>
            <div className="p-7">
                <Filho opcoes={["Pedro Álvares Cabral", "Índios", "Colombo"]} opcaoSelecionada={receberResposta} />
            </div>
        </div>
    );
}