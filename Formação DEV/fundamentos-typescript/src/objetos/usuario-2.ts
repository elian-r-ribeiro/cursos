import { StatusUsuario } from "./status-usuario";
import { Usuario } from "./usuario";

let usuario: Usuario = {
    id: 1,
    nome: 'João da Silva',
    email: 'joao@gmail.com',
    senha: '123456',
    status: StatusUsuario.ATIVO
}

console.log(usuario);