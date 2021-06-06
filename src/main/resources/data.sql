INSERT INTO tb_user (first_name, last_name, email, password) VALUES ('Alex', 'Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (first_name, last_name, email, password) VALUES ('Maria', 'Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_OPERATOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);

INSERT INTO tb_exam (id, nome, numacesso, visita, patientid, data, modalidade, tipoexame, numero, estado, medsol, laudo, sexo, especial, urgente, restaurado) VALUES (0, 'ANONIMO 1', '80153-158', '', 'ANONIMO', '2020-06-09', 'MR', 'SHOULDER', '780153-158', 4, '', 'F', 'A', 'F', 'F', 'F');
INSERT INTO tb_exam (id, nome, numacesso, visita, patientid, data, modalidade, tipoexame, numero, estado, medsol, laudo, sexo, especial, urgente, restaurado) values (1, 'ANONIMO 2', '60739-31', '47002', 'ANONIMO', '2020-05-25', 'MR', 'RM COL CERVICAL  C1-C7', '60739-31', 1, '2014-03-24', 'F', 'F', 'F', 'T', 'F');
INSERT INTO tb_exam (id, nome, numacesso, visita, patientid, data, modalidade, tipoexame, numero, estado, medsol, laudo, sexo, especial, urgente, restaurado) values (2, 'ANONIMO 3', '413953-19', '', '389823', '2020-04-20', 'MR', 'RM CRANIO', '413953-19', 1, '','F', 'F', 'T', 'F', 'F');
INSERT INTO tb_exam (id, nome, numacesso, visita, patientid, data, modalidade, tipoexame, numero, estado, medsol, laudo, sexo, especial, urgente, restaurado) values (3, 'ANONIMO 4', '624732SAMER', '', 'ANONIMO', '2020-04-20', 'MR', '', '624732SAMER', 1, '', 'F','A', 'F', 'F', 'F');
INSERT INTO tb_exam (id, nome, numacesso, visita, patientid, data, modalidade, tipoexame, numero, estado, medsol, laudo, sexo, especial, urgente, restaurado) values (4, 'ANONIMO 5', '771877-96', '', 'ANONIMO', '2020-04-20', 'CT', 'ABDOMEN', '771877-96', 1, '', 'F','A', 'F', 'F', 'F');
INSERT INTO tb_exam (id, nome, numacesso, visita, patientid, data, modalidade, tipoexame, numero, estado, medsol, laudo, sexo, especial, urgente, restaurado) values (5, 'ANONIMO 6', '771583-34', '', 'ANONIMO', '2020-04-17', '', '', '771583-34', 3, '', 'F','A', 'F', 'F', 'F');
INSERT INTO tb_exam (id, nome, numacesso, visita, patientid, data, modalidade, tipoexame, numero, estado, medsol, laudo, sexo, especial, urgente, restaurado) values (6, 'ANONIMO 7', '5429276', '', '1702144', '2020-04-16', 'CR', 'RX ANTEBRACO AP E PERFIL', '5429276', 3, 'MEDICO','F', 'M', 'F', 'T', 'F');
INSERT INTO tb_exam (id, nome, numacesso, visita, patientid, data, modalidade, tipoexame, numero, estado, medsol, laudo, sexo, especial, urgente, restaurado) values (7, 'ANONIMO 8', '771095-34', '', 'ANONIMO', '2020-04-14', 'MR', '', '771095-34', 1, '', 'F','A', 'F', 'F', 'F');
INSERT INTO tb_exam(id, nome, numacesso, visita, patientid, data, modalidade, tipoexame, numero, estado, medsol, laudo, sexo, especial, urgente, restaurado) values (8, 'ANONIMO 9', '761706-34', '', '257259', '2020-02-28', 'CT', 'CRANIO SEQUENCIAL ADULT', '761706-34', 1, '','F', 'F', 'F', 'F', 'F');
