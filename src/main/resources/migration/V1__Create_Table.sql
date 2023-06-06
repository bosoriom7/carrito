CREATE TABLE "public"."DetalleFacturas" (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(255),
    fecha_creacion DATE
);

CREATE TABLE "public"."DetalleFacturas" (
    id SERIAL PRIMARY KEY,
    product_id INT,
    factura_id INT,
    valor NUMERIC(10, 2),
    cantidad INT,
    fecha_creacion DATE
);

CREATE TABLE "public"."Facturas" (
    id SERIAL PRIMARY KEY,
    totalVenta NUMERIC(10, 2),
    usuarioId INT,
    cantidadProductos INT,
    fechaCreacion DATE
);

CREATE TABLE "public"."Productos" (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(255),
    descripcion VARCHAR(255),
    valor INT,
    cantidad INT,
    fechaCreacion DATE
);

CREATE TABLE "public"."Usuarios" (
    id SERIAL PRIMARY KEY,
    nombre INT,
    email VARCHAR(255),
    contrasena VARCHAR(100),
    rol VARCHAR(100),
    fechaCreacion DATE
);