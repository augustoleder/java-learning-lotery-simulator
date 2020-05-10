package domain;

public class Person {

    private Integer age;

    public Person(Integer age) {
        setAge(age);
    }

    private void setAge(Integer age) {
        if (isAgeNotValid(age)) {
            throw new IllegalArgumentException();
        }
        this.age = age;
    }

    private boolean isAgeNotValid(Integer age) {
        return age <= 16 || age >= 250;
    }
}
