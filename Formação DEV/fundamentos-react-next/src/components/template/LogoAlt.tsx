import Image from "next/image";

export default function LogoAlt() {
    return (
        <div className="flex items-center gap-2">
            <Image src="https://static.vecteezy.com/system/resources/previews/042/127/160/non_2x/instagram-logo-on-circle-style-with-transparent-background-free-png.png"
                alt="Logo"
                height={50}
                width={50}
            />
            <span className="text-xl font-black">Instagram</span>
        </div>
    );
};