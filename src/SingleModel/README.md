#### 一般情况下不建议使用懒汉式单例(DesignPattern.SingleModel.LazySingleObject.*)，建议使用饿汉式单例(DesignPattern.SingleModel.HangerSingleModle)。
#### 只有在明确懒加载才会实现登记式/静态内部类方式实现(DesignPattern.SingleModel.LoginSingleModle)。
#### 如果涉及反序列化创建对象使用枚举方式(DesignPattern.SingleModel.EmunSingleModle)
#### 其他特殊情况考虑双重校验锁方式(DesignPattern.SingleModel.DoubleCheckedLock)
单例模式（Singleton Pattern）是 Java 中最简单的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。

这种模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。

注意：

1、单例类只能有一个实例。
2、单例类必须自己创建自己的唯一实例。
3、单例类必须给所有其他对象提供这一实例。