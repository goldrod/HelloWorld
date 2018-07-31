/**
 *
 *  Builder模式：将一个复杂的对象和它的表现分离，使得同样的构建工程可以创建不同的表示
 *  用例：AlertDialog,EventBus,OKHttp
 *
 *
 **/
public class Person {

    public String name,
    public String age,
    public String sex,

    private Person(Builder builder){
        this.name = builder.name
        this.age = builder.age
        this.sex = builder.sex
    }

    public static class Builder {
        public String name,
        public String age,
        public String sex,

        public Builder setName(String name){
            this.name = name;
            return this
        }

        public Builder setAge(String age){
            this.age = age;
            return this
        }

        public Builder setSex(String sex){
            this.sex = sex;
            return this
        }

        public Person build(){
            return new Person(this);
        }
    }

}

//调用 new Person.Builder()
//             .setName("刘继承")
//             .build();
