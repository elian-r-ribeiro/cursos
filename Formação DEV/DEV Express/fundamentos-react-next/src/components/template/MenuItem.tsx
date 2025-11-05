import Link from "next/link";
import React from "react";

interface MenuItemProps {
    link: string;
    texto: string;
    icone?: React.ElementType;
};

export default function MenuItem(props: MenuItemProps) {
    return (
        <Link className="flex gap-2 items-center px-4 py-2 rounded-md hover:bg-white/10" href={props.link}>
            {props.icone && <props.icone size={20} stroke={1.5} />}
            <span>{props.texto}</span>
        </Link>
    );
};