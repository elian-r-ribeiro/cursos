interface AprovadoProps {
    nome: string;
}

export default function Aprovado(props: AprovadoProps) {
    return (
        <div className="conteudo">
            <div className="bg-black rounded-lg p-3 flex justify-between">
                <span className="text-white">{props.nome}</span>
                <div className="flex gap-2">
                    <button className="bg-blue-500 text-sm rounded-md w-20 h-8">Editar</button>
                    <button className="bg-red-600 text-sm rounded-md w-20 h-8">Excluir</button>
                </div>
            </div>

        </div>
    );
}