SELECT numero, nome FROM banco;
SELECT banco_numero, numero, nome FROM agencia;
SELECT numero, nome, email FROM cliente;
SELECT banco_numero, agencia_numero, cliente_numero FROM cliente_transacoes;
SELECT * FROM conta_corrente;
SELECT * FROM information_schema.columns WHERE table_name = 'banco';
SELECT column_name, data_type FROM information_schema.columns WHERE table_name = 'banco';

-- AVG
-- COUNT
-- MAX
-- MIN 
-- SUM

SELECT * FROM cliente_transacoes;

SELECT AVG(numero) FROM cliente;
SELECT COUNT(numero) FROM cliente;

SELECT COUNT(numero), email
FROM cliente
WHERE email ILIKE '@gmail.com'
GROUP BY email;

SELECT MAX(numero)
FROM cliente;
SELECT MIN(numero)
FROM cliente;

SELECT column_name, data_type FROM information_schema.columns WHERE table_name = 'cliente_transacoes';
SELECT COUNT(id), tipo_transacao_id
FROM cliente_transacoes
GROUP BY tipo_transacao_id
HAVING COUNT(id) > 150;

SELECT SUM(numero)
FROM cliente;
