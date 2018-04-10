# JDK原生动态代理
JDK原生动态代理中，有2个重要的接口或者类，一个是InvocationHandler接口，另一个则是Proxy类。<br>
这一个接口和类是我们实现动态代理必须用到的。每一个动态代理类必须要实现InvocationHandler接口，<br>
并且每个代理类的实例都关联到了一个handler，当我们通过代理对象调用一个方法时，这个方法的调用就会被<br>
转发给InvocationHandler的invoke方法来进行调用。

Object invoke(Object proxy, Method method, Object[] args) throws Throwable<br>
该方法有3个参数<br>
proxy:  代理对象<br>
method: 将要调用的方法<br>
args:   所调用方法的参数

Proxy类的作用就是用来动态创建一个代理对象，用得最多的是newProxyInstance方法。<br>
public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces,  InvocationHandler h)  throws IllegalArgumentException<br>
loader: 一个ClassLoader对象，定义了由哪个ClassLoader对象来对生成的代理对象进行加载<br>
interfaces: 一个Interface对象的数组，表示的是我将要给我需要代理的对象提供一组什么接口，如果我提供了一组接口给它，那么这个代理对象就宣称实现了该接口(多态)，这样我就能调用这组接口中的方法了<br>
h:  一个InvocationHandler对象，表示的是当我这个动态代理对象在调用方法的时候，会关联到哪一个InvocationHandler对象上<br>

JDK原生代理会自动代理equals、toString和hashCode这三个方法。

同时，无论是静态代理还是JDK原生代理都需要一个接口，如果我们想要代理的对象没有接口怎么办？<br>
这个时候可以使用CGLIB来实现动态代理。
