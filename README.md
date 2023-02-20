## AbstractFactory
## Design patterns. Abstract factory
Create a game using the Abstract Factory pattern. The game should have a set of characters, including warriors, mages, and archers. 

The characters should belong to either the human or elf race. The Abstract Factory should provide an interface for creating these characters, and concrete factories should be implemented for each race. The client should be able to switch between the different concrete factories to create different sets of characters. 

Finally, the game should be able to print out the stats of each character, including their name, health, level, and abilities.

Разработайте систему для создания игровых персонажей в видеоролевой игре с помощью шаблона Abstract Factory. Система должна поддерживать создание различных типов персонажей, таких как воин, маг, лучник и т.д. для двух различных фракций, например, людей и эльфов.

Каждый персонаж должен иметь следующие характеристики:

Имя;

Здоровье;

Уровень;

Способности.

Система должна иметь возможность создавать персонажей обеих фракций, а также переключаться между фракциями во время игры. Каждый тип персонажа должен быть представлен отдельным классом.

Требования:

Создать интерфейсы для абстрактной фабрики, абстрактного продукта и конкретных продуктов;

Создать две конкретные фабрики, каждая из которых создает персонажей для определенной фракции;

Создать два набора конкретных продуктов, каждый из которых представляет персонажей для определенной фракции;

Создать класс клиента, который будет использовать абстрактную фабрику для создания персонажей и вывода информации о них. Клиент должен работать с абстрактными типами фабрики и продукта, не зная о конкретных реализациях.
