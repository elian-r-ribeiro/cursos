export default function ExemploJSX02() {

    function renderizarCirculo(texto: string) {
        return (
            <div className="w-12 h-12 rounded-full bg-red-600 flex justify-center items-center text-sm">
                {texto}
            </div>
        )
    }

    return (
        <div className="container">
            <div className="exercicio">
                <h1>Entendendo JSX #02</h1>
                <div className="conteudo">
                    <div className="grid grid-cols-3 gap-5">
                        {renderizarCirculo("#01")}
                        {renderizarCirculo("#02")}
                        {renderizarCirculo("#03")}
                        {renderizarCirculo("#04")}
                        {renderizarCirculo("#05")}
                        {renderizarCirculo("#06")}
                    </div>
                </div>
            </div>
        </div>

    )
}