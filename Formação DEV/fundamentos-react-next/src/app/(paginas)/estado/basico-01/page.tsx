import Contador from "@/components/estado/Contador";
import Titulo from "@/components/template/Titulo";

export default function EstadoBasico01() {
    return (
        <div className="flex flex-col gap-7">
            <Titulo principal="Usando Estado" secundario="Exemplo de gerenciamento de estado com React" />
            <div className="flex flex-col gap-10">
                <Contador valorInicial={2} />
                <Contador valorInicial={1000} />
                <Contador valorInicial={-550} />
            </div>
        </div>
    );
}