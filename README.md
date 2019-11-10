# Генератор случайных данных людей.

Консольное приложение, которое на выходе создает Excel файл (xls) с данными людей.
Данные берутся из справочников в проекте.
Таблица содержит колонки: Фамилия, Имя, Отчество, Возраст, Пол, Дата рождения, Место рождения, Индекс, Страна, Область, Город, Улица, Дом, Квартира.

Количество генерируемых строк задается пользователем вводом (от 1 до 30).

Имена, фамилии и отчества сочетаются с полом.
Возраст зависит от дня рождения.
Дата рождения выбирается на промежутке 100 лет от текущей даты.

Мужской и женский пол сделаны как enum для масштабирования.
Данные человека и адреса разнесены по разным классам, т.к. в будущем могут быть разные (сторонние) источники данных.
