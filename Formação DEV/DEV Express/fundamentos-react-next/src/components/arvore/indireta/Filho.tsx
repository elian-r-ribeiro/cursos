'use client';
interface FilhoProps {
    opcoes: string[];
    opcaoSelecionada: (opcao: string) => void;
};

export default function Filho(props: FilhoProps) {
    return (
        <div className="flex gap-3">
            {props.opcoes.map((opcao, index) => {
                return (<button onClick={() => props.opcaoSelecionada(opcao)} key={index} className="botao azul">{opcao}</button>);
            })}
        </div>
    );
}