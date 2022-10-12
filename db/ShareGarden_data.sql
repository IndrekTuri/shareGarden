INSERT INTO public.role (id, name) VALUES (DEFAULT, 'admin');
INSERT INTO public.role (id, name) VALUES (DEFAULT, 'user');

INSERT INTO public."user" (id, role_id, user_name, password, reset_password_token) VALUES (DEFAULT, 1, 'Admin', '123', null);
INSERT INTO public."user" (id, role_id, user_name, password, reset_password_token) VALUES (DEFAULT, 2, 'Kasutaja1', '123', null);
INSERT INTO public."user" (id, role_id, user_name, password, reset_password_token) VALUES (DEFAULT, 2, 'Kasutaja2', '123', null);
INSERT INTO public."user" (id, role_id, user_name, password, reset_password_token) VALUES (DEFAULT, 2, 'Kasutaja3', '123', null);
INSERT INTO public."user" (id, role_id, user_name, password, reset_password_token) VALUES (DEFAULT, 2, 'Kasutaja4', '123', null);
INSERT INTO public."user" (id, role_id, user_name, password, reset_password_token) VALUES (DEFAULT, 2, 'Kasutaja5', '123', null);

INSERT INTO public.contact (id, user_id, first_name, last_name, email, mobile) VALUES (DEFAULT, 1, 'Aadu', 'Admin', 'admin@gmail.com', '56 11 222');
INSERT INTO public.contact (id, user_id, first_name, last_name, email, mobile) VALUES (DEFAULT, 2, 'Kaspar', 'Kasutaja1', 'kasutaja1@msn.com', '56 33 444');
INSERT INTO public.contact (id, user_id, first_name, last_name, email, mobile) VALUES (DEFAULT, 3, 'Katri', 'Kasutaja2', 'kasutaja2@hotmail.com', '56 55 666');
INSERT INTO public.contact (id, user_id, first_name, last_name, email, mobile) VALUES (DEFAULT, 4, 'Kessu', 'Kasutaja3', 'kasutaja3@hot.ee', '56 77 888');
INSERT INTO public.contact (id, user_id, first_name, last_name, email, mobile) VALUES (DEFAULT, 5, 'Kaarel', 'Kasutaja4', 'kasutaja4@yahoo.com', '56 99 000');
INSERT INTO public.contact (id, user_id, first_name, last_name, email, mobile) VALUES (DEFAULT, 6, 'Kaja', 'Kasutaja5', 'Kasutaja5@neti.ee', '56 22 111');

INSERT INTO public.region (id, county) VALUES (DEFAULT, 'Harjumaa');
INSERT INTO public.region (id, county) VALUES (DEFAULT, 'Hiiumaa');
INSERT INTO public.region (id, county) VALUES (DEFAULT, 'Ida-Virumaa');
INSERT INTO public.region (id, county) VALUES (DEFAULT, 'Jõgevamaa');
INSERT INTO public.region (id, county) VALUES (DEFAULT, 'Järvamaa');
INSERT INTO public.region (id, county) VALUES (DEFAULT, 'Läänemaa');
INSERT INTO public.region (id, county) VALUES (DEFAULT, 'Lääne-Virumaa');
INSERT INTO public.region (id, county) VALUES (DEFAULT, 'Pärnumaa');
INSERT INTO public.region (id, county) VALUES (DEFAULT, 'Põlvamaa');
INSERT INTO public.region (id, county) VALUES (DEFAULT, 'Raplamaa');
INSERT INTO public.region (id, county) VALUES (DEFAULT, 'Saaremaa');
INSERT INTO public.region (id, county) VALUES (DEFAULT, 'Tartumaa');
INSERT INTO public.region (id, county) VALUES (DEFAULT, 'Viljandi');
INSERT INTO public.region (id, county) VALUES (DEFAULT, 'Valgamaa');
INSERT INTO public.region (id, county) VALUES (DEFAULT, 'Võrumaa');

INSERT INTO public.location (id, contact_id, region_id, name, address, longitud, latitude) VALUES (DEFAULT, 1, 1, 'Töö', 'Töö 1, Tallinn', null, null);
INSERT INTO public.location (id, contact_id, region_id, name, address, longitud, latitude) VALUES (DEFAULT, 2, 4, 'Kodu', 'Kodu 2, Jõgeva', null, null);
INSERT INTO public.location (id, contact_id, region_id, name, address, longitud, latitude) VALUES (DEFAULT, 3, 6, 'Kodukoht', 'Koht 22, Haapsalu', null, null);
INSERT INTO public.location (id, contact_id, region_id, name, address, longitud, latitude) VALUES (DEFAULT, 4, 2, 'SaareKodu', 'Saare 3, Kärdla', null, null);
INSERT INTO public.location (id, contact_id, region_id, name, address, longitud, latitude) VALUES (DEFAULT, 5, 12, 'Korter', 'Riia 43, Tartu', null, null);
INSERT INTO public.location (id, contact_id, region_id, name, address, longitud, latitude) VALUES (DEFAULT, 6, 8, 'Villa', 'Tallinna mnt. 31, Pärnu', null, null);
INSERT INTO public.location (id, contact_id, region_id, name, address, longitud, latitude) VALUES (DEFAULT, 2, 5, 'Suvila', 'Viljandi mnt. 3, Imavere', null, null);

INSERT INTO public.category (id, name) VALUES (DEFAULT, 'Juurviljad');
INSERT INTO public.category (id, name) VALUES (DEFAULT, 'Aedviljad');
INSERT INTO public.category (id, name) VALUES (DEFAULT, 'Puuviljad');
INSERT INTO public.category (id, name) VALUES (DEFAULT, 'Marjad');
INSERT INTO public.category (id, name) VALUES (DEFAULT, 'Maitsetaimed');
INSERT INTO public.category (id, name) VALUES (DEFAULT, 'Lilled');
INSERT INTO public.category (id, name) VALUES (DEFAULT, 'Seened');
INSERT INTO public.category (id, name) VALUES (DEFAULT, 'Hoidised');
INSERT INTO public.category (id, name) VALUES (DEFAULT, 'Muu');

INSERT INTO public.measure_unit (id, unit) VALUES (DEFAULT, 'tk');
INSERT INTO public.measure_unit (id, unit) VALUES (DEFAULT, 'kast');
INSERT INTO public.measure_unit (id, unit) VALUES (DEFAULT, 'kg');
INSERT INTO public.measure_unit (id, unit) VALUES (DEFAULT, 'g');
INSERT INTO public.measure_unit (id, unit) VALUES (DEFAULT, 'l');
INSERT INTO public.measure_unit (id, unit) VALUES (DEFAULT, 'ml');

INSERT INTO public.product (id, seller_user_id, location_id, category_id, measure_unit_id, name, description, quantity, image_base64, is_active, date_added, status) VALUES (DEFAULT, 2, 2, 3, 2, 'Õunad', 'Magusad', 1, null, true, '2022-09-28', 'A');
INSERT INTO public.product (id, seller_user_id, location_id, category_id, measure_unit_id, name, description, quantity, image_base64, is_active, date_added, status) VALUES (DEFAULT, 4, 4, 4, 3, 'Vaarikad', 'Suured', 3, null, true, '2022-09-28', 'A');
INSERT INTO public.product (id, seller_user_id, location_id, category_id, measure_unit_id, name, description, quantity, image_base64, is_active, date_added, status) VALUES (DEFAULT, 6, 6, 7, 4, 'Liivapuravik', 'Ussitanud', 750, null, true, '2022-09-28', 'A');
INSERT INTO public.product (id, seller_user_id, location_id, category_id, measure_unit_id, name, description, quantity, image_base64, is_active, date_added, status) VALUES (DEFAULT, 2, 7, 8, 6, 'Maasikamoos', 'Kodune', 300, null, true, '2022-09-28', 'A');

INSERT INTO public."order" (id, buyer_user_id, status, date_time) VALUES (DEFAULT, 3, 'P', '2022-09-28 22:39:23.000000');
INSERT INTO public."order" (id, buyer_user_id, status, date_time) VALUES (DEFAULT, 5, 'P', '2022-09-28 22:39:49.000000');
INSERT INTO public."order" (id, buyer_user_id, status, date_time) VALUES (DEFAULT, 1, 'P', '2022-09-28 22:40:09.000000');

INSERT INTO public.product_order (id, product_id, order_id) VALUES (DEFAULT, 1, 2);
INSERT INTO public.product_order (id, product_id, order_id) VALUES (DEFAULT, 4, 1);
INSERT INTO public.product_order (id, product_id, order_id) VALUES (DEFAULT, 2, 3);