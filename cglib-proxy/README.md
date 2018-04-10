# CGLIB动态代理
CGLIB(Code Generation Library)是一个基于ASM的字节码生成库，它允许我们在运行时对字节码进行修改和动态生成。<br>
CGLIB通过继承方式实现代理，CGLIB生成的代理类会继承被代理类。final类型不能有子类，所以CGLIB不能代理final类型，<br>
final方法是不能重载的，所以CGLIB也不能代理final方法。

### CGLIB动态代理步骤<br>
* 实现MethodInterceptor，方法调用会被转发到该接口的intercept()方法。
* 通过CGLIB获取代理对象。