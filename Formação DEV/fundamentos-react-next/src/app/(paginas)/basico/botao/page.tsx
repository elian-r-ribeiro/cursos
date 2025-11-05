'use client';
import Titulo from "@/components/template/Titulo";

export default function exemploBotao() {
    return (
        <div>
            <Titulo principal="Usando Botão" secundario="Como utilizar botão com o React" />
            <div className="py-7">
                <button onClick={() => executar('A')} className="botao azul">Executar</button>
            </div>
        </div>
    );
}

function executar(nome: string) {
    alert('A função ' + nome + ' foi executada!');
};