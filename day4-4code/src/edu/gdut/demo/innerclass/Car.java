package edu.gdut.demo.innerclass;

public class Car {
    private String name;
    private int carAge;
    private String carColor;

    public Car() {
    }

    public Car(String name, int carAge, String carColor) {
        this.name = name;
        this.carAge = carAge;
        this.carColor = carColor;
    }

    public void show() {
        System.out.println(this);
        //内部类的访问特点：
        //1.内部类可以直接访问外部类的成员，包括私有。
        //2.外部类要访问内部类的成员，必须创建对象。
        Engine e = new Engine();
        e.start();
        e.stop();
        System.out.println(e);
    }

    class Engine {
        private String engineName;
        private int engineAge;
        private String engineColor;

        public Engine() {
        }

        public Engine(String engineName, int engineAge, String engineColor) {
            this.engineName = engineName;
            this.engineAge = engineAge;
            this.engineColor = engineColor;
        }

        public void start() {
            System.out.println("引擎启动");
        }

        public void stop() {
            System.out.println("引擎停止");
        }

        public String toString() {
            return "Engine [engineName=" + engineName + ", engineAge=" + engineAge + ", engineColor=" + engineColor + "]";
        }
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return carAge
     */
    public int getCarAge() {
        return carAge;
    }

    /**
     * 设置
     * @param carAge
     */
    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    /**
     * 获取
     * @return carColor
     */
    public String getCarColor() {
        return carColor;
    }

    /**
     * 设置
     * @param carColor
     */
    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public String toString() {
        return "Car{name = " + name + ", carAge = " + carAge + ", carColor = " + carColor + "}";
    }

}
