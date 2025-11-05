export default function ExemploJSX01() {
    const titulo = <h1>Entendendo JSX #01</h1>;
    return (
        <div className="container">
            <div className="exercicio">
                {titulo}
                <div className="conteudo">
                    <span>{7 * 7}</span>
                    <span>{Math.random()}</span>
                    <span>Math.random()</span>
                </div>
            </div>
        </div>

    )
}