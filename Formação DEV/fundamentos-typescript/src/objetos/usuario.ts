import { StatusUsuario } from "./status-usuario";

export interface Usuario {
    id: number;
    nome: string;
    email: string;
    senha?: string;
    status: StatusUsuario;
}