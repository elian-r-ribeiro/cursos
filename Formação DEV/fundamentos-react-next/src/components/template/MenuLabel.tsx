export interface MenuLabelProps {
    label: string;
};

export default function MenuLabel(props: MenuLabelProps) {
    return (
        <span className="text-xs uppercase text-zinc-500 px-4 py-4">
            {props.label}
        </span>
    );
}