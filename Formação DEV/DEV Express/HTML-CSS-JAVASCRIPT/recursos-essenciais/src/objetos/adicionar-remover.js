const curso = {
  id: 1,
  nome: "Curso de JavaScript",
  duracao: 10000,
  aulas: [{}, {}, {}],
};

curso.ativo = true;
delete curso.aulas;

console.log(curso);
