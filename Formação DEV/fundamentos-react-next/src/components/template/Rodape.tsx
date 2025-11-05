import { IconHeartFilled } from "@tabler/icons-react";

export default function Rodape() {
    return (
        <footer className="flex items-center justify-end px-6 gap-1.5 text-sm text-zinc-400 h-16 border-t border-zinc-800">
            <span>Feito com  </span>
            <IconHeartFilled size={14} className="text-red-500" />
            <span>por Cod3r</span>
        </footer>
    );
};