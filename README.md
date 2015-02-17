# spring-boot-mvc-jpa-data-mysql

> 这是一个用gradle构建的一个spring boot应用程序，
> 该程序包含了spring mvc 4，spring data jpa 和 jsp，
> 主要展示了Controller，RestController 的用法，
> 以及数据绑定，分页，持久化，控制器返回json或html 数据等，
> 数据库既可以用mysql，也可以用hsqldb，默认使用hsqldb，
> 即在没有安装数据库的情况下亦可运行项目进行测试
> 这里还用了springloaded，spring 的一个热部署项目，虽然不及jrebel强大
> 但是这里绝对够用，不管你添加了多少方法，或者修改方法名，参数结构，修改注解
> 等一系列操作都能热加载，只有一个缺点，就是新增Controller不能识别，但是问题不大
> 只需要预先把Controller创建好就行了，总体体验还行，值得推荐

### 运行方式

    $ gradle bootRun

### 访问http://localhost:8080/
