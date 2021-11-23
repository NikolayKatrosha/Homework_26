package homework26;

class Dog<string> {
    private string name;
    private int age;
    private double weight;
    private string type;
    static int counter = 0;


    //Насколько я понял, этот конструктор уже имеет сеттеры
    public Dog(string name, int age, double weight, string type) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.type = type;
        counter++;
    }

    //Переопределить метод toString
    public String toString() {
        return "Name: " + name + ", age: " + age + ", weight: " + weight + ", type: " + type;
    }
    // Геттеры
    public String getName() {
        return (String) name;
    }
    public int getAge() {
        return age;
    }
    public double  getWeight() {
        return weight;
    }

    public String getType() {
        return (String) type;
    }

    public string CompareWeight(Dog dog)
    {
        if (this.weight < dog.weight)
            return (string) "<";
        else if (this.weight == dog.weight)
            return (string) "=";
        else return (string) ">";
    }
    public string CompareAge(Dog dog)
    {
        if (this.age < dog.age)
            return (string) "<";
        else if (this.age == dog.age)
            return (string) "=";
        else return (string) ">";
    }
    public static int getNumOfInstances() {
        return counter;
    }
}

