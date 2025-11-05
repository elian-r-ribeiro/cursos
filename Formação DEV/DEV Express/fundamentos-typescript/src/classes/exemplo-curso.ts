import { Aula } from "./aula";
import { Curso } from "./curso";

const aulas : Aula[] = [new Aula("Introdução", "wdoianoisda", 180), new Aula("Primeira Aula", "wdoianoisda", 180)]
const novoCurso = new Curso("React", "Lobo", "A", aulas);

console.log(novoCurso.duracaoEmSegundos);
