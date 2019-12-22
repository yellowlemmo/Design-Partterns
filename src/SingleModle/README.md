#### 一般情况下不建议使用懒汉式单例(DesignPattern.SingleModle.LazySingleObject.*)，建议使用饿汉式单例(DesignPattern.SingleModle.HangerSingleModle)。
#### 只有在明确懒加载才会实现登记式/静态内部类方式实现(DesignPattern.SingleModle.LoginSingleModle)。
#### 如果涉及反序列化创建对象使用枚举方式(DesignPattern.SingleModle.EmunSingleModle)
#### 其他特殊情况考虑双重校验锁方式(DesignPattern.SingleModle.DoubleCheckedLock)