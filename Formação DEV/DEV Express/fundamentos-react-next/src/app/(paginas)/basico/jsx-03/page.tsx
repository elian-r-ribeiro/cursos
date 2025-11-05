export default function ExemploJSX03() {

    const numero = 10;
    const resultado = numero % 2;

    return (
        <div className="container">
            <div className="exercicio">
                <h1>Entendendo JSX #03</h1>
                <div className="conteudo">
                    {resultado === 0 ? (<span className="text-green-600">Par</span>) :
                        (<span className="text-red-600">Ímpar</span>)}
                </div>
            </div>
        </div>

    )
}
