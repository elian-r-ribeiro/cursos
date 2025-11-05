import Filho from "./Filho";

interface PaiProps {
    nome: string;
    sobrenome: string;
    filhos: string[];
};

export default function Pai(props: PaiProps) {
    return (
        <div>
            <h3 className="text-xl font-semibold">{props.nome} {props.sobrenome}</h3>
            <div className="py-6">
                {props.filhos.map((nome, index) =>
                    <Filho key={index} nome={nome} sobrenome={props.sobrenome} />
                )}
            </div>
        </div>
    );
}