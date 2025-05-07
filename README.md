# 💼 Sistema de Alfândega

Este é um projeto simples feito em Java com foco no uso de **herança, polimorfismo e sobrescrita de métodos**. O sistema simula a emissão de etiquetas de preço para produtos comuns, usados e importados.

---

## 🧠 Objetivo

Este projeto foi desenvolvido como exercício prático para consolidar conceitos de Programação Orientada a Objetos (POO), especialmente:

- Herança
- Polimorfismo
- Sobrescrita com `@Override`
- Uso de `super`
- Manipulação de datas com `LocalDate`
- Formatação com `StringBuilder`

---

## ⚙️ Tecnologias utilizadas

- Java SE 17+
- IDE à sua escolha (Eclipse, IntelliJ, VS Code...)
- Git (para versionamento)

---

## 📦 Funcionalidades

- Cadastro de múltiplos produtos, podendo ser:
  - Produto comum
  - Produto usado (com data de fabricação)
  - Produto importado (com taxa alfandegária)
- Cálculo e exibição dos preços com base no tipo do produto
- Sobrescrita de métodos com comportamentos distintos por tipo de produto

## 🖥️ Exemplo de uso

Enter the number of products: 3
Product #1 Data
Commom, used or Imported (c/u/i)? c
Name: TV
Price: 1000.00

Product #2 Data
Commom, used or Imported (c/u/i)? u
Name: Notebook
Price: 700.00
Manufacture date (DD/MM/YYYY): 15/03/2020

Product #3 Data
Commom, used or Imported (c/u/i)? i
Name: Tablet
Price: 400.00
Customs fee: 50.00

Price Tags
TV $ 1000.00
Notebook (Used) $ 700.00 (Manucfature date: 15/03/2020)
Tablet $ 450.00 (Customs fee: $ 50.00)

