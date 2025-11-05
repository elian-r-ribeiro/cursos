import Pai from "@/components/arvore/direta/Pai";
import Titulo from "@/components/template/Titulo";

export default function ComunicacaoDireta() {
    return (
        <div className="flex flex-col gap-7">
            <Titulo principal="Comunicação Direta" secundario="Exemplo de comunicação direta entre componentes"></Titulo>
            <Pai nome="Jhon" sobrenome="Walker" filhos={["João", "Maria"]} />
        </div>
    );
};