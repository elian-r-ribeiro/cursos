import { ItemCarrinho } from "./ItemCarrinho";
import { Produto } from "./Produto";

let precoTotal: number = 0;

let produtos: Produto[] = [
    { 
        id: 1,
        nome: 'Produto 1',
        preco: 100,
        marca: 'Marca 1'},
    {
        id: 2,
        nome: 'Produto 2',
        preco: 200,
        marca: 'Marca 2'}
];

let itens: ItemCarrinho[] = [
    {
        produto: produtos[0],
        quantidade: 2
    },
    {
        produto: produtos[1],
        quantidade: 2
    }
];

itens.forEach(element => {
    precoTotal += element.quantidade * element.produto.preco
});

console.log(precoTotal);