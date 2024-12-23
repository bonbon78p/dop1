class Women extends Human {
    public Women(String name, int age) {
        super(name, age);
    }

    public void inputAge(int age) {
        setAge(age);
    }

    public void printAge() {
        System.out.println("Возраст женщины: " + getAge());
    }
}