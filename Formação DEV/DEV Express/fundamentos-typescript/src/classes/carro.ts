export class Carro {
    marca: string = "";
    private _velocidadeAtual: number = 0;

    get velocidadeAtual(): number {
        return this._velocidadeAtual;
    }

    acelerar(): void {
        this._velocidadeAtual += 10;
    }

    frear(): void {
        this._velocidadeAtual -= 10;
    }
}