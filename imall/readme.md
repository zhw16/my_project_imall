# imall项目说明

## 项目背景：属于电商系统的实现。

## Controller的API接口：
### 测试模块：
* 测试数据链路接口：method=GET， URL:http://localhost:8000/user/user_test, ARGS：“null”；说明：测试接口在service中通过id查询用户信息，返回json格式的数据到浏览器。
### 用户模块：
* 用户注册界面：method=POST, URL:http://localhost:8000/user/register, ARGS：“username=111122,password=12345678”；说明：通过postman发送post请求，返回状态信息和状态码。
* 用户登录界面：method=post, URL:http://localhost:8000/user/login, ARGS：“username=11122，password=12345678”；说明：通过postman发送post请求，返回状态数据，里面包含user的实体类，不包含password。
* 更新签名：method=post, URL:http://localhost:8000/user/update, ARGS:"HttpSession=当前登录人，signatu=”签名“； 说明：通过当前的登陆的用户名id，查询后更新签名。
* 登出账户：method=post, URL:http://localhost:8000/user/logout, ARGS:HttpSession="当前登录的用户"； 说明：查询到当前session里面的用户，进行注销。
* 管理员登陆：method=post, URL:http://localhost:8000/user/adminLogin, ARGS:“username=11122，password=12345678”; 说明：查询后，通过判断返回用户的role字段，确认是否为管理员。
* 
