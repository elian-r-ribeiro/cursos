import Aprovado from "@/components/exercicios/Aprovado";

export default function CriandoComponentes01() {

    const listaAprovados = ["Rebeca", "Maria", "Ana", "Pedro", "João"];

    return (
        <div className="container">
            <div className="exercicio">
                <h1>Criando Componentes #01</h1>
                <div className="conteudo">
                    <div className="flex flex-col gap-3">
                        {listaAprovados.map((nome, i) => {
                            return <Aprovado key={i} nome={nome}></Aprovado>
                        })}
                    </div>
                </div>
            </div>
        </div>

    )
}
