-- -------------------------------------------
-- Users and Profiles
-- -------------------------------------------

INSERT INTO tb_user (first_name, last_name, cpf, birth_day, phone, email, password) VALUES ('Julio', 'Cesar', '11122233370', '1993-08-11', '34991707070', 'julio@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_name, last_name, cpf, birth_day, phone, email, password) VALUES ('Amanda', 'Rodrigues', '22244455571', '2002-11-26', '34991707000', 'mandinha@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_profile (authority) VALUES ('PROFILE_USER');
INSERT INTO tb_profile (authority) VALUES ('PROFILE_ADMIN');

INSERT INTO tb_user_profile (user_id, profile_id) VALUES (1, 1);
INSERT INTO tb_user_profile (user_id, profile_id) VALUES (2, 1);
INSERT INTO tb_user_profile (user_id, profile_id) VALUES (2, 2);

-- -----------------------------------------------------
-- Categories
-- -----------------------------------------------------
INSERT INTO product_category(category_name) VALUES ('Carros');
INSERT INTO product_category(category_name) VALUES ('Motos');
INSERT INTO product_category(category_name) VALUES ('Caminhonetes');
INSERT INTO product_category(category_name) VALUES ('Caminhão');
INSERT INTO product_category(category_name) VALUES ('Náutica');
INSERT INTO product_category(category_name) VALUES ('Estacionária');

-- -----------------------------------------------------
-- Carros
-- -----------------------------------------------------
INSERT INTO product (sku, name, description, image_url, favorite, units_in_stock, unit_price, category_id,date_created) VALUES ('60-Amperes', 'Corsa Sedã-Corsa Hatch', 'Bateria para linha Corsa todos os modelos', 'assets/images/products/60-AMP/Bateria-Corsa.png', true, 8, 319.99, 1, NOW());

-- -----------------------------------------------------
-- Motos
-- -----------------------------------------------------
INSERT INTO product (sku, name, description, image_url, favorite, units_in_stock, unit_price, category_id,date_created) VALUES ('6-Amperes', 'Fazer 250 cc', 'Bateria para Yamaha Fazer 250cc', 'assets/images/products/6-AMP/Bateria-Fazer250.png', true, 5, 180.00, 2, NOW());

-- -----------------------------------------------------
-- Countries
-- -----------------------------------------------------
INSERT INTO country(code,name) VALUES ('BR','Brasil');

INSERT INTO country(code,name) VALUES ('UR','Uruguai');
INSERT INTO country(code,name) VALUES ('PR','Paraguai');
INSERT INTO country(code,name) VALUES ('AR','Argentinha');

-- -----------------------------------------------------
-- States
-- -----------------------------------------------------

INSERT INTO state(name,country_id) VALUES ('Acre',1),('Alagoas',1),('Amapá',1),('Amazonas',1),('Bahia',1),('Ceará',1),('Distrito Federal',1),('Espírito Santo',1),('Goiás',1),('Maranhão',1),('Mato Grosso do Sul',1),('Mato Grosso',1),('Minas Gerais',1),('Paraná',1),('Paraíba',1),('Pará',1),('Pernambuco',1),('Piaui',1),('Rio de Janeiro',1),('Rio Grande do Norte',1),('Rio Grande do Sul',1),('Rondônia',1),('Roraima',1),('Santa Catarina',1),('Sergipe',1),('São Paulo',1),('Tocantins',1);

-- -----------------------------------------------------
-- Endereço
-- -----------------------------------------------------
INSERT INTO tb_address(cep,logradouro,complemento,bairro,localidade,uf, user_id) VALUES ('38408-239','Rua Dolorita Alves Nascimento', 'casa A', 'Parque América', 'Uberlandia', 'MG',1);
INSERT INTO tb_address(cep,logradouro,complemento,bairro,localidade,uf, user_id) VALUES ('38410-239','Rua da Professora', 'casa frente', 'Planalto', 'Uberlandia', 'MG',2);

-- -----------------------------------------------------
-- Orders
-- -----------------------------------------------------
INSERT INTO tb_order (moment, status, client_id) VALUES (TIMESTAMP WITH TIME ZONE '2024-04-29T13:00:00Z', 1, 1);
INSERT INTO tb_order (moment, status, client_id) VALUES (TIMESTAMP WITH TIME ZONE '2024-04-29T15:50:00Z', 3, 2);
INSERT INTO tb_order (moment, status, client_id) VALUES (TIMESTAMP WITH TIME ZONE '2024-04-26T14:20:00Z', 0, 1);

-- -----------------------------------------------------
-- Order Item
-- -----------------------------------------------------
INSERT INTO tb_order_item (order_id, product_id, quantity, price) VALUES (1, 1, 1, 319.99);
INSERT INTO tb_order_item (order_id, product_id, quantity, price) VALUES (2, 2, 1, 180.00);

-- -----------------------------------------------------
-- Payment moment
-- -----------------------------------------------------
INSERT INTO tb_payment (order_id, moment) VALUES (1, TIMESTAMP WITH TIME ZONE '2024-05-01T15:00:00Z');
INSERT INTO tb_payment (order_id, moment) VALUES (2, TIMESTAMP WITH TIME ZONE '2022-05-01T11:00:00Z');
