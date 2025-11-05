import { Aula } from "./aula";

export class Curso {
    constructor(
        public nome: string, 
        public autor: string, 
        public descricao: string,
        public aulas: Aula[] = []
    ){}

    get duracaoEmSegundos() {
        let duracaoTotal: number = 0;
        this.aulas.forEach(element => {
            duracaoTotal += element.duracaoEmSegundos
        })
        return duracaoTotal;
    }
}