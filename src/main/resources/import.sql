INSERT  INTO PROPIETARIO (ID,EMAIL_PRO,APELLIDO_PRO,DIRECCION_PRO,NOMBRE_PRO,TELEFONO_PRO)
VALUES (1,'ALGO@ALGO.ALGALLO','CARANCHOA','EL BRONX','BENITO','5556677');

INSERT  INTO PACIENTE (CODIGO_PACIENTE,ESPECIE_PTE,NOMBRE_PTE,PESO_PTE,RAZA_PTE,CODIGO_PROPIETARIO_ID)
VALUES (1,'CANINO','MISIFUS','50','PINCHE',1);

INSERT INTO HISTORIA_CLINICA (CODIGO_HISTORIA, MEDICAMENTOS, PROCEDIMIENTO, CODIGO_PACIENTE_CODIGO_PACIENTE, CODIGO_PROPIETARIO_ID)
VALUES (1,'ACETAMINOFEN','DISPENSACIÓN DE MEDICAMENTO',1,1);


