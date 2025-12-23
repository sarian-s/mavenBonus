
    class Dog {
        private String name;

        // Метод экземпляра - работает с конкретной собакой
        public void bark() {
            System.out.println(name + " говорит: Гав!");
        }

        public void setName(String newName) {
            this.name = newName;
        }
    }
