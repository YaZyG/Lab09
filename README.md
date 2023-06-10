# Lab09

Даний код створює графічний інтерфейс для калькулятора тривалості імпульсу.

#
# Даний код виконує наступну функцію:

1. >Імпорт пакетів та наслідування класу. 

Імпортуються необхідні пакети: javax.swing.* та java.awt.*, для роботи з графічним інтерфейсом та подіями.

2. >Налаштування вікна калькулятора.

Створюється клас ImpulseDurationCalculator, який унаслідований від класу JFrame і представляє вікно калькулятора.
В конструкторі класу ImpulseDurationCalculator налаштовуються властивості вікна: назва, дія при закритті тощо.

3. >Створення компонентів калькулятора.

Створюються необхідні компоненти для калькулятора: JLabel, JTextField, JButton, JPanel.

4. >Розташування компонентів на панелі.

Компоненти розташовуються на панелі за допомогою менеджера розміщення GridLayout.

5. >Обробка події натискання кнопки "Розрахувати".

Створюється об'єкт слухача CalculateButtonListener, який реалізує інтерфейс ActionListener для обробки події натискання кнопки "Розрахувати".

6. >Виконання розрахунків та відображення результату.

При натисканні кнопки, викликається метод actionPerformed, де отримуються значення з текстових полів, виконується розрахунок і відображається результат на JLabel.

7. >Запуск графічного інтерфейсу калькулятора

В методі main створюється екземпляр ImpulseDurationCalculator та відображається графічний інтерфейс.

#
Отже, цей код створює вікно калькулятора тривалості імпульсу, де користувач може ввести значення тривалості і кількості імпульсів, а після натискання кнопки "Розрахувати" отримати загальну тривалість імпульсів.
