export default function ExemploJSX04() {

    const listaAprovados = ["Rebeca", "Maria", "Ana", "Pedro", "João"];

    return (
        <div className="container">
            <div className="exercicio">
                <h1>Entendendo JSX #04</h1>
                <div className="conteudo">
                    <div className="flex flex-col gap-5">
                        {listaAprovados.map((nome, i) => {
                            return (
                                <div className="bg-black rounded-lg p-3" key={i}>
                                    <span className="text-red-600">{nome}</span>
                                </div>
                            )
                        })}
                    </div>
                </div>
            </div>
        </div>

    )
}
