import Usuario from "@/data/model/Usuario";

interface FormUsuarioProps {
    usuario: Partial<Usuario>,
    alterarUsuario: (usuario: Partial<Usuario>) => void,
    salvar: () => void,
    cancelar: () => void
}

export default function FormUsuario(props: FormUsuarioProps) {

    return (
        <div>
            <div className="flex flex-col gap-1">
                <span>Nome</span>
                <input value={props.usuario.nome ?? ""} className="input" type="text"
                    onChange={(e) => props.alterarUsuario({ ...props.usuario, nome: e.target.value })}
                />
            </div>
            <div className="grid grid-cols-2 gap-4">
                <div className="flex flex-col gap-1">
                    <span>Email</span>
                    <input value={props.usuario.email ?? ""} className="input" type="text"
                        onChange={(e) => props.alterarUsuario({ ...props.usuario, email: e.target.value })}
                    />
                </div>
                <div className="flex flex-col gap-1">
                    <span>Senha</span>
                    <input value={props.usuario.senha ?? ""} className="input" type="password"
                        onChange={(e) => props.alterarUsuario({ ...props.usuario, senha: e.target.value })}
                    />
                </div>
                <div className="flex gap-2">
                    <button className="botao azul" onClick={props.salvar}>Confirmar</button>
                    <button className="botao cinza" onClick={props.cancelar}>Cancelar</button>
                </div>
            </div>
        </div>
    );
}