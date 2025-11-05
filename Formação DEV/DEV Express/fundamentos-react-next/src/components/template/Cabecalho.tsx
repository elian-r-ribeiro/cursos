import Logo from "./Logo";

export interface PaginaProps {

};

export default function Cabecalho(props: PaginaProps) {
    return (
        <header className="flex items-center h-20 border-b border-zinc-800 px-6">
            <Logo />
        </header>
    );
};