# usersbase

***Описание:***

usersbase - это простейший CRUD веб сервис, с его помщью можно манипулировать с данными пользователя в базе данных (Добавить, удалить, изменить, прочитать).
Данные пользователя содержат:
-id
-first_name
-last_name


**Инструкция сборки:**

Для запуска приложения необходим Docker, в папке с файлом docker-compose.yml необходимо выполнить команду docker-compose up. 
После запуска поднимается база данных postgres на порте 5432 и запуститься веб-сервис по локальному адресу http://localhost:8080/users

Параметры postgres:

db: users-base

username: postgres

password: admin


**Edit By** *Tunkenov Nikolay* 

***https://vk.com/nik0sh***
