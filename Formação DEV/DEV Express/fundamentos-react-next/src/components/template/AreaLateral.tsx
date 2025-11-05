interface AreaLateralProps {
    children: any;
};

export default function AreaLateral(props: AreaLateralProps) {
    return (
        <aside className="w-80 p-6 border-r border-zinc-800">{props.children}</aside>
    );
};