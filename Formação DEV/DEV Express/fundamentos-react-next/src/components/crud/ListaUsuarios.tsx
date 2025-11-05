'use client'

import Usuario from "@/data/model/Usuario";
import { IconEdit, IconTrash } from "@tabler/icons-react";

interface ListaUsuarioProps {
    usuarios: Usuario[];
    removerUsuario: (usuario: Usuario) => void;
    selecionarUsuario: (usuario: Usuario) => void;
}

export default function ListaUsuarios(props: ListaUsuarioProps) {

    function renderizarUsuario(usuario: Usuario) {
        return <div className="flex items-center p-6 py-3 rounded-md bg-zinc-900">
            <div className="flex flex-col flex-1">
                <span className="font-semibold">{usuario.nome}</span>
                <span className="text-sm text-zinc-400">{usuario.email}</span>
            </div>
            <div className="flex gap-2">
                <button className="botao azul" onClick={() => props.selecionarUsuario(usuario)}><IconEdit /></button>
                <button className="botao vermelho" onClick={() => props.removerUsuario(usuario)}><IconTrash /></button>
            </div>
        </div>
    }

    return (
        <ul className="flex flex-col gap-2">
            {props.usuarios.map(usuario => {
                return <li key={usuario.id}>{renderizarUsuario(usuario)}</li>
            })}
        </ul>
    );
}