## Задача № 1
### Логирование жизненного цикла активити
Это домашнее задание поможет лучше понять жизненный цикл активити и запомнить вызываемые системой методы.

#### Задание:
Мы создадим новое приложение с одной активити, переопределим методы из лекции и добавим логирование в каждый из них. Кроме того, добавим нашей активити возможность восстанавливать состояние после пересоздания.

#### Выполнение
1. Создайте новое приложение с одной активити.
2. В интерфейсе активити сделайте одно текстовое поле в центре. Используйте ConstraintLayout.
3. Переопределите методы жизненного цикла onCreate, onStart, onResume, onPause, onStop, onDestroy, onRestart, onPostCreate, onPostResume. Не забывайте вызывать методы супер класса при переопределении.
4. В каждом методе добавьте логирование, Log.d("Lifecycle", methodName);, где methodName - это название метода, например onStart.
5. В каждом методе добавляйте строку в текстовое поле активити, textView.append("\n" + methodName);.
6. Переопределите методы onKeyDown, onKeyLongPress и onBackPressed. По аналогии с другими методами добавьте в них логирование и запись в текстовое поле.
7. Запустите приложение, понаблюдайте за логами и текстовым полем. Используйте кнопку назад. Посмотрите, что будет, если из onKeyDown возвращать true.
8. Переопределите метод onSaveInstanceState и onRestoreInstanceState. Добавьте логирование и запись в текстовое поле.
9. Снова запустите приложение и понаблюдайте за вызовами этих методов. Используйте кнопку назад и кнопку домой. Попробуйте перевернуть телефон. Включите опцию "Не сохранять действия" ("Don't keep activities") в настройках разработчика и повторите все действия с ней. (http://androidmir.org/android/4901/).
10. Добавьте в интерфейсе кнопку для запуска новой активити. Используя метод startActivity создайте новый экземпляр этой же активити а затем нажмите кнопку Назад. Посмотрите что будет выводится в логи и текстовое поле.
11. Сохраните текст из TextView в Bundle в методе onSaveInstanceState и восстановите его либо в onCreate, либо в onRestoreInstanceState.
12. В методе onCreate добавьте к логированию и записи в текстовое поле информацию о том, равен ли входной параметр Bundle null.
13. На этом задание выполнено, пользуйтесь приложением и изучайте логи.

![](screen.png)