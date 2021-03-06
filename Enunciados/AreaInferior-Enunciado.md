Segue abaixo o texto extraído da plataforma referente ao desafio.

# Desafio

Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz **M**\[12\]\[12\]. Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão na área direita da matriz, conforme ilustrado abaixo (área verde).

![](https://github.com/caiohscruz/DIO-Desafio-SetoresMatriz/blob/master/Imagens/img_areainferior.png?raw=true)

## Entrada

A primeira linha de entrada contem um único caractere Maiúsculo **O** ('S' ou 'M'), indicando a operação (Soma ou Média) que deverá ser realizada com os elementos da matriz. Seguem os 144 valores de ponto flutuante que compõem a matriz.

## Saída

Imprima o resultado solicitado (a soma ou média), com 1 casa após o ponto decimal.

| Exemplo de Entrada                                   | Exemplo de Saída |
| ---------------------------------------------------- | ---------------- |
| S<br/>1.0<br/>330.0<br/>-3.5<br/>2.5<br/>4.1<br/>... | 111.4            |

# Testes

Abaixo deixo uma tabela com os testes propostos pela plataforma. 

|      | Entrada                                                      | Saída Esperada |
| ---- | ------------------------------------------------------------ | -------------- |
| #1   | S 23 -8 -93 46 84 -94 -56 -88 20 -15 -8 44 -38 -88 -63 -96 -30 82 70 -10 1 -6 -16 -8 -38 -40 -99 83 19 66 -47 -9 71 17 -21 59 -16 35 49 92 -70 39 10 41 67 -60 92 -31 45 13 -86 -87 91 29 -3 4 -19 27 29 60 14 -29 33 91 97 -67 73 94 86 41 -44 79 13 5 60 7 64 -98 34 -24 11 -2 -36 -1 -75 24 -51 88 -79 93 -6 -38 -48 34 -27 15 -68 91 2 -87 -7 -90 76 -66 47 92 -52 -22 10 -21 -29 68 -17 -26 -76 -92 -5 91 98 19 60 91 -20 80 80 -93 73 98 -30 -69 93 -73 -2 -67 52 36 -38 -64 70 28 2 -72 53 -67 | -29.0          |
| #2   | M 23 -8 -93 46 84 -94 -56 -88 20 -15 -8 44 -38 -88 -63 -96 -30 82 70 -10 1 -6 -16 -8 -38 -40 -99 83 19 66 -47 -9 71 17 -21 59 -16 35 49 92 -70 39 10 41 67 -60 92 -31 45 13 -86 -87 91 29 -3 4 -19 27 29 60 14 -29 33 91 97 -67 73 94 86 41 -44 79 13 5 60 7 64 -98 34 -24 11 -2 -36 -1 -75 24 -51 88 -79 93 -6 -38 -48 34 -27 15 -68 91 2 -87 -7 -90 76 -66 47 92 -52 -22 10 -21 -29 68 -17 -26 -76 -92 -5 91 98 19 60 91 -20 80 80 -93 73 98 -30 -69 93 -73 -2 -67 52 36 -38 -64 70 28 2 -72 53 -67 | -1.0           |

