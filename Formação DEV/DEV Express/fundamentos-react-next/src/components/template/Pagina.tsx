import {
  IconArrowDown,
  IconArrowUp,
  IconClick,
  IconCode,
  IconDatabase,
  IconForms,
  IconGoGame,
  IconHome,
  IconNumbers,
  IconReload,
  IconSquare1,
  IconUsers,
} from "@tabler/icons-react";
import AreaLateral from "./AreaLateral";
import Cabecalho from "./Cabecalho";
import Menu from "./Menu";
import MenuItem from "./MenuItem";
import Rodape from "./Rodape";
import MenuLabel from "./MenuLabel";

export interface PaginaProps {
  children: any;
}

export default function Pagina(props: PaginaProps) {
  return (
    <div className="flex flex-col min-h-screen">
      <Cabecalho />
      <div className="flex flex-1">
        <AreaLateral>
          <Menu>
            <MenuLabel label="Componentes" />
            <MenuItem icone={IconHome} link="/" texto="Início"></MenuItem>
            <MenuItem
              icone={IconSquare1}
              link="/basico/primeiro"
              texto="Primeiro Componente"
            ></MenuItem>
            <MenuItem
              icone={IconCode}
              link="/basico/jsx-01"
              texto="Entendendo JSX #01"
            ></MenuItem>
            <MenuItem
              icone={IconCode}
              link="/basico/jsx-02"
              texto="Entendendo JSX #02"
            ></MenuItem>
            <MenuItem
              icone={IconCode}
              link="/basico/jsx-03"
              texto="Entendendo JSX #03"
            ></MenuItem>
            <MenuItem
              icone={IconCode}
              link="/basico/jsx-04"
              texto="Entendendo JSX #04"
            ></MenuItem>
            <MenuItem
              icone={IconGoGame}
              link="/basico/comp-01"
              texto="Componentes #01"
            ></MenuItem>
            <MenuItem
              icone={IconGoGame}
              link="/basico/comp-02"
              texto="Componentes #02"
            ></MenuItem>
            <MenuLabel label="Árvore de Componentes" />
            <MenuItem
              icone={IconArrowUp}
              link="/arvore/direta"
              texto="Comunicação Direta"
            ></MenuItem>
            <MenuItem
              icone={IconArrowDown}
              link="/arvore/indireta"
              texto="Comunicação Indireta"
            ></MenuItem>
            <MenuItem
              icone={IconClick}
              link="/basico/botao"
              texto="Usando Botão"
            ></MenuItem>
            <MenuItem
              icone={IconUsers}
              link="/arvore/crud"
              texto="Cadastro de Usuário"
            ></MenuItem>
            <MenuLabel label="Gerenciamento de Estado" />
            <MenuItem
              icone={IconNumbers}
              link="/estado/basico-01"
              texto="Usando Estado #01"
            ></MenuItem>
            <MenuItem
              icone={IconForms}
              link="/estado/basico-02"
              texto="Usando Estado #02"
            ></MenuItem>
            <MenuItem
              icone={IconReload}
              link="/estado/basico-03"
              texto="Usando UseEffect #01"
            ></MenuItem>
            <MenuItem
              icone={IconReload}
              link="/estado/basico-04"
              texto="Usando UseEffect #02"
            ></MenuItem>
            <MenuItem
              icone={IconDatabase}
              link="/estado/contexto-01"
              texto="Usando Context API #01"
            ></MenuItem>
          </Menu>
        </AreaLateral>
        <main className="p-6 flex-1">{props.children}</main>
      </div>
      <Rodape />
    </div>
  );
}
