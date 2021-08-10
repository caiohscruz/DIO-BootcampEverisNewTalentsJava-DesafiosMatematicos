Segue abaixo o texto extraído da plataforma referente ao desafio.

# Desafio

Leia um caractere maiúsculo, que indica uma operação que deve ser realizada e uma matriz **M**\[12\]\[12\]. Em seguida, calcule e mostre a soma ou a média considerando somente aqueles elementos que estão na área direita da matriz, conforme ilustrado abaixo (área verde).

![](https://github.com/caiohscruz/DigitalInnovationOne/blob/master/Desafios%20Java/src/DesafiosMatematicos/SetoresMatriz/img/img_areaesquerda.png?raw=true)



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
| #1   | M 23 -8 -93 46 84 -94 -56 -88 20 -15 -8 44 -38 -88 -63 -96 -30 82 70 -10 1 -6 -16 -8 -38 -40 -99 83 19 66 -47 -9 71 17 -21 59 -16 35 49 92 -70 39 10 41 67 -60 92 -31 45 13 -86 -87 91 29 -3 4 -19 27 29 60 14 -29 33 91 97 -67 73 94 86 41 -44 79 13 5 60 7 64 -98 34 -24 11 -2 -36 -1 -75 24 -51 88 -79 93 -6 -38 -48 34 -27 15 -68 91 2 -87 -7 -90 76 -66 47 92 -52 -22 10 -21 -29 68 -17 -26 -76 -92 -5 91 98 19 60 91 -20 80 80 -93 73 98 -30 -69 93 -73 -2 -67 52 36 -38 -64 70 28 2 -72 53 -67 | 8.4            |
| #2   | S -19 0 -7 13 -4 46 23 -28 33 -28 -31 25 -9 29 -48 36 7 -8 48 34 -42 31 -11 -41 25 -20 -46 14 34 49 38 -29 36 30 40 36 38 0 10 -41 -8 -21 -7 -46 -24 29 11 -22 4 12 8 -45 19 29 1 -29 -4 -28 -16 -38 14 39 35 -19 16 -12 -20 20 15 5 -37 38 4 4 8 -31 24 22 2 16 47 -48 6 32 18 10 36 -1 -23 46 20 -47 -17 32 -47 -8 9 26 -47 12 26 45 24 -4 8 -46 -29 13 9 48 11 36 -40 18 -28 41 40 47 -34 34 -28 -34 -41 -24 -42 0 48 -26 16 -48 6 26 5 15 -33 -33 -48 -3 -31 -29 -36 -47 -44 10 | 197.0          |
| #3   | M -19 0 -7 13 -4 46 23 -28 33 -28 -31 25 -9 29 -48 36 7 -8 48 34 -42 31 -11 -41 25 -20 -46 14 34 49 38 -29 36 30 40 36 38 0 10 -41 -8 -21 -7 -46 -24 29 11 -22 4 12 8 -45 19 29 1 -29 -4 -28 -16 -38 14 39 35 -19 16 -12 -20 20 15 5 -37 38 4 4 8 -31 24 22 2 16 47 -48 6 32 18 10 36 -1 -23 46 20 -47 -17 32 -47 -8 9 26 -47 12 26 45 24 -4 8 -46 -29 13 9 48 11 36 -40 18 -28 41 40 47 -34 34 -28 -34 -41 -24 -42 0 48 -26 16 -48 6 26 5 15 -33 -33 -48 -3 -31 -29 -36 -47 -44 10 | 6.6            |

