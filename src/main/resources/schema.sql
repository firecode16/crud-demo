CREATE TABLE order_info (
    sku varchar(100) NOT NULL,
    country varchar(100),
    city varchar(100),
    name varchar(100),
    address varchar(100),
    contact_phone varchar(100),
    item_number int,
    store  varchar(100),
    PRIMARY KEY (sku)
);


CREATE TABLE cart (
    sku varchar(100) NOT NULL,
    name varchar(100),
    address varchar(100),
    item_number int,
    store  varchar(100),
    date_transac varchar(100),
    PRIMARY KEY (sku)
);

CREATE TABLE cart_prices (
    cart_id varchar(100) NOT NULL,
    total_price int NOT NULL,
    iva int NOT NULL,
    promotion int NOT NULL,
    PRIMARY KEY (cart_id)
);
