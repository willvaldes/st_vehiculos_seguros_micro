-- vehiculos
INSERT INTO vehiculos (id,cilindraje,clase,color,combustible,linea,marca,modelo,pasajeros,propietario_doc,propietario_tipo_doc,puertas,registro_fecha,registro_usuario,revision_fecha,revision_vigencia,servicio,tipo_carroceria) VALUES (1,124,'MOTO','ROJO','GASOLINA','CB125F','HONDA',2020,2,1234567,'CC','0','2019-01-01','USER','2019-01-09','2021-06-08','PARTICULAR','SIN CARROCERIA');

-- matriculas
INSERT INTO matriculas (id,estado,licencia_transito_numero,matricula_fecha,organismo,placa,registro_fecha,registro_usuario,vehiculo_id) VALUES (1,'ACTIVA','1234567890','2019-01-01','SECRETARIA TRANSITO CALI','ABC25C','2019-01-01','USER',1);

-- TRASPASOS
INSERT INTO traspasos (id,propietario_anterior_doc,propietario_anterior_tipo_doc,propietario_doc,propietario_tipo_doc,registro_fecha,registro_usuario,traspaso_fecha,vehiculo_id) VALUES (1,123456,'CC',123456789,'CC','2019-01-01','USER','2019-05-10',1);

-- SEGUROS
INSERT INTO seguros (id,aseguradora_codigo,contribucion_fosyga,expedicion_fecha,poliza_numero,prima_soat,registro_fecha,registro_usuario,sucursal_codigo,tarifa,tasa_runt,tomador_doc,tomador_tipo_doc,total,vigencia_desde,vigencia_hasta,vehiculo_id) VALUES (1,'001',152000.2,'2019-01-01','32145156',380250,'2019-01-01','USER','125',100,20000,123456,'CC',12454,'2019-01-01','2021-07-12',1);

-- tipo_seguros
INSERT INTO tipo_seguros (id,cilindraje,clase,contribucion_fosyga,modelo,prima_soat,registro_fecha,registro_usuario,revision_fecha,revision_vigencia,tarifa,tasa_runt,total) VALUES (1,124,'MOTO',120000,2020,185000,'2019-01-01','USER','2019-01-01','2019-01-01',100,125000,520000);