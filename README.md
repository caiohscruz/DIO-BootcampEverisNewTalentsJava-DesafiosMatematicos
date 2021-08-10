# Sobre os desafios

Eu me deparei com esses desafios durante o bootcamp *everis New Talents - Java* da [Digital Innovation One](https://web.digitalinnovation.one/). Lá eles foram apresentados como Desafios Matemáticos em Java, [clique aqui](https://github.com/caiohscruz/DIO-Desafio-SetoresMatriz/blob/master/Enunciados) caso queira consultar os enunciados tal como apresentados na plataforma.

A premissa é bem simples, deve ser construída uma matriz 12x12, cujos elementos serão incluídos por um usuário, e uma operação deverá ser feita sobre um conjunto específico desses elementos, soma ou média dos valores. São três desafios, cada um tratando de um "setor" da matriz, a saber "Área Direita" (amarelo), "Área Esquerda" (azul) e "Área Inferior" (verde).

![](https://github.com/caiohscruz/DIO-Desafio-SetoresMatriz/blob/master/Imagens/img_setores.png?raw=true)

## Desenvolvimento

| Desafio                                                      | Resolução                                                    | Teste                                  |
| ------------------------------------------------------------ | ------------------------------------------------------------ | -------------------------------------- |
| [Área Direita](https://github.com/caiohscruz/DIO-Desafio-SetoresMatriz/blob/master/Enunciados) | [:heavy_check_mark: AreaDireita.java](https://github.com/caiohscruz/DIO-Desafio-SetoresMatriz/blob/master/Setores%20da%20Matriz/src/main/java/AreaDireita.java) | :no_entry_sign: não implementado ainda​ |
| [Área Esquerda](https://github.com/caiohscruz/DIO-Desafio-SetoresMatriz/blob/master/Enunciados) | :heavy_check_mark: [AreaEsquerda.java](https://github.com/caiohscruz/DIO-Desafio-SetoresMatriz/blob/master/Setores%20da%20Matriz/src/main/java/AreaEsquerda.java)) | :no_entry_sign: não implementado ainda​ |
| [Área Inferior](https://github.com/caiohscruz/DIO-Desafio-SetoresMatriz/blob/master/Enunciados) | [:heavy_check_mark: AreaInferior.java](https://github.com/caiohscruz/DIO-Desafio-SetoresMatriz/blob/master/Setores%20da%20Matriz/src/main/java/AreaInferior.java)) | :no_entry_sign: não implementado ainda​ |

## Considerações

Para tratar de cada uma dessas "regiões" é interessante perceber o que pode ser depreendido de cada uma delas. Minha sugestão é analisar o que os elementos de cada lado das diagonais tem em comum.

![](https://github.com/caiohscruz/DIO-Desafio-SetoresMatriz/blob/master/Imagens/img_diagonal_NO_SE.png?raw=true)

Não é muito difícil perceber que elementos acima da diagonal em destaque, considerando que os elementos são identificados pela Linha e Coluna em que se encontram dispostos, possuem "Coluna > Linha". Já para os elementos abaixo da diagonal, o contrário é observado, "Coluna < Linha".

![](https://github.com/caiohscruz/DIO-Desafio-SetoresMatriz/blob/master/Imagens/img_diagonal_SO_NE.png?raw=true)

Considerando agora a outra diagonal, é observado para os elementos acima dela que "Coluna < 11 - Linha", e para os elementos abaixo dela, "Coluna > 11 - Linha".

Por fim, facilmente podemos determinar as "propriedades" de cada uma das regiões com base nas observações acima, temos então:

- Área Superior = (Coluna > Linha) && (Coluna < 11 - Linha)
- Área Direita = (Coluna > Linha) && (Coluna > 11 - Linha)
- Área Inferior = (Coluna < Linha) && (Coluna > 11 - Linha)
- Área Esquerda = (Coluna < Linha) && (Coluna < 11 - Linha)

